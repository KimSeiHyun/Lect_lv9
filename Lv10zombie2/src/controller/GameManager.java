package controller;

import java.util.ArrayList;
import java.util.Scanner;

import models.Hero;
import models.Shop;
import models.Unit;
import models.Zombie;
import models.ZombieKing;



public class GameManager extends Shop{
	private static GameManager instance = new GameManager();
	ArrayList<Unit> unit = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	private Hero hero = null;
	
	public void run() {
		setting();
//		for(int i=0; i<unit.size(); i++) {
//			System.out.println(this.unit.get(i).getName());
//		}
		while(true) {
			this.mainMenuPrint();
			int sel = sc.nextInt();
			if(sel == 1) {
				
			}
			if(sel == 2) {
				this.dungeonInformation();
			}
			if(sel == 3) {
				this.Shop();
			}
			if(sel == 4) {
				this.menualPrint();
			}
			if(sel == 5) {
				this.unit.clear();
				this.setting();
				this.hero.reset();
			}
 			
		}
	}
	
	public void ex () {
		
	}
	public static GameManager getInstance() {
		return instance;
	}
	
	private void setting() {
		hero = new Hero("김세현" , 150 , 5 , 3 , 1);
		unit.add(new Zombie("이병좀비",30 , 8 , 2, 1));
		unit.add(new Zombie("일병좀비",50 , 11 , 3, 2));
		unit.add(new Zombie("상병좀비",70 , 14 , 4, 3));
		unit.add(new Zombie("병장좀비",90 , 17 , 5, 4));
		unit.add(new Zombie("하사좀비",110 ,20 , 6, 5));
		unit.add(new Zombie("중사좀비",130, 23 , 7, 6));
		unit.add(new Zombie("상사좀비",150 ,26 , 8, 7));
		unit.add(new Zombie("소위좀비",170 ,29 , 9, 8));
		unit.add(new Zombie("중위좀비",190 ,32 , 10, 9));
		unit.add(new ZombieKing("대장좀비",400 , 45 , 15, 10));
	}
	
	private void mainMenuPrint() {
		System.out.println("======Zombie Tower======");
		System.out.println("[1].던전입장");
		System.out.println("[2].던전정보");
		System.out.println("[3].상점");
		System.out.println("[4].설명서");
		System.out.println("[5].처음부터");
		System.out.println("=========================");
	}
	
	private void menualPrint() {
		System.out.println("---------------메뉴얼-----------------");
		System.out.println("1.던전입장을 하면 플레이어는 공격 , 방어 , 물약사용 세가지 중에 선택을 할 수 있습니다.");
		System.out.println("2.물약은 처음에 5개 소지하고 있으며 5층마다 1개씩 추가로 지급됩니다.");
		System.out.println("3.물약을 사용하면 현재층 x 20만큼 회복됩니다.");
		System.out.println("4.던전을 클리어하면 골드를 얻으며 플레이어의 입맛대로 스텟을 구매할 수 있습니다.");
		System.out.println("5.던전정보 메뉴를 통해 현재 층의 몬스터의 정보를 획득 할 수 있습니다.");
		System.out.println("6.처음부터를 하면 모든 데이터가 초기화됩니다.");
		System.out.println("7.마지막층(10층)의 좀비는 특별한 능력을 사용합니다 . ");
		System.out.println("-----------------------------------");
	}
	
	private void dungeonInformation() {
		System.out.printf("[%s]\n체력 : %d\n공격력 : %d\n방어력 : %d\n현재층수 : %d\n남은포션 : %d\n보유골드 : %d\n",this.hero.getName() , this.hero.getHp(), this.hero.getAtk() , this.hero.getDef() , this.hero.getFloor() , this.hero.getPortion(), this.hero.getMoney());
		this.hero.getFloor();
	}
	
	private void Shop() {
		this.shopMenu();
		int sel = sc.nextInt();
		if(this.hero.getMoney() >= super.getPrice()) {
			if(sel == 1) {
				this.hero.setAddHp(super.getHp());
				this.hero.setMinusMoney();
				System.out.println("스텟 Hp를 구매했습니다. ");
			}
			if(sel == 2) {
				this.hero.setAddAtk(super.getAtk());
				this.hero.setMinusMoney();
				System.out.println("스텟 Atk를 구매했습니다.");
			}
			if(sel == 3) {
				this.hero.setAddDef(super.getDef());
				this.hero.setMinusMoney();
				System.out.println("스텟 Def를 구매했습니다.");
			}
		}else System.out.println("보유머니가 부족합니다.");
	}

	@Override
	public void shopMenu() {
		System.out.println("[스텟]   [스텟증가치]  [가격]");
		System.out.printf("1.HP\t%d\t   %d\n",this.getHp(),this.getPrice());
		System.out.printf("2.ATK\t%d\t   %d\n",this.getAtk(),this.getPrice());
		System.out.printf("3.DEF\t%d\t   %d\n",this.getDef(),this.getPrice());
		System.out.println("보유머니 : " +this.hero.getMoney());
	}



	

	
}
