<<<<<<< HEAD


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RedirectedServ
 */
public class RedirectedServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			
			PrintWriter pw=response.getWriter();
			pw.println("In RedirectedServlet");
				}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}

}
=======


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RedirectedServ
 */
public class RedirectedServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			
			PrintWriter pw=response.getWriter();
			pw.println("In RedirectedServlet");
				}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}

}
>>>>>>> 3fd61c2cda82844777e680a35d74c252f0555355
