

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

/**
 * Servlet implementation class FistServlet
 */
public class FistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	@Resource(lookup="java:/comp/env/mypool")
	private DataSource ds;
	List <String> plist=new ArrayList<String>();
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			PrintWriter pw=response.getWriter();
			con=ds.getConnection();
			PreparedStatement pst=con.prepareStatement("Select pname from product");
			ResultSet rs=pst.executeQuery();
			while(rs.next()) 
			{
				plist.add(rs.getString(1));
			}
			//pw.println(plist);
			request.setAttribute("list",plist);
			RequestDispatcher rd=request.getRequestDispatcher("Shop.jsp");
			rd.forward(request, response);
			
			}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
