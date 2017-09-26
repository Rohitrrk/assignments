package com.cg.orb.ui;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;









import com.cg.hotel.Exception.RoomException;
import com.cg.orb.dto.FlatRegistrationDTO;
import com.cg.orb.service.IRoomRegistrationService;
import com.cg.orb.service.RoomRegistrationServiceImpl;


public class Client 
{
	
	private static final int ArrayList = 0;
	
	static FlatRegistrationDTO d ;
	static  IRoomRegistrationService service1 =  new  RoomRegistrationServiceImpl ();
	
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args) throws SQLException, IOException, RoomException

{
	
	
	System.out.println( "Enter your Choice:\n1.RoomBooking\n2.Exit");
	
	int choice =sc.nextInt();
	switch(choice)
	{
	case 1: registerhotel();
	
	break;
	case 2: System.exit(0);
	}
	
	
	
}
private static void registerhotel() throws SQLException, IOException, RoomException
{
	ArrayList<Integer> list;
					list= service1.getallOwner();
	
	System.out.println("Existing Hotelowener ids are:"+list);
	
//	System.out.println("Enter owener");
//	int OId = sc.nextInt();
	
    System.out.println("Enter hotel owener id");
    int id =sc.nextInt();
    
    if(list.contains(id))
    {
    	
    

	System.out.println("Select  room type \n1.AC.....2.NonAc");
	int Rtype = sc.nextInt();
	
	if(service1.validateRoomtype(Rtype))
	{
	
            System.out.println("Enter room area in sq. ft ");
	         int Rarea = sc.nextInt();
	
	if(service1.validateRoomarea(Rarea))
	{
		
	System.out.println("Enter desired rent amount Rs: ");
	int Ramount = sc.nextInt();
	
	if(service1.validateAmount(Ramount))
	{
	
	System.out.println("Enter desired paid amount Rs: ");
    int  Pamount= sc.nextInt();
	
    d = new FlatRegistrationDTO(id,Rtype ,Rarea,Ramount , Pamount);
	
	int row = service1. registerhotel(d);
	
	System.out.println("Room successfully registered. Room no:<"+row+">");
	
	}
	
	
	}

    else  
    	System.out.println("Enter valid  hotel owener ids ");
    }
}
}
}


   
	

