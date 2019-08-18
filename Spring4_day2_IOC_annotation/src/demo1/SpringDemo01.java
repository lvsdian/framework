package demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring的IOC的注解开发
 * @author LSD
 *
 */
public class SpringDemo01 {

	@Test
	/**
	 * 传统方式
	 */
	public void test1(){
		UserDao userService = new UserDaoImpl();
		userService.save();
	}
	
	@Test
	/**
	 * Spring的IOC注解
	 */
	public void test2(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao)applicationContext.getBean("UserDao");
		System.out.println(22);
		userDao.save();
	}
	
	@Test
	/**
	 * Spring的IOC属性注入注解，UserService中注入了UserDao
	 */
	public void test3(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService UserService = (UserService)applicationContext.getBean("UserService");
		System.out.println(33);
		UserService.save();
	}
}
