package practice.factorymethod2;

public class SMSFactory implements NotificationFactory {

	@Override
	public Notification createNotification(String message) {
		// TODO Auto-generated method stub
		return new SMS(message);
	}

}
