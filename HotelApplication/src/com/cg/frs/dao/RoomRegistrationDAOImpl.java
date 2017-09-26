package com.cg.frs.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.hotel.Exception.RoomException;
import com.cg.orb.dbutil.Dbutil;
import com.cg.orb.dto.FlatRegistrationDTO;

public class RoomRegistrationDAOImpl  implements IRoomRegistrationDAO
{
	Connection conn;
	   int result ;
	   int noofrows;
	   
	   Logger logger = Logger.getRootLogger();
	   
	   public  RoomRegistrationDAOImpl ()
	   {
		   PropertyConfigurator.configure("log4j.properties");
	   }
	   
	@Override
	public int registerhotel(FlatRegistrationDTO d) throws SQLException, IOException, RoomException
	{
		
	 try
	 {
		conn=Dbutil.getConnection();
	            System.out.println("hii");
			
		
	   String insertQuery =  "Insert into Room_Registration  values(room_SEQ.nextval,?,?,?,?,?) ";
	 
	    PreparedStatement ps = conn.prepareStatement(insertQuery);
	
	    ps.setInt(1,d.getOId());
	  ps.setInt(2, d.getRtype());
	    ps.setInt(3,d.getRarea());
	    
	    ps.setInt(4,d.getRamount());
	    
	    ps.setInt(5,d.getPamount());
	    
	    noofrows= ps.executeUpdate();

	    
	    if( noofrows==1)
	    {
	    	 String sql = "Select   room_SEQ.currval from dual";
	    	 
	    	 PreparedStatement ps1 = conn.prepareStatement(sql);
	    	 
	    	 ResultSet rs = ps1.executeQuery();
	    	 while(rs.next())
	    	 {
	    		 result = rs.getInt(1);
	    	 }
	    	 logger.info("Executed Sucessfully");
	    	
	    	
	   // return noofRows;
	    }
	    else 
	    {
	    	return 0;
	    }
	 }
	   
//  catch (IOException | SQL Exception f) 
// {
//	   System.out.println("Exception occured");
//	   logger.error("Exception occured);"	 
//			   
// }
	 catch(Exception e)
	 {
		 throw new  RoomException("exception occured");
	 }
	 
		return result;
	   }
	

	

	@Override
	public ArrayList<Integer> getallOwner() throws SQLException, IOException {
		
		conn=Dbutil.getConnection();
		
		 ArrayList<Integer> list =new  ArrayList<Integer>();
		 
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
