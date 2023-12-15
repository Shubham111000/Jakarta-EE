

import jakarta.servlet.ServletException;
import java.io.*;
import mypack.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class RegisterServ
 */
public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		Student s1=new Student();
		s1.setName(request.getParameter("name"));
		s1.setLogin(request.getParameter("login"));
		s1.setPassword(request.getParameter("password"));
		s1.setEmail(request.getParameter("email"));
		s1.setAddress(request.getParameter("address"));
		session.persist(s1);
		tr.commit(); 
        factory.close();
        pw.println("done with student");
        pw.println("<a href=\"Home.jsp\">Home</a>");
		
	}

}
