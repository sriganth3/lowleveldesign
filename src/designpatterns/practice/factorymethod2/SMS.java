package designpatterns.practice.factorymethod2;

public class SMS implements Notification {

	private String message;
	public SMS(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		
		return message;
	}

	@Override
	public String getType() {
		
		return "SMS";
	}

}
