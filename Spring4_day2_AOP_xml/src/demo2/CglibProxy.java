package demo2;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * Cglib动态代理
 * @author LSD
 *
 */
public class CglibProxy implements MethodInterceptor{
	private CustomerDao customerDao;
	
	public CglibProxy(CustomerDao customerDao){
		this.customerDao = customerDao;
	}
	
	/**
	 * 使用cglib产生代理的方法
	 */
	public CustomerDao createProxy(){
		//创建cglib的核心对象
		Enhancer enhancer = new Enhancer();
		//设置父类
		enhancer.setSuperclass(customerDao.getClass());
		//设置回调(类似于InvocationHandler对象)
		enhancer.setCallback(this);
		//创建代理对象
		CustomerDao customerDao = (CustomerDao)enhancer.create();
		return customerDao;
	}
	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		//判断方法是否为save
		if("save".equals(method.getName())){
			//增强
			System.out.println("权限校验=================");
		}
		return methodProxy.invoke(customerDao, args);
	}
}
