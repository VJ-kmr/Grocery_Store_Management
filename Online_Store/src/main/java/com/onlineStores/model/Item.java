package com.onlineStores.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Item {
	@Id
 private int itemId;
private String itemName;
private String itemDescribtion;
private int itemCost;
private int itemQuantity;

public Item() {
	super();
	// TODO Auto-generated constructor stub
}
public Item(int itemId,String itemName,String itemDescribtion,int itemCost,int itemQuantity) {
	this.itemId=itemId;
	this.itemName=itemName;
	this.itemDescribtion=itemDescribtion;
	this.itemCost=itemCost;
	this.itemQuantity=itemQuantity;
}
 public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescribtion() {
		return itemDescribtion;
	}
	public void setItemDescribtion(String itemDescribtion) {
		this.itemDescribtion = itemDescribtion;
	}
	public int getItemcost() {
		return itemCost;
	}
	public void setItemcost(int itemcost) {
		this.itemCost = itemcost;
	}
public int getItemQuantity() {
	return itemQuantity;
}
public void setItemQuantity(int itemQuantity) {
	this.itemQuantity = itemQuantity;
}
}
