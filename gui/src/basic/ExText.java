package basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JoinFrame extends JFrame {
	
	JLabel idLabel = new JLabel("id");
	JTextField idField = new JTextField();
	
	public JoinFrame() {
		setLayout(null);
		setBounds(200,200,200,200);
		
		idLabel.setBounds(10,20,30,20);
		idLabel.setText("id : ");
		add(idLabel);
		
		this.idField.setBounds(50,20,100,20);
		this.idField.setText("id");
		add(this.idField);
		
		setVisible(true);
		revalidate();
	}
}

public class ExText extends JFrame implements ActionListener , KeyListener , MouseListener{
	
	JLabel dataField = new JLabel(String.format("<html>%s<br>%d</html>","",123 )); 
	
	JTextField text = new JTextField();
	JTextArea text2 = new JTextArea();
	
	JButton login = new JButton("login");
	JButton join = new JButton("join");
	
	
	JoinFrame joinFrame = null;
	
	public ExText() {
		setLayout(null);
		setBounds(100,100,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 텍스트 박스의 처리
		// JTextField  ( 줄바꿈이 안됨 . )
//		this.text.setBounds(20,40,300,50);
//		text.addKeyListener(this);
//		add(this.text);
//		
//		// JTextArea ( 줄바꿈이 가능 . )
//		this.text2.setBounds(20,100,300,50);
//		text2.addKeyListener(this);
//		add(this.text2);
		setButton();
		
		
		setFocusable(true);
		addKeyListener(this);
		
		setVisible(true);
		revalidate();
		
	}
	
	private void setButton() {
		this.join.setBounds(100,100,100,100);
		this.join.addActionListener(this);
		add(this.join);
	}

	public static void main(String[] args) {
		
		new ExText();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("press");

		if(e.getSource() == this.joinFrame.idField && e.getKeyCode() == e.VK_ENTER) {
			System.out.println(this.joinFrame.idField.getText());
			this.joinFrame.dispose();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.join) {
//			new JoinFrame();
			this.joinFrame = new JoinFrame();
			this.joinFrame.idField.addKeyListener(this);
			this.joinFrame.idField.addMouseListener(this);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == this.joinFrame.idField) {
			this.joinFrame.idField.setText("");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
