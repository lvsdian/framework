package demo1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {

	
	@Resource(name="OrderDao")
	private OrderDao orderDao;
	
	@Test 
	public void test1(){
		orderDao.save();
		orderDao.delete();
		orderDao.update();
		orderDao.find();
	}
}
