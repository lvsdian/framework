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
 * HQL查询方式测试类
 * @author LSD
 *
 */
public class HibernateDemo1 {
//
//	@Test
//	//初始化数据
//	public void demo1(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//创建一个客户
//		Customer customer = new Customer();
//		customer.setCust_name("33");
//		
//		for (int i = 0; i < 10; i++) {
//			LinkMan linkMan = new LinkMan();
//			linkMan.setLkm_name("王五"  + i);
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
//	//HQL的简单查询
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
//	//HQL的简单查询之别名查询
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		//c是别名，但HQL不支持*,聚合函数中的*除外
//		Query query = session.createQuery("select c from Customer c");
//		
//		List<Customer> list = query.list();
//		for (Customer customer : list) {
//			System.out.println(customer);
//		}
//		transaction.commit();
//	}
	
//	@Test
	//HQL的排序查询
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		//默认
////		Query query = session.createQuery(" from Customer order by cust_id");
//		//降序
//		Query query = session.createQuery(" from Customer order by cust_id desc");
//		//升序
////		Query query = session.createQuery("  from Customer order by cust_id asc");
//
//		List<Customer> list = query.list();
//		for (Customer customer : list) {
//			System.out.println(customer);
//		}
//		transaction.commit();
//	}
	
//	@Test
	//HQL的条件查询
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//条件查询
//		//1.按位置绑定，多个条件时类推
////		Query query = session.createQuery("from Customer where cust_id=?");
////		query.setParameter(0, 1l);
////		List<Customer> list = query.list();
//		//2.按名称绑定--根据参数位置进行绑定
//														//aaa,bbb这些名字随便起，但与:之间不能有空格
//		Query query = session.createQuery("from Customer where cust_id = :aaa and cust_name = :bbb");
//		//设置参数
//		query.setParameter("aaa", 1l);
//		query.setParameter("bbb", "22");
//		
//		List<Customer> list = query.list();
//		
//		transaction.commit();
//	}
	
//	@Test
	//HQL的投影查询
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		//单个属性
////		List<Object> list = session.createQuery("select c.cust_name from Customer c").list();
//		//多个属性
////		List<Object []> list = session.createQuery("select c.cust_name,c.cust_id from Customer c").list();
//		
////		for (Object [] object : list) {
////			System.out.println(Arrays.toString(object));
////		}
//		//将查询结果封装到对象中
//		List<Customer> list = session.createQuery("select new Customer(cust_name,cust_id) from Customer").list();
//		for (Customer customer : list) {
//			System.out.println(customer);
//		}
//		transaction.commit();
//	}
//	
//	@Test
//	//HQL的分页查询
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
//	//HQL的分组统计查询
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//
//		//聚合函数：count(),sum(),max(),min(),avg()
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





