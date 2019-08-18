package hibernate_demo01;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * hibernate�������ɲ���
 * @author LSD
 *
 */
public class HibernateDemo01 {

	//����һ����¼
	
	//�־û����������״̬
	@Test
	public void demo1(){
		Session session = HibernateUtils.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customer customer = new Customer();//˲ʱ̬����,û��Ψһ��ʶid,û�б�session����
		
		customer.setCust_name("zhangsan");
		Serializable id = session.save(customer);//�־�̬����session������Ψһ��ʶoid
		
		System.out.println(customer);

		transaction.commit();
		session.close();  //session�رգ���֮��û�б�session���������й�̬
		
	}
	
	
}
