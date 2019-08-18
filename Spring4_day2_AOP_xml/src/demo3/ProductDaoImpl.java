package demo3;

public class ProductDaoImpl implements ProductDao{

	@Override
	public void save() {
		System.out.println("保存商品");
	}

	@Override
	public void update() {
		System.out.println("更改商品");
	}

	@Override
	public void find() {
		System.out.println("查找存商品");
	}

	@Override
	public String delete() {
		System.out.println("删除商品");
		return "测试后置通知的返回值";
	}
}
