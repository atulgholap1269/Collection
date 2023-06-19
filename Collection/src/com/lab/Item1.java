package com.lab;

public class Item1 {
  int id;
  String item_name;
  int iPrice;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getItem_name() {
	return item_name;
}
public void setItem_name(String item_name) {
	this.item_name = item_name;
}
public int getiPrice() {
	return iPrice;
}
public void setiPrice(int iPrice) {
	this.iPrice = iPrice;
}
@Override
public String toString() {
	return "Item1 [id=" + id + ", item_name=" + item_name + ", iPrice=" + iPrice + "]";
}

  
}
