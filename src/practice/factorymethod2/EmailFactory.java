package practice.factorymethod2;

public class EmailFactory implements NotificationFactory {

	@Override
	public Notification createNotification(String message) {
		// TODO Auto-generated method stub
		return new Email(message);
	}

}
