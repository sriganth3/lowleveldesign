package practice.factorymethod2;

public class PushNotification implements Notification {

	private String message;
	public PushNotification(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "PushNotification";
	}

}
