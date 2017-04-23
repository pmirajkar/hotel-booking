package com.pranav.hotel;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Hotel {

	private Map<Long, Reservation> reservationMap = new HashMap<>();
	private HashMap<Long, Guest> guestMap = new HashMap<>();
	private HashMap<Integer, Room> roomMap = new HashMap<>();
	private long guestID = 1;
	private long reservationNo = 1;

	public static void main(String[] args) {
		Hotel h = new Hotel();
		h.addRooms();

		h.reserveRoom("John", RoomType.LUXURY, new Date(2017, 4, 11), new Date(2017, 4, 15));

		h.printReservations();
	}

	private void printReservations() {
		// print all reservations
		for (Map.Entry<Long, Reservation> entry : reservationMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	private void reserveRoom(String name, RoomType rType, Date startDate, Date endDate) {
		guestMap.put(guestID, new Guest(name, guestID));
		int roomNo = getFreeRoom(RoomType.LUXURY, startDate, endDate);
		reservationMap.put(reservationNo, new Reservation(reservationNo, guestID, roomNo, startDate, endDate));
		guestID++;
		reservationNo++;
	}

	// Return a free room of given type for given start and end date
	private int getFreeRoom(RoomType luxury, Date startDate, Date endDate) {
		return 1001;
	}

	// logic for checking in room is free
	private boolean isRoomFree(int i, Date startDate, Date endDate) {
		return true;
	}

	private void addRooms() {
		int i = 0;
		for (; i < 500; i++) {
			roomMap.put(new Integer(i + 1000), new Room(i + 1000, RoomType.REGULAR));
		}
		for (; i < 150; i++) {
			roomMap.put(new Integer(i + 1000), new Room(i + 1000, RoomType.LUXURY));
		}
		for (; i < 10; i++) {
			roomMap.put(new Integer(i + 1000), new Room(i + 1000, RoomType.PRESEDENTIAL));
		}
		for (; i < 5; i++) {
			roomMap.put(new Integer(i + 1000), new Room(i + 1000, RoomType.CHAIRMAN));
		}
	}

}
