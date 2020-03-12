package com.whim.models;

public class EntryModel {
	
	protected Long orderNumber;
	protected Long barCode;
	protected String name;
	protected String type;
	protected int quantity;
	
	EntryModel(Long orderNumber, Long barCode, String name, String type, Integer quantity){
		this.orderNumber = orderNumber;
		this.barCode = barCode;
		this.name = name;
		this.type = type;
		this.quantity = quantity;
	}

	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getBarCode() {
		return barCode;
	}

	public void setBarCode(Long barCode) {
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
