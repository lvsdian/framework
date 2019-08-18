package txDemo1_编程式;

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
	//注入事务管理的模板
	private TransactionTemplate transactionTemplate;
	
	@Override
	public void transfer(final String from,final String to,final Double money) {

		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				
				accountDao.outMoney(from, money);
				int i = 1 / 0;
				accountDao.inMoney(to, money);
			}
		});
	}
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void setAccountDao(AccountDao accountDao){
		this.accountDao = accountDao;
	}
}
//public class AccountServiceImpl implements AccountService {
//
//	// 注入DAO:
//	private AccountDao accountDao;
//	
//	public void setAccountDao(AccountDao accountDao) {
//		this.accountDao = accountDao;
//	}
//	
//	@Override
//	/**
//	 * from：转出账号
//	 * to：转入账号
//	 * money：转账金额
//	 */
//	public void transfer( String from,  String to,  Double money) {
//		
//			accountDao.outMoney(from, money);
//			int d = 1/0;
//			accountDao.inMoney(to, money);
//		
//	}
//
//}
