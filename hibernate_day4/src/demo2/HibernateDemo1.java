package demo2;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import demo1.HibernateUtils;
import domain.Customer;

/**
 * hibernate�༶���ӳټ���
 * @author LSD
 *
 */
public class HibernateDemo1 {

	//�༶���ӳټ���,��<class>��ǩ������lazy=true������load�����ͺ�get����һ��
	//��ʹ��ʱ�ŷ��Ͳ�ѯ���
	@Test
	public void test1(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		session.load(Customer.class, 1l);
		
		transaction.commit();
	}
	
}
