package practice.factorymethod2;

public class Email implements Notification {

	
	private String message;

	public Email(String message) {
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
		return "Email";
	}

}
