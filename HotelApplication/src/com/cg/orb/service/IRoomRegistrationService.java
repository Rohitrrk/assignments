package com.cg.orb.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.hotel.Exception.RoomException;
import com.cg.orb.dto.FlatRegistrationDTO;

public interface IRoomRegistrationService {

	  public int registerhotel(FlatRegistrationDTO d) throws SQLException, IOException, RoomException;

	public ArrayList<Integer> getallOwner() throws SQLException, IOException;

	public boolean validateRoomtype(int rtype);

	public boolean validateRoomarea(int rarea);

	public boolean validateAmount(int ramount);



}
