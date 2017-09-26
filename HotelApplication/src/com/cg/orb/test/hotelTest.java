package com.cg.orb.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.frs.dao.IRoomRegistrationDAO;
import com.cg.frs.dao.RoomRegistrationDAOImpl;
import com.cg.hotel.Exception.RoomException;
import com.cg.orb.dto.FlatRegistrationDTO;
import com.cg.orb.service.RoomRegistrationServiceImpl;


public class hotelTest {

	

		static IRoomRegistrationDAO dao ;
		
		static FlatRegistrationDTO bean ;
		
		@BeforeClass
		public static  void initialize()
		{
			System.out.println("HIE");
			dao = new  RoomRegistrationDAOImpl();
			
			bean = new FlatRegistrationDTO();
			
		}
		
		
		@Test
		public void test() 
		{
			System.out.println("HIE");
			bean.setOId(10);
			bean.setRtype(1);
			bean.setRarea(350);
			bean.setRamount(2500);
			bean.setPamount(2000);
			}
			
		@Test
		public void testRegisterhotel()
		{
			try {
				assertNotNull(dao.registerhotel(bean));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RoomException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


