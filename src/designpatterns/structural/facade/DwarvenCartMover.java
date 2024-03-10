package designpatterns.structural.facade;

public class DwarvenCartMover extends DwarvenGoldMineWorker{

	@Override
	public String name() {
		return "Dwarf Cart Mover";
	}

	@Override
	public void work() {
		System.out.println(name() + " moves cart full of gold");
	}
	
}
