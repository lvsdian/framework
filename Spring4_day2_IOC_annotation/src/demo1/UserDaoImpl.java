package demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("UserDao")//�൱�ڣ�<bean id="UserDao" class="demo1.UserDaoImpl"> </bean>
//����һ���࣬������ཻ��Spring����
public class UserDaoImpl implements UserDao {

	//���name����û��set������@Value("����")��ж���⣬����о�д��set������
	private String name;
	@Value("����")
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void save() {
		System.out.println("dao�б����û��ķ���ִ����" + name);
	}
}
