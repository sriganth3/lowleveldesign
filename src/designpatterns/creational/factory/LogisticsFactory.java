package designpatterns.creational.factory;

public class LogisticsFactory {
	
	public Logistics createLogistics(String mode) throws Exception {
		Logistics logistics;
		if("sea".equals(mode)) {
			logistics = new SeaLogistics();
		}else if("road".equals(mode)){
			logistics = new RoadLogistics();
		}else {
			throw new Exception("Invalid Request!");
		}
		
		return logistics;
	}


}
