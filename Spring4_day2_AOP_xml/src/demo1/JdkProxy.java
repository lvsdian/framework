package demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ʹ��JDK��̬�����UserDao
 * @author LSD
 *
 */
public class JdkProxy implements InvocationHandler{

	//��Ҫ��ǿ�Ķ��󴫵ݵ�������
	private UserDao userDao;
	public JdkProxy(UserDao userDao){
		this.userDao = userDao;
	}
	
	/**
	 * ����UserDao����ķ���
	 * @return
	 */
	public UserDao createProxy(){
		
		UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);
		return userDaoProxy;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//�жϷ������ǲ���save
		if("save".equals(method.getName())){
			System.out.println("Ȩ��У��");
		}
		return method.invoke(userDao, args);
	}
}
