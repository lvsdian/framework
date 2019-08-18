package demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo02 {

	@Test
	/**
	 * ע��������������
	 */
	public void test1(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = (CustomerService)applicationContext.getBean("CustomerService");
		System.out.println(customerService);
		applicationContext.close();		
	}
	
	@Test
	/**
	 * ע������������@scope
	 */
	public void test2(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService1 = (CustomerService)applicationContext.getBean("CustomerService");
		CustomerService customerService2 = (CustomerService)applicationContext.getBean("CustomerService");
		System.out.println(customerService1);
		System.out.println(customerService2);
	}
}
