package mbean.remote;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {

	public static void main(String[] args) {
		System.out.println("程序开始");
		ApplicationContext server=new ClassPathXmlApplicationContext("mbean/remote/server.xml");
        System.out.println("server文件运行结束");
	}

}
