package com.cg.roomreg.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.roomreg.bean.RoomRegistrationDTO;

public interface IRoomRegistrationService {

	public int addRoomDetails(RoomRegistrationDTO details) throws IOException, SQLException;

	public ArrayList<Integer> gethotelbyIds() throws SQLException, IOException;

}
