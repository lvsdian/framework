package txDemo2_����ʽ_xml;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ����ת�˻���
 * @author LSD
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx2_xml.xml")
public class SpringDemo2 {

	@Resource(name="AccountService")
	private AccountService accountService;
	
	@Test
	public void test1(){
		accountService.transfer("aaa", "bbb", 700d);
	}

	
}
