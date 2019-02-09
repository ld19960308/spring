package aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AllLogAdvice {
	private Logger logger=LogManager.getLogger(AllLogAdvice.class);
	public void myBeforeAdvice(JoinPoint joinPoint){
		String targetClassName=joinPoint.getTarget().getClass().getName();
		String targetMethodName=joinPoint.getSignature().getName();
		String logInfoText="ǰ��֪ͨ:"+targetClassName+"���"+targetMethodName+"������ʼִ��";
		System.out.println(logInfoText);
		logger.info(logInfoText);
	}
	public void myAfterReturnAdvice(JoinPoint joinPoint){
		String targetClassName=joinPoint.getTarget().getClass().getName();
		String targetMethodName=joinPoint.getSignature().getName();
		String logInfoText="����֪ͨ:"+targetClassName+"���"+targetMethodName+"������ʼִ��";
		System.out.println(logInfoText);
		logger.info(logInfoText);
	}
	public void myThrowingAdvice(JoinPoint jointPoint,Exception e){
		String targetClassName=jointPoint.getTarget().getClass().getName();
		String targetMethodName=jointPoint.getSignature().getName();
		String logInfoText="�쳣֪ͨ:"+targetClassName+"���"+targetMethodName+"���������쳣";
		System.out.println(logInfoText);
		logger.info(logInfoText);
	}
    public void myAroundAdvice(ProceedingJoinPoint joinPoint)throws Throwable{
    	long beginTime=System.currentTimeMillis();
    	joinPoint.proceed();
    	long endTime=System.currentTimeMillis();
    	String targetMethodName=joinPoint.getSignature().getName();
    	String logInfoText="����֪ͨ:"+targetMethodName+"��������ǰʱ��"+beginTime+"����"+"���ú�ʱ��"+endTime/1000+"����";
    	System.out.println(logInfoText);
    	logger.info(logInfoText);
    }
    public void beforeAdviceAndArgs(JoinPoint joinPoint,String args){
    	String targetClassName=joinPoint.getTarget().getClass().getName();
		String targetMethodName=joinPoint.getSignature().getName();
		String logInfoText="ǰ��֪ͨ:"+targetClassName+"���"+targetMethodName+"������ʼִ��"+" ����"+args;
		System.out.println(logInfoText);
		logger.info(logInfoText);
    }
}
