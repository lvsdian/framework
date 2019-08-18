package hibernate_demo01;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
 

/**
 * hibernate���Ű���
 * @author LSD
 *
 */
public class HibernateDemo02 {

	//���Թ�����
//	@Test
//	public void demo1() {
//		Session session = HibernateUtils.openSession();
//		Transaction transaction = session.beginTransaction();
//
//		Customer customer = new Customer();
//		customer.setCust_name("123");
//		session.save(customer);
//
//		transaction.commit();
//		session.close();
//	}
	
	//��ѯ
//	@Test
//	public void demo2(){
//		
//		Session session = HibernateUtils.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		/**
//		 * get������
//		 * 		1.���õ��������أ�ִ�е����д���ʱ������sql���ȥ��ѯ
//		 * 		2.������ʵ������
//		 * 		3.��ѯ�Ҳ�������ʱ������null;
//		 * load������
//		 * 		1.�����ӳټ���(������),ִ�����д���ʱ�����أ�����ʹ��ʱ�ż���
//		 * 		2.���ش���Ķ���javassist-3.18.1-GA.jar����javassist���������Ĵ���
//		 *		3.��ѯ�Ҳ�������ʱ������ObjectNotFoundException
//		 */
//		
//		//ʹ��get�������в�ѯ
//		Customer customer = session.get(Customer.class, 2l);//Customer��id��long���ͣ����������l
//		System.out.println(customer);
//		
//		//ʹ��load������ѯ
////		Customer customer = session.load(Customer.class, 2l);//l��long����
////		System.out.println(customer);
//		
//		//�����ύ
//		transaction.commit();
//		session.close();
//	}
	
	//�޸�
//	@Test
//	public void demo3(){
//		Session session = HibernateUtils.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//ֱ�Ӵ������󣬽����޸�
////		Customer customer = new Customer();
////		customer.setCust_id(3l);
////		customer.setCust_name("cnm");
////		session.update(customer);
//		
//		//�Ȳ�ѯ���޸�
//		Customer customer = session.get(Customer.class,3l);
//		customer.setCust_name("mnc");
//		session.update(customer);
//		
//		transaction.commit();
//		session.close();
//	}
//	
//	@Test
//	public void demo4(){
//		Session session = HibernateUtils.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//ֱ�Ӵ�����ɾ��
////		Customer customer = new Customer();
////		customer.setCust_id(3l);
////		session.delete(customer);
//		
//		//�Ȳ�ѯ��ɾ��
//		Customer customer = session.get(Customer.class, 3l);
//		session.delete(customer);
//		
//		
//		transaction.commit();
//		session.close();
//	}
//
//
//	//��ѯ����
//	@Test
	public void demo5(){
		Session session = HibernateUtils.openSession();
		Transaction transaction = session.beginTransaction();
		
		//����HQL��Hibernate Query Language ��������ѯ����
//		Query query = session.createQuery(" from Customeer");
//		List<Customer> list = query.list();
//		for (Customer customer : list) {
//			System.out.println(customer);
//		}
		
		//����SQL
		SQLQuery query = session.createSQLQuery("select * from cst_customer");
		List<Object []> list = query.list();
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
		
		transaction.commit();
		session.close();
	}
}
