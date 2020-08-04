package com.arpitPardesi_59128;

public class Train {

	private int trainId;
	private String trainName;
	private String startingStation;
	private String endingStation;
	public int getTrainId() {
		return trainId;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getStartingStation() {
		return startingStation;
	}
	public void setStartingStation(String startingStation) {
		this.startingStation = startingStation;
	}
	public String getEndingStation() {
		return endingStation;
	}
	public void setEndingStation(String endingStation) {
		this.endingStation = endingStation;
	}
	
	
	public Train() {
		super();
	}
	public Train(int trainId, String trainName, String startingStation, String endingStation) {
		super();
		this.trainId = trainId;
		this.trainName = trainName;
		this.startingStation = startingStation;
		this.endingStation = endingStation;
	}
	@Override
	public String toString() {
		return "Train [trainId=" + trainId + ", trainName=" + trainName + ", startingStation=" + startingStation
				+ ", endingStation=" + endingStation + "]";
	}
	
}
