package aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("aop/annotation/aop.xml");
		Performer per=(Performer)ctx.getBean("performer");
		per.performance();		
		System.out.println("********************************");
		per.performances("li");
	}

}
