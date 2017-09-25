package com.cg.roomreg.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.roomreg.bean.RoomRegistrationDTO;
import com.cg.roomreg.dao.IRoomRegistrationDAO;
import com.cg.roomreg.dao.RoomRegistrationDAOImpl;

public class RoomRegistrationServiceImpl implements IRoomRegistrationService {

	IRoomRegistrationDAO dao= new RoomRegistrationDAOImpl();
	public int addRoomDetails(RoomRegistrationDTO details) throws IOException, SQLException {
		return dao.RoomRegistrationDAOImpl(details);
	
	}
	@Override
	public ArrayList<Integer> gethotelbyIds() throws SQLException, IOException {
		
		return dao.gethotelbyIds();
	}

}