package jpa.containerEntity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jpa/containerEntity/jpa.xml");
		UserDao userDao=(UserDao)ctx.getBean("userDao");
		User user=userDao.getById(2);
		System.out.println(user.getUsername());
	}

}
