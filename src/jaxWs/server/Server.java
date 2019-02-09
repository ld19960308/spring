package jaxWs.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jaxWs/server/server.xml");
		System.out.println("³ÌÐò½áÊø");

	}

}
