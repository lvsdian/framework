package demo02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo02 {

	@Test
	/**
	 * 生命周期配置
	 * 在配置文件的bean标签中添加 init-method="init" destroy-method="destory"来配置bean的生命周期(注意方法名不要括号)
	 *  然后在CustomerDaoImpl类中写这两个方法(要想执行销毁方法必须是单例，即没有在bean中配置scope="prototype")
	 */
	public void test1(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDaoImpl customerDaoImpl = (CustomerDaoImpl)applicationContext.getBean("CustomerDao");
		customerDaoImpl.save();
		//只有执行了close()方法才会执行destory方法,close()方法是子类中方法所以用ClassPathXmlApplicationContext
		applicationContext.close();
	}
	
	@Test
	/**
	 * bean作用范围的配置
	 *   在配置文件的bean标签中添加scope属性,
	 *   singleton为单例，prototype为多例
	 */
	public void test2(){
		
	}
}
