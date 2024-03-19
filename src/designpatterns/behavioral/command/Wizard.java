package designpatterns.behavioral.command;

import java.util.Deque;
import java.util.LinkedList;

public class Wizard {

	Deque<Runnable> undo = new LinkedList<>();
	Deque<Runnable> redo = new LinkedList<>();
	
	public void castSpell(Runnable runnable) {
		runnable.run();
		undo.addLast(runnable);
	}
	
	public void undoLastSpell() {
		if(undo.isEmpty()) {
			return;
		}
		Runnable prevSpell = undo.pollLast();
		prevSpell.run();
		redo.offerLast(prevSpell);
	}
	
	public void redoLastSpell() {
		if(redo.isEmpty()) {
			return;
		}
		Runnable prevSpell = redo.pollLast();
		prevSpell.run();
		undo.offerLast(prevSpell);
	
	}
	
	@Override
	public String toString() {
		return "Wizard";
		
	}
	
}
