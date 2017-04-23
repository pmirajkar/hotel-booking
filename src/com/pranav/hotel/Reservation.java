package com.pranav.hotel;
import java.util.Date;

public class Reservation {
	
	private long reservationNo;
	private long guestID;
	private int roomNo;
	private Date startDate, endDate;

	public Reservation(long reservationNo, long guestID, int roomNo, Date startDate, Date endDate) {
		super();
		this.reservationNo = reservationNo;
		this.guestID = guestID;
		this.roomNo = roomNo;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public long getReservationNo() {
		return reservationNo;
	}

	public void setReservationNo(long reservationNo) {
		this.reservationNo = reservationNo;
	}

	public long getGuestID() {
		return guestID;
	}

	public void setGuestID(long guestID) {
		this.guestID = guestID;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		return reservationNo + ":" + guestID + ":" + roomNo + ":" + startDate + ":" + endDate;
	}

}
