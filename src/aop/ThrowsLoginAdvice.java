package aop;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

public class ThrowsLoginAdvice implements ThrowsAdvice {
	private Logger logger=LogManager.getLogger(LogAdvice.class);
	public void afterThrowing(Method method,Object[] args,Object target,Throwable exceptionClass){
		String targetClassName=target.getClass().getName();
		String targetMethodName=method.getName();
		String logInfoText="异常通知:"+targetClassName+"类的"+targetMethodName+"方法出现异常";
		System.out.println(logInfoText);
		logger.info(logInfoText);
	}
	

}
