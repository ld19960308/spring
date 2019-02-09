package rpc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("rpc/client.xml");
		RPCService service=(RPCService)ctx.getBean("rpcProxy");
		List<User> user=service.getAllUser();
		User u=user.get(0);
		System.out.println(u.getName());
		
	}

}
