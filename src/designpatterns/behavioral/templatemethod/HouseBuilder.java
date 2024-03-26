package designpatterns.behavioral.templatemethod;

public abstract class HouseBuilder {
	
	public final void build() {
		buildFoundation();
		buildWalls();
		buildRoof();
		paintHouse();
	}

	protected abstract void paintHouse();

	protected abstract void buildRoof();

	protected abstract void buildWalls();

	protected abstract void buildFoundation();
}
