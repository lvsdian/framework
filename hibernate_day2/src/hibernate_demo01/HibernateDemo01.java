package hibernate_demo01;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * hibernate主键生成策略
 * @author LSD
 *
 */
public class HibernateDemo01 {

	//保存一条记录
	
	//持久化对象的三种状态
	@Test
	public void demo1(){
		Session session = HibernateUtils.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customer customer = new Customer();//瞬时态对象,没有唯一标识id,没有被session管理
		
		customer.setCust_name("zhangsan");
		Serializable id = session.save(customer);//持久态，被session管理有唯一标识oid
		
		System.out.println(customer);

		transaction.commit();
		session.close();  //session关闭，这之后没有被session管理，属于托管态
		
	}
	
	
}
