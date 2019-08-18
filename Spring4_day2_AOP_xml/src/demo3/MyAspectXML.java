package demo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * ������
 * @author LSD
 *
 */
public class MyAspectXML {

	/**
	 * ǰ��֪ͨ
	 */
	public void checkPri(JoinPoint joinPoint){
		System.out.println("ǰ��֪ͨ======================" + joinPoint);
	}
	
	/**
	 * ����֪ͨ
	 * 	�����result���������ļ���returningֵ��������returning��ֵ����һ����
	 *      ��returning��ֵ�������ȡ
	 */
	public void writeLog(Object result){
		System.out.println("����֪ͨ========================" + result);
	}
	
	/**
	 * ����֪ͨ
	 * @throws Throwable 
	 */
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("����ǰ֪ͨ============");
		Object obj = proceedingJoinPoint.proceed();
		System.out.println("���ƺ�ͨ��============");
		return obj;
	}
	
	/**
	 * �쳣�׳�֪ͨ
	 */
	public void afterThrowing(Throwable e){
		System.out.println("�쳣�׳�֪ͨ" + e.getMessage());
	}
	
	/**
	 * ����֪ͨ---�൱��finally������е�����
	 */
	public void after(){
		System.out.println("����֪ͨ");
	}
}

