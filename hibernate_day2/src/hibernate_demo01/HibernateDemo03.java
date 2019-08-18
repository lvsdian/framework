package hibernate_demo01;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * ���Ե�ǰ�̰߳�session
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
		//�߳̽���ʱ���Զ��رգ��˴��ٹرջᱨ��
		//session.close();  
		
	}
	
}
