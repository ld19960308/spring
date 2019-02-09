package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AOPXmlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new FileSystemXmlApplicationContext("src/aop/aop.xml");
		UserBiz userBiz=(UserBiz)context.getBean("ub");
		userBiz.addUser("123","123");
		userBiz.delUser(1);

	}

}
