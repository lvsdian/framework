package demo02;

public class CustomerDaoImpl implements CustomerDao{
	public void init(){
		System.out.println("CustomerDaoImpl�࿪ʼ��ʼ��");
	}
	
	@Override
	public void save() {
		System.out.println("CustomerDaoImplִ����");
	}
	
	public void destory(){
		System.out.println("CustomerDaoImpl�౻����");
	}
}
