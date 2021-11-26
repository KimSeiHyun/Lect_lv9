package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import models.Coffees;
import models.Teas;

class AlertCntZero extends JFrame {
	
	JLabel text = new JLabel("메뉴를 선택해주세요.");
	public AlertCntZero() {
		setLayout(null);
		setBounds(550,300,300,200);
		
		this.text.setBounds(0,0,300,150);
		this.text.setFont(new Font("",Font.BOLD,20));
		this.text.setHorizontalAlignment(JLabel.CENTER);
		this.text.setVerticalAlignment(JLabel.CENTER);
		add(text);
		
		setVisible(true);
		revalidate();
	}
}

public class Content extends MyUtil{
	
	public static int state = 1;
	Vector<Coffees> coffees = new Vector<>();
	Vector<Teas> teas = new Vector<>();
	Image mainImage = new ImageIcon("images/Main.png").getImage().getScaledInstance(800, 900, Image.SCALE_SMOOTH);
	Image inDrinkImage = new ImageIcon("images/inDrink.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
	Image takeOutImage = new ImageIcon("images/takeout.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
	
	JButton inDrinkButton = new JButton(new ImageIcon(this.inDrinkImage));
	JButton takeOutButton = new JButton(new ImageIcon(this.takeOutImage));
	
	//state = 2
	Image state2HeadImage = new ImageIcon("images/MainHead.png").getImage().getScaledInstance(800, 100, Image.SCALE_SMOOTH);
	Vector<Vector<String>> barsket = new Vector<>();
	JButton coffeeMenuButton = new JButton("커피/라떼/밀크티");
	JButton teaMenuButton = new JButton("티/에이드");
	JButton null1Button = new JButton("null");
	JButton null2Button = new JButton("null");
	
	JButton coffeButtons[] = new JButton[16];
	JButton teaButtons[] = new JButton[16];
	
	JButton resetButton = new JButton();
	JButton calculateButton = new JButton();
	
	JTable table = null;
	JScrollPane js = null;
	public static int total = 0;
	
	int totalCnt = 0;
	//state = 3
	
	JTable state3Table = null;
	JScrollPane state3Js = null;
	
	//state = 4
	Image inputCardImage = new ImageIcon("images/inputCard.png").getImage().getScaledInstance(800, 700, Image.SCALE_SMOOTH);
	boolean state4Check = true;
	JLabel state4Text = new JLabel();
	int second = 0;
	int state4Cnt = 0;
	
	//state = 5;
	JLabel state5Text = new JLabel("이용해 주셔서 감사합니다.");
	boolean state5Check = true;
	boolean state5Content = true;
	int state5Cnt = 0;
	
	public Content() {
		setLayout(null);
		setBounds(0,0,800,900);
		addMouseMotionListener(this);
		addMouseListener(this);
		setBackground(new Color(103, 137, 131));
		setTable();
		setArraylist();
		setState1Button();
		setState3Table();
		setState2Button();
		setState4Text();
		setState5Text();
		this.setState2TeaButton();
		this.setState2CoffeeButton();
	}

	private void setState5Text() {
		this.state5Text.setBounds(150,580,600,50);
		this.state5Text.setForeground(Color.white);
		this.state5Text.setFont(new Font("",1,40));
	
	}

	private void setState4Text() {
		this.state4Text.setBounds(0,700,700,100);
		this.state4Text.setFont(new Font("",1,40));
	}

	private void setArraylist() {
		this.coffees.add(new Coffees("아메리카노",1500));
		this.coffees.add(new Coffees("스페셜아메리카노",2500));
		this.coffees.add(new Coffees("헤이즐넛아메리카노",2000));
		this.coffees.add(new Coffees("유자아메리카노",2500));
		this.coffees.add(new Coffees("카푸치노",2500));
		this.coffees.add(new Coffees("카페라떼",2500));
		this.coffees.add(new Coffees("헤이즐럿라떼",3000));
		this.coffees.add(new Coffees("바닐라라떼",3000));
		this.coffees.add(new Coffees("크리미라떼",3000));
		this.coffees.add(new Coffees("헤이즐넛크리미라떼",3500));
		this.coffees.add(new Coffees("카페모카",3500));
		this.coffees.add(new Coffees("카라멜마끼아또",3500));
		this.coffees.add(new Coffees("에소프레소",1500));
		this.coffees.add(new Coffees("더치커피",2500));
		this.coffees.add(new Coffees("더치시나몬라떼",3000));
		this.coffees.add(new Coffees("더치코코넛라떼",3000));
		
		this.teas.add(new Teas("허니레몬티",3500));
		this.teas.add(new Teas("허니유자티",3500));
		this.teas.add(new Teas("허니자몽티",3500));
		this.teas.add(new Teas("얼그레이",2500));
		this.teas.add(new Teas("국화차",2500));
		this.teas.add(new Teas("민트초코티",2500));
		this.teas.add(new Teas("캐모마일",2500));
		this.teas.add(new Teas("페퍼민트",2500));
		this.teas.add(new Teas("청포토에이드",3500));
		this.teas.add(new Teas("보이차",2500));
		this.teas.add(new Teas("루이보스,",2500));
		this.teas.add(new Teas("로즈힙",2500));
		this.teas.add(new Teas("히비스커스",2500));
		this.teas.add(new Teas("복숭아아이스티",3000));
		this.teas.add(new Teas("블루레몬에이드",3500));
		this.teas.add(new Teas("자몽에이드",3500));
		
		Vector<String> temp = new Vector<>();
		temp.add("총금액");
		temp.add("0");
		temp.add("0");
		this.barsket.add(temp);
		
	}

	private void setState2Button() {
		this.coffeeMenuButton.setBounds(0,100,200,50);
		this.coffeeMenuButton.setBackground(new Color(240, 233, 210));
		this.coffeeMenuButton.addActionListener(this);
		this.teaMenuButton.setBounds(200,100,200,50);
		this.teaMenuButton.addActionListener(this);
		this.teaMenuButton.setBackground(new Color(240, 233, 210));
		this.null1Button.setBounds(400,100,200,50);
		this.null1Button.setBackground(new Color(240, 233, 210));
		this.null2Button.setBounds(600,100,200,50);
		this.null2Button.setBackground(new Color(240, 233, 210));
		this.resetButton.setBounds(660,750,100,50);
		this.resetButton.setText("처음으로");
		this.resetButton.setBackground(new Color(240, 233, 210));
		this.resetButton.addActionListener(this);
		this.calculateButton.setBounds(660,805,100,50);
		this.calculateButton.setText("계산하기");
		this.calculateButton.setBackground(new Color(240, 233, 210));
		this.calculateButton.addActionListener(this);
	}
	
	private void addState2Button() {
		add(this.coffeeMenuButton);
		add(this.teaMenuButton);
		add(this.null1Button);
		add(this.null2Button);
		add(this.resetButton);
		add(this.calculateButton);
	}
	
	private void setState2CoffeeButton() {
		int x = 0;
		int y = 150;
		for(int i=0; i<this.coffeButtons.length; i++) {
			if(i != 0 &&  i%4 == 0 ) {
				x = 0;
				y += 150;
			}
			Image temp = new ImageIcon(String.format("images/coffee_sub%d.png", (i+1))).getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);		
			this.coffeButtons[i] = new JButton(new ImageIcon(temp));
			this.coffeButtons[i].setBounds(x,y,200,150);
			this.coffeButtons[i].addActionListener(this);
			x += 200;
		}
	}
	
	
	private void setState2TeaButton() {
		int x = 0;
		int y = 150;
		for(int i=0; i<this.teaButtons.length; i++) {
			if(i != 0 &&  i%4 == 0 ) {
				x = 0;
				y += 150;
			}
			Image temp = new ImageIcon(String.format("images/tea_sub%d.png", (i+1))).getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);		
			this.teaButtons[i] = new JButton(new ImageIcon(temp));
			this.teaButtons[i].setBounds(x,y,200,150);
			this.teaButtons[i].addActionListener(this);
			x += 200;
		}
	}
	
	private void addState2CoffeeButton() {
		for(int i=0; i<this.coffeButtons.length; i++) {
			add(this.coffeButtons[i]);
		}
	}
	private void addState2TeaButton() {
		for(int i=0; i<this.teaButtons.length; i++) {
			add(this.teaButtons[i]);
		}
	}
	
	private void removeState2CoffeeButton() {
		for(int i=0; i<this.coffeButtons.length; i++) {
			remove(this.coffeButtons[i]);
		}
	}
	private void removeState2teaButton() {
		
		for(int i=0; i<this.teaButtons.length; i++) {
			remove(this.teaButtons[i]);
		}
	}
	
	private void RemoveState2MenuButton() {
		remove(this.coffeeMenuButton);
		remove(this.teaMenuButton);
		remove(this.null1Button);
		remove(this.null2Button);
	}

	private void setState1Button() {
		this.inDrinkButton.setBounds(150,550,200,200);
		this.inDrinkButton.addActionListener(this);
		add(this.inDrinkButton);
		
		this.takeOutButton.setBounds(450,550,200,200);
		this.takeOutButton.addActionListener(this);
		add(this.takeOutButton);
	}

	private void addCoffeeBarsket(int i) {
		int check = 1;
		for(int j=0; j<this.barsket.size(); j++) {
				if(this.barsket.get(j).get(0).equals(this.coffees.get(i).getName())) {
					check = -1;
					String temp = this.barsket.get(j).get(2);
					int cntTemp = Integer.parseInt(temp);
					cntTemp ++;
					temp = cntTemp+"";
					this.barsket.get(j).set(2, temp);
				}
		}
		if(check == 1) {
			Vector<String> temp = new Vector<>();
			temp.add(this.coffees.get(i).getName());
			temp.add(this.coffees.get(i).getPrice()+"");
			temp.add(1+"");
			this.barsket.add(0,temp);
		}
	}
	
	private void addTeaBarsket(int i) {
		int check = 1;
		for(int j=0; j<this.barsket.size(); j++) {
				if(this.barsket.get(j).get(0).equals(this.teas.get(i).getName())) {
					check = -1;
					String temp = this.barsket.get(j).get(2);
					int cntTemp = Integer.parseInt(temp);
					cntTemp ++;
					temp = cntTemp+"";
					this.barsket.get(j).set(2, temp);
				}
		}
		if(check == 1) {
			Vector<String> temp = new Vector<>();
			temp.add(this.teas.get(i).getName());
			temp.add(this.teas.get(i).getPrice()+"");
			temp.add(1+"");
			this.barsket.add(0,temp);
		}
	}
	
	
	private void setTable() {
		Vector<String> temp = new Vector<>();
		
		temp.add("이름");
		temp.add("가격");
		temp.add("수량");

		this.table = new JTable(this.barsket , temp);
		
		//this.table.setBounds(0,750,500,100);
		this.table.setCellEditor(null);
		this.table.setDragEnabled(true);
		this.table.setCellSelectionEnabled(true);
		//add(this.table);
		
		js = new JScrollPane(table);
		js.setBounds(0,750,600,100);
		js.setAutoscrolls(true); // 필요시에 스크롤바가 등장.
		
		setVisible(true);
	}
	
	private void setState3Table() {
		Vector<String> temp = new Vector<>();
		
		temp.add("이름");
		temp.add("가격");
		temp.add("수량");
		
		this.state3Table = new JTable(this.barsket , temp);
		this.state3Table.setBounds(50,100,500,600);
		
		this.state3Js = new JScrollPane(this.state3Table);
		this.state3Js.setBounds(50,100,500,600);
		this.state3Js.setAutoscrolls(true);
	}
	

	
	private void setTotal() {
		int temp = 0;
		for(int i=0; i<this.barsket.size()-1; i++) {
			int price = Integer.parseInt(this.barsket.get(i).get(1));
			int cnt = Integer.parseInt(this.barsket.get(i).get(2));
			temp += price * cnt;			
		}
		this.total = temp;
		
		int tempCnt = 0;
		for(int i=0; i<this.barsket.size()-1; i++) {
			int cnt = Integer.parseInt(this.barsket.get(i).get(2));
			tempCnt += cnt;			
		}
		this.totalCnt = tempCnt;
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(this.state == 1) {
			g.drawImage(mainImage,0,0,null );			
		}
		if(this.state == 2 || this.state == 3) {
			g.drawImage(this.state2HeadImage,0,0,null);
			System.out.println("여기는스테이트2");
		}
		if(this.state == 4) {
			g.drawImage(this.inputCardImage,0,0,null);
			if(this.state4Check) {
				remove(this.resetButton);
				remove(this.calculateButton);
				remove(this.state3Js);
				this.state4Check = false;
				this.state4Text.setText(String.format("총 금액 : %d원 ", this.total));
				add(this.state4Text);
			}
			if(this.second == 1) {
				g.setColor(Color.black);
				g.fillRoundRect(330, 380, 20, 20, 20, 20);
			}
			if(this.second == 2) {
				g.setColor(Color.black);
				g.fillRoundRect(330, 380, 20, 20, 20, 20);
				g.fillRoundRect(370, 380, 20, 20, 20, 20);
			}
			if(this.second == 3) {
				g.setColor(Color.black);
				g.fillRoundRect(330, 380, 20, 20, 20, 20);
				g.fillRoundRect(370, 380, 20, 20, 20, 20);
				g.fillRoundRect(410, 380, 20, 20, 20, 20);
			}
		}
		if(!this.state4Check && this.state == 4) {
			try {
				Thread.sleep(1000);
				this.second ++;
				if(this.second == 4) {
					this.second = 0;
					this.state4Cnt ++;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		if(this.state4Cnt == 2) {
			remove(this.state4Text);
			this.state = 5;
			this.state4Cnt = -1;
			this.state4Check = true;
		}
		if(this.state == 5) {
			g.drawImage(mainImage,0,0,null );
			if(this.state5Check) {
				add(this.state5Text);
				this.state5Check = false;
			}
			if(this.state5Content) {
				try {
					Thread.sleep(1000);
					this.state5Cnt ++;
					if(this.state5Cnt == 5) {
						this.state5Content = false;
					}
				} catch (Exception e) {
					// TODO: handle exception
			}
			}
		}
		
		if(this.state5Cnt == 5) {
			System.out.println("b");
			this.state = 1;
			remove(this.state5Text);
			CouponPanel.member = null;
			add(this.inDrinkButton);
			add(this.takeOutButton);
			this.barsket.clear();
			Vector<String> temp = new Vector<>();
			temp.add("총금액");
			temp.add("0");
			temp.add("0");
			this.barsket.add(temp);
			this.state5Cnt = 0;
			this.state5Check = true;
			this.state5Content = true;
		}
		revalidate();
		repaint();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		setTotal();
		if(e.getSource() == this.inDrinkButton) {
			this.state = 2;
			this.addState2CoffeeButton();
			this.addState2Button();
			System.out.println("aaa");
			System.out.println("state : " + this.state);
		}
		if(e.getSource() == this.takeOutButton) {
			this.state = 2;
			this.addState2CoffeeButton();
			this.addState2Button();
			System.out.println("bbb");
			System.out.println("state : " + this.state);
		}
		if(e.getSource() == this.resetButton) {
			this.state = 1;
			this.removeState2CoffeeButton();
			this.RemoveState2MenuButton();
			this.removeState2teaButton();
			remove(this.resetButton);
			remove(this.calculateButton);
			this.barsket.clear();
			Vector<String> temp = new Vector<>();
			temp.add("총금액");
			temp.add("0");
			temp.add("0");
			this.barsket.add(temp);
		}
		if(this.state == 3 && e.getSource() == this.calculateButton) {
			new CouponFrame();
		}
		
		if(this.state == 2  && e.getSource() == this.calculateButton) {
			if(this.barsket.size() > 1) {
				this.state = 3;				
			}else if(this.barsket.size() == 1) {
				new AlertCntZero();
			}
		}
		
		if(e.getSource() == this.teaMenuButton) {
			this.removeState2CoffeeButton();
			this.addState2TeaButton();
		}
		if(e.getSource() == this.coffeeMenuButton) {
			this.removeState2teaButton();
			this.addState2CoffeeButton();
		}

		
		if(this.state == 1) {
			add(this.inDrinkButton);
			add(this.takeOutButton);
		}else {
			remove(this.inDrinkButton);
			remove(this.takeOutButton);
		}
		
		if(this.state == 2) {
			for(int i=0; i<this.coffeButtons.length; i++) {
				if(e.getSource() == this.coffeButtons[i]) {
					this.addCoffeeBarsket(i);
					System.out.println("ccc");
				}
				if(e.getSource() == this.teaButtons[i]) {
					this.addTeaBarsket(i);
					System.out.println("ddd");
				}
			}
			add(this.js);
		}else {
			this.removeState2CoffeeButton();
			this.removeState2teaButton();
			RemoveState2MenuButton();
			remove(this.js);
		}
		
		if(this.state == 3) {
			add(this.state3Js);
		}else {
			remove(this.state3Js);
		}
		
		
		
		setTotal();
		this.barsket.get(this.barsket.size()-1).set(1, this.total+"");
		this.barsket.get(this.barsket.size()-1).set(2, this.totalCnt+"");
		revalidate();
		repaint();
		table.revalidate();
		
		System.out.println("state(last) : " + this.state);
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(e.getX());
		System.out.println(e.getY());
	}

}
