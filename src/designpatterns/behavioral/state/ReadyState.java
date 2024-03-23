package designpatterns.behavioral.state;

public class ReadyState extends State {

	public ReadyState(Phone phone) {
		super(phone);
	}

	@Override
	public String onHome() {
		return phone.home();
	}

	@Override
	public String onOnOff() {
		phone.setState(new OffState(phone));
		return phone.lock();
		
	}

}
