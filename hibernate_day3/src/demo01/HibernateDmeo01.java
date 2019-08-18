package demo01;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import domain.Customer;
import domain.LinkMan;

public class HibernateDmeo01 {

//	@Test
//	//保存两个客户，三个联系人，并且建立好关系
//	public void test1(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//两个客户
//		Customer customer1 = new Customer();
//		customer1.setCust_name("东");
//		Customer customer2 = new Customer();
//		customer2.setCust_name("西");
//		
//		//三个联系人
//		LinkMan linkMan1 = new LinkMan();
//		linkMan1.setLkm_name("甲");
//		LinkMan linkMan2 = new LinkMan();
//		linkMan2.setLkm_name("乙");
//		LinkMan linkMan3 = new LinkMan();
//		linkMan3.setLkm_name("丙");
//		
//		//设置关系
//		linkMan1.setCustomer(customer1);
//		linkMan2.setCustomer(customer2);
//		linkMan3.setCustomer(customer1);
//	
//		customer1.getLinkMans().add(linkMan1);
//		customer1.getLinkMans().add(linkMan2);
//		customer2.getLinkMans().add(linkMan3);
//		
//		//保存数据
//		session.save(linkMan1);
//		session.save(linkMan2);
//		session.save(linkMan3);
//		session.save(customer1);
//		session.save(customer2);
//		
//		transaction.commit();
//	}
//	
//	@Test
//	//一对多关系只保存一边
//	public void test2(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//一个客户
//		Customer customer1 = new Customer();
//		customer1.setCust_name("东");
//		
//		//一个联系人
//		LinkMan linkMan1 = new LinkMan();
//		linkMan1.setLkm_name("甲");
//		 
//		//设置关系
//		linkMan1.setCustomer(customer1);
//	
//		customer1.getLinkMans().add(linkMan1);
//		
//		//保存一边：不可以，报瞬时对象异常，持久态对象关联一个瞬时态对象
//		session.save(customer1);
//		
//		transaction.commit();
//	}
//	
//	@Test
//	/**
//	 * 级联保存或更新操作
//	 * 		保存客户级联联系人，操作主题是客户对象，需要在客户映射文件中配置
//	 */
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//一个客户
//		Customer customer1 = new Customer();
//		customer1.setCust_name("东");
//		
//		//一个联系人
//		LinkMan linkMan1 = new LinkMan();
//		linkMan1.setLkm_name("甲");
//		 
//		//设置关系
//		linkMan1.setCustomer(customer1);
//	
//		customer1.getLinkMans().add(linkMan1);
//		
//		//保存一边：不可以，配置级联后可以
//		session.save(customer1);
//		
//		transaction.commit();
//	}
//	
//	@Test
//	/**
//	 * 级联保存或更新操作
//	 * 		保存联系人，操作主题是联系人对象，需要在联系人映射文件中配置
//	 */
//	public void test4(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//一个客户
//		Customer customer1 = new Customer();
//		customer1.setCust_name("1");
//		
//		//一个联系人
//		LinkMan linkMan1 = new LinkMan();
//		linkMan1.setLkm_name("2");
//		 
//		//设置关系
//		linkMan1.setCustomer(customer1);
//	
//		customer1.getLinkMans().add(linkMan1);
//		
//		//保存一边：不可以，配置级联后可以
//		session.save(linkMan1);
//		
//		transaction.commit();
//	}
	
//	@Test
//	/**
//	 * 测试对象导航
//	 * 		前提：一对多的双方都设置cascade="sava-update"
//	 */
//	public void test5(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//一个客户
//		Customer customer1 = new Customer();
//		customer1.setCust_name("1");
//		
//		//三个联系人
//		LinkMan linkMan1 = new LinkMan();
//		linkMan1.setLkm_name("张三");
//		LinkMan linkMan2 = new LinkMan();
//		linkMan2.setLkm_name("李四");
//		LinkMan linkMan3 = new LinkMan();
//		linkMan3.setLkm_name("王如花");
//		 
//		//设置关系
//		linkMan1.setCustomer(customer1);
//		customer1.getLinkMans().add(linkMan2);
//		customer1.getLinkMans().add(linkMan3);
//		
//		//双方都设置了cascade
//		//session.save(linkMan1);//4条insert语句
//		//session.save(linkMan2);//1条insert语句
//		session.save(customer1);//3条insert语句
//		
//		transaction.commit();
//	}
	
//	@Test
//	/**
//	 * 级联删除：
//	 * 		删除客户级联联系人
//	 * 		删除客户，同时删除联系人，在客户配置文件中配置级联删除：cascade=delete
//	 */
//	public void test6(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//没有设置级联删除，默认情况:修改了联系人的外键，删除客户
////		Customer customer = session.get(Customer.class, 1l);
////		session.delete(customer);
//		
//		//删除客户，同时删除联系人，在客户配置文件中配置级联删除：cascade=delete
//		Customer customer = session.get(Customer.class, 1l);
//		session.delete(customer);
//		
//		transaction.commit();
//	}
	
//	@Test
//	/**
//	 * 级联删除：
//	 * 		删除联系人级联客户
//	 * 		删除联系人，同时删除客户，在联系人配置文件中配置级联删除：cascade=delete
//	 */
//	public void test7(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		
//		//删除联系人，同时删除客户，在联系人配置文件中配置级联删除：cascade=delete
//		LinkMan linkMan = session.get(LinkMan.class, 1l);
//		session.delete(linkMan);
//		
//		transaction.commit();
//	}
	
	@Test
	/**
	 * 将2号联系人原来归1号客户，现在在改为2号客户
	 * 		在Customer配置文件中配置inverse="true",放弃外键维护权,这样下面会只发送一条update语句，否则会发两条
	 */
	public void test8(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		//查询2号联系人
		LinkMan linkMan = session.get(LinkMan.class, 2l);
		//查询2号客户
		Customer customer = session.get(Customer.class, 2l);
		
		//双向关联
		linkMan.setCustomer(customer);
		customer.getLinkMans().add(linkMan);
		
		transaction.commit();
	}
	
//	@Test
//	/**
//	 * cascade与inverse的区别
//	 * 		inverse只管外键
//	 * 		下面例子中由于保存了customer,根据cascade配置，会关联到
//	 * 			linkMan，即linkMan也会保存，但由于inverse为true,
//	 * 			所以linkMan的外键为空
//	 * 	
//	 */
//	public void test8(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		Customer customer = new Customer();
//		customer.setCust_name("1");
//		
//		LinkMan linkMan = new LinkMan();
//		linkMan.setLkm_name("2");
//		
//		customer.getLinkMans().add(linkMan);
//		
//		//条件；在Customer.hbm.xml上的set中配置了 cascade="save-update",inverse="true"
//		session.save(customer);
//		
//		transaction.commit();
//	}
}

