package com.arpitPardesi_59128;

import java.util.List;

public interface TrainDao {

	List<Train> getAllTrainsStartingFrom(String startingStation) throws InvalidEndingStationException;
}
