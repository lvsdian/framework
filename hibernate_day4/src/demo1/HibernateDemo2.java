package demo1;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import domain.Customer;

/**
 * ����QBC��ѯ
 * @author LSD
 *
 */
public class HibernateDemo2 {

//	//�򵥲�ѯ
//	@Test
//	public void test1(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//���Criteria����
//		Criteria criteria = session.createCriteria(Customer.class);
//		List<Customer> list = criteria.list();
//		for (Customer customer : list) {
//			System.out.println(customer.toString());
//		}
//		transaction.commit();
//	}
	
//		//�����ѯ
//		@Test
//		public void test1(){
//			Session session = HibernateUtils.getCurrentSession();
//			Transaction transaction = session.beginTransaction();
//			
//			//���Criteria����
//			Criteria criteria = session.createCriteria(Customer.class);
//			//�����ѯ����Ӧ����Ϊdesc
//			criteria.addOrder(Order.asc("cust_id"));
//			
//			List<Customer> list = criteria.list();
//			for (Customer customer : list) {
//				System.out.println(customer.toString());
//			}
//			transaction.commit();
//		}
	
//		//��ҳ��ѯ
//		@Test
//		public void test1(){
//			Session session = HibernateUtils.getCurrentSession();
//			Transaction transaction = session.beginTransaction();
//			
//			//���Criteria����
//			Criteria criteria = session.createCriteria(Customer.class);
//			
//			criteria.setFirstResult(0);
//			criteria.setMaxResults(2);
//			
//			List<Customer> list = criteria.list();
//			for (Customer customer : list) {
//				System.out.println(customer);
//			}
//			transaction.commit();
//		}
	
//	//������ѯ
//		@Test
//		public void test1(){
//			Session session = HibernateUtils.getCurrentSession();
//			Transaction transaction = session.beginTransaction();
//			
//			//���Criteria����
//			Criteria criteria = session.createCriteria(Customer.class);
//			
//			/**
//			 * =  eq
//			 * >  gt
//			 * >= ge
//			 * <  lt
//			 * <= le
//			 * <> ne ������
//			 */
//			//��������
//			criteria.add(Restrictions.eq("cust_name", "11"));
//			
//			List<Customer> list = criteria.list();
//			for (Customer customer : list) {
//				System.out.println(customer);
//			}
//			transaction.commit();
//		}
	
//	//ͳ�Ʋ�ѯ
//		@Test
//		public void test1(){
//			Session session = HibernateUtils.getCurrentSession();
//			Transaction transaction = session.beginTransaction();
//			
//			//���Criteria����
//			Criteria criteria = session.createCriteria(Customer.class);
//		
//			/**
//			 * add :��ͨ������,where�����¼�
//			 * addOrder:����
//			 * setProjection:�ۺϺ�����group by having
//			 */
//			criteria.setProjection(Projections.rowCount());
//			Long num = (Long)criteria.uniqueResult();
//			
//			System.out.println(num);
//			
//			transaction.commit();
//		}
	
//	//���߲�ѯ
//	@Test
//	public void test1(){
//	
//		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
//		detachedCriteria.add(Restrictions.ilike("cust_name", "1%"));
//		
//		
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		Criteria  criteria = detachedCriteria.getExecutableCriteria(session);
//		List<Customer> list = criteria.list();
//		for (Customer customer : list) {
//			System.out.println(customer);
//		}
//		
//	}
	
	//����ѯ
	@Test
	public void test1(){	
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		//SQL:SELECT * FROM cst_customer c INNER JOIN cst_linkman l ON c.cust_id = l.lkm_cust_id;
		
		//HQL(������):from Customer c inner join c.linkMans
		//List<Object[]> list = session.createQuery("from Customer c inner join c.linkMans").list();
		
		//HQL(����������)������ͨ������inner join�����һ���ؼ���fetch��������SQL�����
		//������һ��������:֪ͨhibernate�����ݷ�װ���������ΪCustomer����LinkMan�ļ��ϣ����԰�
		//LinkMan��װ��Customer�У����ص�list�����зŵ���Customer(select distincr c ��Ϊ��ȥ���ظ�)
		List<Object[]> list = session.createQuery("select distinct c from Customer c inner join fetch c.linkMans").list();
		
	}
}
