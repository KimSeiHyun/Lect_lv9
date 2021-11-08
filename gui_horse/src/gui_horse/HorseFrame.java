package gui_horse;

import javax.swing.JFrame;

public class HorseFrame extends JFrame {
	
	public HorseFrame() {
		super("horse");
		setLayout(null);
		setBounds(500,100,1000,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new Content());
		
		
		setVisible(true);
		revalidate();
	}
}
