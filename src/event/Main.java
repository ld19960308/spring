package event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("event/bean.xml");
		EmailEvent e=new EmailEvent("hello","spring_test@163.com","this is a test");
		ctx.publishEvent(e);

	}

}
