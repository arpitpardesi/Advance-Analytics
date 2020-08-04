package com.arpitPardesi_59128;

import java.util.List;

import org.junit.Test;

public class TestTrainDao {

	Train train = new Train();
	TrainDao trainDao = new TrainDaoImpl();
	
	@Test
	public void testGetAllTrainsStartingFrom() {
		String start = "Mhow";
		List<Train> trains = null;
		try {
			trains = trainDao.getAllTrainsStartingFrom(start);
		} catch (InvalidEndingStationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(trains);
	}
}
