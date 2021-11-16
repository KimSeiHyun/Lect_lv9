package controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import models.Coffees;
import models.MainFrame;
import models.Teas;


public class Content extends MyUtil{
	
	private int state = 1;
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
	public Content() {
		setLayout(null);
		setBounds(0,0,800,900);
		
		setBackground(new Color(103, 137, 131));
		setTable();
		setArraylist();
		setState1Button();
		this.setState2TeaButton();
		this.setState2CoffeeButton();
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
		
	}

	private void setState2Button() {
		this.coffeeMenuButton.setBounds(0,100,200,50);
		this.coffeeMenuButton.setBackground(new Color(240, 233, 210));
		this.coffeeMenuButton.addActionListener(this);
		add(this.coffeeMenuButton);
		this.teaMenuButton.setBounds(200,100,200,50);
		this.teaMenuButton.addActionListener(this);
		this.teaMenuButton.setBackground(new Color(240, 233, 210));
		add(this.teaMenuButton);
		this.null1Button.setBounds(400,100,200,50);
		this.null1Button.setBackground(new Color(240, 233, 210));
		this.null2Button.setBounds(600,100,200,50);
		this.null2Button.setBackground(new Color(240, 233, 210));
		add(this.null1Button);
		add(this.null2Button);
		this.resetButton.setBounds(660,750,100,50);
		this.resetButton.setText("처음으로");
		this.resetButton.setBackground(new Color(240, 233, 210));
		this.resetButton.addActionListener(this);
		add(this.resetButton);
		this.calculateButton.setBounds(660,805,100,50);
		this.calculateButton.setText("계산하기");
		this.calculateButton.setBackground(new Color(240, 233, 210));
		this.calculateButton.addActionListener(this);
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
			//this.coffeButtons[i] = null;
		}
		//this.coffeButtons = new JButton[16];
	}
	private void removeState2teaButton() {
		
		for(int i=0; i<this.teaButtons.length; i++) {
			remove(this.teaButtons[i]);
			//	this.teaButtons[i] = null;
		}
		
		//this.teaButtons = new JButton[16];
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
			this.barsket.add(temp);
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
			this.barsket.add(temp);
		}
	}
	
	
	private void setTable() {
		Vector<String> temp = new Vector<>();
		
		temp.add("이름");
		temp.add("가격");
		temp.add("수량");

		this.table = new JTable(this.barsket , temp);
		
		this.table.setBounds(0,750,500,100);
		this.table.setCellEditor(null);
		this.table.setDragEnabled(true);
		this.table.setCellSelectionEnabled(true);
		//add(this.table);
		
		JScrollPane js = new JScrollPane(table);
	//	js.setBounds(0,750,500,100);
		js.setAutoscrolls(true); // 필요시에 스크롤바가 등장.
		add(js);
		setVisible(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(this.state == 1) {
			g.drawImage(mainImage,0,0,null );			
		}
		if(this.state == 2) {
			g.drawImage(this.state2HeadImage,0,0,null);
		}
		
		repaint();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.inDrinkButton) {
			this.state = 2;
			this.addState2CoffeeButton();
			setState2Button();
		}
		if(e.getSource() == this.takeOutButton) {
			this.state = 2;
			this.addState2CoffeeButton();
			setState2Button();
		}
		if(e.getSource() == this.resetButton) {
			this.state = 1;
			this.removeState2CoffeeButton();
			this.RemoveState2MenuButton();
			this.removeState2teaButton();
			remove(this.resetButton);
			remove(this.calculateButton);
			this.barsket.clear();
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
				}
				if(e.getSource() == this.teaButtons[i]) {
					this.addTeaBarsket(i);
				}
			}
		}else {
			RemoveState2MenuButton();
		}
		
		for(int i=0; i<this.barsket.size(); i++) {
				System.out.printf("%s , %s , %s \n" , this.barsket.get(i).get(0) , this.barsket.get(i).get(1) , this.barsket.get(i).get(2));
		}
		revalidate();
		repaint();
	}
}
