package com.themaxsmith.preorder.logic;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CompanyData {
private ArrayList<Store> stores = new ArrayList<Store>(){{
   add(new Store(0));
   add(new Store(1));
   add(new Store(2));
   add(new Store(3));
   add(new Store(4));
   add(new Store(5));
}};;
	
	private int inWarehouseWaitingToShip = 0;
	
	private String productName = "";
	
	private Boolean released = false;
	public int customerWaiting = 0;
	public int customerTotal = 0;
	public ArrayList<Store> getStores() {
		return stores;
	}
	public int sendToStores() {
			int product = inWarehouseWaitingToShip / stores.size();
		for(int x = 0; x < stores.size(); x++) {
			stores.get(x).productDelivered(product);
		}
		return product;
	}
	public void sendToCus() {

		int total = 0;
		for(int x = 0; x < stores.size(); x++) {
			total = total + stores.get(x).lookForCustomers();
		}
		JOptionPane.showMessageDialog(null, "Sent product to Customers. Product Sent: "+total);
	
	}
	public boolean getStore(int x) {
		if (x > stores.size()-1) {
			JOptionPane.showMessageDialog(null, "Not A Vaild Store");
			return false;
		}
		if (x < 0) {
			JOptionPane.showMessageDialog(null, "Not A Vaild Store");
			return false;
		}
		return true;
	}

	public void setStores(ArrayList<Store> stores) {
		this.stores = stores;
	}
	private Log log = new Log(2000);

	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	}
	
	public int getInWarehouseWaitingToShip() {
		return inWarehouseWaitingToShip;
	}

	public void addWarehouseWaitingToShip(int inWarehouseWaitingToShip) {
		this.inWarehouseWaitingToShip = this.inWarehouseWaitingToShip +  inWarehouseWaitingToShip;
		JOptionPane.showMessageDialog(null, "Added: "+inWarehouseWaitingToShip+" Total:"+this.inWarehouseWaitingToShip);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Boolean getReleased() {
		return released;
	}

	public void setReleased(Boolean released) {
		this.released = released;
	}
}