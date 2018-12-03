package com.themaxsmith.preorder.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public Home() {
		setTitle("Pre-Order System");
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
		
		JButton btnStatsics = new JButton("Statsics");
		btnStatsics.setBounds(6, 94, 117, 48);
		contentPane.add(btnStatsics);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(142, 94, 117, 48);
		contentPane.add(btnExit);
	}
}
