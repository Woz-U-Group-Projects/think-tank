package com.whim.models;

public class FactoryModel extends EntryModel {
	
	private String value;
	
	public FactoryModel(Long orderNumber, Long barCode, String name, String type, Integer quantity, String value){
		super(orderNumber,barCode,name,type,quantity);
		this.value = value;
	
}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public EntryModel createEntry(String value) {
		if(value.equalsIgnoreCase("sent")) {
			return new SentModel(orderNumber, barCode, name, type, quantity);
		}
		else if(value.equalsIgnoreCase("received")) {
			return new ReceivedModel(orderNumber, barCode, name, type, quantity);
		}
		else if(value.equalsIgnoreCase("damaged")) {
			return new DamagedModel(orderNumber, barCode, name, type, quantity);
		}
		else {
			return null;
		}
	}
}
