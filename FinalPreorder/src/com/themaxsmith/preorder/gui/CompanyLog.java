package com.themaxsmith.preorder.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import com.themaxsmith.preorder.logic.Company;

import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

public class CompanyLog extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public CompanyLog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSaveCompanyLog = new JButton("Save Company Log To File");
		btnSaveCompanyLog.setBounds(6, 197, 470, 48);
		contentPane.add(btnSaveCompanyLog);
		
		JButton btnExit = new JButton("Go Home");
		btnExit.setBounds(6, 257, 470, 48);
		contentPane.add(btnExit);
		JFrame s = this;
		btnSaveCompanyLog.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  try (PrintWriter out = new PrintWriter("output.txt")) {
					   while (!Company.data.getLog().isEmpty())
					    out.println(Company.data.getLog().pop());
					   
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				  JOptionPane.showMessageDialog(null,"Saved Log to File");
				  } 
				} );
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
		JTextArea log = new JTextArea();
		
		
			log.setText(Company.data.getLog().display());
			log.setEditable(false);

		
		JScrollPane logW = new JScrollPane(log);
		logW.setBounds(6, 6, 470, 179);
		logW.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		logW.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(logW);

		
		
	}
}
