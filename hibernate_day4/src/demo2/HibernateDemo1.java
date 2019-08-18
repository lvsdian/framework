package demo2;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import demo1.HibernateUtils;
import domain.Customer;

/**
 * hibernate类级别延迟加载
 * @author LSD
 *
 */
public class HibernateDemo1 {

	//类级别延迟加载,在<class>标签上配置lazy=true，这样load方法就和get方法一样
	//在使用时才发送查询语句
	@Test
	public void test1(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		session.load(Customer.class, 1l);
		
		transaction.commit();
	}
	
}
