package demo02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo02 {

	@Test
	/**
	 * ������������
	 * �������ļ���bean��ǩ����� init-method="init" destroy-method="destory"������bean����������(ע�ⷽ������Ҫ����)
	 *  Ȼ����CustomerDaoImpl����д����������(Ҫ��ִ�����ٷ��������ǵ�������û����bean������scope="prototype")
	 */
	public void test1(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDaoImpl customerDaoImpl = (CustomerDaoImpl)applicationContext.getBean("CustomerDao");
		customerDaoImpl.save();
		//ֻ��ִ����close()�����Ż�ִ��destory����,close()�����������з���������ClassPathXmlApplicationContext
		applicationContext.close();
	}
	
	@Test
	/**
	 * bean���÷�Χ������
	 *   �������ļ���bean��ǩ�����scope����,
	 *   singletonΪ������prototypeΪ����
	 */
	public void test2(){
		
	}
}
