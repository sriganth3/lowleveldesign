package designpatterns.practice.factorymethod2;

public class PushNotification implements Notification {

	private String message;
	public PushNotification(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		
		return message;
	}

	@Override
	public String getType() {
		
		return "PushNotification";
	}

}
