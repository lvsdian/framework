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
 * hibernate������API-----Query,Criteria
 * @author LSD
 *
 */
public class HibernateDemo04 {


	@Test
	public void demo1(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		//ͨ��Session���Query�ӿ�
		//�򵥲�ѯ
		String hql = "from Customer";
		//������ѯ
//		String hql = "from Customer where cust_name like ?";
		
		Query query =session.createQuery(hql);
		//��ҳ����
		query.setFirstResult(0);//����limit���һ������
		query.setMaxResults(3);//����limit��ڶ�������
		
//		query.setParameter(0, "��%");
		
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
	
		//ʹ��session���Criteria�Ķ���

		//�򵥲�ѯ
//		Criteria criteria = session.createCriteria(Customer.class);
//		List <Customer> list = criteria.list();
		
		//������ѯ
//		Criteria criteria = session.createCriteria(Customer.class);
//		criteria.add(Restrictions.like("cust_name", "��%"));//Ҳ����ʹ�õ�������������ʾ%λ��
//		List <Customer> list = criteria.list();

		//��ҳ��ѯ
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
