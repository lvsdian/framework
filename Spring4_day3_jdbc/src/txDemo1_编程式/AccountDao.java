package txDemo1_���ʽ;

/**
 * ת�˵�dao�ӿ�
 * @author LSD
 *
 */
public interface AccountDao {
	public void outMoney(String from,Double money);
	public void inMoney(String to,Double money);
}
