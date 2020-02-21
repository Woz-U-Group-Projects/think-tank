package com.thinktank.whim;

public class Entry {
	private int orderNumber;
	private int barCode;
	private int quantity;
	
	private String name;
	private String type;
	
	
	
	private Entry(EntryBuilder builder) {
		this.orderNumber = builder.orderNumber;
		this.barCode = builder.barCode;
		this.quantity = builder.quantity;
		this.name = builder.name;
		this.type = builder.type;
		
		
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	public int getBarCode() {
		return barCode;
	}
	public int getquantity() {
		return quantity;
	}
	public String getname() {
		return name;
	}
	public String gettype() {
		return type;
	}
	
	
	public static class EntryBuilder{
		private int orderNumber;
		private int barCode;
		private int quantity;
		
		private String name = "";
		private String type = "";
		
		
		public EntryBuilder(int orderNumber, int barCode, int quantity) {
			this.orderNumber = orderNumber;
			this.barCode = barCode;
			this.quantity = quantity;
		}
		
		public EntryBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public EntryBuilder setType(String type) {
			this.type = type;
			return this;
		}
		
		public Entry build() {
			return new Entry(this);
		}
	}
}
