package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDAODataImpl implements StudentDAO {

	@Override
	public void addStudent(Student ref) 
	{
		Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		session.persist(ref);
		tr.commit();
		factory.close();
		System.out.println("Done With Sudent");
		
	}

}
