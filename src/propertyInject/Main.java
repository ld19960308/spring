package propertyInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("propertyInject/bean.xml");
		/*System.out.println(((Son)ctx.getBean("son")).getAge());
		Son son1=(Son)ctx.getBean("son1");
		System.out.println(son1.getAge());
		System.out.println(((Son)ctx.getBean("son2")).getAge());
		System.out.println(ctx.getBean("age"));
		System.out.println(((Son)ctx.getBean("son3")).getAge());
		System.out.println(((Son)ctx.getBean("son4")).getAge());*/
		System.out.println(ctx.getBean("javaVersion"));
	}

}
