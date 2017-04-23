package com.pranav.hotel;

public enum RoomType {
	
	REGULAR(1001, "Regular Room", "Free Breakfast and Lunch", 100), //
	LUXURY(1002, "Luxury Suite", "Free Breakfast and Lunch", 120), //
	PRESEDENTIAL(1003, "Presedential Suite", "Dining Area and Bar", 1800), //
	CHAIRMAN(1004, "Chairman Suite", "Penthouse", 3000); //

	private int typeID;
	private String name;
	private String desc;
	private float baseRate;

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public float getBaseRate() {
		return baseRate;
	}

	public void setBaseRate(float baseRate) {
		this.baseRate = baseRate;
	}
		
	RoomType(int typeID, String name, String desc, float baseRate) {
		this.typeID = typeID;
		this.name = name;
		this.desc = desc;
		this.baseRate = baseRate;
	}

}
