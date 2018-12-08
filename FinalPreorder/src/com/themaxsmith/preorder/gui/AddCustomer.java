package com.themaxsmith.preorder.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.themaxsmith.preorder.logic.Company;
import com.themaxsmith.preorder.logic.Customer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class AddCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField cus_name;
	private JTextField cus_address;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public AddCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton addCustomerBtn = new JButton("Add Customer");
		addCustomerBtn.setBounds(6, 164, 268, 48);
		contentPane.add(addCustomerBtn);
		
		JButton btnGenerateCustomer = new JButton("Generate Customers");
		btnGenerateCustomer.setBounds(286, 164, 158, 48);
		contentPane.add(btnGenerateCustomer);
		
		JLabel lblNewLabel = new JLabel("Enter New Customer");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 438, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Store #:");
		lblNewLabel_1.setBounds(6, 34, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JSpinner cus_store = new JSpinner();
		cus_store.setBounds(204, 29, 240, 26);
		contentPane.add(cus_store);
		
		JLabel lblNewLabel_2 = new JLabel("Customer Name:");
		lblNewLabel_2.setBounds(6, 62, 185, 16);
		contentPane.add(lblNewLabel_2);
		
		cus_name = new JTextField();
		cus_name.setBounds(204, 57, 240, 26);
		contentPane.add(cus_name);
		cus_name.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Address:");
		lblNewLabel_3.setBounds(6, 90, 185, 16);
		contentPane.add(lblNewLabel_3);
		
		cus_address = new JTextField();
		cus_address.setBounds(204, 85, 240, 26);
		contentPane.add(cus_address);
		cus_address.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Pick Up From Store:");
		lblNewLabel_4.setBounds(6, 118, 185, 16);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox cus_store_pickup = new JCheckBox("Yes");
		cus_store_pickup.setBounds(204, 114, 128, 23);
		contentPane.add(cus_store_pickup);
		
		JButton btnExit = new JButton("Go Home");
		btnExit.setBounds(6, 224, 438, 48);
		contentPane.add(btnExit);
		
		addCustomerBtn.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  if (Company.data.getStore(Integer.parseInt(cus_store.getValue().toString()))) {
					Customer x = new Customer(cus_name.getText(), cus_address.getText(), cus_store_pickup.isSelected(),  Integer.parseInt(cus_store.getValue().toString()));
			Company.data.getStores().get(Integer.parseInt(cus_store.getValue().toString())).addCustomer(x);	
				 
				  }
			  } 
				} );
		btnGenerateCustomer.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  for (int xy = 0; xy < 300; xy++) {
				  Random generate = new Random(); 
				  String[] name = {"John", "Marcus", "Susan", "Henry"};
				  String[] Lname = {"Smith", "Stayner", "Murphay", "Linder"};
					
					  String[] address = {"1st Street", "White Birch", "Birewood", "9th Street"};
					  int store = generate.nextInt(Company.data.getStores().size());
						
								Customer x = new Customer(name[generate.nextInt(4)] + " "+Lname[generate.nextInt(4)], (generate.nextInt(900)+100)+" "+address[generate.nextInt(4)], generate.nextInt(2) == 1, store );
						Company.data.getStores().get(store).addCustomer(x);	
						  
							  }
				  Company.data.customerTotal = Company.data.customerTotal + 300;
				  Company.data.customerWaiting = Company.data.customerWaiting + 300;
					 JOptionPane.showMessageDialog(null,"300 Customers Generated");
			
				  } 
				} );
		JFrame s = this;
		btnExit.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
					s.dispose();
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Home frame = new Home();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				  } 
				} );
	}
}
