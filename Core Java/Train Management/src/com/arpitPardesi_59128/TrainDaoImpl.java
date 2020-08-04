package com.arpitPardesi_59128;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrainDaoImpl implements TrainDao {
	@Override
	public List<Train> getAllTrainsStartingFrom(String startingStation) throws InvalidEndingStationException {
		List<Train> getAll = new ArrayList<Train>();
		Connection con = ConnectionUtil.getConnection();
		String sql = "select * from train";
		Train train = null;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				String start = rs.getString("starting_station");

				if (start.equals(startingStation)) {

					int trainId = rs.getInt("train_id");
					String trainName = rs.getString("train_name");
					String end = rs.getString("ending_station");

					if (end.equals(start) || end == null || end.isEmpty()) {
						throw new InvalidEndingStationException();
					}

					else {
						train = new Train(trainId, trainName, start, end);
						getAll.add(train);
					}

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getAll;
	}
}