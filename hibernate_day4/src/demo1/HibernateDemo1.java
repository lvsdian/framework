package demo1;



import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import domain.Customer;
import domain.LinkMan;

/**
 * HQL��ѯ��ʽ������
 * @author LSD
 *
 */
public class HibernateDemo1 {
//
//	@Test
//	//��ʼ������
//	public void demo1(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//����һ���ͻ�
//		Customer customer = new Customer();
//		customer.setCust_name("33");
//		
//		for (int i = 0; i < 10; i++) {
//			LinkMan linkMan = new LinkMan();
//			linkMan.setLkm_name("����"  + i);
//			linkMan.setCustomer(customer);
//			
//			customer.getLinkMans().add(linkMan);
//			
//			session.save(linkMan);
//		}
//		session.save(customer);
//		
//		transaction.commit();
//	}
	
//	@Test
//	//HQL�ļ򵥲�ѯ
//	public void test2(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		Query query = session.createQuery("from Customer");
//		
//		List<Customer> list = query.list();
//		for (Customer customer : list) {
//			System.out.println(customer);
//		}
//		transaction.commit();
//	}
	
//	@Test
//	//HQL�ļ򵥲�ѯ֮������ѯ
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		//c�Ǳ�������HQL��֧��*,�ۺϺ����е�*����
//		Query query = session.createQuery("select c from Customer c");
//		
//		List<Customer> list = query.list();
//		for (Customer customer : list) {
//			System.out.println(customer);
//		}
//		transaction.commit();
//	}
	
//	@Test
	//HQL�������ѯ
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		//Ĭ��
////		Query query = session.createQuery(" from Customer order by cust_id");
//		//����
//		Query query = session.createQuery(" from Customer order by cust_id desc");
//		//����
////		Query query = session.createQuery("  from Customer order by cust_id asc");
//
//		List<Customer> list = query.list();
//		for (Customer customer : list) {
//			System.out.println(customer);
//		}
//		transaction.commit();
//	}
	
//	@Test
	//HQL��������ѯ
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//������ѯ
//		//1.��λ�ð󶨣��������ʱ����
////		Query query = session.createQuery("from Customer where cust_id=?");
////		query.setParameter(0, 1l);
////		List<Customer> list = query.list();
//		//2.�����ư�--���ݲ���λ�ý��а�
//														//aaa,bbb��Щ��������𣬵���:֮�䲻���пո�
//		Query query = session.createQuery("from Customer where cust_id = :aaa and cust_name = :bbb");
//		//���ò���
//		query.setParameter("aaa", 1l);
//		query.setParameter("bbb", "22");
//		
//		List<Customer> list = query.list();
//		
//		transaction.commit();
//	}
	
//	@Test
	//HQL��ͶӰ��ѯ
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		//��������
////		List<Object> list = session.createQuery("select c.cust_name from Customer c").list();
//		//�������
////		List<Object []> list = session.createQuery("select c.cust_name,c.cust_id from Customer c").list();
//		
////		for (Object [] object : list) {
////			System.out.println(Arrays.toString(object));
////		}
//		//����ѯ�����װ��������
//		List<Customer> list = session.createQuery("select new Customer(cust_name,cust_id) from Customer").list();
//		for (Customer customer : list) {
//			System.out.println(customer);
//		}
//		transaction.commit();
//	}
//	
//	@Test
//	//HQL�ķ�ҳ��ѯ
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//
//		Query query = session.createQuery("from Customer");
//		
//		query.setFirstResult(0);
//		query.setMaxResults(2);
//		
//		List<Customer> list = query.list();
//		
//		for (Object object : list) {
//			System.out.println(object);
//		}
//		
//		transaction.commit();
//	}
	
//	@Test
//	//HQL�ķ���ͳ�Ʋ�ѯ
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//
//		//�ۺϺ�����count(),sum(),max(),min(),avg()
////		Object object = session.createQuery("select count(*) from Customer").uniqueResult();
////		System.out.println(object);
//		
//		Query query = session.createQuery("select cust_id,count(*) from Customer group by cust_name");
//		List<Object[]> object = query.list();
//		for (Object[] object2 : object) {
//			System.out.println(Arrays.toString(object2));
//		}
//		transaction.commit();
//	}
}





