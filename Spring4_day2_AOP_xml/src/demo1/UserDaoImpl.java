package demo1;

public class UserDaoImpl implements UserDao {
	@Override
	public void save() {
		System.out.println("�����û�");
	}

	@Override
	public void update() {
		System.out.println("�޸��û�");
	}

	@Override
	public void find() {
		System.out.println("��ѯ�û�");
	}

	@Override
	public void delete() {
		System.out.println("ɾ���û�");
	}
}
