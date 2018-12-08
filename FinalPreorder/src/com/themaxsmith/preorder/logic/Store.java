package com.themaxsmith.preorder.logic;

import java.util.ArrayList;

public class Store {
	
	private QueueCustomer customers = new QueueCustomer(100);
	private int storeID;
	
	private int productHave;
	
	private int productWaiting;
	
	
	public Store(int storeID) {
		this.storeID = storeID;
	}
	public void addCustomer(Customer x) {
		customers.enqueue(x);
	}
	public void productDelivered(int product) {
		productHave = productHave + product;
		Company.data.getLog().push("Store #"+storeID+"\t"+"Received "+product+" from Warehouse");
	}
	
	public int lookForCustomers() {
		int delivered = 0;
		System.out.println("store #"+storeID);
		for(int x = 0; x < productHave; x++) {
			if (!customers.isEmpty()) {
			Customer y  = customers.dequeue();
			delivered++;
			Company.data.customerWaiting--;
			productPickup(y);
		}
		}
		Company.data.getLog().push("Store #"+storeID+"\t"+"Delivered "+delivered+" to Customers");
		return delivered;
	}
	public void productPickup(Customer x) {
		
		if (x.getIsPickup()) {
			System.out.println(x+": Order Pickup");
		}else {
			System.out.println(x+": Order Sent to "+x.getAddress());
		}
		
	}
	
}
