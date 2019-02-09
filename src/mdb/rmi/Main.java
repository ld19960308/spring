package mdb.rmi;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import activemq.AlertService;
import rpc.User;

public class Main {
	private static Logger logger=LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		User u=new User();
		u.setName("li");
		ApplicationContext server=new ClassPathXmlApplicationContext("mdb/rmi/server.xml");
		logger.info("server.xml 加载完成");
		ApplicationContext client=new ClassPathXmlApplicationContext("mdb/rmi/client.xml");
		logger.info("client.xml 加载完成");
		AlertService service=(AlertService)client.getBean("alertService");
		logger.info("获取的对象为"+service);
		service.sendAlert(u);
		
	}

}
