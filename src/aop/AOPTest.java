package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
	public static void main(String[] args)throws Exception{
		ApplicationContext context=new ClassPathXmlApplicationContext("aop/aop.xml");
		UserBiz userBiz=(UserBiz)context.getBean("userBiz");
		userBiz.addUser("123","123");
		userBiz.delUser(1);
		System.out.println("****************************************************");
		userBiz.arg("要传递的参数是123");
	}

}
