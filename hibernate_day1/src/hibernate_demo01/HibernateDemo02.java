package hibernate_demo01;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
 

/**
 * hibernate入门案例
 * @author LSD
 *
 */
public class HibernateDemo02 {

	//测试工具类
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
	
	//查询
//	@Test
//	public void demo2(){
//		
//		Session session = HibernateUtils.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		/**
//		 * get方法：
//		 * 		1.采用的立即加载，执行到这行代码时立马发送sql语句去查询
//		 * 		2.返回真实对象本身
//		 * 		3.查询找不到对象时，返回null;
//		 * load方法：
//		 * 		1.采用延迟加载(懒加载),执行这行代码时不加载，真正使用时才加载
//		 * 		2.返回代理的对象，javassist-3.18.1-GA.jar利用javassist技术产生的代理
//		 *		3.查询找不到对象时，返回ObjectNotFoundException
//		 */
//		
//		//使用get方法进行查询
//		Customer customer = session.get(Customer.class, 2l);//Customer的id是long类型，所以这里加l
//		System.out.println(customer);
//		
//		//使用load方法查询
////		Customer customer = session.load(Customer.class, 2l);//l是long类型
////		System.out.println(customer);
//		
//		//事务提交
//		transaction.commit();
//		session.close();
//	}
	
	//修改
//	@Test
//	public void demo3(){
//		Session session = HibernateUtils.openSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//直接创建对象，进行修改
////		Customer customer = new Customer();
////		customer.setCust_id(3l);
////		customer.setCust_name("cnm");
////		session.update(customer);
//		
//		//先查询再修改
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
//		//直接创建再删除
////		Customer customer = new Customer();
////		customer.setCust_id(3l);
////		session.delete(customer);
//		
//		//先查询再删除
//		Customer customer = session.get(Customer.class, 3l);
//		session.delete(customer);
//		
//		
//		transaction.commit();
//		session.close();
//	}
//
//
//	//查询所有
//	@Test
	public void demo5(){
		Session session = HibernateUtils.openSession();
		Transaction transaction = session.beginTransaction();
		
		//接受HQL：Hibernate Query Language 面向对象查询语言
//		Query query = session.createQuery(" from Customeer");
//		List<Customer> list = query.list();
//		for (Customer customer : list) {
//			System.out.println(customer);
//		}
		
		//接受SQL
		SQLQuery query = session.createSQLQuery("select * from cst_customer");
		List<Object []> list = query.list();
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
		
		transaction.commit();
		session.close();
	}
}
