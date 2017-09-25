package com.cg.orb.dbutil;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Dbutil {

public static Connection getConnection() throws SQLException, IOException

{
	Connection conn=null;
	Properties prop = readDbInfo();
	
	String url=prop.getProperty("url");
	String username=prop.getProperty("username");
	String password=prop.getProperty("password");
     conn=DriverManager.getConnection(url,username,password);
     return conn;
     
	
	
	
}

private static Properties readDbInfo() throws IOException

{
	// TODO Auto-generated method stub
	Properties p = new Properties();
	FileReader fr=new FileReader("hotel.properties");
	p.load(fr);
	return p;
}
}

	
	



