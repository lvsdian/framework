package demo3;

public class ProductDaoImpl implements ProductDao{

	@Override
	public void save() {
		System.out.println("������Ʒ");
	}

	@Override
	public void update() {
		System.out.println("������Ʒ");
	}

	@Override
	public void find() {
		System.out.println("���Ҵ���Ʒ");
	}

	@Override
	public String delete() {
		System.out.println("ɾ����Ʒ");
		return "���Ժ���֪ͨ�ķ���ֵ";
	}
}
