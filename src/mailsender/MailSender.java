package mailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component(value="mailSenderBean")
public class MailSender {
	@Autowired
	private JavaMailSender mailSender;
	public void sendSimpleEmail(String to){
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("noreply@mail.com");
		message.setTo(to);
		message.setSubject("message from li");
		message.setText("hello li");
		mailSender.send(message);
	}

}
