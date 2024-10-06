package designpatterns.practice.factorymethod2;

public class PushNotificationFactory implements NotificationFactory {

	@Override
	public Notification createNotification(String message) {
		
		return new PushNotification(message);
	}

}
