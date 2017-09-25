package com.cg.roomreg.bean;

import java.util.Scanner;

import com.cg.roomreg.service.IRoomRegistrationService;
import com.cg.roomreg.service.RoomRegistrationServiceImpl;

public class RoomRegistrationDTO {

	private int room_no;
	private int hotel_id;
	private int room_type;
	private int room_area;
	private int rent_amount;
	private int paid_amount;
	public RoomRegistrationDTO(int room_no, int hotel_id, int room_type,
			int room_area, int rent_amount, int paid_amount) {
		super();
		this.room_no = room_no;
		this.hotel_id = hotel_id;
		this.room_type = room_type;
		this.room_area = room_area;
		this.rent_amount = rent_amount;
		this.paid_amount = paid_amount;
		
	}
	public RoomRegistrationDTO(int hotel_id, int room_type, int room_area,
			int rent_amount, int paid_amount) {
		super();
		this.hotel_id = hotel_id;
		this.room_type = room_type;
		this.room_area = room_area;
		this.rent_amount = rent_amount;
		this.paid_amount = paid_amount;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public int getRoom_type() {
		return room_type;
	}
	public void setRoom_type(int room_type) {
		this.room_type = room_type;
	}
	public int getRoom_area() {
		return room_area;
	}
	public void setRoom_area(int room_area) {
		this.room_area = room_area;
	}
	public int getRent_amount() {
		return rent_amount;
	}
	public void setRent_amount(int rent_amount) {
		this.rent_amount = rent_amount;
	}
	public int getPaid_amount() {
		return paid_amount;
	}
	public void setPaid_amount(int paid_amount) {
		this.paid_amount = paid_amount;
	}
	
	
	
	
}
