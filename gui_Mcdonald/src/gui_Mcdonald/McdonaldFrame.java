package gui_Mcdonald;

import javax.swing.JFrame;

public class McdonaldFrame extends JFrame {
	OrderState state;
	
	public McdonaldFrame() {
		super("Mc Donald");
		setLayout(null);
		setBounds(200,200,800,950);
		add(new Content());
		add(new OrderState());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		revalidate();
		
	}
	
	public static void finish () {
		new AlertFrame();
	}
	
}
