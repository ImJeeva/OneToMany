package OneToMany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Lauch {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure();
		cf.addAnnotatedClass(Orders.class);
		cf.addAnnotatedClass(Customer.class);
		cf.addAnnotatedClass(CustDetails.class);
		
		SessionFactory sf = cf.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		Customer c = s.get(Customer.class, 5);
		List<Orders> o = c.getOrder();
		CustDetails cd = c.getCid();
		System.out.println(c);
		System.out.println(cd);
		
		for(Orders order:o) {
			System.out.println(order);
		}
		
		
		
		t.commit();
		

	}

}
