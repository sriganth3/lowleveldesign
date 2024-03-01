package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box{

	private List<Box> childern = new ArrayList<>();
	
	public CompositeBox(Box... boxes) {
		childern.addAll(Arrays.asList(boxes));
	}

	@Override
	public double calculatePrice() {

		return childern.stream().mapToDouble(Box::calculatePrice).sum();
	}
}
