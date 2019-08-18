package txDemo1_���ʽ;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * ת�˵�ҵ���ӿ�ʵ��
 * @author LSD
 *
 */
public class AccountServiceImpl implements AccountService {
	//ע��dao
	private AccountDao accountDao;
	//ע����������ģ��
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
//	// ע��DAO:
//	private AccountDao accountDao;
//	
//	public void setAccountDao(AccountDao accountDao) {
//		this.accountDao = accountDao;
//	}
//	
//	@Override
//	/**
//	 * from��ת���˺�
//	 * to��ת���˺�
//	 * money��ת�˽��
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
