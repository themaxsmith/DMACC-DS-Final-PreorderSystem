package com.themaxsmith.preorder.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.themaxsmith.preorder.logic.Company;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Home() {
		setTitle("Pre-Order System For "+Company.data.getProductName());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddCustomer = new JButton("Add Customer");
		btnAddCustomer.setBounds(6, 34, 117, 48);
		contentPane.add(btnAddCustomer);
		
		JLabel lblNewLabel = new JLabel("Options:");
		lblNewLabel.setBounds(6, 6, 438, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnChangeProduction = new JButton("Production");
		btnChangeProduction.setBounds(142, 34, 117, 48);
		contentPane.add(btnChangeProduction);
		
		JButton btnStatsics = new JButton("Statistics");
		btnStatsics.setBounds(6, 94, 117, 48);
		contentPane.add(btnStatsics);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(142, 94, 117, 48);
		contentPane.add(btnExit);
		JFrame s = this;
		btnExit.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
					
				
					s.dispose();
					System.exit(0);
				  } 
				} );
		btnAddCustomer.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
					AddCustomer frame = new AddCustomer();
					frame.setVisible(true);
					s.dispose();
				  } 
				} );
		btnChangeProduction.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
					Production frame = new Production();
					frame.setVisible(true);
					s.dispose();
				  } 
				} );
		btnStatsics.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
					CompanyLog frame = new CompanyLog();
					frame.setVisible(true);
					s.dispose();
				  } 
				} );
		
	}
}
