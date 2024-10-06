package practice.factorymethod2;

public class Email implements Notification {

	
	private String message;

	public Email(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		
		return message;
	}

	@Override
	public String getType() {
		
		return "Email";
	}

}
