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
 * <set>�ϵ�fetch��lazy
 * @author LSD
 *
 */
public class HibernateDemo2 {

//	//Ĭ�ϲ�����fetch��lazyһ�»ᷢ������sql��䣬����
//	//Customer.hbm.xml��set��ǩ������fetch="select" lazy="true"���һ��
//	@Test
//	public void test1(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//��ѯ1�ſͻ�
//		Customer customer = session.get(Customer.class, 1l);//����һ��sql����ͻ�
//		System.out.println(customer);
//		
//		for (LinkMan linkMan : customer.getLinkMans()) {//�ٷ���һ��sql������ϵ��
//			System.out.println(linkMan.getLkm_name());
//		}
//		
//		transaction.commit();
//	}
//	
//	//��Customer.hbm.xml��set��ǩ������fetch="select" lazy="false"���ӳٷ���sql��䣬����������
//	@Test
//	public void test2(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//��ѯ1�ſͻ�
//		Customer customer = session.get(Customer.class, 1l);//����һ��sql����ͻ����ٷ���һ��sql������ϵ��
//		System.out.println(customer);
//		
//		for (LinkMan linkMan : customer.getLinkMans()) {
//			System.out.println(linkMan.getLkm_name());
//		}
//		
//		transaction.commit();
//	}
//
//	//��Customer.hbm.xml��set��ǩ������fetch="select" lazy="extra"���ӳٷ���sql��䣬����������
//	@Test
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//��ѯ1�ſͻ�
//		Customer customer = session.get(Customer.class, 1l);//����һ��sql����ͻ�
//		System.out.println(customer);
//		
//		for (LinkMan linkMan : customer.getLinkMans()) {//����һ����count�����
//			System.out.println(linkMan.getLkm_name());//���Ͳ�ѯ��ϵ�˵����
//		}
//		
//		transaction.commit();
//	}
//	
//	//��Customer.hbm.xml��set��ǩ������fetch="join" lazy="ʧЧ"������lazy��ʧЧ,
//		@Test
//		public void test4(){
//			Session session = HibernateUtils.getCurrentSession();
//			Transaction transaction = session.beginTransaction();
//			
//			//��ѯ1�ſͻ�
//			Customer customer = session.get(Customer.class, 1l);//����һ�������������Ӳ�ѯ�����ж��鵽�ˣ����治�������
//			System.out.println(customer);
//			
//			for (LinkMan linkMan : customer.getLinkMans()) {
//				System.out.println(linkMan.getLkm_name());
//			}
//			
//			transaction.commit();
//		}
//		
//		//��Customer.hbm.xml��set��ǩ������fetch="subselect" lazy="true"
//		@Test
//		public void test5(){
//			Session session = HibernateUtils.getCurrentSession();
//			Transaction transaction = session.beginTransaction();
//			
//			List<Customer> list = session.createQuery("from Customer").list();//���Ͳ�ѯ���пͻ�sql
//			
//			for (Customer customer : list) {
//				System.out.println(customer.getCust_name());
//				System.out.println(customer.getLinkMans().size());//����һ���Ӳ�ѯ
//			}
//			
//			
//			transaction.commit();
//		}
	//��Customer.hbm.xml��set��ǩ������fetch="subselect" lazy="false"
			@Test
			public void test5(){
				Session session = HibernateUtils.getCurrentSession();
				Transaction transaction = session.beginTransaction();
				
				List<Customer> list = session.createQuery("from Customer").list();//���Ͳ�ѯ���пͻ�sql,����һ���Ӳ�ѯ
				
				for (Customer customer : list) {
					System.out.println(customer.getCust_name());
					System.out.println(customer.getLinkMans().size());
				}
				
				
				transaction.commit();
			}
}
