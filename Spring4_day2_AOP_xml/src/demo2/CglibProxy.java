package demo2;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * Cglib��̬����
 * @author LSD
 *
 */
public class CglibProxy implements MethodInterceptor{
	private CustomerDao customerDao;
	
	public CglibProxy(CustomerDao customerDao){
		this.customerDao = customerDao;
	}
	
	/**
	 * ʹ��cglib��������ķ���
	 */
	public CustomerDao createProxy(){
		//����cglib�ĺ��Ķ���
		Enhancer enhancer = new Enhancer();
		//���ø���
		enhancer.setSuperclass(customerDao.getClass());
		//���ûص�(������InvocationHandler����)
		enhancer.setCallback(this);
		//�����������
		CustomerDao customerDao = (CustomerDao)enhancer.create();
		return customerDao;
	}
	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		//�жϷ����Ƿ�Ϊsave
		if("save".equals(method.getName())){
			//��ǿ
			System.out.println("Ȩ��У��=================");
		}
		return methodProxy.invoke(customerDao, args);
	}
}
