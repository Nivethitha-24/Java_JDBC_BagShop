package com.nivethitha.bagshop;

public class Excess extends Exception
{
	Excess(String msg)
	{
	super(msg);
	}
	void disp()
	{
		System.out.println("Excess quantity");
	}
}
