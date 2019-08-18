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
 * 测试QBC查询
 * @author LSD
 *
 */
public class HibernateDemo2 {

//	//简单查询
//	@Test
//	public void test1(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//获得Criteria对象
//		Criteria criteria = session.createCriteria(Customer.class);
//		List<Customer> list = criteria.list();
//		for (Customer customer : list) {
//			System.out.println(customer.toString());
//		}
//		transaction.commit();
//	}
	
//		//排序查询
//		@Test
//		public void test1(){
//			Session session = HibernateUtils.getCurrentSession();
//			Transaction transaction = session.beginTransaction();
//			
//			//获得Criteria对象
//			Criteria criteria = session.createCriteria(Customer.class);
//			//升序查询，对应降序为desc
//			criteria.addOrder(Order.asc("cust_id"));
//			
//			List<Customer> list = criteria.list();
//			for (Customer customer : list) {
//				System.out.println(customer.toString());
//			}
//			transaction.commit();
//		}
	
//		//分页查询
//		@Test
//		public void test1(){
//			Session session = HibernateUtils.getCurrentSession();
//			Transaction transaction = session.beginTransaction();
//			
//			//获得Criteria对象
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
	
//	//条件查询
//		@Test
//		public void test1(){
//			Session session = HibernateUtils.getCurrentSession();
//			Transaction transaction = session.beginTransaction();
//			
//			//获得Criteria对象
//			Criteria criteria = session.createCriteria(Customer.class);
//			
//			/**
//			 * =  eq
//			 * >  gt
//			 * >= ge
//			 * <  lt
//			 * <= le
//			 * <> ne 不等于
//			 */
//			//设置条件
//			criteria.add(Restrictions.eq("cust_name", "11"));
//			
//			List<Customer> list = criteria.list();
//			for (Customer customer : list) {
//				System.out.println(customer);
//			}
//			transaction.commit();
//		}
	
//	//统计查询
//		@Test
//		public void test1(){
//			Session session = HibernateUtils.getCurrentSession();
//			Transaction transaction = session.beginTransaction();
//			
//			//获得Criteria对象
//			Criteria criteria = session.createCriteria(Customer.class);
//		
//			/**
//			 * add :普通的条件,where后面事件
//			 * addOrder:排序
//			 * setProjection:聚合函数和group by having
//			 */
//			criteria.setProjection(Projections.rowCount());
//			Long num = (Long)criteria.uniqueResult();
//			
//			System.out.println(num);
//			
//			transaction.commit();
//		}
	
//	//离线查询
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
	
	//多表查询
	@Test
	public void test1(){	
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		//SQL:SELECT * FROM cst_customer c INNER JOIN cst_linkman l ON c.cust_id = l.lkm_cust_id;
		
		//HQL(内连接):from Customer c inner join c.linkMans
		//List<Object[]> list = session.createQuery("from Customer c inner join c.linkMans").list();
		
		//HQL(迫切内连接)：在普通内连接inner join后添加一个关键字fetch。它发的SQL语句与
		//内连接一样，作用:通知hibernate将数据封装到对象里，因为Customer中有LinkMan的集合，所以把
		//LinkMan封装到Customer中，返回的list集合中放的是Customer(select distincr c 是为了去掉重复)
		List<Object[]> list = session.createQuery("select distinct c from Customer c inner join fetch c.linkMans").list();
		
	}
}
