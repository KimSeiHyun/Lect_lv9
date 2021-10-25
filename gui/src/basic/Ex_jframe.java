package basic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
//import javax.swing.*; // ������ �������ִ� ��� Ŭ���� ��� ���� . 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// GUI : Graphic User Interface
// �� awt 
// �� swing

// JFrame : �ֻ��� �����̳� 
// JPanel : �����̳� <- ������Ʈ(��ҵ��� �ٿ�add() �����鼭  �ϼ���)
// �� JButton , JTextField , JLabel , JCheckBox ...

class HeadTitle extends JLabel {
	public HeadTitle() {
		setBounds(MyFrame.W/2-150,0,300,300);
		setText("����");
		setFont(new Font("asd", Font.BOLD , 30));
		setHorizontalAlignment(CENTER);
		setVisible(true);
	}
	
}
class MyPanel extends JPanel implements ActionListener { 
	Random rn = new Random();
	// ��ư �����
	// JButton
	JButton bt = new JButton(); 
	
	// ��ư ����
	// ���������� 3*3 ��ư�� ����
	JButton[] map = new JButton[9];
	
	public MyPanel() {
		setLayout(null); // ����Ʈ ���̾ƿ� ������ ������.
		// Ư�� ��ġ�� ��������
		setBounds(MyFrame.W/2-100, MyFrame.H/2-100, 200, 200);
		System.out.println(MyFrame.W/2-100);
		System.out.println(MyFrame.H/2-100);
		setBackground(Color.orange);
		
//		this.bt.setBounds(50,50,50,50);
//		this.bt.setVisible(true);
		
		add(new HeadTitle());
		int x = 300;
		int y = 200;
		for(int i=0; i<this.map.length; i++) {
			map[i] = new JButton();
				this.map[i].setBounds(x,y,65,65);
				this.map[i].setBackground(Color.blue);
				this.map[i].setVisible(true);				
			x += 65;
			if(x == 495) y += 65;
			if(x == 495) x = 300;
			
			this.map[i].addActionListener(this);
			
			add(this.map[i]);
		}
		
		// map�� �� ��ư ����
		// ��� -> panel �� add
//		add(this.bt);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton temp = (JButton) e.getSource(); // �̺�Ʈ�� �߻��� ��ü�� ������ . 
		for(int i=0; i<this.map.length; i++) {
			if(this.map[i] == temp) {
				int r = rn.nextInt(5);
				if(r == 0) {this.map[i].setBackground(Color.green);}
				if(r == 1) {this.map[i].setBackground(Color.black);}
				if(r == 2) {this.map[i].setBackground(Color.blue);}
				if(r == 3) {this.map[i].setBackground(Color.gray);}
				if(r == 4) {this.map[i].setBackground(Color.pink);}
				System.out.println(i); //�ֿܼ� �׼��� �߻��� �ε����� ���
			}
		}
		
		// ��ư Ŭ���� -> ��ư�� ���� ����ǵ��� ó�� . 
	}
}
class MyFrame extends JFrame {
	
	// ������� ��ũ������������ �����͸� ������ . (������ػ󵵿����� �ٸ�)
	private Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
	private int width = dm.width;
	private int hight = dm.height;
	public final static int W = 800;
	public final static int H = 600;
	public MyFrame(String title) {
		// �θ� �����ڸ� Ȱ���� �������� ���� ���� . 
		super(title);
		setLayout(null); // ����Ʈ ���̾ƿ� ������ ������.
		// �������� ũ�� ����
		// setBounds( x , y , width , height);
		//setBounds(100,100,800,600);
		// Dimension�� Ȱ���� ��ũ�� �߾ӿ� ��ǥ��� . 
		setBounds(this.width/2-W/2 , this.hight/2-H/2 , W , H);
		// �������� ���� ����(���)�� ���� . (������ , �������� ��������� ������� ������� ����.)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// �������� ���� ���̰� ����.
		setVisible(true);
		
		//add(new MyPanel());
	//	this.setContentPane(new MyPanel());
	}
}
public class Ex_jframe {

	public static void main(String[] args) {
		MyFrame frame = new MyFrame("Green IT");
		frame.setContentPane(new MyPanel());
		
		
		
	}

}
