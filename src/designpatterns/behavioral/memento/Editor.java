package designpatterns.behavioral.memento;

import java.util.Deque;
import java.util.LinkedList;

import designpatterns.behavioral.memento.TextArea.Memento;

public class Editor {

	private Deque<Memento> stateHistory;
	
	private TextArea textArea;
	
	public Editor() {
		stateHistory = new LinkedList<>();
		textArea = new TextArea();
	}
	
	public void write(String text) {
		stateHistory.add(textArea.takeSnapshot());
		textArea.setText(textArea.getText().concat(text));
		currentState();
	}
	
	public void undo() {
		if(stateHistory.isEmpty()) {
			System.out.print("Undo action not performed");
			return;
		}
		textArea.restore(stateHistory.pollLast());
		currentState();
	}
	
	public void currentState() {
		System.out.println("Current state: " + textArea.getText());
	}
}
