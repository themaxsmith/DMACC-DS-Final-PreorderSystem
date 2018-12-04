package com.themaxsmith.preorder.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Production extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Production frame = new Production();
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
	public Production() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGoHome = new JButton("Go Home");
		btnGoHome.setBounds(6, 120, 438, 48);
		contentPane.add(btnGoHome);
		
		JButton btnReleaseProduct = new JButton("Release Product");
		btnReleaseProduct.setBounds(6, 62, 438, 48);
		contentPane.add(btnReleaseProduct);
		
		JButton btnAddProdcut = new JButton("Add Product");
		btnAddProdcut.setBounds(279, 6, 165, 48);
		contentPane.add(btnAddProdcut);
		
		textField = new JTextField();
		textField.setToolTipText("Enter Amt to Produce");
		textField.setBounds(6, 16, 261, 26);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
