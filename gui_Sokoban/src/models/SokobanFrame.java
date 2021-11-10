package models;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.Sokoban;

class AlertEnd extends JFrame {
	
	private JLabel text = new JLabel("game clear!!");
	public AlertEnd() {
		super("Clear!!");
		setLayout(null);
		setBounds(400,400,200,100);
		setVisible(true);
		
		this.text.setBounds(0,0,200,50);
		this.text.setFont(new Font("",1,15));
		add(this.text);
	}
}

public class SokobanFrame extends JFrame{

	public SokobanFrame() {
		super("Sokoban");
		setLayout(null);
		setBounds(200,200,600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new Sokoban());
		
		setVisible(true);

		revalidate();

	}
	
	public static void end() {
		new AlertEnd();
	}
	
}
