package com.themaxsmith.preorder.logic;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.themaxsmith.preorder.gui.Home;

public class Company {
	

	public static CompanyData data = new CompanyData();
	
	public static void main(String[] args) {
		
		
	String message =  JOptionPane.showInputDialog(null,"Enter product name:");
	data.setProductName( message);
	Home frame = new Home();
	frame.setVisible(true);
	}
	
}

class CompanyData {
private ArrayList<Store> stores = new ArrayList<>();
	
	private int inWarehouseWaitingToShip;
	
	private String productName;
	
	private Boolean released;

	public ArrayList<Store> getStores() {
		return stores;
	}
	public Store getStore(int x) {
		if (x > stores.size()-1) {
			JOptionPane.showMessageDialog(null, "Not A Vaild Store");
			return stores.get(0);
		}
		return stores.get(x);
	}

	public void setStores(ArrayList<Store> stores) {
		this.stores = stores;
	}

	public int getInWarehouseWaitingToShip() {
		return inWarehouseWaitingToShip;
	}

	public void setInWarehouseWaitingToShip(int inWarehouseWaitingToShip) {
		this.inWarehouseWaitingToShip = inWarehouseWaitingToShip;
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