package designpatterns.practice.decorator1;

public class BoldDecorator extends TextDecorator {

	public BoldDecorator(Text text) {
		super(text);
	}

	@Override
	public String format() {
		return "<b> " + text.format() + " </b>";
	}

}
