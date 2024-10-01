package com.nivethitha.bagshop;
import java.util.*;
public class main1 {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		Bag b;
		Invent i=new Invent();
		int op,con,quantity;
		String name,shop_name,branch,jewel_type,u_name,pwd,id;
		Users u;
		login l=new login();		
		do 
		{
			System.out.println("Enter Login Details ");
			System.out.println("Enter User Name: ");
			u_name=scan.next();
			System.out.println("Enter Password: ");
			pwd=scan.next();
			
			u=new Users(u_name,pwd);
			boolean lc=l.checkUser(u);
			if(lc)
			{
				do
				{
					System.out.println("1-Add\n2.Update\n3.Remove\n4.Search\n5.Display");
					System.out.println("Enter Option: ");
					int option=scan.nextInt();
					switch(option)
					{
					case 1:
						System.out.println("Enter name ");
						name=scan.next()+scan.nextLine();
						System.out.println("Enter Name");
						shop_name=scan.next()+scan.nextLine();
						System.out.println("Enter the branch");
						branch=scan.next()+scan.nextLine();
						System.out.println("Enter the branch_type");
						jewel_type=scan.nextLine();
						System.out.println("Enter quantity: ");
						quantity=scan.nextInt();
						i.add(new Bag(name,shop_name,branch,jewel_type,quantity));
						break;
					case 2:
						System.out.println("Enter ID: ");
						id=scan.next()+scan.nextLine();
						b=i.search(id);
						System.out.println("1-Change Name\n2-Change shop_name\n3-Change quantity");
						System.out.println("Enter Check: ");
						int c=scan.nextInt();
						switch(c)
						{
						case 1:
							System.out.println("Enter Name: ");
							name=scan.next()+scan.nextLine();
							b.setName(name);
							break;
						case 2:
							System.out.println("Enter Shop name: ");
							shop_name=scan.next()+scan.nextLine();
							b.setShop_name(shop_name);
							break;
						case 3:
							System.out.println("Enter quantity:");
							quantity=scan.nextInt();
							b.setQuantity(quantity);
							break;
						}
						break;
					case 3:
						System.out.println("Enter ID: ");
						id=scan.next()+scan.nextLine();
						i.remove(id);
						break;
					case 4:
						System.out.println("Enter ID: ");
						id=scan.next()+scan.nextLine();
						b=i.search(id);
						System.out.println(b);
						break;
					case 5:
						i.show();
						break;
					}
					System.out.println("Enter Op: ");
					op=scan.nextInt();
				}while(op!=-1);
			}
			else
			{
				i.show();
			}
			System.out.println("Enter 1 to Logout and continue using another Login or Enter -1 to Exit");
			con=scan.nextInt();
		}while(con!=-1);
	}

}
