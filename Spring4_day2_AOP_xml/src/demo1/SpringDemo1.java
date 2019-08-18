package demo1;

import org.junit.Test;

public class SpringDemo1 {

	@Test
	public void demo1(){
		UserDao userDao = new UserDaoImpl();
		//��������
		UserDao proxy = new JdkProxy(userDao).createProxy();
		proxy.save();
		proxy.delete();
		proxy.find();
		proxy.update();
	}
}