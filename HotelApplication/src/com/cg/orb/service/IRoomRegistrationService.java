package com.cg.orb.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.orb.dto.FlatRegistrationDTO;

public interface IRoomRegistrationService {

	int registerhotel(FlatRegistrationDTO d) throws SQLException, IOException;

	public ArrayList<Integer> getallOwner() throws SQLException, IOException;



}
