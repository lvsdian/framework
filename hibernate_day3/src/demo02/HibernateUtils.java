package demo02;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	public static final Configuration  configuration;
	public static final SessionFactory sessionFactory;
	static{
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
	}
	public static Session openSession(){
		return sessionFactory.openSession();
	}
	public static Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
}

