

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
 * Servlet implementation class StudentServ
 */
public class StudentServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;
	@Resource(lookup="java:/comp/env/mypool")
	private DataSource ds;
	List<Integer>list1=new ArrayList<Integer>();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			PrintWriter pw=resp.getWriter();
			con=ds.getConnection();
			PreparedStatement pst=con.prepareStatement("Insert into Student (rollno,name,age,address)values(?,?,?,?)");
			pst.setString(2,req.getParameter("Name"));
			pst.setString(4,req.getParameter("Address"));
			pst.setInt(1,Integer.parseInt(req.getParameter("Roll").trim()));
			pst.setInt(3,Integer.parseInt(req.getParameter("Age")));
			boolean result=pst.execute();
			PreparedStatement pst1=con.prepareStatement("Select rollno from Student");
			boolean result1=pst1.execute();
			if(result1) 
			{
				ResultSet rs=pst1.getResultSet();
				while(rs.next()) 
				{
					list1.add(rs.getInt(1));
				}
			}
			req.setAttribute("list1", list1);
			RequestDispatcher rd=req.getRequestDispatcher("Report.jsp");
			rd.forward(req, resp);			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}


	

}
