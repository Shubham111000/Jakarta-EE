

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mypack.BeanClass;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServ
 */
public class FirstServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("Welcome to CallPojoServ");
		pw.println("<br>"); // generating html dynamically
		BeanClass bc=new BeanClass();
		pw.print(bc.disp());
		}

}
