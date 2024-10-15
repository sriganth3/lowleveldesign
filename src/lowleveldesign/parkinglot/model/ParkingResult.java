package lowleveldesign.parkinglot.model;

public class ParkingResult {
	private String spotId;
	private String vehicleNumber;
	private String ticketId;
	private String status;
	private int vehicleType;
	public ParkingResult(String spotId, String vehicleNumber, String ticketId, String status, int vehicleType) {
		super();
		this.spotId = spotId;
		this.vehicleNumber = vehicleNumber;
		this.ticketId = ticketId;
		this.status = status;
		this.vehicleType = vehicleType;
	}
	public int getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getSpotId() {
		return spotId;
	}
	public void setSpotId(String spotId) {
		this.spotId = spotId;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
