package com.themaxsmith.preorder.logic;

public class Customer {
	private String name,address;
	private Boolean isPickup = false;
	private int store;
	
	public Customer(String name, String address, Boolean isPickup, int store) {
		
	}
	
	public int getStore() {
		return store;
	}

	public void setStore(int store) {
		this.store = store;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getIsPickup() {
		return isPickup;
	}
	public void setIsPickup(Boolean isPickup) {
		this.isPickup = isPickup;
	}
	
	
}
