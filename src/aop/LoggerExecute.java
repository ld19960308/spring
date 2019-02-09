package aop;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class LoggerExecute implements MethodInterceptor {
	public LoggerExecute(){}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		before();
		return null;
	}
    public void before(){
    	System.out.println("Ö´ÐÐbefore·½·¨");
    }
	

}
