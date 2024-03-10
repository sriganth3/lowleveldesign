package designpatterns.structural.facade;

public class DwarvenGoldDigger extends DwarvenGoldMineWorker{

	@Override
	public String name() {	
		return "Dwarf Gold Digger";
	}

	@Override
	public void work() {
		System.out.println(name() + " digs gold");
	}
	
}
