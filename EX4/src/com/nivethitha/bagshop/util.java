package com.nivethitha.bagshop;
import java.sql.Connection;

import java.sql.DriverManager;

public class util 

{

	public Connection getDBConnection()

	{

		Connection con=null;

		try

		{

			Class.forName("com.mysql.cj.jdbc.Driver");

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bagshop","Nivi","");	

		}

		catch(Exception e)

		{

			System.out.println(e);

		}

		return con;

	}
}