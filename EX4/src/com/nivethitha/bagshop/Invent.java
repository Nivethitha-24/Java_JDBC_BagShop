package com.nivethitha.bagshop;

import java.util.ArrayList;
import java.util.List;

public class Invent
{
	List <Bag> l=new ArrayList<>();
	 public void add(Bag b)
	{
		l.add(b);
	}
	 public void update()
	{
		 System.out.println("Updated Sucessfully");
	}
	public void remove(String id)
	{
		for(int i=0;i<l.size();i++)
		{
			if (id.equals(l.get(i).getId()))
				l.remove(i);
		}
	}
	public Bag search(String id)
	{
		for(int i=0;i<l.size();i++)
		{
			if(id.equals(l.get(i).getId()))
				return (l.get(i));
		}
		return null;
	}
	public void show()
	{
		for(Bag b:l)
		{
			System.out.println(b);
		}
	}
}
