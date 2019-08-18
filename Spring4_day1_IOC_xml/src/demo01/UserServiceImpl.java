package demo01;
/**
 * 用户管理业务层实现类
 * @author LSD
 *
 */
public class UserServiceImpl implements UserService {

	private   String name;
	@Override
	public void save1() {
		System.out.println("UserService执行了");
	}
	
	@Override
	public void save2(){
		System.out.println("UserService执行了" + name);
	}

	public void setName(String name) {
		this.name = name;
	}
}
