package com.cg.roomreg.dao;

import java.io.IOException;
import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.roomreg.bean.RoomRegistrationDTO;
import com.cg.roomreg.dbutil.DbUtil;

public class RoomRegistrationDAOImpl implements IRoomRegistrationDAO{

	int res;
	int result;
	
	public int RoomRegistrationDAOImpl(RoomRegistrationDTO details)
			throws IOException, SQLException {
		Connection con= DbUtil.getConnection();
		
		String insertQuery="insert into Room_Registration values(room_SEQ .nextval,?,?,?,?,?)";
		PreparedStatement ps= con.prepareStatement(insertQuery);
		ps.setInt(1,details.getHotel_id());
		ps.setInt(2, details.getRoom_type());
		ps.setInt(3,details.getRoom_area());
		ps.setInt(4, details.getRent_amount());
		ps.setInt(5,details.getPaid_amount());
		
		res=ps.executeUpdate();
		if(res==1)
		{
			String sql="select room_no from Room_Registration where hotel_id=?";
			PreparedStatement pst= con.prepareStatement(sql);
			pst.setInt(1, details.getHotel_id());
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				result = rs.getInt(1);
			}
		}
		else
		{
			return 0;
		}
		return result;

		
	}

	@Override
	public ArrayList<Integer> gethotelbyIds() throws SQLException, IOException {
		Connection con= DbUtil.getConnection();
		
		String sql="select hotel_id from Hotel_owners";
		PreparedStatement pst= con.prepareStatement(sql);
		
		ResultSet rs=pst.executeQuery();
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		while(rs.next())
		{
			list.add(rs.getInt(1));
		}
		return list;
	}

	
}
