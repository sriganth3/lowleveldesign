package lowleveldesign.parkinglot;

public class MaxFreeStrategy implements ParkingStrategy {

	@Override
	public String park(int vehicleType, String vehicleNumber, String ticketId, ParkingDataManager dataManager) {
		int floor = dataManager.getFloorWithMaxFreeSpots(vehicleType);
		if (floor == -1) {
			return "";
		}

		String spotId = dataManager.parkAndGetSpotId(vehicleType, floor);
		if(spotId == "") {
			return "";
		}
		dataManager.addToHashMap(spotId, vehicleNumber,ticketId,vehicleType);
		return spotId;
	}


}
