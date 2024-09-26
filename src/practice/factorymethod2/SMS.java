package practice.factorymethod2;

public class SMS implements Notification {

	private String message;
	public SMS(String message) {
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
		return "SMS";
	}

}
