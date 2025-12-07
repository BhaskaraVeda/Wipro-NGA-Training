package com.wipro.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mydb {

	 Connection  getConnection() throws ClassNotFoundException, SQLException
	   {
	        
			String dbUrl="jdbc:mysql://localhost:3306/wipropractice";
			String uname="root";     // mysql uname
			String password="root";   // mysql pass
			Class.forName("com.mysql.cj.jdbc.Driver");//  1
			Connection conObj = DriverManager.getConnection(dbUrl,uname ,password);//2
			return conObj;
	   }
}
