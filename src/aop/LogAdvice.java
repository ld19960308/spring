package aop;


import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.simple.SimpleLogger;
import org.springframework.aop.MethodBeforeAdvice;

public class LogAdvice implements MethodBeforeAdvice {
	private Logger logger=LogManager.getLogger(LogAdvice.class);
	public void before(Method method,Object[] args,Object target)
	throws Throwable{
		String targetClassName=target.getClass().getName();
		String targetMethodName=method.getName();
		String logInfoText="前置通知:"+targetClassName+"类的"+targetMethodName+"方法开始执行";
		System.out.println(logInfoText);
		logger.info(logInfoText);
	}

}
