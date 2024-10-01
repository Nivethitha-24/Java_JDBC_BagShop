package com.nivethitha.bagshop;
import java.util.*;
public class inventory {
Bag_info[] bg;
Scanner sc=new Scanner(System.in);
public void add() {
	System.out.println("Enter the number of products:");
	int n=sc.nextInt();
	bg=new Bag_info[n];
	for(int i=0;i<n;i++) {
		bg[i]=new Bag_info();
		System.out.println("Enter the brand of bag:");
		bg[i].setBrand(sc.next());
		System.out.println("Enter the Quantity:");
		bg[i].setQuantity(sc.nextInt());
		bg[i].setId(genid(bg[i]));
	}
	System.out.println("Added!!");
}
public void show() {
	for(int i=0;i<bg.length;i++) {
		System.out.println(bg[i]);
	}
}
public String genid(Bag_info bg) {
	String s=bg.getBrand().toUpperCase().substring(0,2);
	String str=s+bg.getBrand().toUpperCase().substring(0,3);
	return str;
}

}
