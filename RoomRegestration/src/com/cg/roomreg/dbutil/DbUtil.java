package com.cg.roomreg.dbutil;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {

	public static Connection getConnection() throws IOException, SQLException
	{
		Connection con=null;
		Properties prop=readdbInfo();
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		con=DriverManager.getConnection(url,username,password);
		return con;
	}

	private static Properties readdbInfo() throws IOException 
	{
		Properties p=new Properties();
		FileReader fr= new FileReader("roominfo.properties");
		p.load(fr);
		return p;
	}
}
