package activemq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import rpc.User;
@Component("alertService")
public class AlertServiceImp implements AlertService {
    @Autowired
    JmsTemplate jmsTemplate;
	public void sendAlert(User u) {
		
		/*jmsTemplate.send("myQueue",new MessageCreator(){
			public Message createMessage(Session session) throws JMSException{
				return session.createObjectMessage(u);
			}
		});*/
		//设置默认消息位置用下面方法
		jmsTemplate.send(new MessageCreator(){
			public Message createMessage(Session session) throws JMSException{
				return session.createObjectMessage(u);
			}
		});
	}

}
