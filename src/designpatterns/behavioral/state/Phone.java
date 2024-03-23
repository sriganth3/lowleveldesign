package designpatterns.behavioral.state;

public class Phone {

	private State state;
	
	public Phone() {
		state = new OffState(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public String lock() {
		return "Locking the phone";
	}
	
	public String unlock() {
		return "Unlocking the phone";
	}
	
	public String home() {
		return "Navigating to home screen";
	}
	
	public String turnOn() {
		return "Turning screen on, device still locked";
	}
	
	public String onClickHome() {
		return state.onHome();
	}
	
	public String onClickPower() {
		return state.onOnOff();
	}
}
