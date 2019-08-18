package hibernate_demo01;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * hibernate一级缓存
 * @author LSD
 *
 */
public class HibernateDemo02 {

	//一级缓存
	@Test
	public void demo1(){
		Session session = HibernateUtils.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customer customer1 = new Customer();//发送sql语句		
		customer1.setCust_name("cnm");
		
		Serializable id = session.save(customer1);
		
		Customer customer2 = session.get(Customer.class,id);//不发送sql语句
		
		System.out.println(customer2.toString());
		

		transaction.commit();
		session.close();  
	}
	
	
	@Test
	public void demo2(){
		Session session = HibernateUtils.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customer customer2 = session.get(Customer.class,1l);
		customer2.setCust_name("ccnm");

		transaction.commit();
		session.close();  
		
	}
	
}
