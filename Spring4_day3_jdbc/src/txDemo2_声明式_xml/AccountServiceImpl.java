package txDemo2_声明式_xml;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账的业务层接口实现
 * @author LSD
 *
 */
public class AccountServiceImpl implements AccountService {

	//注入dao
	private AccountDao accountDao;
	
	@Override
	public void transfer(String from, String to, Double money) {
					
				accountDao.outMoney(from, money);
				int i = 1 / 0;
				accountDao.inMoney(to, money);
	}
	
	public void setAccountDao(AccountDao accountDao){
		this.accountDao = accountDao;
	}
}
