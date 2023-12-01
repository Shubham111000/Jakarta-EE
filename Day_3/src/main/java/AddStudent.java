

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Servlet implementation class AddStudent
 */
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	 /*
	 * 
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException 
	{
		// TODO Auto-generated method stub
			try	{
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/bit";
				con=DriverManager.getConnection(url,"root","Nokia@6600");
				}
		catch(Exception e) 
		{
			e.printStackTrace();		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
	try {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("Name");
		int age=Integer.parseInt(request.getParameter("Age").trim());
		String Address=request.getParameter("Address");
		PreparedStatement pst=con.prepareStatement("insert into Student(Name,Age,Address) values(?,?,?)");
		pst.setString(1,name);
		pst.setInt(2,age);
		pst.setString(3, Address);
		int k=pst.executeUpdate();
		if(k>0)
		{
			pw.println("Record has been added");
		}
		else
		{
			pw.println("cannot add");
		}
	}
	catch(Exception ee)
	{
		ee.printStackTrace();
	}
	}
}
	
