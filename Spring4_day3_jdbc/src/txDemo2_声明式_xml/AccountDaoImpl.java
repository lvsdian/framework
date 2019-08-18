package txDemo2_声明式_xml;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 转账的dao接口
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
