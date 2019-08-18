package demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
//public class SpringDemo3 {
//	@Resource(name="ProductDao")
//	private ProductDao productDao;
//	@Test
//	public void test(){
//		productDao.save();
//		productDao.update();
//		productDao.delete();
//		productDao.find();
//	}
//	
//}


public class SpringDemo3 {
	
	@Test
	public void test(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductDao productDao = (ProductDao)applicationContext.getBean(ProductDao.class);
				productDao.save();
				productDao.update();
				productDao.delete();
				productDao.find();
	}
	
}
