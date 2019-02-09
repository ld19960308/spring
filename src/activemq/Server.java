package activemq;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import rpc.User;

public class Server {
	 private static JmsTemplate jmsTemplate=null;
		public static void main(String[] args) {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("activemq/bean.xml");
	        jmsTemplate=(JmsTemplate)ctx.getBean("jmsTemplate");
			AlertService alertService=(AlertService)ctx.getBean("alertService");
			User u=new User();
			u.setName("li");
			alertService.sendAlert(u);
			//alertService.sendAlert("hello");
			getUser();
			

		}
		public static void getUser(){
			User u=null;
			ObjectMessage receivedMessage=(ObjectMessage)jmsTemplate.receive();
			try {
				u=(User)receivedMessage.getObject();
				System.out.println(u.getName());
			} catch (JMSException e) {
				e.printStackTrace();
			}
			
		}


}
