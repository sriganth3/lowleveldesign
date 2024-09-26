package practice.factorymethod2;

public class PushNotificationFactory implements NotificationFactory {

	@Override
	public Notification createNotification(String message) {
		// TODO Auto-generated method stub
		return new PushNotification(message);
	}

}
