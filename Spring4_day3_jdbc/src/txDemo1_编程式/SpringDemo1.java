package txDemo1_编程式;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试转账环境
 * @author LSD
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx1.xml")
public class SpringDemo1 {

	@Resource(name="AccountService")
	private AccountService accountService;

	@Test
	public void test1(){
		accountService.transfer("aaa", "bbb", 700d);
	}
	/**
	 * 在AccountServiceImpl中添加代码
	 * 如果不使用事务，除零异常时，收账的没收到，转账的扣钱了
	 */
	
}
