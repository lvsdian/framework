package txDemo2_声明式_xml;

/**
 * 转账的dao接口
 * @author LSD
 *
 */
public interface AccountDao {

	public void outMoney(String from,Double money);
	public void inMoney(String to,Double money);
}
