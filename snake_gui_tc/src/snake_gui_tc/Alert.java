package snake_gui_tc;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Alert extends JFrame{
	
	private JLabel text = new JLabel();
	// 300 * 200
	public Alert() {
		super("Game Over");
		setLayout(null);
		this.text.setBounds(0,0,300,200);
		this.text.setText("¸ö¿¡ ºÎ‹HÇô »ç¸Á !!! ");
		this.text.setFont(new Font("",Font.BOLD , 20));
		text.setHorizontalAlignment(JLabel.CENTER);
		add(this.text);
		setBounds(SnakeGame.WIDTH/2-150, SnakeGame.HEIGHT/2-100 , 300 , 200);
		setVisible(true);
		revalidate();
	}
}
