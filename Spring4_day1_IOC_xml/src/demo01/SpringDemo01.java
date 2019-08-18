package demo01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Spring ����
 * @author LSD
 *
 */
public class SpringDemo01 {

	@Test
	/**
	 * ��ͳ��ʽ
	 */
	public void test1(){
		UserService userService = new UserServiceImpl();
		userService.save1();
	}
	
	@Test
	/**
	 * Spring��ʽ����-----IOC
	 * 
	 * 	�������ļ������ýӿںͽӿڵ�ʵ�֣�Ȼ���������ȡxml�ļ����ݽӿ����ֵõ�ʵ����
	 */
	public void test2(){
		//����Spring ����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService userService = (UserService)applicationContext.getBean("UserService");
		System.out.println(22);
		userService.save1();
	}
	
	/**
	 * ClassPathXmlApplicationContext���ص�����·���µ������ļ�����src�µ�·��
	 * FileSystemXmlApplicationContext���ص����ļ�ϵͳ�µ������ļ����������е�λ��
	 */
	public void test3(){
		//����Spring ����
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\applicationContext.xml");	
		UserService userService = (UserService)applicationContext.getBean("UserService");
		System.out.println(22);
		userService.save1();
	}
	@Test
	/**
	 * Spring--DI(����ע��)
	 *  DIǰ�᣺ʵ��IOC,�������Ҫ����Springȥ���� 
	 *  DIʵ�����ӿڵ�ʵ�����и�name���ԣ�������xml����property��ǩ��������ֵ��ʵ�����б���
	 *          Ҫ��set������
	 *  
	 */
	public void test4(){
		//����Spring ����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService userService = (UserService)applicationContext.getBean("UserService");
		System.out.println(33);
		userService.save2();
	}
	
}
