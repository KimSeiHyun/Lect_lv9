package basic;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//class ExPanel5 extends JPanel {
//	
//	public ExPanel5() {
//		
//	}
//	
//}

public class Ex_ScrollPane extends JFrame{
	
	JScrollPane js = null;
	
	JTable table = new JTable();
	JLabel image = new JLabel();
//	ExPanel5 panel = new ExPanel5();
	
	public Ex_ScrollPane() {
		setLayout(null);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setScrollPane();
		
		setVisible(true);
		revalidate();
		
	}
	
	private void setScrollPane() {
		// JScrollPane�� ��ũ�� ����� �ִ� ���̾� ��� �����.
		
		// ��ũ�����ο� ���� ������Ʈ�� �غ� >> ex) panel , button , iamge ��� 
		ImageIcon image = new ImageIcon(new ImageIcon("image/����1.png").getImage().getScaledInstance(800, 800, Image.SCALE_SMOOTH));
		this.image = new JLabel(image);
		this.image.setBounds(0,0,800,800);
		this.image.setVisible(true);
		
		// ��ũ�������� ����.
		// �����ڿ��� ��ũ�����ο� ���� ������Ʈ�� ���ڷ� �ѱ�.
		this.js = new JScrollPane(this.image); 
		
//		this.js = new JScrollPane(table);
//		this.js = new JScrollPane(panel);
		
		this.js.setBounds(0,0,500,500);
		js.setAutoscrolls(true);
		add(js);
	}

	public static void main(String[] args) {
		new Ex_ScrollPane();
	}

}
