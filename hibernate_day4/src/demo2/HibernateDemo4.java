package demo2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import demo1.HibernateUtils;
import domain.Customer;
import domain.LinkMan;

/**
 * 批量获取
 * @author LSD
 *
 */
public class HibernateDemo4 {

	//在Customer.hbm.xml的set上配置
	//先查询客户，再查询每个客户对应的联系人
	//因为有三个客户，所有发4条语句，设置batch-size=4后就一次发四条语句
	//如果设置batch-size=5就发一次，一次发四条
	//如果设置batch-size=3就发两次，一次发3条，一次发一条
	
	@Test
	public void demo1(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<Customer> list = session.createQuery("from Customer").list();
		for (Customer customer : list) {
			System.out.println(customer.getCust_name());
			for (LinkMan linkMan : customer.getLinkMans()) {
				System.out.println(linkMan.getLkm_name());
			}
		}
		transaction.commit();
	}
	
	//在Customer.hbm.xml的class中配置batch-size
	//配置了batch-size=2,所以总共三条语句，发了两次
	@Test
	public void demo2(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		List<LinkMan> list = session.createQuery("from LinkMan").list();
		for (LinkMan linkMan : list) {
			System.out.println(linkMan.getLkm_name());
			System.out.println(linkMan.getCustomer().getCust_name());
		}
		transaction.commit();
	}
}
