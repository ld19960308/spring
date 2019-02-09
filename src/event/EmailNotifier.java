package event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailNotifier implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0 instanceof EmailEvent){
			EmailEvent emailEvent=(EmailEvent)arg0;
			System.out.println("��Ҫ�����ʼ��Ľ��յ�ַ:"+emailEvent.getAddress());
			System.out.println("��Ҫ�����ʼ�������:"+emailEvent.getText());
		}
		else{
			System.out.println("���������ʱ��:"+arg0);
		}
		
	}

}
