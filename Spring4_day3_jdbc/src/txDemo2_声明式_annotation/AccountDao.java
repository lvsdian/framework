package txDemo2_����ʽ_annotation;

/**
 * ת�˵�dao�ӿ�
 * @author LSD
 *
 */
public interface AccountDao {

	public void outMoney(String from,Double money);
	public void inMoney(String to,Double money);
}
