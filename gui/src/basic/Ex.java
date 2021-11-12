package basic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ExPanel2 extends MyUtil {
	
	private JLabel label = new JLabel();
//	private JLabel image = new JLabel();
	
	private ImageIcon icon = new ImageIcon("image/루피"+1+".png");
	private int x = 100;

	private Image im = new ImageIcon("image/루피"+1+".png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	private JLabel image = new JLabel(new ImageIcon(im));
	private Image im2 = new ImageIcon("image/루피"+1+".png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
	private JLabel image2 = new JLabel(new ImageIcon(im2));
	
	public ExPanel2() {
		setLayout(null);
		setBounds(0,0,500,500);

		this.label.setBounds(0,0,500,500);
		this.label.setText("test");
		add(this.label); // 컨테이너 위에 add()메소드를 통해 -> 컴포넌트 추가 : 인덱스가 붙음 (추가하는 순서대로)	
		
		this.image.setBounds(0,0,500,500);
		this.image2.setBounds(0,0,600,600);
	//	this.image.setIcon(new ImageIcon("image/루피.png"));
		this.image.setVisible(true);
		add(this.image); // <<<   우선순위 변경 [ 제일먼저 add한것은 변경을 할 수 없음.]
		add(this.image2);
		//먼저 추가한것일수록 제일 위로 올라오고 다음에 추가하는건 그 뒤로 깔림.
//		
//		//컴포넌트 지우기
//		remove(image);
//		this.revalidate();
//		this.repaint();
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.im, x,100 , null);
		
		try {
			Thread.sleep(50);
			x ++;
		} catch (Exception e) {
			// TODO: handle exception
		}
		repaint();
	}
}


class ExFrame2 extends JFrame {
	
	public ExFrame2() {
		super("drag");
		setLayout(null);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new ExPanel2());
		setVisible(true);
		revalidate();
	}
}
public class Ex {

	public static void main(String[] args) {
		ExFrame2 frame = new ExFrame2();
	}

}
