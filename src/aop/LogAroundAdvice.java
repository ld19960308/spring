package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogAroundAdvice implements MethodInterceptor {
    private Logger logger=LogManager.getLogger(LogAdvice.class);
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
    	long beginTime=System.currentTimeMillis();
    	arg0.proceed();
    	long endTime=System.currentTimeMillis();
    	String targetMethodName=arg0.getMethod().getName();
    	String logInfoText="环绕通知:"+targetMethodName+"方法调用前时间"+beginTime+"豪秒"+"调用后时间"+endTime/1000+"豪秒";
    	System.out.println(logInfoText);
    	logger.info(logInfoText);
		return null;
	}

}
