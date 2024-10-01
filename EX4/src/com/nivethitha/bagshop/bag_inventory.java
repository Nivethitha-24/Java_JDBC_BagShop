package com.nivethitha.bagshop;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class bag_inventory
{
	Statement stmt;
	ResultSet rs;
	String qry=null;
	util db=new util();
	Connection con;
	int count;
List<Bag> l=new ArrayList<>();
Bag_info bg=new Bag_info();
 /*public void add(Bag bg) {
 {
	l.add(j);
 }*/
public boolean add(Bag_info b)
{
	boolean sts=false;
	 try
	 {
		 con=db.getDBConnection();
		 stmt=con.createStatement();
		 count=stmt.executeUpdate("insert into bagdetails(brand,quantity) values('"+b.getBrand()+"',"+b.getQuantity()+")");
		 if(count==1)
			 sts=true;
		 else
			 throw new Exception();
	 }
	 catch(Exception ex)
	 {
		 System.out.println(ex);
	 }
	 return sts;
}
 
public void show()
 {
	/* for(Bag j:l)
	 {
		 System.out.println(j);
	 }*/
  	try {

  		con=db.getDBConnection();

		stmt=(Statement) con.createStatement();

		rs=((java.sql.Statement) stmt).executeQuery("select * from bagdetails");

		while(rs.next())

		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));

	}

	catch(Exception ex) {System.out.println(ex.getMessage());}

}

 public Bag search(String i2)
 {
	 for(int i=0;i<l.size();i++)
	 {
		 if(i2.equals(l.get(i).getId()))
				 return l.get(i);
		 
	 }
	 return null;
 }
 /*public void update()
 {
	 System.out.println("Updation is done successfully");
	 show();
 }*/
 public boolean update(Bag_info b,int o)
 {
	 boolean sts=false;
	 int count=0;
	 try
	 {
		 con=db.getDBConnection();
		 stmt=con.createStatement();
		 switch(o)
		 {
		 case 1:
			 qry="update bagdetails set Brand='"+b.getBrand()+"' where id ="+b.getId();
			 break;
		 case 2:
			 qry="update bagdetails set Quantity='"+b.getQuantity()+"' where id ="+b.getId();
			 break;
		 }
		 count=stmt.executeUpdate(qry);
		 if(count==1)
			 sts=true;
		 else
			 throw new Exception();
	 }
	 catch(Exception ex)
	 {
		 System.out.println(ex);
	 }
	 return sts;
 }
 /*public void remove(String id)
 {
	 for(int i=0;i<l.size();i++)
	 {
		 if(id.equals(l.get(i).getId()))
				 {
			 			l.remove(i);
				 }
	 }
 }*/
 public void remove(int id) {

     try {

         con = db.getDBConnection();

         stmt = con.createStatement();

         

         stmt.executeUpdate("DELETE FROM bagdetails WHERE id=" + id);

     } catch (Exception ex) {

         System.out.println(ex.getMessage());

     }

     System.out.println("Item removed from db");

 }
	 
 
 public  String generateId(Bag j)
	{
		String s=((Bag) j).getName().toUpperCase().substring(0,2);
		String str=s+((Bag) j).getShop_name().toUpperCase().substring(0,3);
		return str;
	}
}
	