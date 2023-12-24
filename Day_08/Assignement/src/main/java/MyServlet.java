<<<<<<< HEAD


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Sushil");
		list.add("Ajinkya");
		list.add("Akshay");
		list.add("Yash");
		HttpSession session=request.getSession();
		session.setAttribute("list",list);
		PrintWriter pw=response.getWriter();
		pw.println("Session Created");
		//RequestDispatcher rd=request.getRequestDispatcher("MyJsp.jsp");
		//rd.forward(request,response);
		
	}

}
=======


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Sushil");
		list.add("Ajinkya");
		list.add("Akshay");
		list.add("Yash");
		HttpSession session=request.getSession();
		session.setAttribute("list",list);
		PrintWriter pw=response.getWriter();
		pw.println("Session Created");
		//RequestDispatcher rd=request.getRequestDispatcher("MyJsp.jsp");
		//rd.forward(request,response);
		
	}

}
>>>>>>> 5639019305e8044418c2f6c24834f90c9cf7c1fd
