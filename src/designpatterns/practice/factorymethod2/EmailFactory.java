package designpatterns.practice.factorymethod2;

public class EmailFactory implements NotificationFactory {

	@Override
	public Notification createNotification(String message) {
		
		return new Email(message);
	}

}
