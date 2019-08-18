package txDemo2_����ʽ_annotation;

import org.springframework.transaction.annotation.Transactional;

/**
 * ת�˵�ҵ���ӿ�ʵ��
 * @author LSD
 *
 */
@Transactional
public class AccountServiceImpl implements AccountService {

	//ע��dao
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
