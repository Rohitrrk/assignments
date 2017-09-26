package com.cg.orb.dto;

public class FlatRegistrationDTO

{
	
	private int OId;
	private int Rtype;
	private int Rarea;
    private int Ramount;
    private int Pamount;
    
    
	public FlatRegistrationDTO(int oId, int rtype, int rarea, int ramount,
			int pamount) {
		super();
	   OId = oId;
		Rtype = rtype;
		Rarea = rarea;
		Ramount = ramount;
		Pamount = pamount;
	}
	
	
public FlatRegistrationDTO() {
		// TODO Auto-generated constructor stub
	}


public int getOId() {
	return OId;
}
	public void setOId(int oId) {
	OId = oId;
}
	public int getRtype() {
		return Rtype;
	}
	public void setRtype(int rtype) {
		Rtype = rtype;
	}
	public int getRarea() {
		return Rarea;
	}
	public void setRarea(int rarea) {
		Rarea = rarea;
	}
	public int getRamount() {
		return Ramount;
	}
	public void setRamount(int ramount) {
		Ramount = ramount;
	}
	public int getPamount() {
		return Pamount;
	}
	public void setPamount(int pamount) {
		Pamount = pamount;
	}
	
	
	

}
