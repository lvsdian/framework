package demo01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Spring 入门
 * @author LSD
 *
 */
public class SpringDemo01 {

	@Test
	/**
	 * 传统方式
	 */
	public void test1(){
		UserService userService = new UserServiceImpl();
		userService.save1();
	}
	
	@Test
	/**
	 * Spring方式调用-----IOC
	 * 
	 * 	在配置文件中配置接口和接口的实现，然后在这里读取xml文件根据接口名字得到实现类
	 */
	public void test2(){
		//创建Spring 工厂
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService userService = (UserService)applicationContext.getBean("UserService");
		System.out.println(22);
		userService.save1();
	}
	
	/**
	 * ClassPathXmlApplicationContext加载的是类路径下的配置文件，即src下的路径
	 * FileSystemXmlApplicationContext加载的是文件系统下的配置文件，即磁盘中的位置
	 */
	public void test3(){
		//创建Spring 工厂
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\applicationContext.xml");	
		UserService userService = (UserService)applicationContext.getBean("UserService");
		System.out.println(22);
		userService.save1();
	}
	@Test
	/**
	 * Spring--DI(依赖注入)
	 *  DI前提：实现IOC,即这个类要交给Spring去管理 
	 *  DI实例：接口的实现中有个name属性，可以在xml中用property标签配置它的值，实现类中必须
	 *          要有set方法。
	 *  
	 */
	public void test4(){
		//创建Spring 工厂
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService userService = (UserService)applicationContext.getBean("UserService");
		System.out.println(33);
		userService.save2();
	}
	
}
