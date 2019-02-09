package jaxWs.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jaxWs.server.RPCService;
public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jaxWs/client/bean.xml");
		//RPCService rpcService=(RPCService)ctx.getBean("jaxWsProxy");
		//System.out.println(rpcService.getAllUser().get(0).getName());
		
		RPCService rpcService1=(RPCService)ctx.getBean("jaxProxy");
		System.out.println(rpcService1.hello("li"));

	}

}
