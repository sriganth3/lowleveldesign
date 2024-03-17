package designpatterns.structural.proxy;

public class WizardTowerProxy {
	private static int maxCount = 3;
	
	private int count = 0;
	
	private final WizardTower tower;
	
	public WizardTowerProxy(WizardTower tower) {
		this.tower = tower;
	}
	
	public void enter(Wizard wizard) {
		if(count >= maxCount) {
			System.out.print(wizard + " not allowed to enter!");
			return;
		}
		count++;
		tower.enter(wizard);
		
		
	}
}
