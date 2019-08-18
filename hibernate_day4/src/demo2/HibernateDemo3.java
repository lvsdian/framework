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
 * <many-to-one>上的fetch和lazy
 * @author LSD
 *
 */
public class HibernateDemo3 {

	//默认
	@Test
	public void test1(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		LinkMan linkMan = session.get(LinkMan.class, 1l);//发送一条查联系人
		System.out.println(linkMan.getLkm_name());
		System.out.println(linkMan.getCustomer().getCust_name());//查询联系人关联的客户
	}
	
	//<many-to-one>配置fetch="select" lazy="proxy"
	@Test
	public void test2(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		LinkMan linkMan = session.get(LinkMan.class, 1l);//发送一条查联系人
		System.out.println(linkMan.getLkm_name());
		System.out.println(linkMan.getCustomer().getCust_name());//查询联系人关联的客户
	}
	
	//<many-to-one>配置fetch="select" lazy="false"
		@Test
		public void test3(){
			Session session = HibernateUtils.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			
			LinkMan linkMan = session.get(LinkMan.class, 1l);//发送一条查联系人,再发一条查询联系人关联的客户
			System.out.println(linkMan.getLkm_name());
			System.out.println(linkMan.getCustomer().getCust_name());
		}
		
	//<many-to-one>配置fetch="join" lazy="失效"，直接发送迫切左外连接,lazy失效
		@Test
		public void test4(){
			Session session = HibernateUtils.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			
			LinkMan linkMan = session.get(LinkMan.class, 1l);//发送一条迫切左外连接
			System.out.println(linkMan.getLkm_name());
			System.out.println(linkMan.getCustomer().getCust_name());
		}
}
