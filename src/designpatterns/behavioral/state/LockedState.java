package designpatterns.behavioral.state;

public class LockedState extends State {

	public LockedState(Phone phone) {
		super(phone);
	}

	@Override
	public String onHome() {
		phone.setState(new ReadyState(phone));
		return phone.unlock();
		
	}

	@Override
	public String onOnOff() {
		phone.setState(new OffState(phone));
		return phone.lock();
	}

}
