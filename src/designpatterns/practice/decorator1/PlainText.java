package designpatterns.practice.decorator1;

public class PlainText implements Text {

	private String text;
	
	public PlainText(String text) {
		super();
		this.text = text;
	}

	@Override
	public String format() {
		return text;
	}

}
