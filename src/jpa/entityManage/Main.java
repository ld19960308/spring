package jpa.entityManage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jpa.containerEntity.User;
import jpa.containerEntity.UserDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jpa/entityManage/jpa.xml");
		UserDao userDao=(UserDao)ctx.getBean("userDao");
		User u=userDao.getById(1);
		System.out.println(u);

	}

}
