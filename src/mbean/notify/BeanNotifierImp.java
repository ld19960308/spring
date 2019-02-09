package mbean.notify;

import javax.management.Notification;

import org.springframework.jmx.export.annotation.ManagedNotification;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;
import org.springframework.stereotype.Component;

@Component
@ManagedResource("remote:name=BeanNotifier")
@ManagedNotification(name = "TODO", notificationTypes = { "BeanNotifier.OneMillionBeans" })
public class BeanNotifierImp implements BeanNotifier ,NotificationPublisherAware{
    private NotificationPublisher notificationPunlisher;
	@Override
	public void millionthBeanPosted() {
		this.notificationPunlisher.sendNotification(new Notification("BeanNotifier.OneMillionBeans",this,0));

	}

	@Override
	public void setNotificationPublisher(NotificationPublisher arg0) {
		this.notificationPunlisher=arg0;
	}

}
