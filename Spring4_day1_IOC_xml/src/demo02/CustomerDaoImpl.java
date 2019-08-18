package demo02;

public class CustomerDaoImpl implements CustomerDao{
	public void init(){
		System.out.println("CustomerDaoImpl类开始初始化");
	}
	
	@Override
	public void save() {
		System.out.println("CustomerDaoImpl执行了");
	}
	
	public void destory(){
		System.out.println("CustomerDaoImpl类被销毁");
	}
}
