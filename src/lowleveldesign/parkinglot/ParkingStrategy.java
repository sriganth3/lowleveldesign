package lowleveldesign.parkinglot;

public interface ParkingStrategy {

	public String park(int vehicleType, String vehicleNumber, String ticketId, ParkingDataManager parkingLot);
}
