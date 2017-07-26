package com.lzw.login;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Login extends JFrame {
	private JLabel userLabel;
	private JLabel passLabel;
	private JButton exit;
	private JButton login;
	//private static TbUserlist user;
	
	public Login() {
		setTitle("Login to Sell-Buy-Store Management System");
		final JPanel panel = new LogPanel(); 
		panel.setLayout(null);
		getContentPane().add(panel);
		setBounds(600, 400, panel.getWidth(), panel.getHeight());
		
		setVisible(true);
		setResizable(true);
		//setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);		
	}
	
	
	

}
