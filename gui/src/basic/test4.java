package basic;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

class ExPanel4 extends JPanel {
	
	JButton[] btn = new JButton[10];
	
	public ExPanel4() {
		setLayout(null);
		setBounds(0,0,400,1000);
		
		setButton();
	}

	private void setButton() {
		for(int i=0; i<10; i++) {
			this.btn[i] = new JButton();
			this.btn[i].setBounds(0,i*100,100,100);
			this.btn[i].setText(i+1 +"");
			add(this.btn[i]);
		}
	}
}



public class test4 extends JFrame{
	
	JScrollPane js = null; 
	ExPanel panel = new ExPanel();

	public test4() {
		setLayout(null);
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel.setPreferredSize(new Dimension(400,1000));
		js = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		js.setBounds(0,0,400,400);
		js.isWheelScrollingEnabled();
		js.setAutoscrolls(true);
		setContentPane(js);	
		
		setVisible(true);
		revalidate();
	}

	public static void main(String[] args) {
		new test4();
	}

}
