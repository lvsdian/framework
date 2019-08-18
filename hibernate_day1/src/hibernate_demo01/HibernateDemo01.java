package hibernate_demo01;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 

/**
 * hibernate入门案例
 * @author LSD
 *
 */
public class HibernateDemo01 {


	public static void main(String[] args) {
		//1.加载核心配置文件
		Configuration configuration = new Configuration().configure();
		
		//如果将hibernate.cfg.xml替换为hibernate.properties (hibernate.properties中无法配置映射文件)
		//那么第一步就是：Configuration configuration = new Configuration();
		//configuration.addResource("hibernate_demo01/Customer.hbm.xml");
		
		//2.创建一个SessionFactory,类似JDBC中连接池
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		//3.通过SessionFactory获取Session对象，类似JDBC中Connection
		Session session = sessionFactory.openSession();
		
		//4.手动开启事务
		Transaction transaction = session.beginTransaction();
		
		//5.编写代码
		
		Customer customer = new Customer();
		customer.setCust_name("某东");
		session.save(customer);
		
		//6.事务提交
		transaction.commit();
			
	}
}
