package com.zensar.day5.collections.map;

public class Bank {
	
	private int bankID;
	private String bankName;
	private String location;
	
	public int getBankID() {
		return bankID;
	}
	public void setBankID(int bankID) {
		this.bankID = bankID;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Bank(int bankID, String bankName, String location) {
		super();
		this.bankID = bankID;
		this.bankName = bankName;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Bank [bankID=" + bankID + ", bankName=" + bankName + ", location=" + location + "]";
	}
	
	

	
	
}
