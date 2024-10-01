package com.main;
import java.sql.Connection;
import java.sql.DriverManager;
public class util {
public Connection getDBConnection() {
	Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","");
	}catch(Exception ex) {
		System.out.println(ex);
	}
	return con;
}
}
