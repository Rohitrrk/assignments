package com.cg.frs.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import java.util.ArrayList;

import com.cg.orb.dbutil.Dbutil;
import com.cg.orb.dto.FlatRegistrationDTO;

public class RoomRegistrationDAOImpl  implements IRoomRegistrationDAO
{
	Connection conn;
	   int noofRows ;
	@Override
	public int registerhotel(FlatRegistrationDTO d) throws SQLException, IOException
	{
		
		
		conn=Dbutil.getConnection();
	            System.out.println("hii");
			
		
	   String insertQuery =  "Insert into Room_Registration  values(room_SEQ .nextval,?,?,?,?,?)";
	 
	    PreparedStatement ps = conn.prepareStatement(insertQuery);
	
	    ps.setInt(1,d.getOId());
	  ps.setInt(2, d.getRtype());
	    ps.setInt(3,d.getRarea());
	    
	    ps.setInt(4,d.getRamount());
	    
	    ps.setInt(5,d.getPamount());
	    
	    noofRows = ps.executeUpdate();

	    return noofRows;
		
		

	}
	@Override
	public ArrayList<Integer> getallOwner() throws SQLException, IOException {
		
		conn=Dbutil.getConnection();
		
		 ArrayList<FlatRegistrationDTO> list =new  ArrayList<FlatRegistrationDTO>();
		 
		 String sql = "select  Hotel_ID from Hotel_owners";
		 
		  PreparedStatement pst = conn.prepareStatement(sql);
		  
		  ResultSet rs = pst.executeQuery();
		  
		  while( rs.next())
		  {
			  list.add(rs.getInt(1));
		  }

		return list;
	}
	


}
