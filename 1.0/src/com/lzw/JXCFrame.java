package com.lzw;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.lzw.login.Login;

public class JXCFrame {
	private JPanel sysManagePanel;
	private JDesktopPane desktopPane;
	private JFrame frame;
	private JLabel backLabel;
	
	public JXCFrame() {
		frame = new JFrame("Buy-Sell-Store Management System");
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Login();     //create login window
			}
		});
	}

}
