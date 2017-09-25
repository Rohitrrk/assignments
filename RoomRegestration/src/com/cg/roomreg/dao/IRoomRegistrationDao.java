package com.cg.roomreg.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.roomreg.bean.RoomRegistrationDTO;

public interface IRoomRegistrationDAO {

	

	public int RoomRegistrationDAOImpl(RoomRegistrationDTO details) throws IOException, SQLException;

	public ArrayList<Integer> gethotelbyIds() throws SQLException, IOException;

	




	

}
