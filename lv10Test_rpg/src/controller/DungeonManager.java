package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import models.Dungeon;
import models.Inventory;
import models.Player;
import models.Raid;
import models.Unit;
import models.UnitBat;
import models.UnitOrc;
import models.UnitWolf;

public class DungeonManager extends Dungeon {
	public static DungeonManager instance = new DungeonManager();
	public static  DungeonManager getDungeonManagerInstance() {
		return DungeonManager.instance;
	}
	
	private GuildManager gm = GuildManager.getGuildManagerInstance();
	private ArrayList<Unit> unit = new ArrayList<>();
	private Raid raid = null;
	private int dungeonLevel = 1;
	private int partyIdx[];
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	public void dungeonManagerRun() {
		
		while(true) {
			this.dungeonManagerMenuPrint();
			int sel = sc.nextInt();
			if(sel == 1) {
				this.dungeonEntry();
			}
			if(sel == 2) {
				this.dungeonReset();
			}
			if(sel == 3) {
				this.dungeonInformation();
			}
			if(sel == 4) {
				this.dungeonManual();
			}
			if(sel == 5) {
				break;
			}
		}
	}
	
	public void UnitInit() {
		if(this.dungeonLevel %5 != 0) {
		for(int i=0; i<4; i++) {
			int r = rn.nextInt(3);
			if(r == 0) {
				this.unit.add(new UnitBat("박쥐",(25+this.dungeonLevel*5),10,(3+this.dungeonLevel*1),(0+this.dungeonLevel)));				
			}
			if(r == 1) {
				this.unit.add(new UnitOrc("오크",(30+this.dungeonLevel*5),10,(3+this.dungeonLevel*2),(0+this.dungeonLevel)));								
			}
			if(r == 2) {
				this.unit.add(new UnitWolf("울프",(40+this.dungeonLevel*5),10,(4+this.dungeonLevel*2),(0+this.dungeonLevel)));												
			}
		}
		}
	}
	public void RaidInit() {
		if(this.dungeonLevel %5 == 0) {
		this.raid = new Raid(this.dungeonLevel , (this.dungeonLevel*50) , (this.dungeonLevel*5) , this.dungeonLevel);
		}
	}
	
	public void partyIdxInit() {
			this.partyIdx = new int[this.gm.partyCount];
			int x = 0;
			for(int i=0; i<this.gm.member.size(); i++) {
				if(this.gm.member.get(i).getParty() == true) {
					this.partyIdx[x] = i;
					x++;
				}
			}
	}
	private void dungeonManagerMenuPrint() {
		System.out.println("1.던전입장\n2.던전초기화\n3.현재레벨의던전정보\n4.게임설명서\n5.뒤로가기");
	}
	
	@Override
	public void dungeonLevelUp() {
		this.dungeonLevel ++;
	}
	
	//레벨업시 체력은 +10 공격력은 +3 방어력은 +1 
	private void dungeonEntry() {
		this.partyIdxInit();
		if(this.gm.partyCount != 0) {
			if(this.dungeonLevel %5 != 0) {//일반몹
				while(true) {
					System.out.println("파티원");
					this.gm.partyListPrint();
					System.out.println("던전몬스터");
					this.UnitListPrint();
					int run = -1;
					int checkClear = -1;
					for(int i=0; i<this.partyIdx.length; i++) {
						int memberIdx = this.partyIdx[i];
						System.out.printf("%s의 행동을 선택해주세요 \n[1.공격]  [2.도망]\n", this.gm.member.get(memberIdx).getName());
						int sel = sc.nextInt();
						if(sel == 1) {
							int unitIdx = rn.nextInt(this.unit.size());
							if(this.gm.member.get(memberIdx).getAtk() > this.unit.get(unitIdx).getDef()) {
								System.out.printf("%s의 공격 !! %s는 %d의 데미지를 입었다.\n",this.gm.member.get(memberIdx).getName() ,
										this.unit.get(unitIdx).getName() , (this.gm.member.get(memberIdx).getAtk()-this.unit.get(unitIdx).getDef()));
								this.unit.get(unitIdx).setHp((this.unit.get(unitIdx).getHp())-(this.gm.member.get(memberIdx).getAtk()-this.unit.get(unitIdx).getDef()));
								System.out.println("파티원");
								this.gm.partyListPrint();
								System.out.println("던전몬스터");
								this.UnitListPrint();
								if(this.unit.get(unitIdx).getHp() <= 0 ) {
									System.out.printf("%s를 처치했다 !! \n",this.unit.get(unitIdx).getName());
									this.unit.remove(unitIdx);
									if(this.unit.size() == 0) {
										checkClear = 1;
										System.out.println("던전 클리어!! ");
										this.dungeonLevelUp();
										this.RaidInit();
										this.UnitInit();
										this.partyLevelUp();
										Player.money += this.dungeonLevel*1000;
										break;
									}
								}
							}else System.out.println("데미지가 0 들어갔다 .. ");
						}
						else if(sel == 2) {
							run = rn.nextInt(4);
							if(run == 0) break;
						}
						else {
							i --;
						}
					}
					if(checkClear == 1) return;
					if(run == 0) {
						System.out.println("도망갑니다....");
						break;
					}
					//몬스터들의 공격 
					for(int i=0; i<this.unit.size(); i++) {
						int r = rn.nextInt(this.partyIdx.length);
						int memberIdx = this.partyIdx[r];
						if( this.unit.get(i).getMp() == 0) {
							this.unit.get(i).attack(this.gm.member.get(memberIdx));
						}else {
							if(this.unit.get(i).getHp() > this.unit.get(i).getMaxHp()/2) {
								this.unit.get(i).attack(this.gm.member.get(memberIdx));
							}else {
								//스킬사용
								if(this.unit.get(i).getName().equals("박쥐")) {
									UnitBat.skillBat((SkillBat) this.unit.get(i), this.unit.get(i), this.gm.member.get(memberIdx));
								}
								if(this.unit.get(i).getName().equals("오크")) {
									
								}
								if(this.unit.get(i).getName().equals("울프")) {
									
								}
								this.unit.get(i).setMp();
							}
						}
					}
					
				}//while(True)
				
			}else {//보스전
				while(true) {
					System.out.println("파티원");
					this.gm.partyListPrint();
					System.out.println("보스");
					this.RaidPrint();
					int run = -1;
					int checkClear = -1;
					for(int i=0; i<this.partyIdx.length; i++) {
						int memberIdx = this.partyIdx[i];
						System.out.printf("%s의 행동을 선택해주세요 \n[1.공격]  [2.도망]\n", this.gm.member.get(memberIdx).getName());
						int sel = sc.nextInt();
						if(sel == 1) {
							if(this.gm.member.get(memberIdx).getAtk() > this.raid.getDef()) {
								int damage = (this.gm.member.get(memberIdx).getAtk() - this.raid.getDef());
								System.out.printf("%s의 공격 !! 보스는 %d의 데미지를 입었다.\n" , this.gm.member.get(memberIdx).getName() , damage);
								this.raid.setHp((this.raid.getHp()-damage));
								if(this.raid.getHp() <= 0) {
									checkClear = 1;
									this.dungeonLevelUp();
									System.out.println("보스를 물리쳤다!!");
									this.RaidInit();
									this.UnitInit();
									this.partyLevelUp();
									Player.money += this.dungeonLevel*1000;
									break;
								}
							}else System.out.println("데미지를 0 입혔다 ... ");
						}
						else if(sel == 2) {
							run = rn.nextInt(4);
							if(run == 0) break;
						}
						else {
							i --;
						}
					}
					if(checkClear == 1) break;
					if(run == 0) {
						System.out.println("도망갑니다....");
						break;
					}
				}
			}
			
		}else System.out.println("파티맴버가 존재하지 않아 던전에 입장 할 수 없습니다.");
	}
	
	private void partyLevelUp() {
		for(int i=0; i<this.partyIdx.length; i++) {
			int memberIdx = this.partyIdx[i];
			int exp = this.gm.member.get(memberIdx).getExp();//원래 경험치
			int tempExp = this.dungeonLevel*4; //받아야할 경험치
			this.gm.member.get(memberIdx).setExp((exp+tempExp));
			if(this.gm.member.get(memberIdx).getExp() >= this.gm.member.get(memberIdx).getLevel()*10 ) {
				this.gm.member.get(memberIdx).levelUp();
				this.gm.member.get(memberIdx).setExp(0);
				System.out.printf("%s LEVEL UP !! \n" , this.gm.member.get(memberIdx).getName());
			}
			
		}
	}
	@Override
	public void dungeonReset() {
		this.dungeonLevel = 1;
		this.unit.clear();
		this.UnitInit();
		System.out.println("던전을 초기화합니다.");
	}
	
	private void dungeonInformation() {
		System.out.println("던전의 레벨 : " + this.dungeonLevel);
		if(this.dungeonLevel %5 != 0) {
			System.out.println("[몬스터정보]");
			this.UnitListPrint();
		}else {
			System.out.println("[보스정보]");
			this.RaidPrint();
		}
	}
	
	private void UnitListPrint() {
		System.out.println("이름\t체력\t마력\t공격력\t방어력");
		for(int i=0; i<this.unit.size(); i++) {
			System.out.println(this.unit.get(i).getName()+"\t"+this.unit.get(i).getHp()+"/"+this.unit.get(i).getMaxHp()+"\t"
		+this.unit.get(i).getMp()+"/"+this.unit.get(i).getMaxMp()+"\t"+this.unit.get(i).getAtk()+"\t"+this.unit.get(i).getDef());
		}
	}
	private void RaidPrint() {
		System.out.println("레벨\t체력\t공격력\t방어력");
		System.out.println(this.raid.getLevel()+"\t"+this.raid.getHp()+"/"+this.raid.getMaxHp()+"\t"+this.raid.getAtk()+"\t"+this.raid.getDef());
	}
	
	private void dungeonManual() {
		System.out.println("1.던전을 클리어하면 경험치와 골드를 얻습니다.");
		System.out.println("2.던전을 클리어하기 어려울시 초기화를 통해 던전의 레벨을 1로 만들 수 있습니다.");
		System.out.println("3.던전은 플레이도중 25%확률로 도망가기를 할 수 있습니다.");
		System.out.println("4.몬스터들은 체력이50%이하로 내려가면 스킬을 한번 사용하며 보스는 일정 공격턴마다 전체공격을 합니다 .");
		System.out.println("5.던전레벨이 5의 배수일때는 보스가 출현합니다 . ");
		System.out.println("6.파티원들은 경험치를 자신의 레벨 x10만큼 회득하면 레벨업 하며 스텟이 조금 상승하고 hp가 모두 회복됩니다.");
		System.out.println("7.던전클리어시 던전의 레벨 *1000만큼 골드를 획득합니다 . ");
		System.out.println("8.레벨업은 최대 한번만 가능합니다.");
	}
}
