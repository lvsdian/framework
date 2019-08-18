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
 * <many-to-one>�ϵ�fetch��lazy
 * @author LSD
 *
 */
public class HibernateDemo3 {

	//Ĭ��
	@Test
	public void test1(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		LinkMan linkMan = session.get(LinkMan.class, 1l);//����һ������ϵ��
		System.out.println(linkMan.getLkm_name());
		System.out.println(linkMan.getCustomer().getCust_name());//��ѯ��ϵ�˹����Ŀͻ�
	}
	
	//<many-to-one>����fetch="select" lazy="proxy"
	@Test
	public void test2(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		LinkMan linkMan = session.get(LinkMan.class, 1l);//����һ������ϵ��
		System.out.println(linkMan.getLkm_name());
		System.out.println(linkMan.getCustomer().getCust_name());//��ѯ��ϵ�˹����Ŀͻ�
	}
	
	//<many-to-one>����fetch="select" lazy="false"
		@Test
		public void test3(){
			Session session = HibernateUtils.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			
			LinkMan linkMan = session.get(LinkMan.class, 1l);//����һ������ϵ��,�ٷ�һ����ѯ��ϵ�˹����Ŀͻ�
			System.out.println(linkMan.getLkm_name());
			System.out.println(linkMan.getCustomer().getCust_name());
		}
		
	//<many-to-one>����fetch="join" lazy="ʧЧ"��ֱ�ӷ���������������,lazyʧЧ
		@Test
		public void test4(){
			Session session = HibernateUtils.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			
			LinkMan linkMan = session.get(LinkMan.class, 1l);//����һ��������������
			System.out.println(linkMan.getLkm_name());
			System.out.println(linkMan.getCustomer().getCust_name());
		}
}
