package aop;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class AfterLoginAdvice implements AfterReturningAdvice {
	private Logger logger=LogManager.getLogger(LogAdvice.class);

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stubString
		String targetClassName=arg3.getClass().getName();
		String targetMethodName=arg1.getName();
		String logInfoText="����֪ͨ:"+targetClassName+"���"+targetMethodName+"������ʼִ��";
		System.out.println(logInfoText);
		logger.info(logInfoText);

	}

}
