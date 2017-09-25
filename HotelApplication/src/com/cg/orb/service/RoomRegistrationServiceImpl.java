package com.cg.orb.service;

//import java.util.ArrayList;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.frs.dao.IRoomRegistrationDAO;
import com.cg.frs.dao.RoomRegistrationDAOImpl;
import com.cg.orb.dto.FlatRegistrationDTO;

public class RoomRegistrationServiceImpl  implements  IRoomRegistrationService {

	@Override
	public int registerhotel(FlatRegistrationDTO d) throws SQLException, IOException 
	
	{
		IRoomRegistrationDAO  imd =  new RoomRegistrationDAOImpl();
		return imd.registerhotel(d);

	}

	public ArrayList<Integer> getallOwner() throws SQLException, IOException {
		
		IRoomRegistrationDAO  imd =  new RoomRegistrationDAOImpl();
		return imd.getallOwner();
	
	}

}
