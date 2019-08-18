package demo2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import demo1.HibernateUtils;
import domain.Customer;
import domain.LinkMan;
import domain.User;

/**
 * <set>上的fetch和lazy
 * @author LSD
 *
 */
public class HibernateDemo2 {

//	//默认不配置fetch和lazy一下会发送两条sql语句，当在
//	//Customer.hbm.xml中set标签中配置fetch="select" lazy="true"结果一样
//	@Test
//	public void test1(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//查询1号客户
//		Customer customer = session.get(Customer.class, 1l);//发送一条sql语句查客户
//		System.out.println(customer);
//		
//		for (LinkMan linkMan : customer.getLinkMans()) {//再发送一条sql语句查联系人
//			System.out.println(linkMan.getLkm_name());
//		}
//		
//		transaction.commit();
//	}
//	
//	//在Customer.hbm.xml中set标签中配置fetch="select" lazy="false"不延迟发送sql语句，但还是两条
//	@Test
//	public void test2(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//查询1号客户
//		Customer customer = session.get(Customer.class, 1l);//发送一条sql语句查客户，再发送一条sql语句查联系人
//		System.out.println(customer);
//		
//		for (LinkMan linkMan : customer.getLinkMans()) {
//			System.out.println(linkMan.getLkm_name());
//		}
//		
//		transaction.commit();
//	}
//
//	//在Customer.hbm.xml中set标签中配置fetch="select" lazy="extra"不延迟发送sql语句，但还是两条
//	@Test
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//查询1号客户
//		Customer customer = session.get(Customer.class, 1l);//发送一条sql语句查客户
//		System.out.println(customer);
//		
//		for (LinkMan linkMan : customer.getLinkMans()) {//发送一条查count的语句
//			System.out.println(linkMan.getLkm_name());//发送查询联系人的语句
//		}
//		
//		transaction.commit();
//	}
//	
//	//在Customer.hbm.xml中set标签中配置fetch="join" lazy="失效"，这里lazy会失效,
//		@Test
//		public void test4(){
//			Session session = HibernateUtils.getCurrentSession();
//			Transaction transaction = session.beginTransaction();
//			
//			//查询1号客户
//			Customer customer = session.get(Customer.class, 1l);//发送一条迫切左外连接查询，所有都查到了，下面不发语句了
//			System.out.println(customer);
//			
//			for (LinkMan linkMan : customer.getLinkMans()) {
//				System.out.println(linkMan.getLkm_name());
//			}
//			
//			transaction.commit();
//		}
//		
//		//在Customer.hbm.xml中set标签中配置fetch="subselect" lazy="true"
//		@Test
//		public void test5(){
//			Session session = HibernateUtils.getCurrentSession();
//			Transaction transaction = session.beginTransaction();
//			
//			List<Customer> list = session.createQuery("from Customer").list();//发送查询所有客户sql
//			
//			for (Customer customer : list) {
//				System.out.println(customer.getCust_name());
//				System.out.println(customer.getLinkMans().size());//发送一条子查询
//			}
//			
//			
//			transaction.commit();
//		}
	//在Customer.hbm.xml中set标签中配置fetch="subselect" lazy="false"
			@Test
			public void test5(){
				Session session = HibernateUtils.getCurrentSession();
				Transaction transaction = session.beginTransaction();
				
				List<Customer> list = session.createQuery("from Customer").list();//发送查询所有客户sql,发送一条子查询
				
				for (Customer customer : list) {
					System.out.println(customer.getCust_name());
					System.out.println(customer.getLinkMans().size());
				}
				
				
				transaction.commit();
			}
}
