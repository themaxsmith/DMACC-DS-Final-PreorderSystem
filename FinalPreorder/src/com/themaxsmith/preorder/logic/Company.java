package com.themaxsmith.preorder.logic;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.themaxsmith.preorder.gui.Home;

public class Company {
	

	public static final CompanyData data = new CompanyData();
	
	public static void main(String[] args) {
		
		
	String message =  JOptionPane.showInputDialog(null,"Enter product name:");
	data.setProductName( message);
	Home frame = new Home();
	frame.setVisible(true);
	}
	

}

