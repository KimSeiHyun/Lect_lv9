package lv8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

//static (������ ���� �ѹ� �߾��� ���� ���� �����ϸ鼭 )

// �÷��̾�
// �� �ټ��� ���͸� ä���� �� �ְ�
// �� ������ ���۵Ǹ� �������� �� ������ hp�� ���� (hp�� 20 �����ϸ� -> �÷��̾��� ���� 1 ���)
// �� hp default : 50
// �� hp�� 0�� �Ǹ� ��� . 
// �� ������ ���Ͱ� ��� ����ϸ� -> ���� ���� . 

class Player {
	ArrayList<Monster> party = new ArrayList<>();
	static int level;
	static int exp;
	
	public Player() {
		this.level = 1;
		party.add(new Monster());
	}
	
	public void printInfo() {
		System.out.println("level : " + this.level);
		for(int i=0; i<party.size(); i++) {
			party.get(i).printInfo();
		}
		
	}
}
class Monster {
	
	String name;
	static int level;
	int hp;
	boolean death;
	
	public Monster() {
		this.name = ranName();
		this.level = Player.level;
		this.hp = 50;
		System.out.printf("���� %s�� ź�� ...\n",this.name);
	}

	private String ranName() {
		String front[] = {"���","��Ÿ","�����̵�","����","����"};
		String back[] = {"��","��","��","��","ȣ"};
		int r1 = Game.rn.nextInt(front.length);
		int r2 = Game.rn.nextInt(back.length);
		
		return front[r1] + back[r2];
	}
	public void printInfo() {
		System.out.printf("%s  : level %d,  hp %d,  death  %b\n",this.name,this.level,this.hp,this.death);
	}
}

class Game {
	static Random rn = new Random();
	Vector<Monster> monster = new Vector<>();
	Vector<Player> player = new Vector<>();
	
	Player p1 = new Player();
	
	void run () {
		while(isRun()) {
			createMon();
			printState();
			fight();
			try {
				Thread.sleep(800); // sleep() �޼���� ���࿡ �����̸� �� �� �ִ� .
				//������ () �Ұ�ȣ�� �и�����(1/1000)�ʸ� �־��� 
			} catch (Exception e) {
				
			}
		}
		
	}



	private void fight() {
		int total =  0;
		for(int i=0; i<this.p1.party.size(); i++) {
			int damage = rn.nextInt(5)+3;
			this.p1.party.get(i).hp -= damage;
			Player.exp += damage;
			
			Player.level = Player.exp / 20 +1; 
			this.p1.party.get(i).level = Player.level;
			
			if(this.p1.party.get(i).hp < 0) {
//				this.p1.party.get(i).death = true;
//				this.p1.party.get(i).hp = 0;
				this.p1.party.remove(i); // ����� ĳ���� ������ 
			}
		}
		System.out.println();
		
	}



	private void createMon() {
		int r = rn.nextInt(5);
		if(r == 0) {
			this.p1.party.add(new Monster());
		}
		
	}

	private void printState() {
		this.p1.printInfo();
		
	}

	private boolean isRun() {
		if(this.p1.party.isEmpty() ) {
			//isEmpty �޼���� �Ҹ����� ��ȯ�ϴ� �޼��� . 
			return false;
		}
		return true;
	}
}

public class Ex003 {

	public static void main(String[] args) {
		Game game = new Game();
		game.run();

	}

}