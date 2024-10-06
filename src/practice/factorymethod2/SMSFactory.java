package practice.factorymethod2;

public class SMSFactory implements NotificationFactory {

	@Override
	public Notification createNotification(String message) {
		
		return new SMS(message);
	}

}
