package demo01;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import domain.Customer;
import domain.LinkMan;

public class HibernateDmeo01 {

//	@Test
//	//���������ͻ���������ϵ�ˣ����ҽ����ù�ϵ
//	public void test1(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//�����ͻ�
//		Customer customer1 = new Customer();
//		customer1.setCust_name("��");
//		Customer customer2 = new Customer();
//		customer2.setCust_name("��");
//		
//		//������ϵ��
//		LinkMan linkMan1 = new LinkMan();
//		linkMan1.setLkm_name("��");
//		LinkMan linkMan2 = new LinkMan();
//		linkMan2.setLkm_name("��");
//		LinkMan linkMan3 = new LinkMan();
//		linkMan3.setLkm_name("��");
//		
//		//���ù�ϵ
//		linkMan1.setCustomer(customer1);
//		linkMan2.setCustomer(customer2);
//		linkMan3.setCustomer(customer1);
//	
//		customer1.getLinkMans().add(linkMan1);
//		customer1.getLinkMans().add(linkMan2);
//		customer2.getLinkMans().add(linkMan3);
//		
//		//��������
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
//	//һ�Զ��ϵֻ����һ��
//	public void test2(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//һ���ͻ�
//		Customer customer1 = new Customer();
//		customer1.setCust_name("��");
//		
//		//һ����ϵ��
//		LinkMan linkMan1 = new LinkMan();
//		linkMan1.setLkm_name("��");
//		 
//		//���ù�ϵ
//		linkMan1.setCustomer(customer1);
//	
//		customer1.getLinkMans().add(linkMan1);
//		
//		//����һ�ߣ������ԣ���˲ʱ�����쳣���־�̬�������һ��˲ʱ̬����
//		session.save(customer1);
//		
//		transaction.commit();
//	}
//	
//	@Test
//	/**
//	 * �����������²���
//	 * 		����ͻ�������ϵ�ˣ����������ǿͻ�������Ҫ�ڿͻ�ӳ���ļ�������
//	 */
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//һ���ͻ�
//		Customer customer1 = new Customer();
//		customer1.setCust_name("��");
//		
//		//һ����ϵ��
//		LinkMan linkMan1 = new LinkMan();
//		linkMan1.setLkm_name("��");
//		 
//		//���ù�ϵ
//		linkMan1.setCustomer(customer1);
//	
//		customer1.getLinkMans().add(linkMan1);
//		
//		//����һ�ߣ������ԣ����ü��������
//		session.save(customer1);
//		
//		transaction.commit();
//	}
//	
//	@Test
//	/**
//	 * �����������²���
//	 * 		������ϵ�ˣ�������������ϵ�˶�����Ҫ����ϵ��ӳ���ļ�������
//	 */
//	public void test4(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//һ���ͻ�
//		Customer customer1 = new Customer();
//		customer1.setCust_name("1");
//		
//		//һ����ϵ��
//		LinkMan linkMan1 = new LinkMan();
//		linkMan1.setLkm_name("2");
//		 
//		//���ù�ϵ
//		linkMan1.setCustomer(customer1);
//	
//		customer1.getLinkMans().add(linkMan1);
//		
//		//����һ�ߣ������ԣ����ü��������
//		session.save(linkMan1);
//		
//		transaction.commit();
//	}
	
//	@Test
//	/**
//	 * ���Զ��󵼺�
//	 * 		ǰ�᣺һ�Զ��˫��������cascade="sava-update"
//	 */
//	public void test5(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//һ���ͻ�
//		Customer customer1 = new Customer();
//		customer1.setCust_name("1");
//		
//		//������ϵ��
//		LinkMan linkMan1 = new LinkMan();
//		linkMan1.setLkm_name("����");
//		LinkMan linkMan2 = new LinkMan();
//		linkMan2.setLkm_name("����");
//		LinkMan linkMan3 = new LinkMan();
//		linkMan3.setLkm_name("���绨");
//		 
//		//���ù�ϵ
//		linkMan1.setCustomer(customer1);
//		customer1.getLinkMans().add(linkMan2);
//		customer1.getLinkMans().add(linkMan3);
//		
//		//˫����������cascade
//		//session.save(linkMan1);//4��insert���
//		//session.save(linkMan2);//1��insert���
//		session.save(customer1);//3��insert���
//		
//		transaction.commit();
//	}
	
//	@Test
//	/**
//	 * ����ɾ����
//	 * 		ɾ���ͻ�������ϵ��
//	 * 		ɾ���ͻ���ͬʱɾ����ϵ�ˣ��ڿͻ������ļ������ü���ɾ����cascade=delete
//	 */
//	public void test6(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//û�����ü���ɾ����Ĭ�����:�޸�����ϵ�˵������ɾ���ͻ�
////		Customer customer = session.get(Customer.class, 1l);
////		session.delete(customer);
//		
//		//ɾ���ͻ���ͬʱɾ����ϵ�ˣ��ڿͻ������ļ������ü���ɾ����cascade=delete
//		Customer customer = session.get(Customer.class, 1l);
//		session.delete(customer);
//		
//		transaction.commit();
//	}
	
//	@Test
//	/**
//	 * ����ɾ����
//	 * 		ɾ����ϵ�˼����ͻ�
//	 * 		ɾ����ϵ�ˣ�ͬʱɾ���ͻ�������ϵ�������ļ������ü���ɾ����cascade=delete
//	 */
//	public void test7(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		
//		//ɾ����ϵ�ˣ�ͬʱɾ���ͻ�������ϵ�������ļ������ü���ɾ����cascade=delete
//		LinkMan linkMan = session.get(LinkMan.class, 1l);
//		session.delete(linkMan);
//		
//		transaction.commit();
//	}
	
	@Test
	/**
	 * ��2����ϵ��ԭ����1�ſͻ��������ڸ�Ϊ2�ſͻ�
	 * 		��Customer�����ļ�������inverse="true",�������ά��Ȩ,���������ֻ����һ��update��䣬����ᷢ����
	 */
	public void test8(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		//��ѯ2����ϵ��
		LinkMan linkMan = session.get(LinkMan.class, 2l);
		//��ѯ2�ſͻ�
		Customer customer = session.get(Customer.class, 2l);
		
		//˫�����
		linkMan.setCustomer(customer);
		customer.getLinkMans().add(linkMan);
		
		transaction.commit();
	}
	
//	@Test
//	/**
//	 * cascade��inverse������
//	 * 		inverseֻ�����
//	 * 		�������������ڱ�����customer,����cascade���ã��������
//	 * 			linkMan����linkManҲ�ᱣ�棬������inverseΪtrue,
//	 * 			����linkMan�����Ϊ��
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
//		//��������Customer.hbm.xml�ϵ�set�������� cascade="save-update",inverse="true"
//		session.save(customer);
//		
//		transaction.commit();
//	}
}

