package demo1;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import domain.Customer;

/**
 * ≤‚ ‘SQL≤È—Ø
 * @author LSD
 *
 */
public class HibernateDemo3 {

	
		@Test
		public void test1(){	
			Session session  = HibernateUtils.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			
			SQLQuery sqlQuery = session.createSQLQuery("select * from cst_customer");
			
			sqlQuery.addEntity(Customer.class);
			
			List<Customer> list = sqlQuery.list();
			
			for (Customer customer : list) {
				System.out.println(customer);
			}
			
			transaction.commit();
		}			
}
