package AnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Chinese p=(Chinese)ctx.getBean("chinese");
		p.use();
		//ctx.registerShutdownHook();
	}

}
