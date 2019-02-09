package mdb.rmi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import activemq.AlertService;
import rpc.User;

public class AlertServiceImp implements AlertService {
	private static Logger logger=LogManager.getLogger(AlertServiceImp.class);
    private JavaMailSender mailSender;
    private String alertEmailAddress;
    public AlertServiceImp(){};
	public AlertServiceImp(JavaMailSender mailSender, String alertEmailAddress) {
		this.mailSender = mailSender;
		this.alertEmailAddress = alertEmailAddress;
	}
	public void sendAlert(final User u) {
		logger.debug("user name:"+u.getName());
		SimpleMailMessage message=new SimpleMailMessage();
		logger.debug("simpleMailMessage:"+message);
		System.out.println(u);
		String userName=u.getName();
		message.setFrom("noreply@user.com");
		message.setTo(this.alertEmailAddress);
		message.setSubject("new user from "+userName);
		message.setText(userName+" says: hello");
		if(mailSender!=null){
            mailSender.send(message);
		}
        logger.info("sendAlert()·½·¨½áÊø");
	}

}
