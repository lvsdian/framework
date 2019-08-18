package demo04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 属性注入方法
 * @author LSD
 *
 */
public class SpringDemo04 {

	@Test
	/**
	 * 构造方法设置属性
	 */
	public void demo1(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car1 car1 = (Car1)applicationContext.getBean("Car1");
		System.out.println(car1);
	}
	
	@Test
	/**
	 * set方法设置属性
	 */
	public void demo2(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car2 car2 = (Car2)applicationContext.getBean("Car2");
		System.out.println(car2);
	}
	
	@Test
	/**
	 * set方法设置对象类型
	 */
	public void demo3(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)applicationContext.getBean("Person");
		System.out.println(person);
	}
	@Test
	/**
	 * 使用P名称空间(2.5以后版本)
	}
	 */
	public void demo4(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)applicationContext.getBean("Person");
		System.out.println(person);
	}
	
	@Test
	/**
	 * 使用SpEL(3.0以后版本)
	 */
	public void demo5(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)applicationContext.getBean("Person");
		System.out.println(person);
	}
}
