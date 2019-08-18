package demo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 * @author LSD
 *
 */
public class MyAspectXML {

	/**
	 * 前置通知
	 */
	public void checkPri(JoinPoint joinPoint){
		System.out.println("前置通知======================" + joinPoint);
	}
	
	/**
	 * 后置通知
	 * 	这里的result根据配置文件中returning值而来，与returning的值必须一样，
	 *      但returning的值可以随便取
	 */
	public void writeLog(Object result){
		System.out.println("后置通知========================" + result);
	}
	
	/**
	 * 环绕通知
	 * @throws Throwable 
	 */
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("环绕前通知============");
		Object obj = proceedingJoinPoint.proceed();
		System.out.println("环绕后通后============");
		return obj;
	}
	
	/**
	 * 异常抛出通知
	 */
	public void afterThrowing(Throwable e){
		System.out.println("异常抛出通知" + e.getMessage());
	}
	
	/**
	 * 最终通知---相当于finally代码块中的内容
	 */
	public void after(){
		System.out.println("最终通知");
	}
}

