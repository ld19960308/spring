package mdb;
//基于ejb的事件处理
import javax.annotation.Resource;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.Message;
import javax.jms.MessageListener;
@MessageDriven(mappedName="jms/myQueue")
public class AlertHandler implements MessageListener {
    @Resource
    private MessageDrivenContext mdc;
	public void onMessage(Message arg0) {
		// TODO Auto-generated method stub

	}

}
