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
		String logInfoText="前置通知:"+targetClassName+"类的"+targetMethodName+"方法开始执行";
		System.out.println(logInfoText);
		logger.info(logInfoText);
	}
	public void myAfterReturnAdvice(JoinPoint joinPoint){
		String targetClassName=joinPoint.getTarget().getClass().getName();
		String targetMethodName=joinPoint.getSignature().getName();
		String logInfoText="后置通知:"+targetClassName+"类的"+targetMethodName+"方法开始执行";
		System.out.println(logInfoText);
		logger.info(logInfoText);
	}
	public void myThrowingAdvice(JoinPoint jointPoint,Exception e){
		String targetClassName=jointPoint.getTarget().getClass().getName();
		String targetMethodName=jointPoint.getSignature().getName();
		String logInfoText="异常通知:"+targetClassName+"类的"+targetMethodName+"方法出现异常";
		System.out.println(logInfoText);
		logger.info(logInfoText);
	}
    public void myAroundAdvice(ProceedingJoinPoint joinPoint)throws Throwable{
    	long beginTime=System.currentTimeMillis();
    	joinPoint.proceed();
    	long endTime=System.currentTimeMillis();
    	String targetMethodName=joinPoint.getSignature().getName();
    	String logInfoText="环绕通知:"+targetMethodName+"方法调用前时间"+beginTime+"豪秒"+"调用后时间"+endTime/1000+"豪秒";
    	System.out.println(logInfoText);
    	logger.info(logInfoText);
    }
    public void beforeAdviceAndArgs(JoinPoint joinPoint,String args){
    	String targetClassName=joinPoint.getTarget().getClass().getName();
		String targetMethodName=joinPoint.getSignature().getName();
		String logInfoText="前置通知:"+targetClassName+"类的"+targetMethodName+"方法开始执行"+" 参数"+args;
		System.out.println(logInfoText);
		logger.info(logInfoText);
    }
}
