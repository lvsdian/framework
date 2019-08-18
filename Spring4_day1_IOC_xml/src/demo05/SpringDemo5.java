package demo05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo5 {

	@Test
	/**
	 * ��������ע��
	 */
	public void test1(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("CollectionBean");
		System.out.println(collectionBean);
	}
}
