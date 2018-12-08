package com.themaxsmith.preorder.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.themaxsmith.preorder.logic.Company;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Production extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Production() {
		setTitle(Company.data.customerWaiting+" / "+Company.data.customerTotal);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 269);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGoHome = new JButton("Go Home");
		btnGoHome.setBounds(6, 186, 438, 48);
		contentPane.add(btnGoHome);
		JButton btnReleaseProduct = new JButton("Release Product");
		btnReleaseProduct.setBounds(6, 126, 438, 48);
		contentPane.add(btnReleaseProduct);
		JFrame s = this;
		btnGoHome.addActionListener(new ActionListener() { 
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
		if (Company.data.getReleased()) {
			btnReleaseProduct.setText("Send Product to Customers From Stores");
		}
		
		JButton btnAddProdcut = new JButton("Add Product");
		btnAddProdcut.setBounds(279, 6, 165, 48);
		contentPane.add(btnAddProdcut);
		
		textField = new JTextField();
		textField.setToolTipText("Enter Amt to Produce");
		textField.setBounds(6, 6, 261, 48);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSendProductFrom = new JButton("Send Product from Warehouse to Stores");
		btnSendProductFrom.setBounds(6, 66, 438, 48);
		contentPane.add(btnSendProductFrom);
		btnSendProductFrom.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(null,"Products sent to each store: "+Company.data.sendToStores());
				  } 
				} );
	
		btnReleaseProduct.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
					if (!Company.data.getReleased()) {
					Company.data.setReleased(true);
					
					btnReleaseProduct.setText("Send Product to Customers From Stores");
					 JOptionPane.showMessageDialog(null,"Product "+Company.data.getProductName()+" Released");
				
					}else {
						Company.data.sendToCus();
						setTitle(Company.data.customerWaiting+" / "+Company.data.customerTotal);
					}
				  } 
				} );
		btnAddProdcut.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
					Company.data.addWarehouseWaitingToShip(Integer.parseInt( textField.getText()));
					setTitle(Company.data.customerWaiting+" / "+Company.data.customerTotal);
				  } 
				} );
	}

}
