package mbean.remote;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {

	public static void main(String[] args) {
		System.out.println("����ʼ");
		ApplicationContext server=new ClassPathXmlApplicationContext("mbean/remote/server.xml");
        System.out.println("server�ļ����н���");
	}

}
