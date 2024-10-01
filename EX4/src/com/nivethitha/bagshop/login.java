package com.nivethitha.bagshop;

public class login
{
	public boolean checkUser(Users u) 
	{
		if(u.getU_name().equals("Nivethitha"))
		{
			System.out.println(u.getU_name());
			return true;
		}
		else
		{
			System.out.println(u.getU_name());
			return false;
		}
	}
}
