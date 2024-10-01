package com.nivethitha.bagshop;

public class Bag_info {
String Brand;
private String id;
private int Quantity;
public Bag_info() {
	
}
public Bag_info(String Brand,int Quantity,String id) {
	this.Brand=Brand;
	this.Quantity=Quantity;
	this.id=id;
}
public String getBrand() {
	return Brand;
}

public int getQuantity() {
	return Quantity;
}

public void setBrand(String brand) {
	Brand = brand;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
public String getId() {
	return id;
}

public void setId(String id) {
	this.id=id;
}
@Override
public String toString() {
	return "Bag_info [Brand=" + Brand + ", id=" + id + ", Quantity=" + Quantity + "]";
}
}

