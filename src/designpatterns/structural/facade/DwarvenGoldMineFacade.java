package designpatterns.structural.facade;

import java.util.Collection;
import java.util.List;

public class DwarvenGoldMineFacade {

	private final List<DwarvenGoldMineWorker> workers;
	
	
	public DwarvenGoldMineFacade() {
		this.workers = List.of(
				new DwarvenGoldDigger(),
				new DwarvenTunnelDigger(),
				new DwarvenCartMover()
				);
	}
	
	public void startNewDay() {
		makeAction(workers, Action.WAKE_UP, Action.GO_TO_MINE);
	}
	
	public void workOnMine() {
		makeAction(workers, Action.WORK);
	}
	
	public void endOfTheDay() {
		makeAction(workers, Action.GO_HOME, Action.GO_TO_SLEEP);
	}
	
	
	private void makeAction(Collection<DwarvenGoldMineWorker> workers, Action...actions) {
		workers.forEach(worker -> {
			worker.action(actions);
		});
	}
}
