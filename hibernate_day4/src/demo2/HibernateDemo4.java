package demo2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import demo1.HibernateUtils;
import domain.Customer;
import domain.LinkMan;

/**
 * ������ȡ
 * @author LSD
 *
 */
public class HibernateDemo4 {

	//��Customer.hbm.xml��set������
	//�Ȳ�ѯ�ͻ����ٲ�ѯÿ���ͻ���Ӧ����ϵ��
	//��Ϊ�������ͻ������з�4����䣬����batch-size=4���һ�η��������
	//�������batch-size=5�ͷ�һ�Σ�һ�η�����
	//�������batch-size=3�ͷ����Σ�һ�η�3����һ�η�һ��
	
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
	
	//��Customer.hbm.xml��class������batch-size
	//������batch-size=2,�����ܹ�������䣬��������
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
