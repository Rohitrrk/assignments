package com.cg.orb.service;

import java.util.ArrayList;


import java.util.List;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import com.cg.frs.dao.IRoomRegistrationDAO;
import com.cg.frs.dao.RoomRegistrationDAOImpl;
import com.cg.hotel.Exception.RoomException;
import com.cg.orb.dto.FlatRegistrationDTO;

public class RoomRegistrationServiceImpl  implements  IRoomRegistrationService
{

	@Override
	public int registerhotel(FlatRegistrationDTO d) throws SQLException, IOException, RoomException 
	
	{
		IRoomRegistrationDAO  imd =  new RoomRegistrationDAOImpl();
		return imd.registerhotel(d);

	}
	


	public ArrayList<Integer> getallOwner() throws SQLException, IOException
	{
		
		IRoomRegistrationDAO  imd =  new RoomRegistrationDAOImpl();
		return imd.getallOwner();
		
		
		
	
	}



	@Override
	public boolean validateRoomtype(int rtype) 
	{
         	if(rtype==1 || rtype==2)
         	{
         		return true;
         	}
         	else
         	{
         		System.out.println("please enter valid room type");
			return false;
         	}
		
	}



	public boolean validateRoomarea(int rarea) {
		
		String phnPatt="[0-9]{3}";
		String d = String.valueOf(rarea);
		
		if(Pattern.matches(phnPatt,d))
		
		return true;
		else
		{  	
			System.out.println("please enter valid room area");
		
		return false;
		}
	}



	@Override
	public boolean validateAmount(int ramount) {
		
		if(ramount>0)
			return true;
		else 
		{
			System.out.println("please enter valid  Room amount");
			return false;
			
		}
	
	}
	
	
}






    
       



        
