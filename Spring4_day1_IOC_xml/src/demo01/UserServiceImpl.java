package demo01;
/**
 * �û�����ҵ���ʵ����
 * @author LSD
 *
 */
public class UserServiceImpl implements UserService {

	private   String name;
	@Override
	public void save1() {
		System.out.println("UserServiceִ����");
	}
	
	@Override
	public void save2(){
		System.out.println("UserServiceִ����" + name);
	}

	public void setName(String name) {
		this.name = name;
	}
}
