package designpatterns.structural.facade;

public class DwarvenTunnelDigger extends DwarvenGoldMineWorker{

	@Override
	public String name() {
		return "Dwarf Tunnel Digger";
	}

	@Override
	public void work() {
		System.out.println(name() + " digs tunnel");
	}
	
}
