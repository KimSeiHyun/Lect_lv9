package models;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.Content;


public class MainFrame extends JFrame{

	public MainFrame() {
		super("kiosk");
		setLayout(null);
		setBounds(400,100,800,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new Content());
		
		setVisible(true);
		revalidate();
	}
	

	

}
