package aop;

import org.springframework.aop.framework.ProxyFactory;

public class Manager {
	public static void main(String[] args){
		Target target=new Target();
		ProxyFactory di=new ProxyFactory();
		//di.addAdvice(advice);;
		di.setTarget(target);
		Target proxy=(Target)di.getProxy();
		proxy.execute("AOP的简单实现");
	}

}
