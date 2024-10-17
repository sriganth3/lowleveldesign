package lowleveldesign.parkinglot;

import java.util.HashMap;
import java.util.Map;

import lowleveldesign.parkinglot.model.ParkingResult;

public class ParkingDataManager {
	int[][][] parking;
	Map<Integer, Map<Integer, Integer>> freeSpotCount;
	Map<String, ParkingResult> spotMap;
	Map<String, ParkingResult> ticketMap;
	Map<String, ParkingResult> vehicleMap;

	Map<String, ParkingResult> ticketHistory;
	Map<String, ParkingResult> vehicleHistory;


	public ParkingDataManager(int[][][] parking) {
		this.parking = parking;
		freeSpotCount = new HashMap<>();

		spotMap = new HashMap<>();
		ticketMap = new HashMap<>();
		vehicleMap = new HashMap<>();

		ticketHistory = new HashMap<>();
		vehicleHistory = new HashMap<>();

		computeFreeSpots();
	}

	public int getFreeSpotsCount(int floor, int vehicleType) {
		if(parking.length < floor) {
			return 0;
		}
		int count = 0;
		for(int i = 0; i < parking[floor].length; i++) {
			for(int j = 0; j < parking[floor][i].length; j++) {
				if(parking[floor][i][j] == vehicleType) {
					count++;
				}
			}
		}

		return count;
	}

	private void computeFreeSpots() {
		for(int i = 0; i < parking.length;i++) {
			Map<Integer, Integer> map = new HashMap<>();
			map.put(2, getFreeSpotsCount(i, 2));
			map.put(4, getFreeSpotsCount(i, 4));
			freeSpotCount.put(i, map);
		}

	}

	public String park(int vehicleType, String vehicleNumber, String ticketId, ParkingStrategy strategy){
		return strategy.park(vehicleType, vehicleNumber, ticketId, this);
	}

	public int getFloorWithMaxFreeSpots(int vehicleType) {
		int floor = -1;
		int max = 0;
		for(int key: freeSpotCount.keySet()) {
			if(freeSpotCount.get(key).get(vehicleType) > max) {
				floor = key;
			}
		}
		return floor;
	}

	public int getFloorWithLowIndexFreeSpots(int vehicleType) {
		for(int i = 0; i < freeSpotCount.keySet().size(); i++) {
			if(freeSpotCount.get(i).get(vehicleType) > 0) {
				return i;
			}
		}
		return -1;
	}

	public void updateFreeSpotCount(int floor, int vehicleType, int count) {
		freeSpotCount.get(floor).put(vehicleType, freeSpotCount.get(floor).get(vehicleType) + count);

	}

	public void addToHashMap(String spotId, String vehicleNumber, String ticketId, int vehicleType) {
		ParkingResult result = new ParkingResult(spotId, vehicleNumber, ticketId, "PARKED", vehicleType);
		spotMap.put(spotId, result);
		vehicleMap.put(vehicleNumber, result);
		ticketMap.put(ticketId, result);
	}

	public String removeFromHashMap(String spotId, String vehicleNumber, String ticketId) {
		ParkingResult result = spotMap.remove(spotId);
		result.setStatus("UNPARKED");
		spotId = result.getSpotId();
		vehicleMap.remove(vehicleNumber);
		ticketMap.remove(ticketId);

		ticketHistory.put(ticketId, result);
		vehicleHistory.put(vehicleNumber, result);
		String[] spotDetails = result.getSpotId().split("-");
		int floor = Integer.parseInt(spotDetails[0]);
		int row = Integer.parseInt(spotDetails[1]);
		int col = Integer.parseInt(spotDetails[2]);
		updateFreeSpotCount(floor, result.getVehicleType(), parking[floor][row][col] < 0 ? -1 : 1);
		return spotId;
	}

	public ParkingResult searchWithSpotId(String spotId) {
		return spotMap.get(spotId);
	}

	public ParkingResult searchWithVehicleNumber(String vehicleNumber) {
		return vehicleMap.containsKey(vehicleNumber) ? vehicleMap.get(vehicleNumber) : vehicleHistory.get(vehicleNumber);
	}

	public ParkingResult searchWithTicketId(String ticketId) {
		return ticketMap.containsKey(ticketId) ? ticketMap.get(ticketId) : ticketHistory.get(ticketId);
	}

	public String parkAndGetSpotId(int vehicleType, int floor) {
		for(int j = 0; j < parking[floor].length;j++) {
			for(int k = 0; k < parking[floor][j].length; k++) {
				if(parking[floor][j][k] == vehicleType || parking[floor][j][k] == -1 * vehicleType) {
					parking[floor][j][k] *= -1;
					updateFreeSpotCount(floor, vehicleType, parking[floor][j][k] < 0 ? -1 : 1);
					return floor + "-" + j + "-" + k;

				}
			}

		}
		return "";
	}

}
