package mailsender;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("mailsender/mail.xml");
		MailSender mailSender=(MailSender)ctx.getBean("mailSenderBean");
		mailSender.sendSimpleEmail("1315554723@qq.com");

	}

}
