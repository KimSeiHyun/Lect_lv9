package lv8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

//static (예전에 설명 한번 했었음 몬스터 레벨 설명하면서 )

// 플레이어
// ㄴ 다수의 몬스터를 채용할 수 있고
// ㄴ 전투가 시작되면 랜덤으로 각 몬스터의 hp가 감소 (hp가 20 감소하면 -> 플레이어의 레벨 1 상승)
// ㄴ hp default : 50
// ㄴ hp가 0이 되면 사망 . 
// ㄴ 보유한 몬스터가 모두 사망하면 -> 게임 종료 . 

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
		System.out.printf("몬스터 %s의 탄생 ...\n",this.name);
	}

	private String ranName() {
		String front[] = {"헤라","메타","포세이돈","릴랄","베라"};
		String back[] = {"몬","릴","히","하","호"};
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
				Thread.sleep(800); // sleep() 메서드는 실행에 딜레이를 줄 수 있다 .
				//슬립의 () 소괄호에 밀리세컨(1/1000)초를 넣어줌 
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
				this.p1.party.remove(i); // 사망한 캐릭터 보내기 
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
			//isEmpty 메서드는 불리언을 반환하는 메서드 . 
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
