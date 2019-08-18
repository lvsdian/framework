package txDemo1_编程式;

/**
 * 转账的业务层接口
 * @author LSD
 *
 */
public interface AccountService {
	public void transfer(String from,String to,Double money);
}
