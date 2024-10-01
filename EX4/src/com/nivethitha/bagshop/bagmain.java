package com.nivethitha.bagshop;

import java.util.Scanner;
public class bagmain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Bag_info b=new Bag_info();
		Bag bg=new Bag();
		bag_inventory inv=new bag_inventory();
		int op1;
		inv.show();

		do
		{
			System.out.println("1.Add\n2.Update\n3.Search\n4.Remove\n5.Show\n-1 to stop");
		    op1=sc.nextInt();
			switch(op1)
			{
			case 1:
				/*bg=new Bag();
				System.out.println("Enter name/shop name/branch/bag type/quantity");
				bg.setName(sc.next());
				bg.setShop_name(sc.next());
				bg.setBranch(sc.next());
				bg.setJewel_type(sc.next());
				bg.setQuantity(sc.nextInt());
				boolean addsts= inv.add(bg);
				*/
				System.out.println("Enter brand and quantity");
				b.setBrand(sc.next());
				b.setQuantity(sc.nextInt());
				boolean addsts= inv.add(b);
				if(addsts)
					System.out.println("Details Added");
				else
					System.out.println("Could not Add");
				break;
				
			case 2:
				/*System.out.println("List of items");
				inv.show();
				System.out.println("Enter id:");
				String id=sc.next();
				bg=inv.search(id);
				System.out.println("Enter 1.name\n2.shop name\n3.branch\n4.bag type\n5quantity\n to update products basis:");
				int o=sc.nextInt();
				switch(o)
				{
				case 1:
					System.out.println("Enter brand to be updated");
					b.setBrand(sc.next());
					inv.update();
					break;
				case 2:
					System.out.println("Enter the shop name to be updated");
					bg.setShop_name(sc.next());
					inv.update();
					break;
				case 3:
					System.out.println("Enter brand to be updated:");
					bg.setBrand(sc.next());
					inv.update();
					break;
				case 4:
					System.out.println("Enter the jewel type to be updated");
					bg.setJewel_type(sc.next());
					inv.update();
					break;
				}*/
				System.out.println("Enter id:");
				String id=sc.next();
				b.setId(id);
				System.out.println("Enter 1-To change the Brand\n2-To change the Quantity");
				int o=sc.nextInt();
				switch(o)
				{
				case 1:
					System.out.println("Enter brand to be updated");
					b.setBrand(sc.next());
					break;
				case 3:
					System.out.println("Enter brand to be updated:");
					b.setBrand(sc.next());
					break;
				}
				boolean upsts=inv.update(b,o);
				if(upsts)
					System.out.println("Details Updated");
				else
					System.out.println("Could not Updated");
				break;
			 case 3:
				System.out.println("Enter id to be searched:");
				String i=sc.next();
				bg=inv.search(i);
				System.out.println(bg);
				break;
			 case 4:
				 System.out.println("Enter id to be deleted:");

                 while (!sc.hasNextInt()) {

                     System.out.println("Invalid input. Please enter a valid ID.");

                     sc.next();

                 }

                 int deleteId = sc.nextInt();

                 inv.remove(deleteId);

                 break;
			 case 5:
				inv.show();
			
			}
		}while(op1!=-1);

	}

}
