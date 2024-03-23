package designpatterns.behavioral.memento;

public class TextArea {

	private String text = "";

	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public Memento takeSnapshot() {
		return new Memento(this.text);
	}
	
	public void restore(Memento memento) {
		this.text = memento.getSavedText();
	}

	public class Memento{
		
		private final String text;
		
		private Memento(String text) {
			this.text = text;
		}
		
		private String getSavedText() {
			return text;
		}
		
	}
}
