package demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring��IOC��ע�⿪��
 * @author LSD
 *
 */
public class SpringDemo01 {

	@Test
	/**
	 * ��ͳ��ʽ
	 */
	public void test1(){
		UserDao userService = new UserDaoImpl();
		userService.save();
	}
	
	@Test
	/**
	 * Spring��IOCע��
	 */
	public void test2(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao)applicationContext.getBean("UserDao");
		System.out.println(22);
		userDao.save();
	}
	
	@Test
	/**
	 * Spring��IOC����ע��ע�⣬UserService��ע����UserDao
	 */
	public void test3(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService UserService = (UserService)applicationContext.getBean("UserService");
		System.out.println(33);
		UserService.save();
	}
}
