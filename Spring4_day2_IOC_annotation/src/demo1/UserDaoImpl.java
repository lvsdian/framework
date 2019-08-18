package demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("UserDao")//相当于：<bean id="UserDao" class="demo1.UserDaoImpl"> </bean>
//修饰一个类，将这个类交给Spring管理
public class UserDaoImpl implements UserDao {

	//如果name属性没有set方法，@Value("张三")就卸载这，如果有就写在set方法上
	private String name;
	@Value("张三")
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void save() {
		System.out.println("dao中保存用户的方法执行了" + name);
	}
}
