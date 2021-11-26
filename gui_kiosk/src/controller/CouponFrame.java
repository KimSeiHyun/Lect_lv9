package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import models.MainFrame;
import models.Members;

class AlertSignUpEndFrame extends JFrame {
	JLabel text = new JLabel("회원가입 완료 ! ");
	public AlertSignUpEndFrame () {
		super("회원가입 완료");
		setLayout(null);
		setBounds(550,300,300,300);
		setText();
		setVisible(true);
		revalidate();
	}
	private void setText() {
		this.text.setBounds(0,50,300,50);
		this.text.setFont(new Font("",1,20));
		this.text.setHorizontalAlignment(JLabel.CENTER);
		add(text);
	}
}
class AlertSignUpFrame extends JFrame implements ActionListener{
	
	JLabel headText = new JLabel("이름과 전화번호를 입력해주세요");
	JLabel nameNumText = new JLabel();
	JTextField nameField = new JTextField();
	JTextField phonNumberField = new JTextField();
	
	JButton enterButton = new JButton("가입하기");
	JButton backButton = new JButton("뒤로가기");
	
	public AlertSignUpFrame() {
		super("SignUp");
		setLayout(null);
		setBounds(550,300,400,400);
		setText();
		setButton();
		setVisible(true);
		revalidate();
	}
	private void setButton() {
		this.enterButton.setBounds(50,200,100,50);
		this.enterButton.addActionListener(this);
		add(this.enterButton);
		
		this.backButton.setBounds(200,200,100,50);
		this.backButton.addActionListener(this);
		add(this.backButton);
		
	}
	private void setText() {
		this.headText.setBounds(50,0,350,50);
		this.headText.setFont(new Font("",1,18));
		add(this.headText);
		
		this.nameNumText.setText("<html>이름   : <br><br>전화번호 : </html>");
		this.nameNumText.setBounds(0,100,100,100);
		this.nameNumText.setFont(new Font("",Font.BOLD, 18));
		add(this.nameNumText);
		
		this.nameField.setBounds(150,115,200,30);
		add(this.nameField);
		this.phonNumberField.setBounds(150,160,200,30);
		add(this.phonNumberField);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.backButton) {
			this.dispose();
		}
		if(e.getSource() == this.enterButton) {
			String name = this.nameField.getText();
			String phoneNumber = this.phonNumberField.getText();
			if(phoneNumber.length()  != 11) {
				this.headText.setText("전화번호는11자리만 입력해주세요 . ");
				return;
			}
			int check = 0;
			for(int i=0; i<CouponPanel.members.size(); i++) {
				Members temp = CouponPanel.members.get(i);
				if(temp.getName().equals(name) && temp.getPhoneNumber().equals(phoneNumber)) {
					check = 1;
				}
			}
			if(check == 0) {
				// 테스트를 위해 스탬프 15개와 포인트 300을 지급
				CouponPanel.members.add(new Members(name , phoneNumber , 15));
				CouponPanel.member = CouponPanel.members.get(CouponPanel.members.size()-1);
				new AlertSignUpEndFrame();
			}else {
				this.headText.setText("이미 존재하는 회원정보입니다.");
			}
		}
	}
}

class CouponPanel extends MyUtil {
	
	JLabel text = new JLabel();
	JLabel memberText = new JLabel();
	JLabel nameNumText = new JLabel();
	JTextField nameField = new JTextField();
	JTextField phonNumberField = new JTextField();
	
	JButton enterButton = new JButton("회원확인");
	JButton signUpButton = new JButton("가입하기");
	JButton useCouponButton = new JButton("쿠폰사용");
	JButton NotUseButton = new JButton("사용안함");
	
	boolean couponUse = false;
	boolean potinUse = false;
	
	public static Vector<Members> members = new Vector<>();
	public static Members member = null;
	
	
	File file = new File("KioskMembers.txt");
	FileWriter fw = null;
	FileReader fr = null;
	BufferedReader br = null;
	public CouponPanel() {
		setLayout(null);
		setBounds(0,0,600,600);
		setBackground(new Color(103, 137, 131));
		
		setText();
		setButton();
	}
	private void setButton() {
		load();
		this.enterButton.setBounds(420,120,100,50);
		this.enterButton.addActionListener(this);
		add(this.enterButton);
			
		this.signUpButton.setBounds(50,250,200,50);
		this.signUpButton.addActionListener(this);
		add(this.signUpButton);
		
		this.useCouponButton.setBounds(300,250,200,50);
		this.useCouponButton.addActionListener(this);
		add(this.useCouponButton);
		
		this.NotUseButton.setBounds(175,320,200,50);
		this.NotUseButton.addActionListener(this);
		add(this.NotUseButton);
		
	}
	private void setText() {
		this.text.setText("<html>쿠폰은 한번에 한개씩 사용하실수 있으며<br>"
				+ "이름과 전화번호를 입력후 엔터 또는 확인버튼을 눌려주세요</html>");
		this.text.setBounds(0,0,600,100);
		this.text.setFont(new Font("",Font.BOLD, 18));
		this.text.setHorizontalAlignment(JLabel.CENTER);
		add(this.text);
		
		this.nameNumText.setText("<html>이름   : <br><br>전화번호 : </html>");
		this.nameNumText.setBounds(0,100,100,100);
		this.nameNumText.setFont(new Font("",Font.BOLD, 18));
		add(this.nameNumText);
		
		this.nameField.setBounds(150,115,200,30);
		add(this.nameField);
		this.phonNumberField.setBounds(150,160,200,30);
		add(this.phonNumberField);
		this.memberText.setText("회원이 아니시면 가입하기를 눌러 회원가입을 하시거나 사용안함을 눌러주세요.");		
		//		

		this.memberText.setBounds(0,200,600,60);
		this.memberText.setFont(new Font("",1,15));
		add(this.memberText);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.signUpButton) {
			new AlertSignUpFrame();
		}
		if(e.getSource() == this.enterButton) {
			this.memberCheck();
		}
		if(e.getSource() == this.NotUseButton) {
			this.member = null;
			Content.state = 4;
			save();
		}
		if(e.getSource() == this.useCouponButton) {
			if(this.member == null) {
				return;
			}else {
				if(this.member.getStamp() >= 10) {
					for(int i=0; i<this.members.size(); i++) {
						if(this.members.get(i).getName().equals(this.member.getName()) && this.members.get(i).getPhoneNumber().equals(this.member.getPhoneNumber())) {
							this.members.get(i).setStamp((this.members.get(i).getStamp()-10));
							Content.total -= 1500;
							Content.state = 4;
							save();
						}
					}
				}
			}
		}
	}
	
	private void save() {
		try {
			fw = new FileWriter(file);
			for(int i=0; i<this.members.size(); i++) {
				Members temp = this.members.get(i);
				fw.write(temp.getName()+"/"+temp.getPhoneNumber()+"/"+temp.getStamp()+"\n");
			}
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private void load() {
		this.members.clear();
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				
				String temp[] = data.split("/");
				String name = temp[0];
				String phoneNumber = temp[1];
				int stamp = Integer.parseInt(temp[2]);
				this.members.add(new Members(name , phoneNumber , stamp));
			}
			
			fr.close();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar() == e.VK_ENTER) {
			this.memberCheck();
		}
	}
	
	private void memberCheck() {
		String name = this.nameField.getText();
		String phoneNumber = this.phonNumberField.getText();
		int check = 0;
		for(int i=0; i<this.members.size(); i++) {
			Members temp = this.members.get(i);
			if(temp.getName().equals(name) && temp.getPhoneNumber().equals(phoneNumber)) {
				this.member = temp;
				check = 1;
				this.memberText.setText(String.format("<html>%s(%s)님의 쿠폰 현황 : %d장</html>",temp.getName(),temp.getPhoneNumber(),temp.getStamp()/10 ));	
			}
		}
		if(check == 0) {
			this.memberText.setText("일치하는 회원정보가 없습니다.");

		}
	}
}


public class CouponFrame extends JFrame implements ActionListener{
	
	CouponPanel c = new CouponPanel();
	public CouponFrame() {
		super("Coupon");
		setLayout(null);
		setBounds(550,300,600,470);
		
		add(c);
		setVisible(true);
		revalidate();
		c.NotUseButton.addActionListener(this);
		c.useCouponButton.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == c.NotUseButton) {
			this.dispose();
		}
		if(e.getSource() == c.useCouponButton) {
			if(c.member == null) {
				c.memberText.setText("회원정보를 먼저 확인해주세요.");
				return;
			}else {
				if(c.member.getStamp() < 10) {
					c.memberText.setText("사용하실 쿠폰이 부족합니다.");
				}
				if(c.member.getStamp() >= 10) {
					this.dispose();
				}
			}
		}
	}
	
}
