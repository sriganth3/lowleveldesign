package designpatterns.structural.facade;

import java.util.Arrays;

public abstract class DwarvenGoldMineWorker {

	public void goesToSleep() {
		System.out.println(name() + " goes to sleep");
	}
	
	public void wakesUp() {
		System.out.println(name() + " wakes up");
	}
	
	public void goesToHome() {
		System.out.println(name() + " goes to home");
	}
	
	public void goesToMine() {
		System.out.println(name() + " goes to mine");
	}
	
	public abstract String name();
	
	public abstract void work();
	
	private void action(Action action) {
		switch(action) {
			case GO_TO_SLEEP -> goesToSleep();
			case WAKE_UP -> wakesUp();
			case GO_TO_MINE -> goesToMine();
			case GO_HOME -> goesToHome();
			case WORK -> work();
		}
	}
	
	public void action(Action... actions ) {
		Arrays.stream(actions).forEach(this::action);
	}
}
