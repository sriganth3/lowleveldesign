package designpatterns.practice.decorator1;

public class ItalicDecorator extends TextDecorator {
	
    public ItalicDecorator(Text decoratedText) {
        super(decoratedText);
    }
	@Override
	public String format() {
		return "<i> " + text.format() + " </i>";
	}
}
