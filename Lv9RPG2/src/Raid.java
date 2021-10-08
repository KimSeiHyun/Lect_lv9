import java.util.Random;
import java.util.Scanner;

public class Raid {
	Scanner sc = new Scanner(System.in);
	Random rn  = new Random();
	public static Raid instance = new Raid();
	private Guild guild = Guild.instance;
	private Inventory inventory = Inventory.instance;
	public static int level = 1;
	public static int atk = 10;
	public static int def = 3;
	public static int hp = 100;
	public static int maxHp = 100;
	

	public int getLevel() {
		return this.level;
	}
	public int getAtk() {
		return this.atk;
	}
	public int getDef() {
		return this.def;
	}
	public int getHp() {
		return this.hp;
	}
	public int getMaxHp() {
		return this.maxHp;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	
	public void raidManager() {
		while(true) {
			raidMenuPrint();
			int sel = sc.nextInt();
			if(sel == 1) {
				this.raidRun();
			}
			if(sel == 2) {
				this.raidBossInformation();
			}
			if(sel == 3) {
				this.raidBossReset();
			}
			if(sel == 4) {
				this.raidManual();
			}
			if(sel == 5) {
				break;
			}
		}
	}
	
	public void raidMenuPrint() {
		System.out.println("1.레이드입장\n2.레이드보스정보\n3.레이드초기화\n4.레이드설명\n5.뒤로가기");
	}
	
	public void raidRun() {
		if(this.guild.partyMember != 0) {
			while(true) {
				this.raidBossInformation();
				this.raidPartyMemberInformationPrint();
				int action[] = new int[this.guild.partyMember];
				int partyMemberIdx[] = new int[this.guild.partyMember];
				int idx = 0 ;
				for(int i=0; i<this.guild.member.size(); i++) {
					if(this.guild.member.get(i).getParty() == true) {
						System.out.printf("%s의 행동선택 : [1].공격   [2].방어" ,this.guild.member.get(i).getName());
						int sel = sc.nextInt();
						if(sel == 1 || sel == 2) {
							partyMemberIdx[idx] = i;
							action[idx] = sel;
							idx ++;
						}else {
							System.out.println("1이나 2만 입력가능 . ");
							i--;
							continue;
						}
					}
				}
				System.out.print("action : ");
				for(int i=0; i<action.length; i++) {
					System.out.print(action[i] + " ");
				}System.out.println();
				System.out.print("partyMemberIdx : ");
				for(int i=0; i<action.length; i++) {
					System.out.print(partyMemberIdx[i] + " ");
				}System.out.println();
				int check = 0;
				int check2 = 0;
				while(true) {
					//파티원들의 행동.
					for(int i=0; i<action.length; i++) {
						if(action[i] == 1) {
							if(this.guild.member.get(partyMemberIdx[i]).getAtk() > this.def) {
								System.out.printf("%s의 공격 !! \n",this.guild.member.get(partyMemberIdx[i]).getName());
								System.out.printf("보스에게 %d의 데미지를 입혔다.\n", this.guild.member.get(partyMemberIdx[i]).getAtk() - this.def );
								this.hp -= guild.member.get(partyMemberIdx[i]).getAtk()-this.def;
							}else System.out.printf("%s의 공격은 흠집조차 나지 않았다.\n",this.guild.member.get(partyMemberIdx[i]).getName() );
						}
						if(action[i] == 2) {
							System.out.printf("%s의 방어 !! %s는 이번턴동안 방어가 2배된다 . \n",this.guild.member.get(partyMemberIdx[i]).getName(),this.guild.member.get(partyMemberIdx[i]).getName());
							this.guild.member.get(partyMemberIdx[i]).setDefActtion();
							System.out.println("방어력 : " + this.guild.member.get(partyMemberIdx[i]).getDef());
						}
					}
					if(this.hp <= 0) {
						System.out.printf("%d단계 레이드 성공 !! \n",this.level);
						this.raidBossLevelUp();
						int percent = rn.nextInt(4);
						if(percent == 0) {
							System.out.println("보스의 무기 획득 !!!!!!!!!!");
							this.addRaidItem();
						}
						for(int i=0; i<partyMemberIdx.length; i++) {
							this.guild.member.get(partyMemberIdx[i]).setExp((this.guild.member.get(partyMemberIdx[i]).getExp()+this.level-1));
							if(this.guild.member.get(partyMemberIdx[i]).getLevel() == this.guild.member.get(partyMemberIdx[i]).getExp()) {
								this.guild.member.get(partyMemberIdx[i]).levelUp();
								System.out.printf("%s의 레벨업!! \n",this.guild.member.get(partyMemberIdx[i]).getName());
							}
							if(this.guild.member.get(partyMemberIdx[i]).getLevel() < this.guild.member.get(partyMemberIdx[i]).getExp()) {
								while(this.guild.member.get(partyMemberIdx[i]).getLevel() < this.guild.member.get(partyMemberIdx[i]).getExp()) {
									int tempExp = this.guild.member.get(partyMemberIdx[i]).getExp();
									this.guild.member.get(partyMemberIdx[i]).levelUp();
									this.guild.member.get(partyMemberIdx[i]).setExp((tempExp-(this.guild.member.get(partyMemberIdx[i]).getLevel()-1)));
									System.out.printf("%s의 레벨업!! \n",this.guild.member.get(partyMemberIdx[i]).getName());
								}//while
							}
						}
						check = 1;
						break;
					}
					//보스의 공격
					int r = rn.nextInt(this.guild.partyMember);
					int rIdx = partyMemberIdx[r];
					System.out.printf("보스가 %s에게 공격 !! \n",this.guild.member.get(rIdx).getName());
					System.out.printf("%s는 %d의 데미지를 받았다. \n",this.guild.member.get(rIdx).getName(),this.atk-this.guild.member.get(rIdx).getDef());
					this.guild.member.get(rIdx).setMinusHp((this.atk-this.guild.member.get(rIdx).getDef()));
					for(int i=0; i<action.length; i++) {
						if(action[i] == 2) {
							this.guild.member.get(partyMemberIdx[i]).setDefFinish();;
						}
					}
					if(this.guild.member.get(rIdx).getHp() <= 0 ) {
						System.out.printf("%s는 hp가 0이 되어 파티에서 제외됐다.\n",this.guild.member.get(rIdx).getName());
						this.guild.partyMember --;
						this.guild.member.get(rIdx).setParty();
						if(this.guild.partyMember == 0) {
							check2 = 1;
							break;
						}else if(this.guild.partyMember != 0){
							int tempAction[] = action;
							int tempPartyMemberIdx[] = partyMemberIdx;
							int x = 0;
							action = new int[this.guild.partyMember];
							partyMemberIdx = new int[this.guild.partyMember];
							for(int i=0; i<tempAction.length; i++) {
								if(i != r) {
									action[x] = tempAction[i];
									partyMemberIdx[x] = tempPartyMemberIdx[i];
									x++;
								}
							}
						}
					}
					break;
				}//while(true)
				
				if(check == 1) {
					break;
				}
				if(check2 == 1) {
					System.out.println("더이상 싸울수 있는 파티맴버가 없으므로 레이드 종료 .");
					break;
				}
			}//while(true)
		}else System.out.println("레이드에 입장 할 수 있는 파티원이 존재하지 않습니다.");
	}
	
	
	
	public void raidBossInformation() {
		System.out.println("==========보스정보=======");
		System.out.println("보스 레벨  : " + this.level);
		System.out.println("보스 공격력 : " + this.atk);
		System.out.println("보스 방어력 : " + this.def);
		System.out.println("보스 생명력 : " + this.hp+"/"+this.maxHp);
		System.out.println("=======================");
	}
	
	public void raidBossLevelUp() {
		this.level ++;
		this.atk = this.level *10;
		this.def = 3+this.level;
		this.maxHp = 50 + this.level*50;
		this.hp = this.maxHp;
	}
	
	public void addRaidItem() {
		String kind = "무기";
		String name = "희귀한검";
		int power = (this.level-1)*20;
		int price = 1;
		this.inventory.itemList.add(new Item(kind , name , power , price));
	}
	
	public void raidPartyMemberInformationPrint() {
		System.out.println("--------파티원정보---------");
		System.out.println("\t이름\t레벨\t체력\t공격력\t방어력\t경험치");
		int temp = 1;
		for(int i=0; i<this.guild.member.size(); i++) {
			if(this.guild.member.get(i).getParty() == true) {
				System.out.println("["+temp+"]\t"+this.guild.member.get(i).getName()+"\t"+this.guild.member.get(i).getLevel()+"\t"
			+this.guild.member.get(i).getHp()+"/"+this.guild.member.get(i).getMaxHp()+"\t"+this.guild.member.get(i).getAtk()+"\t"
			+this.guild.member.get(i).getDef()+"\t"+this.guild.member.get(i).getExp());
				temp++;
			}
		}
		System.out.println("------------------------");
	}
	public void raidManual() {
		System.out.println("-----------------설명서---------------------");
		System.out.println("[1].레이드 보스는 처치할 수록 레벨이 올라가며 점점 강해집니다.");
		System.out.println("[2].획득 경험치는 보스의 레벨만큼 얻을 수 있으며 플레이어들의 레벨업 조건은 자기 자신의 레벨만큼 경험치를 얻으면 레벨업 됩니다.");
		System.out.println("    ex) 플레이어의 1레벨에서 exp가 0일때 레이드보스 1단계를 잡으면 레벨2로 상승 . ");
		System.out.println("[3].레이드를 더이상 진행하기 어려울때 레이드 초기화를 통해 레이드 보스를 1단계로 초기화 할 수 있습니다.");
		System.out.println("[4].레이드 보스를 처치할시 25%확률로 상점에서 구입하지 못하는 아이템을 획득합니다 .  ");
		System.out.println("[5].레이드는 최소 파티원1명 이상의 파티만 입장가능합니다.");
		System.out.println("[6].레이드는 턴제로 이루어지며 공격과 방어를 선택 할수 있습니다.");
		System.out.println("    1.공격 = 파티원 모두의 행동선택이 끝나면 보스를 공격합니다.");
		System.out.println("    2.방어 = 파티원 모두의 행동선택이 끝낫을때 공격을 하지않고 한턴동안 방어수치를 두배 올립니다.");
		System.out.println("--------------------------------------------");
	}
	public void raidBossReset() {
		this.level = 1;
		this.atk = 10;
		this.def = 3;
		this.hp = 100;
		this.maxHp = 100;
		System.out.println("[레이드 보스의 레벨이 1로 변경되었습니다.]");
	}
	
	
}
