package gui_Mcdonald;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class AlertFrame extends JFrame {
	
	private JLabel text = new JLabel();
	public AlertFrame() {
		setLayout(null);
		setBounds(200,200,300,200);
		setVisible(true);
		setText();
	}
	private void setText() {
		this.text.setBounds(50,50,200,50);
		this.text.setText("결제가 완료되었습니다.");
		add(this.text);
	}
}

class OrderState extends MyUtil {
	
	private ArrayList<Barsket> temp;
	private static JLabel mainText = new JLabel();
	
	public OrderState() {
		setLayout(null);
		setBounds(0,800,800,150);
		setBackground(Color.pink);
		revalidate();
		
		temp = Content.getArraylist();
		setMainText();
	}
	
	private void setMainText() {
		this.mainText.setBounds(0,0,800,100);
		this.mainText.setText("주문하기를 눌러주세요");
		this.mainText.setFont(new Font("",1,30));
		this.mainText.setHorizontalAlignment(JLabel.CENTER);
		add(this.mainText);
	}
	
	public static JLabel getMainText() {
		return mainText;
	}
	
	

	
}
public class Content extends MyUtil {
	
	public static ArrayList<Barsket> barsket = new ArrayList<>();
	
	private  String name[] = {"불고기버거","빅맥","치즈버거","더블 치즈버거"};
	private int price[] = { 2900, 5300, 3000 ,5100};
	public static int page = 1; // 1.처음화면 2.메뉴선택 3.결제화면
	
	private Image main = new ImageIcon("images/메인화면.png").getImage().getScaledInstance(800,800,Image.SCALE_SMOOTH);
	
	private Image doOrder = new ImageIcon("images/주문하기.png").getImage().getScaledInstance(200,50,Image.SCALE_SMOOTH);
	private Image orderScreen = new ImageIcon("images/주문화면.png").getImage().getScaledInstance(800,800,Image.SCALE_SMOOTH);
	
	private Image bulgogiBurger  = new ImageIcon("images/불고기버거.png").getImage().getScaledInstance(225,300,Image.SCALE_SMOOTH);
	private Image bigMac = new ImageIcon("images/빅맥.png").getImage().getScaledInstance(225,300,Image.SCALE_SMOOTH);
	private Image cheeseBurger = new ImageIcon("images/치즈버거.png").getImage().getScaledInstance(225,300,Image.SCALE_SMOOTH);
	private Image doubleCheeseBurger = new ImageIcon("images/더블 치즈버거.png").getImage().getScaledInstance(225,300,Image.SCALE_SMOOTH);
	private Image order = new ImageIcon("images/오더버튼.png").getImage().getScaledInstance(100,50,Image.SCALE_SMOOTH);
	
	private JButton mainButton = new JButton(new ImageIcon(doOrder));
	private JButton orderButton[];
	
	private JButton resetButton = new JButton();
	private JButton calculateButton = new JButton();
	
	private JButton numberButton[] = new JButton[10];
	private JLabel totalText = new JLabel();
	private int total = 0;
	private int inputTotal = 0;
	private String tempTotal = "";
	public Content() {
		for(int i=0; i<this.name.length; i++) {
			this.barsket.add(new Barsket(this.name[i] , this.price[i]));
		}
		setLayout(null);
		setBounds(0,0,800,800);
		revalidate();
		addMouseListener(this);
		

		setMainButton();
		setOrderButton();
		setResetButton();
		setCalculateButton();
		setTotalText();
		setNumberButton();
	}
	

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(this.page == 1) {
			g.drawImage(this.main,0,0,null);
		}else if(this.page == 2) {
			g.drawImage(this.orderScreen,0,0,null);
			g.drawImage(this.bulgogiBurger,133,120,null);
			g.drawImage(this.bigMac,358,120,null);
			g.drawImage(this.cheeseBurger,133,420,null);
			g.drawImage(this.doubleCheeseBurger,358,420,null);
		}
		

		repaint();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.mainButton) this.page = 2;
		if(e.getSource() == this.orderButton[0]) this.barsket.get(0).setCnt((this.barsket.get(0).getCnt()+1));
		if(e.getSource() == this.orderButton[1]) this.barsket.get(1).setCnt((this.barsket.get(1).getCnt()+1));
		if(e.getSource() == this.orderButton[2]) this.barsket.get(2).setCnt((this.barsket.get(2).getCnt()+1));
		if(e.getSource() == this.orderButton[3]) this.barsket.get(3).setCnt((this.barsket.get(3).getCnt()+1));
		if(e.getSource() == this.resetButton) {
			this.page = 1;
			for(int i=0; i<this.barsket.size(); i++) {
				this.barsket.get(i).setCnt(0);
			}
			this.tempTotal = "";
			this.inputTotal = 0;
		}
		if(this.page == 3 && e.getSource() == this.calculateButton) {

			if(this.total == this.inputTotal) {
				this.page = 1;
				for(int i=0; i<this.barsket.size(); i++) {
					this.barsket.get(i).setCnt(0);
				}
				this.tempTotal = "";
				this.inputTotal = 0;
				this.total = 0;
				this.totalText.setText("");
				McdonaldFrame.finish();
			}else {
				JLabel temp = OrderState.getMainText(); 
				temp.setText("결제할 금액과 동일한 금액을 입력해주세요.");
			}

		}
		if(this.page == 2 && e.getSource() == this.calculateButton) {
			this.page = 3;
		}
		
		if(this.page == 1) {
			add(this.mainButton);
			remove(this.resetButton);
			remove(this.calculateButton);
			JLabel temp = OrderState.getMainText(); 
			temp.setText("주문하기를 눌러주세요");
		}
		else {
			remove(this.mainButton);
			add(this.resetButton);
			add(this.calculateButton);
		}
		if(this.page == 2) {
			for(int i=0; i< this.orderButton.length; i++) {
						add(this.orderButton[i]);
			}
			JLabel temp = OrderState.getMainText(); 
			temp.setText(String.format("<html><pre>%s = %d개    %s = %d개<br>%s = %d개    %s = %d</pre></html>", 
					this.barsket.get(0).getName(),this.barsket.get(0).getCnt() , 
					this.barsket.get(1).getName(),this.barsket.get(1).getCnt(),
					this.barsket.get(2).getName(),this.barsket.get(2).getCnt(),
					this.barsket.get(3).getName(),this.barsket.get(3).getCnt()));
		}else {
			for(int i=0; i< this.orderButton.length; i++) {
				remove(this.orderButton[i]);
			}
			
		}
		if(this.page == 3) {
			add(this.totalText);
			total = 0;
			for(int i=0; i<this.barsket.size(); i++) {
				total += this.barsket.get(i).getPrice()*this.barsket.get(i).getCnt();
			}
			for(int i=0; i< this.numberButton.length; i++) {
				if(e.getSource() == this.numberButton[i]) {
					tempTotal += i+"";
				}
			}
			
			if(tempTotal.length() >= 1) {
				this.inputTotal = Integer.parseInt(tempTotal);				
			}
			this.totalText.setText(String.format("<html><pre>%s = %d개  %d원 <br>%s = %d개  %d원 <br>%s = %d개  %d원 <br>%s = %d개  %d원 <br>총 결제금액 : %d원<br>입력한 급액 : %d원</pre></html>", 
					this.barsket.get(0).getName(),this.barsket.get(0).getCnt(),this.barsket.get(0).getPrice()*this.barsket.get(0).getCnt(), 
					this.barsket.get(1).getName(),this.barsket.get(1).getCnt(),this.barsket.get(1).getPrice()*this.barsket.get(1).getCnt(),
					this.barsket.get(2).getName(),this.barsket.get(2).getCnt(),this.barsket.get(2).getPrice()*this.barsket.get(2).getCnt(),
					this.barsket.get(3).getName(),this.barsket.get(3).getCnt(),this.barsket.get(3).getPrice()*this.barsket.get(3).getCnt(),total,this.inputTotal));
			JLabel temp = OrderState.getMainText();
			
			
			for(int i=0; i<this.numberButton.length; i++) {
				add(this.numberButton[i]);
			}

		}else {
			remove(this.totalText);
			for(int i=0; i<this.numberButton.length; i++) {
				remove(this.numberButton[i]);
			}
		}
		
		if(this.page == 4) {
			
		}else {
			
		}
		
		System.out.println("page : " + this.page);
	}
	
	private void setMainButton() {
		this.mainButton.setBounds(300,600,200,50);
		this.mainButton.addActionListener(this);
		add(this.mainButton);
	}
	
	private void setOrderButton() {
		this.orderButton = new JButton[4];
		int x = 244;
		int y = 357;
		// x = 244 , 472
		// y = 356 , 655
		for(int i=0; i < this.orderButton.length; i++) {
			this.orderButton[i] = new JButton(new ImageIcon(this.order));
			this.orderButton[i].setBounds(x,y,100,50);
			this.orderButton[i].addActionListener(this);
			if(i != 1) x += (472-244);
			if(i == 1) {
				x = 244;
				y += (655-357);
			}
		}
	}
	
	private void setResetButton() {
		this.resetButton.setBounds(550,70,100,50);
		this.resetButton.setText("처음으로");
		this.resetButton.addActionListener(this);
	}
	
	private void setCalculateButton() {
		this.calculateButton.setBounds(670,70,100,50);
		this.calculateButton.setText("결제하기");
		this.calculateButton.addActionListener(this);
	}
	
	private void setTotalText() {
		this.totalText.setBounds(0,0,500,300);
		this.totalText.setFont(new Font("",1,30));
		
		
	}
	
	private void setNumberButton() {
		int x = 360;
		int y = 560;
		for(int i=0; i<this.numberButton.length; i++) {

			this.numberButton[i] = new JButton();
			this.numberButton[i].setBounds(x,y,50,50);
			this.numberButton[i].setText(i+"");
			this.numberButton[i].setFont(new Font("",1,15));
			this.numberButton[i].addActionListener(this);
			if(i == 0) x -= 50;
			if(i == 0) y -= 50;
			if(i != 0) x += 50;
			if(i == 3 || i == 6) {
				x = 310; y-=50;
			}
		}
	}
	public static ArrayList getArraylist() {
		return barsket;
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println(e.getX());
		System.out.println(e.getY());
		//580 - 133 = 447
			
	}
	
	
}
