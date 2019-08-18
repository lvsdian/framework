package txDemo2_����ʽ_xml;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * ת�˵�dao�ӿ�
 * @author LSD
 *
 */
public class AccountDaoImpl  extends JdbcDaoSupport implements AccountDao{

	@Override
	public void outMoney(String from, Double money) {
		this.getJdbcTemplate().update("update account set money = money - ? where name = ?",money,from);
	}

	@Override
	public void inMoney(String to, Double money) {
		
		this.getJdbcTemplate().update("update account set money = money + ? where name = ?",money,to);
	}

	
}
