package hibernate_demo01;

import java.io.Serializable;
import java.nio.channels.SeekableByteChannel;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

/**
 * hibernate的其他API-----Query,Criteria
 * @author LSD
 *
 */
public class HibernateDemo04 {


	@Test
	public void demo1(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		//通过Session获得Query接口
		//简单查询
		String hql = "from Customer";
		//条件查询
//		String hql = "from Customer where cust_name like ?";
		
		Query query =session.createQuery(hql);
		//分页参数
		query.setFirstResult(0);//代表limit后第一个参数
		query.setMaxResults(3);//代表limit后第二个参数
		
//		query.setParameter(0, "王%");
		
		List<Customer> list = query.list();
		for (Customer customer : list) {
			System.out.println(customer);
		}
		transaction.commit();
	}
	
	@Test
	public void demo2(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
	
		//使用session获得Criteria的对象

		//简单查询
//		Criteria criteria = session.createCriteria(Customer.class);
//		List <Customer> list = criteria.list();
		
		//条件查询
//		Criteria criteria = session.createCriteria(Customer.class);
//		criteria.add(Restrictions.like("cust_name", "王%"));//也可以使用第三个参数，表示%位置
//		List <Customer> list = criteria.list();

		//分页查询
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.setFirstResult(1);
		criteria.setMaxResults(3);
		List <Customer> list = criteria.list();
		
		for ( Customer customer : list) {
			System.out.println(customer);
		}
		
		transaction.commit();
	}
	
}
