package demo03;
/**
 * Bean2�ľ�̬����
 * @author jt
 *
 */
public class Bean2Factory {

	public static Bean2 createBean2(){
		System.out.println("Bean2Factory�з���ִ����...");
		return new Bean2();
	}
}
