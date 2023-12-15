

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import mypack.*;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Servlet implementation class AddServ
 */
public class AddServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();	
		Student s1=new Student();
		s1.setAddress(request.getParameter("address"));
		s1.setName(request.getParameter("name"));
		String result=request.getParameter("target");
		StudentDAO studentDAO=null;
		if (result.equalsIgnoreCase("file"))
				{
					studentDAO=new StudentDAOFileImpl();
					System.out.println("Enter the Roll number");
					s1.setRollNo(new Scanner(System.in).nextInt());
				}
		else 
		{
			studentDAO=new StudentDAODataImpl();
		}
		studentDAO.addStudent(s1);
		pw.println("Record Added Succsfully");
		pw.println("<a href=\"Add.jsp\">Home</a>");
		}

}
