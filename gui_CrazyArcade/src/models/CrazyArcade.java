package models;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.Content;

class AlertEnd extends JFrame {
	
	private JLabel endText = new JLabel("GAME  OVER");
	public AlertEnd() {
		super("End");
		setLayout(null);
		setBounds(300,300,220,200);
		setVisible(true);
		revalidate();
		this.endText.setBounds(0,50,200,50);
		this.endText.setFont(new Font("",1,20));
		this.endText.setHorizontalAlignment(JLabel.CENTER);
		add(this.endText);
	}
}
public class CrazyArcade extends JFrame {

	public CrazyArcade() {
		super("CrazyArcade");
		setLayout(null);
		setBounds(200,150,800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new Content());
		setVisible(true);
		revalidate();
		
	}
	
	public static void end() {
		new AlertEnd();
	}
}
