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
	
	private ImageIcon icon = new ImageIcon("image/����"+1+".png");
	private int x = 100;

	private Image im = new ImageIcon("image/����"+1+".png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	private JLabel image = new JLabel(new ImageIcon(im));
	
	public ExPanel2() {
		setLayout(null);
		setBounds(0,0,500,500);

		this.label.setBounds(0,0,500,500);
		this.label.setText("test");
		add(this.label); // �����̳� ���� add()�޼ҵ带 ���� -> ������Ʈ �߰� : �ε����� ���� (�߰��ϴ� �������)	
		
		this.image.setBounds(0,0,500,500);
	//	this.image.setIcon(new ImageIcon("image/����.png"));
		this.image.setVisible(true);
		add(this.image); // <<<   �켱���� ���� [ ���ϸ��� add�Ѱ��� ������ �� �� ����.]
//		
//		//������Ʈ �����
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
