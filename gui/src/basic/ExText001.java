package basic;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Ids {
	private String id;
	private String pw;
	private String name;
	
	public Ids(String id , String pw , String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

}

class LogoutFrame extends JFrame {
	
	JLabel text = new JLabel("로그아웃 했습니다.");
	public LogoutFrame() {
		setLayout(null);
		setBounds(500,400,260,150);
		this.text.setBounds(0,50,250,30);
		this.text.setFont(new Font("",1,15));
		this.text.setHorizontalAlignment(JLabel.CENTER);
		add(this.text);
		setVisible(true);
		revalidate();
		
	}
}
class SignFrame extends JFrame implements KeyListener , ActionListener {
	
	
	File file = new File("ExText001");
	FileWriter fw = null;


	
	JTextField nameField = new JTextField();
	JTextField idField = new JTextField();
	JTextField pwField = new JTextField();
	JLabel text = new JLabel();
	JLabel guideText = new JLabel();
	
	JButton signButton = new JButton();
	JButton backButton = new JButton();
	
	public SignFrame() {
		super("Sign");
		setLayout(null);
		setBounds(500,300,500,500);
		setText();
		setField();
		setButton();
		setVisible(true);
		revalidate();
	}
	
	
	private void setText() {
		this.text.setBounds(0,20,150,150);
		this.text.setText("<html>Name :<br><br>Id :<br><br>Pw :</html>");
		this.text.setFont(new Font("",1,20));
		add(this.text);
		
		this.guideText.setBounds(0,200,500,150);
		this.guideText.setText("회원정보를 입력해주세요 . ");
		this.guideText.setFont(new Font("",1,20));
		add(this.guideText);
	}
	
	private void setField() {
		this.nameField.setBounds(100,25,100,30);
		this.nameField.addKeyListener(this);
		add(this.nameField);
		this.idField.setBounds(100,80,100,30);
		this.idField.addKeyListener(this);
		add(this.idField);
		this.pwField.setBounds(100,135,100,30);
		this.pwField.addKeyListener(this);
		add(this.pwField);
	}
	
	private void setButton() {
		this.signButton.setBounds(300,50,100,50);
		this.signButton.setText("회원가입");
		this.signButton.addActionListener(this);
		add(this.signButton);
		
		this.backButton.setBounds(300,120,100,50);
		this.backButton.setText("뒤로가기");
		this.backButton.addActionListener(this);
		add(this.backButton);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.signButton) {
			if(e.getSource() == this.signButton) {
			if(this.idField.getText().equals("") || this.pwField.getText().equals("") || this.nameField.getText().equals("")) {
				this.guideText.setText("회원정보를 제대로 입력해주세요 . ");
				return;
			}
			int check = -1;
			for(int i=0; i<Text.members.size(); i++) {
					if(Text.members.get(i).get(0).equals(this.idField.getText())) {
						check = 1;
					}
			}

			if(check == 1) {
				this.guideText.setText("해당 아이디는 이미 존재합니다.");
			}else {
				this.guideText.setText(String.format("%s님께서 회원가입을 하셨습니다.", this.idField.getText()));
				Vector<String> temp = new Vector<>();
				temp.add(this.idField.getText());
				temp.add(this.pwField.getText());
				temp.add(this.nameField.getText());
				Text.members.add(temp);
				System.out.println("---회원리스트---");
				for(int i=0; i<Text.members.size(); i++) {
						System.out.printf("[%d] Id : %s \t Pw : %s \t name : %s\n" ,(i+1) , Text.members.get(i).get(0),Text.members.get(i).get(1),Text.members.get(i).get(2));						
				}
				System.out.println("-------------");
				this.save();
			}
		}
		}
	}

	private void save() {
		try {
			this.fw = new FileWriter(file);
			for(int i=0; i<Text.members.size(); i++) {
				fw.write(Text.members.get(i).get(0)+"/"+Text.members.get(i).get(1)+"/"+Text.members.get(i).get(2)+"\n");
			}
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

class LoginFrame extends JFrame implements KeyListener , ActionListener{
	
	JLabel text = new JLabel();
	JLabel guideText = new JLabel();
	
	JTextField idField = new JTextField();
	JTextField pwField = new JTextField();
	
	JButton loginButton = new JButton();
	JButton backButton = new JButton();
	
	public LoginFrame() {
		super("Login");
		setLayout(null);
		setBounds(500,300,500,500);
		setText();
		setField();
		setButton();
		setVisible(true);
		revalidate();
		
	}
	
	private void setText() {
		this.text.setBounds(0,20,150,150);
		this.text.setText("<html>Id :<br><br>Pw :</html>");
		this.text.setFont(new Font("",1,20));
		add(this.text);
		
		this.guideText.setBounds(0,200,500,150);
		this.guideText.setText("아이디와 비밀번호를 입력해주세요.");
		this.guideText.setFont(new Font("",1,20));
		add(this.guideText);
	}
	
	private void setField() {

		this.idField.setBounds(100-20,80-20,100,30);
		this.idField.addKeyListener(this);
		add(this.idField);
		this.pwField.setBounds(100-20,135-20,100,30);
		this.pwField.addKeyListener(this);
		add(this.pwField);
	}
	
	private void setButton() {
		this.loginButton.setBounds(300,50,100,50);
		this.loginButton.setText("로그인");
		this.loginButton.addActionListener(this);
		add(this.loginButton);
		
		this.backButton.setBounds(300,120,100,50);
		this.backButton.setText("뒤로가기");
		this.backButton.addActionListener(this);
		add(this.backButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.loginButton) {
			int check = -1;
			for(int i=0; i< Text.members.size(); i++) {
				if(Text.members.get(i).get(0).equals(this.idField.getText()) && Text.members.get(i).get(1).equals(this.pwField.getText())) {
					check = 1;
				}
			}
			if(check == 1) {
				Text.log = this.idField.getText();
				Text.logText.setText(String.format("log : %s", Text.log ));
				this.dispose();
			}else {
				this.guideText.setText("아이디와 비밀번호를 다시 확인해주세요.");
			}
		}else {
			this.dispose();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

class Text extends JFrame implements KeyListener , ActionListener{
	
	File file = new File("ExText001");
	FileReader fr = null;
	BufferedReader br = null;
	
	JButton signButton = new JButton();
	JButton loginButton = new JButton();
	JButton logoutButton = new JButton();
	
	SignFrame signFrame = null;
	LoginFrame loginFrame = null;
	public static String log = "없음";
//	public static Vector<Ids> members = new Vector<>();
	public static Vector<Vector<String>> members = new Vector<>();
	public static JLabel logText = new JLabel();
	private int page = 1;
	public Text() {
		super("JTextField");
		setLayout(null);
		setBounds(400,300,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setFocusable(true);
		setButton();
		setLogText();
		setVisible(true);
		revalidate();
		
	}
	
	private void setLogText() {
		this.logText.setBounds(10,10,300,50);
		this.logText.setText(String.format("log : %s", this.log ));
		this.logText.setFont(new Font("",Font.BOLD,20));
		
		add(this.logText);
	}

	private void setButton() {
		this.signButton.setBounds(50,50,100,50);
		this.signButton.setText("회원가입");
		this.signButton.addActionListener(this);
		add(this.signButton);
		this.loginButton.setBounds(50,120,100,50);
		this.loginButton.setText("로그인");
		this.loginButton.addActionListener(this);
		add(this.loginButton);
		this.logoutButton.setBounds(50,190,100,50);
		this.logoutButton.setText("로그아웃");
		this.logoutButton.addActionListener(this);
		add(this.logoutButton);
	}


	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.signButton) {
			this.signFrame = new SignFrame();
			this.signFrame.backButton.addActionListener(this);
		}
		if(this.signFrame != null && e.getSource() == this.signFrame.backButton) {
			this.signFrame.dispose();
		}
		if(e.getSource() == this.loginButton) {
			this.loginFrame = new LoginFrame();
		}
		if(e.getSource() == this.logoutButton) {
			this.log = "없음";
			this.logText.setText(String.format("log : %s", this.log ));
			LogoutFrame a = new LogoutFrame();
		}

		
	}
	
	public void load() {
		try {
			this.fr = new FileReader(file);
			this.br = new BufferedReader(fr);
			while(true) {
				String temp = br.readLine();
				if(temp == null) return;
				
				String member[] = temp.split("/");
				Vector<String> tempMember = new Vector<>();
				String id = member[0];
				String pw = member[1];
				String name = member[2];
				
				tempMember.add(id);
				tempMember.add(pw);
				tempMember.add(name);
				
				this.members.add(tempMember);
				
			}
			
		} catch (Exception e) {
			
		}
	}
	
}

public class ExText001 {

	public static void main(String[] args) {
		Text a = new Text();
		a.load();
	}

}
