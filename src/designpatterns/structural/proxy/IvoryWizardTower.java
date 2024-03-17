package designpatterns.structural.proxy;

public class IvoryWizardTower implements  WizardTower{

	@Override
	public void enter(Wizard wizard) {
		System.out.println(wizard +" enters the IvoryWizardTower");
	}

	
	
}
