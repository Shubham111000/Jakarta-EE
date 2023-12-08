

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mypack.Logic;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CarrierServ
 */
public class CarrierServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Logic ob1=new Logic();
		ob1.setS(request.getParameter("Qual"));
		//PrintWriter pw=response.getWriter();
		//pw.println(request.getParameter("Qual"));
		String s=ob1.getAdvice();
		request.setAttribute("message", s);
		RequestDispatcher rd=request.getRequestDispatcher("CAE.jsp");
		rd.forward(request, response);
	}

	

}
