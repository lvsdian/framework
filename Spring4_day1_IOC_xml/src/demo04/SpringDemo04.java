package demo04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����ע�뷽��
 * @author LSD
 *
 */
public class SpringDemo04 {

	@Test
	/**
	 * ���췽����������
	 */
	public void demo1(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car1 car1 = (Car1)applicationContext.getBean("Car1");
		System.out.println(car1);
	}
	
	@Test
	/**
	 * set������������
	 */
	public void demo2(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car2 car2 = (Car2)applicationContext.getBean("Car2");
		System.out.println(car2);
	}
	
	@Test
	/**
	 * set�������ö�������
	 */
	public void demo3(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)applicationContext.getBean("Person");
		System.out.println(person);
	}
	@Test
	/**
	 * ʹ��P���ƿռ�(2.5�Ժ�汾)
	}
	 */
	public void demo4(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)applicationContext.getBean("Person");
		System.out.println(person);
	}
	
	@Test
	/**
	 * ʹ��SpEL(3.0�Ժ�汾)
	 */
	public void demo5(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)applicationContext.getBean("Person");
		System.out.println(person);
	}
}
