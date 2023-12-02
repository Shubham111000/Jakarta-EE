<<<<<<< HEAD


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

/**
 * Servlet implementation class ViewStudent
 */
public class ViewStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		try {
			
			PreparedStatement pst=con.prepareStatement("Select * from student");
			ResultSet rs=pst.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			int col=rsmd.getColumnCount();
			for(int i=1;i<=col;i++) 
			{
				pw.print(rsmd.getColumnName(i)+"\t");
				pw.print("   ")	;
			}
			pw.print("<br>");
			while(rs.next()) 
			{
				for(int i=1;i<=col;i++) 
				{
					pw.print(rs.getObject(i)+"\t");
					pw.print("      ");
				}
				pw.println("<br>");
							
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
=======


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

/**
 * Servlet implementation class ViewStudent
 */
public class ViewStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		try {
			
			PreparedStatement pst=con.prepareStatement("Select * from student");
			ResultSet rs=pst.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			int col=rsmd.getColumnCount();
			for(int i=1;i<=col;i++) 
			{
				pw.print(rsmd.getColumnName(i)+"\t");
				pw.print("   ")	;
			}
			pw.print("<br>");
			while(rs.next()) 
			{
				for(int i=1;i<=col;i++) 
				{
					pw.print(rs.getObject(i)+"\t");
					pw.print("      ");
				}
				pw.println("<br>");
							
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
>>>>>>> 3fd61c2cda82844777e680a35d74c252f0555355
