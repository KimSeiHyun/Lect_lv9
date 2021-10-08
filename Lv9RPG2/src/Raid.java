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
		System.out.println("1.���̵�����\n2.���̵庸������\n3.���̵��ʱ�ȭ\n4.���̵弳��\n5.�ڷΰ���");
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
						System.out.printf("%s�� �ൿ���� : [1].����   [2].���" ,this.guild.member.get(i).getName());
						int sel = sc.nextInt();
						if(sel == 1 || sel == 2) {
							partyMemberIdx[idx] = i;
							action[idx] = sel;
							idx ++;
						}else {
							System.out.println("1�̳� 2�� �Է°��� . ");
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
					//��Ƽ������ �ൿ.
					for(int i=0; i<action.length; i++) {
						if(action[i] == 1) {
							if(this.guild.member.get(partyMemberIdx[i]).getAtk() > this.def) {
								System.out.printf("%s�� ���� !! \n",this.guild.member.get(partyMemberIdx[i]).getName());
								System.out.printf("�������� %d�� �������� ������.\n", this.guild.member.get(partyMemberIdx[i]).getAtk() - this.def );
								this.hp -= guild.member.get(partyMemberIdx[i]).getAtk()-this.def;
							}else System.out.printf("%s�� ������ �������� ���� �ʾҴ�.\n",this.guild.member.get(partyMemberIdx[i]).getName() );
						}
						if(action[i] == 2) {
							System.out.printf("%s�� ��� !! %s�� �̹��ϵ��� �� 2��ȴ� . \n",this.guild.member.get(partyMemberIdx[i]).getName(),this.guild.member.get(partyMemberIdx[i]).getName());
							this.guild.member.get(partyMemberIdx[i]).setDefActtion();
							System.out.println("���� : " + this.guild.member.get(partyMemberIdx[i]).getDef());
						}
					}
					if(this.hp <= 0) {
						System.out.printf("%d�ܰ� ���̵� ���� !! \n",this.level);
						this.raidBossLevelUp();
						int percent = rn.nextInt(4);
						if(percent == 0) {
							System.out.println("������ ���� ȹ�� !!!!!!!!!!");
							this.addRaidItem();
						}
						for(int i=0; i<partyMemberIdx.length; i++) {
							this.guild.member.get(partyMemberIdx[i]).setExp((this.guild.member.get(partyMemberIdx[i]).getExp()+this.level-1));
							if(this.guild.member.get(partyMemberIdx[i]).getLevel() == this.guild.member.get(partyMemberIdx[i]).getExp()) {
								this.guild.member.get(partyMemberIdx[i]).levelUp();
								System.out.printf("%s�� ������!! \n",this.guild.member.get(partyMemberIdx[i]).getName());
							}
							if(this.guild.member.get(partyMemberIdx[i]).getLevel() < this.guild.member.get(partyMemberIdx[i]).getExp()) {
								while(this.guild.member.get(partyMemberIdx[i]).getLevel() < this.guild.member.get(partyMemberIdx[i]).getExp()) {
									int tempExp = this.guild.member.get(partyMemberIdx[i]).getExp();
									this.guild.member.get(partyMemberIdx[i]).levelUp();
									this.guild.member.get(partyMemberIdx[i]).setExp((tempExp-(this.guild.member.get(partyMemberIdx[i]).getLevel()-1)));
									System.out.printf("%s�� ������!! \n",this.guild.member.get(partyMemberIdx[i]).getName());
								}//while
							}
						}
						check = 1;
						break;
					}
					//������ ����
					int r = rn.nextInt(this.guild.partyMember);
					int rIdx = partyMemberIdx[r];
					System.out.printf("������ %s���� ���� !! \n",this.guild.member.get(rIdx).getName());
					System.out.printf("%s�� %d�� �������� �޾Ҵ�. \n",this.guild.member.get(rIdx).getName(),this.atk-this.guild.member.get(rIdx).getDef());
					this.guild.member.get(rIdx).setMinusHp((this.atk-this.guild.member.get(rIdx).getDef()));
					for(int i=0; i<action.length; i++) {
						if(action[i] == 2) {
							this.guild.member.get(partyMemberIdx[i]).setDefFinish();;
						}
					}
					if(this.guild.member.get(rIdx).getHp() <= 0 ) {
						System.out.printf("%s�� hp�� 0�� �Ǿ� ��Ƽ���� ���ܵƴ�.\n",this.guild.member.get(rIdx).getName());
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
					System.out.println("���̻� �ο�� �ִ� ��Ƽ�ɹ��� �����Ƿ� ���̵� ���� .");
					break;
				}
			}//while(true)
		}else System.out.println("���̵忡 ���� �� �� �ִ� ��Ƽ���� �������� �ʽ��ϴ�.");
	}
	
	
	
	public void raidBossInformation() {
		System.out.println("==========��������=======");
		System.out.println("���� ����  : " + this.level);
		System.out.println("���� ���ݷ� : " + this.atk);
		System.out.println("���� ���� : " + this.def);
		System.out.println("���� ����� : " + this.hp+"/"+this.maxHp);
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
		String kind = "����";
		String name = "����Ѱ�";
		int power = (this.level-1)*20;
		int price = 1;
		this.inventory.itemList.add(new Item(kind , name , power , price));
	}
	
	public void raidPartyMemberInformationPrint() {
		System.out.println("--------��Ƽ������---------");
		System.out.println("\t�̸�\t����\tü��\t���ݷ�\t����\t����ġ");
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
		System.out.println("-----------------����---------------------");
		System.out.println("[1].���̵� ������ óġ�� ���� ������ �ö󰡸� ���� �������ϴ�.");
		System.out.println("[2].ȹ�� ����ġ�� ������ ������ŭ ���� �� ������ �÷��̾���� ������ ������ �ڱ� �ڽ��� ������ŭ ����ġ�� ������ ������ �˴ϴ�.");
		System.out.println("    ex) �÷��̾��� 1�������� exp�� 0�϶� ���̵庸�� 1�ܰ踦 ������ ����2�� ��� . ");
		System.out.println("[3].���̵带 ���̻� �����ϱ� ����ﶧ ���̵� �ʱ�ȭ�� ���� ���̵� ������ 1�ܰ�� �ʱ�ȭ �� �� �ֽ��ϴ�.");
		System.out.println("[4].���̵� ������ óġ�ҽ� 25%Ȯ���� �������� �������� ���ϴ� �������� ȹ���մϴ� .  ");
		System.out.println("[5].���̵�� �ּ� ��Ƽ��1�� �̻��� ��Ƽ�� ���尡���մϴ�.");
		System.out.println("[6].���̵�� ������ �̷������ ���ݰ� �� ���� �Ҽ� �ֽ��ϴ�.");
		System.out.println("    1.���� = ��Ƽ�� ����� �ൿ������ ������ ������ �����մϴ�.");
		System.out.println("    2.��� = ��Ƽ�� ����� �ൿ������ �������� ������ �����ʰ� ���ϵ��� ����ġ�� �ι� �ø��ϴ�.");
		System.out.println("--------------------------------------------");
	}
	public void raidBossReset() {
		this.level = 1;
		this.atk = 10;
		this.def = 3;
		this.hp = 100;
		this.maxHp = 100;
		System.out.println("[���̵� ������ ������ 1�� ����Ǿ����ϴ�.]");
	}
	
	
}
