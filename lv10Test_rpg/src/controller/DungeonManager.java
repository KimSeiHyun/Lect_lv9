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
				this.unit.add(new UnitBat("����",(25+this.dungeonLevel*5),10,(3+this.dungeonLevel*1),(0+this.dungeonLevel)));				
			}
			if(r == 1) {
				this.unit.add(new UnitOrc("��ũ",(30+this.dungeonLevel*5),10,(3+this.dungeonLevel*2),(0+this.dungeonLevel)));								
			}
			if(r == 2) {
				this.unit.add(new UnitWolf("����",(40+this.dungeonLevel*5),10,(4+this.dungeonLevel*2),(0+this.dungeonLevel)));												
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
		System.out.println("1.��������\n2.�����ʱ�ȭ\n3.���緹���Ǵ�������\n4.���Ӽ���\n5.�ڷΰ���");
	}
	
	@Override
	public void dungeonLevelUp() {
		this.dungeonLevel ++;
	}
	
	//�������� ü���� +10 ���ݷ��� +3 ������ +1 
	private void dungeonEntry() {
		this.partyIdxInit();
		if(this.gm.partyCount != 0) {
			if(this.dungeonLevel %5 != 0) {//�Ϲݸ�
				while(true) {
					System.out.println("��Ƽ��");
					this.gm.partyListPrint();
					System.out.println("��������");
					this.UnitListPrint();
					int run = -1;
					int checkClear = -1;
					for(int i=0; i<this.partyIdx.length; i++) {
						int memberIdx = this.partyIdx[i];
						System.out.printf("%s�� �ൿ�� �������ּ��� \n[1.����]  [2.����]\n", this.gm.member.get(memberIdx).getName());
						int sel = sc.nextInt();
						if(sel == 1) {
							int unitIdx = rn.nextInt(this.unit.size());
							if(this.gm.member.get(memberIdx).getAtk() > this.unit.get(unitIdx).getDef()) {
								System.out.printf("%s�� ���� !! %s�� %d�� �������� �Ծ���.\n",this.gm.member.get(memberIdx).getName() ,
										this.unit.get(unitIdx).getName() , (this.gm.member.get(memberIdx).getAtk()-this.unit.get(unitIdx).getDef()));
								this.unit.get(unitIdx).setHp((this.unit.get(unitIdx).getHp())-(this.gm.member.get(memberIdx).getAtk()-this.unit.get(unitIdx).getDef()));
								System.out.println("��Ƽ��");
								this.gm.partyListPrint();
								System.out.println("��������");
								this.UnitListPrint();
								if(this.unit.get(unitIdx).getHp() <= 0 ) {
									System.out.printf("%s�� óġ�ߴ� !! \n",this.unit.get(unitIdx).getName());
									this.unit.remove(unitIdx);
									if(this.unit.size() == 0) {
										checkClear = 1;
										System.out.println("���� Ŭ����!! ");
										this.dungeonLevelUp();
										this.RaidInit();
										this.UnitInit();
										this.partyLevelUp();
										Player.money += this.dungeonLevel*1000;
										break;
									}
								}
							}else System.out.println("�������� 0 ���� .. ");
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
						System.out.println("�������ϴ�....");
						break;
					}
					//���͵��� ���� 
					for(int i=0; i<this.unit.size(); i++) {
						int r = rn.nextInt(this.partyIdx.length);
						int memberIdx = this.partyIdx[r];
						if( this.unit.get(i).getMp() == 0) {
							this.unit.get(i).attack(this.gm.member.get(memberIdx));
						}else {
							if(this.unit.get(i).getHp() > this.unit.get(i).getMaxHp()/2) {
								this.unit.get(i).attack(this.gm.member.get(memberIdx));
							}else {
								//��ų���
								if(this.unit.get(i).getName().equals("����")) {
									UnitBat.skillBat((SkillBat) this.unit.get(i), this.unit.get(i), this.gm.member.get(memberIdx));
								}
								if(this.unit.get(i).getName().equals("��ũ")) {
									
								}
								if(this.unit.get(i).getName().equals("����")) {
									
								}
								this.unit.get(i).setMp();
							}
						}
					}
					
				}//while(True)
				
			}else {//������
				while(true) {
					System.out.println("��Ƽ��");
					this.gm.partyListPrint();
					System.out.println("����");
					this.RaidPrint();
					int run = -1;
					int checkClear = -1;
					for(int i=0; i<this.partyIdx.length; i++) {
						int memberIdx = this.partyIdx[i];
						System.out.printf("%s�� �ൿ�� �������ּ��� \n[1.����]  [2.����]\n", this.gm.member.get(memberIdx).getName());
						int sel = sc.nextInt();
						if(sel == 1) {
							if(this.gm.member.get(memberIdx).getAtk() > this.raid.getDef()) {
								int damage = (this.gm.member.get(memberIdx).getAtk() - this.raid.getDef());
								System.out.printf("%s�� ���� !! ������ %d�� �������� �Ծ���.\n" , this.gm.member.get(memberIdx).getName() , damage);
								this.raid.setHp((this.raid.getHp()-damage));
								if(this.raid.getHp() <= 0) {
									checkClear = 1;
									this.dungeonLevelUp();
									System.out.println("������ �����ƴ�!!");
									this.RaidInit();
									this.UnitInit();
									this.partyLevelUp();
									Player.money += this.dungeonLevel*1000;
									break;
								}
							}else System.out.println("�������� 0 ������ ... ");
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
						System.out.println("�������ϴ�....");
						break;
					}
				}
			}
			
		}else System.out.println("��Ƽ�ɹ��� �������� �ʾ� ������ ���� �� �� �����ϴ�.");
	}
	
	private void partyLevelUp() {
		for(int i=0; i<this.partyIdx.length; i++) {
			int memberIdx = this.partyIdx[i];
			int exp = this.gm.member.get(memberIdx).getExp();//���� ����ġ
			int tempExp = this.dungeonLevel*4; //�޾ƾ��� ����ġ
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
		System.out.println("������ �ʱ�ȭ�մϴ�.");
	}
	
	private void dungeonInformation() {
		System.out.println("������ ���� : " + this.dungeonLevel);
		if(this.dungeonLevel %5 != 0) {
			System.out.println("[��������]");
			this.UnitListPrint();
		}else {
			System.out.println("[��������]");
			this.RaidPrint();
		}
	}
	
	private void UnitListPrint() {
		System.out.println("�̸�\tü��\t����\t���ݷ�\t����");
		for(int i=0; i<this.unit.size(); i++) {
			System.out.println(this.unit.get(i).getName()+"\t"+this.unit.get(i).getHp()+"/"+this.unit.get(i).getMaxHp()+"\t"
		+this.unit.get(i).getMp()+"/"+this.unit.get(i).getMaxMp()+"\t"+this.unit.get(i).getAtk()+"\t"+this.unit.get(i).getDef());
		}
	}
	private void RaidPrint() {
		System.out.println("����\tü��\t���ݷ�\t����");
		System.out.println(this.raid.getLevel()+"\t"+this.raid.getHp()+"/"+this.raid.getMaxHp()+"\t"+this.raid.getAtk()+"\t"+this.raid.getDef());
	}
	
	private void dungeonManual() {
		System.out.println("1.������ Ŭ�����ϸ� ����ġ�� ��带 ����ϴ�.");
		System.out.println("2.������ Ŭ�����ϱ� ������ �ʱ�ȭ�� ���� ������ ������ 1�� ���� �� �ֽ��ϴ�.");
		System.out.println("3.������ �÷��̵��� 25%Ȯ���� �������⸦ �� �� �ֽ��ϴ�.");
		System.out.println("4.���͵��� ü����50%���Ϸ� �������� ��ų�� �ѹ� ����ϸ� ������ ���� �����ϸ��� ��ü������ �մϴ� .");
		System.out.println("5.���������� 5�� ����϶��� ������ �����մϴ� . ");
		System.out.println("6.��Ƽ������ ����ġ�� �ڽ��� ���� x10��ŭ ȸ���ϸ� ������ �ϸ� ������ ���� ����ϰ� hp�� ��� ȸ���˴ϴ�.");
		System.out.println("7.����Ŭ����� ������ ���� *1000��ŭ ��带 ȹ���մϴ� . ");
		System.out.println("8.�������� �ִ� �ѹ��� �����մϴ�.");
	}
}
