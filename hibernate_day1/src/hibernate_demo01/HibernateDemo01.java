package hibernate_demo01;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 

/**
 * hibernate���Ű���
 * @author LSD
 *
 */
public class HibernateDemo01 {


	public static void main(String[] args) {
		//1.���غ��������ļ�
		Configuration configuration = new Configuration().configure();
		
		//�����hibernate.cfg.xml�滻Ϊhibernate.properties (hibernate.properties���޷�����ӳ���ļ�)
		//��ô��һ�����ǣ�Configuration configuration = new Configuration();
		//configuration.addResource("hibernate_demo01/Customer.hbm.xml");
		
		//2.����һ��SessionFactory,����JDBC�����ӳ�
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		//3.ͨ��SessionFactory��ȡSession��������JDBC��Connection
		Session session = sessionFactory.openSession();
		
		//4.�ֶ���������
		Transaction transaction = session.beginTransaction();
		
		//5.��д����
		
		Customer customer = new Customer();
		customer.setCust_name("ĳ��");
		session.save(customer);
		
		//6.�����ύ
		transaction.commit();
			
	}
}
