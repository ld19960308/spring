package differentScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("differentScope/bean.xml");
		Chinese p=(Chinese)ctx.getBean("chinese");
		p.useAxe();
		p.useAxe();

	}

}
