
import jakarta.servlet.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;
import mypack.*;

/**
 * Servlet implementation class ViewServ
 */
public class ViewServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		Query<?> query=session.createQuery("from Student ",Student.class);
		System.out.println("After calling createQuery method");
		List<?> mylist1=(List<?>) query.list();
		System.out.println("After calling list method");	
		System.out.println(mylist1);
		request.setAttribute("mylist",mylist1);
		RequestDispatcher rd=request.getRequestDispatcher("ViewForward.jsp");
		rd.forward(request,response);
		factory.close();

		
	}
	
}
