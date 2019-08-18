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
 * 切面类
 * @author LSD
 *
 */

@Aspect
public class MyAspectAnno {

	//前置通知
	@Before(value = "execution(* demo1.OrderDao.save(..))")
	public void before(){
		System.out.println("前置通知================");
	} 
	
	//后置通知---方法参数必须与returning值一样
	@AfterReturning(value = "execution(* demo1.OrderDao.delete(..))",returning="result")
	public void AfterReturning(Object result){
		System.out.println("后置通知================"+result);
	} 
	
	//环绕通知
	@Around(value = "execution(* demo1.OrderDao.update(..))")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("环绕前================");
		Object obj = proceedingJoinPoint.proceed();
		System.out.println("环绕后================");
		return obj;
	} 
	
	//异常抛出通知
	@AfterThrowing(value = "execution(* demo1.OrderDao.find(..))",throwing="e")
	public void afterThrowing(Throwable e){
		System.out.println("异常抛出通知================"+e.getMessage());
	} 
	
	//最终通知
	@After(value = "execution(* demo1.OrderDao.find(..))")
	public void after(){
		System.out.println("最终通知================");
	} 
	
	
	
	/**
	 * 简写方式：
	 *        自定义一个方法，比如pointcut1，给这个方法配一个@Pointcut注解，
	 *        注解的value值如果是execution(* demo1.OrderDao.find(..))，
	 *        那么用到execution(* demo1.OrderDao.find(..))的地方就可以用【这个类的类名】.pointcut1()替代
	 */
	@Pointcut(value="execution(* demo1.OrderDao.find(..))")
	private void pointcut1(){}
}
