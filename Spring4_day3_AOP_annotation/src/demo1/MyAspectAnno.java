package demo1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * ������
 * @author LSD
 *
 */

@Aspect
public class MyAspectAnno {

	//ǰ��֪ͨ
	@Before(value = "execution(* demo1.OrderDao.save(..))")
	public void before(){
		System.out.println("ǰ��֪ͨ================");
	} 
	
	//����֪ͨ---��������������returningֵһ��
	@AfterReturning(value = "execution(* demo1.OrderDao.delete(..))",returning="result")
	public void AfterReturning(Object result){
		System.out.println("����֪ͨ================"+result);
	} 
	
	//����֪ͨ
	@Around(value = "execution(* demo1.OrderDao.update(..))")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("����ǰ================");
		Object obj = proceedingJoinPoint.proceed();
		System.out.println("���ƺ�================");
		return obj;
	} 
	
	//�쳣�׳�֪ͨ
	@AfterThrowing(value = "execution(* demo1.OrderDao.find(..))",throwing="e")
	public void afterThrowing(Throwable e){
		System.out.println("�쳣�׳�֪ͨ================"+e.getMessage());
	} 
	
	//����֪ͨ
	@After(value = "execution(* demo1.OrderDao.find(..))")
	public void after(){
		System.out.println("����֪ͨ================");
	} 
	
	
	
	/**
	 * ��д��ʽ��
	 *        �Զ���һ������������pointcut1�������������һ��@Pointcutע�⣬
	 *        ע���valueֵ�����execution(* demo1.OrderDao.find(..))��
	 *        ��ô�õ�execution(* demo1.OrderDao.find(..))�ĵط��Ϳ����á�������������.pointcut1()���
	 */
	@Pointcut(value="execution(* demo1.OrderDao.find(..))")
	private void pointcut1(){}
}
