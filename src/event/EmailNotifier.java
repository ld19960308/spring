package event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailNotifier implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0 instanceof EmailEvent){
			EmailEvent emailEvent=(EmailEvent)arg0;
			System.out.println("需要发送邮件的接收地址:"+emailEvent.getAddress());
			System.out.println("需要发送邮件的正文:"+emailEvent.getText());
		}
		else{
			System.out.println("容器本身的时间:"+arg0);
		}
		
	}

}
