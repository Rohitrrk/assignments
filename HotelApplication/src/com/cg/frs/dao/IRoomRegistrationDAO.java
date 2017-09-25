package com.cg.frs.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.FlatRegistrationDTO;

public interface IRoomRegistrationDAO {

	int registerhotel(FlatRegistrationDTO d) throws SQLException, IOException;

	ArrayList<Integer> getallOwner() throws SQLException, IOException;

}
