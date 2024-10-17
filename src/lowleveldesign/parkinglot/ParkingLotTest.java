package lowleveldesign.parkinglot;

import lowleveldesign.parkinglot.model.ParkingResult;

public class ParkingLotTest {

    public static void main(String[] args) {
        int[][][] parking = {
                { // Floor 0
                    {4, 4, 2, 2},
                    {2, 4, 2, 0},
                    {0, 2, 2, 2},
                    {4, 4, 4, 0}
                },
                { // Floor 1
                    {0, 4, 4, 2},
                    {4, 0, 2, 2},
                    {4, 0, 0, 2},
                    {2, 2, 2, 4}
                },
                { // Floor 2
                    {2, 0, 4, 4},
                    {4, 2, 0, 0},
                    {0, 2, 4, 4},
                    {0, 0, 0, 2}
                }
        };

        // Initialize the Parking Lot
        ParkingLot parkingLot = ParkingLot.init(parking);

        // Test case 1: Park vehicle using LowIndexStrategy (vehicle type 2 - car)
        String spotId1 = parkingLot.park(2, "KA-01-1234", "TICKET123", 0); // 0 for LowIndexStrategy
        System.out.println("Vehicle KA-01-1234 parked at spot: " + spotId1);

        // Test case 2: Park vehicle using MaxFreeStrategy (vehicle type 4 - bus)
        String spotId2 = parkingLot.park(4, "KA-02-5678", "TICKET456", 1); // 1 for MaxFreeStrategy
        System.out.println("Vehicle KA-02-5678 parked at spot: " + spotId2);

        // Test case 3: Remove the first vehicle
        boolean removed1 = parkingLot.removeVehicle(spotId1, "KA-01-1234", "TICKET123");
        System.out.println("Vehicle KA-01-1234 removed: " + removed1);

        // Test case 4: Search for a vehicle using ticket ID
        ParkingResult searchResult = parkingLot.searchVehicle(null, null, "TICKET456");
        checkVehicleResponse(searchResult);

        // Test case 5: Check free spots for vehicle type 2 (car) on floor 1
        int freeSpots = parkingLot.getFreeSpotsCount(1, 2);
        System.out.println("Free spots for cars on floor 1: " + freeSpots);
        
        // Test case 5: Search for a vehicle using ticket ID
        searchResult = parkingLot.searchVehicle(null, null, "TICKET123");
        checkVehicleResponse(searchResult);
    }

	private static void checkVehicleResponse(ParkingResult searchResult) {
		if (searchResult == null) {
			System.out.println("Vehicle not found.");
			return;
        } 
		
		if("UNPARKED".equals(searchResult.getStatus())) {
			System.out.println("Vehicle : " + searchResult.getVehicleNumber() + " unParked from spot " + searchResult.getSpotId());
		}
		
		System.out.println("Vehicle Found: " + searchResult.getVehicleNumber() + " at spot " + searchResult.getSpotId());
		
		 
	}

}
