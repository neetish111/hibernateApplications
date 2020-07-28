package com.nt.entity;

public class Product {
private int pid;
private String pname;
private double price;
private int qty;
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + "]";
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}

}
