import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mypack.Dept;

import java.io.IOException;
import java.util.*;
import org.hibernate.cfg.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

/**
 * Servlet implementation class DataServ
 */
public class DataServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		//String location1 = request.getParameter("location");
		SelectionQuery<?> query1=session.createSelectionQuery("from Dept d where d.location= :location1",Dept.class);
		query1.setParameter("location1",request.getParameter("location"));
		List<?> mylist2=(List<?>) query1.list();
		request.setAttribute("list", mylist2);
		RequestDispatcher rd=request.getRequestDispatcher("Data.jsp");
		rd.forward(request,response);
	}

}
