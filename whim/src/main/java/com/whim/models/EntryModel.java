package com.whim.models;

public class EntryModel {
	
	protected int orderNumber;
	protected int barCode;
	protected String name;
	protected String type;
	protected int quantity;
	
	EntryModel(int orderNumber, int barCode, String name, String type, int quantity){
		this.orderNumber = orderNumber;
		this.barCode = barCode;
		this.name = name;
		this.type = type;
		this.quantity = quantity;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
