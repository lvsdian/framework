package demo2;

import org.junit.Test;

import demo1.JdkProxy;
import demo1.UserDao;
import demo1.UserDaoImpl;

public class SpringDemo2 {

	@Test
	public void test(){
		CustomerDao customerDao = new CustomerDao();
		//创建代理
		CustomerDao proxy = new CglibProxy(customerDao).createProxy();
		proxy.save();
		proxy.delete();
		proxy.find();
		proxy.update();
	}
}
