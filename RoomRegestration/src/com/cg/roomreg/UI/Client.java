package com.cg.roomreg.UI;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

import com.cg.roomreg.bean.RoomRegistrationDTO;
import com.cg.roomreg.service.IRoomRegistrationService;
import com.cg.roomreg.service.RoomRegistrationServiceImpl;

public class Client {

	static Scanner sc= new Scanner(System.in);
	static IRoomRegistrationService service= new RoomRegistrationServiceImpl();
	static RoomRegistrationDTO details;
	public static void main(String[] args) {
		while(true)
		{
			System.out.println("Choose an option:");
			System.out.println("1.Booking Room\n2.Exit");
			int choice= sc.nextInt();
			switch(choice)
			{
			case 1:
				addRoomDetails();
				break;
			case 2:
				System.exit(0);
				break;
			}
		}
	}
	private static void addRoomDetails() {
		int id;
		try
		{
			ArrayList<Integer> lst= new ArrayList<Integer>();
			lst=service.gethotelbyIds();
			System.out.println("Existing Hotel Owners IDS are: "+lst);
			System.out.println("Please enter your hotel owner id from above list: ");
			int hotelid=sc.nextInt();
			System.out.println("Select room type Type(1-1AC 2-2NON_AC):");
			int type= sc.nextInt();
			System.out.println("Enter room area in sq. ft.:");
			int area=sc.nextInt();
			System.out.println("Enter desired rent amount Rs:");
			int rent_amount=sc.nextInt();
			System.out.println("Enter desired paid amount Rs:");
			int paid_amount=sc.nextInt();
			if(paid_amount>rent_amount)
			{
				details= new  RoomRegistrationDTO(hotelid,type,area,rent_amount,paid_amount);
			
				id=service.addRoomDetails(details);
				if(id!=0)
					System.out.println("Room successfully registered. Room no:<"+id+">");
				else
					System.out.println("hotel owner  id does not exists");
			}
			else
				System.out.println("the paid amount cannot be less than rent amount.");
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
