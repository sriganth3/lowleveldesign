package lowleveldesign.parkinglot;

import lowleveldesign.parkinglot.model.ParkingResult;

public class ParkingLot {

	private ParkingDataManager dataManager;


	private ParkingLot(int[][][] parking) {
		dataManager = new ParkingDataManager(parking);
	}


	public static ParkingLot init(int[][][] parking) {
		return new ParkingLot(parking);
	}


	public String park(int vehicleType, String vehicleNumber, String ticketId, int parkingStrategy){
		if(parkingStrategy == 0) {
			return dataManager.park(vehicleType, vehicleNumber, ticketId, new LowIndexStrategy());
		}else {
			return dataManager.park(vehicleType, vehicleNumber, ticketId, new LowIndexStrategy());
		}

	}

	public boolean removeVehicle(String spotId, String vehicleNumber, String ticketId){
		ParkingResult result = searchVehicle(spotId, vehicleNumber, ticketId);

		if(result == null || "UNPARKED".equals(result.getStatus())) {
			return false;
		}

		spotId = dataManager.removeFromHashMap(spotId, vehicleNumber, ticketId);
		if(spotId == null || spotId.isBlank()) {
			return false;
		}

		return true;
	}

	public ParkingResult searchVehicle(String spotId, String vehicleNumber, String ticketId) {
		ParkingResult result = null;
		if(spotId != null) {
			result = dataManager.searchWithSpotId(spotId);
		}else if(vehicleNumber != null) {
			result = dataManager.searchWithVehicleNumber(vehicleNumber);
		}else if(ticketId != null){
			result = dataManager.searchWithTicketId(ticketId);
		}
		return result;

	}

	public int getFreeSpotsCount(int floor, int vehicleType) {
		return this.dataManager.getFreeSpotsCount(floor, vehicleType);
	}

}
