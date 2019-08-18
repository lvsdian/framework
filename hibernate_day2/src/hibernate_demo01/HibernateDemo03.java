package hibernate_demo01;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * 测试当前线程绑定session
 * @author LSD
 *
 */
public class HibernateDemo03 {


	@Test
	public void demo1(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		Customer customer = new Customer();
		customer.setCust_name("cnnnm");
		session.save(customer);
		
		transaction.commit();
		//线程结束时会自动关闭，此处再关闭会报错
		//session.close();  
		
	}
	
}
