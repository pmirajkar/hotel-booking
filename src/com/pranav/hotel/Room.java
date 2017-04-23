package com.pranav.hotel;
public class Room {
	private int roomNo;
	private RoomType type;
	
	public Room(int roomNo, RoomType type) {
		
	}
	
	public int getRoomNo() {
		return roomNo;
	}
	
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public RoomType getType() {
		return type;
	}
	public void setType(RoomType type) {
		this.type = type;
	}
}
