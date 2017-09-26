package com.cg.frs.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.hotel.Exception.RoomException;
import com.cg.orb.dto.FlatRegistrationDTO;

public interface IRoomRegistrationDAO {

	public int registerhotel(FlatRegistrationDTO d) throws SQLException, IOException, RoomException;

	ArrayList<Integer> getallOwner() throws SQLException, IOException;

}
