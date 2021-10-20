package controller;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import models.Inventory;
import models.Member;
import models.Player;
public class GuildManager {
	public static GuildManager instance = new GuildManager();
	
	private ItemManager im = ItemManager.getItemManagerInstance();
	public static GuildManager getGuildManagerInstance() {
		return GuildManager.instance;
	}
	public static ArrayList<Member> member = new ArrayList<>();
	
	public static int partyCount = 0;
	private String nameArray1[] = {"��" , "��" , "¥" ,"��" , "��" , "��" , "��" ,"��"};
	private String nameArray2[] = {"��" , "��" , "��" ,"«" , "��" , "��" , "��" ,"��"};
	private String nameArray3[] = {"��" , "��" , "��" ,"��" , "��" , "��" , "��" ,"��"};
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	

	public void guildManageRun() {
		while(true) {
			System.out.println("���� ���� ��� : " +Player.money);
			this.guildManagerMainMneu();
			int sel = sc.nextInt();
			if(sel == 1) {
				this.guildMemberPrint();
			}
			if(sel == 2) {
				this.addGuildMember();
			}
			if(sel == 3) {
				this.sellGuildMember();
			}
			if(sel == 4) {
				this.partyListPrint();
			}
			if(sel == 5) {
				this.addPartyMember();
			}
			if(sel == 6) {
				this.delectPartyMember();
			}
			if(sel == 7) {
				this.curePartyMember();
			}
			if(sel == 8) {
				break;
			}
		}
	}
	
	private void guildManagerMainMneu() {
		System.out.println("1.�������\n2.��������(money -10,000)\n3.�����Ǹ�(money +5,000)\n4.��Ƽ����Ʈ\n5.��Ƽ�߰�\n6.��Ƽ�߹�\n7.��Ƽ��ġ��(money - 5,000)\n8.�ڷΰ���");
	}
	
	public void guildMemberPrint() {
		System.out.println("---��������Ʈ---");
		if(this.member.size() != 0) {
			System.out.println("��ȣ\t�̸�\t����\tü��\t���ݷ�\t����\t����ġ\t��Ƽ");
			for(int i=0; i<this.member.size(); i++) {
				this.printInfo(i);
			}System.out.println("--------------");
		}else System.out.println("������ �Ѹ� �����ϴ�.");
	}
	
	private void addGuildMember() {
		if(Player.money >= 10000) {
			String name ="";
			name += this.nameArray1[rn.nextInt(this.nameArray1.length)];
			name += this.nameArray2[rn.nextInt(this.nameArray1.length)];
			name += this.nameArray3[rn.nextInt(this.nameArray1.length)];
			int level = 1;
			int hp = rn.nextInt(10)+80;
			int atk = rn.nextInt(5)+7;
			int def = rn.nextInt(3)+1;
			int exp = 0;
			Member temp = new Member(name , level , hp , atk , def , exp);
			Member temp2 = new Member(name , level , hp , atk , def , exp , true);
			if(this.partyCount <4) {
				this.member.add(temp2);
				this.partyCount ++;
			}else {				
				this.member.add(temp);
			}
			Player.money -= 10000;
			System.out.printf("%s�� �����߽��ϴ�.\n",name);
		}else System.out.println("������ ������ ���� �����մϴ� . ");
		
	}
	
	//������ �Ǹ��Ұ�� �߰��ؾ��Ұ͵�
	// ��Ƽ���ϰ�� ���� - clear
	// �������������ΰ� ���� - clear
	
	private void sellGuildMember() {
		if(this.member.size() != 0) {
			this.guildMemberPrint();
			System.out.println("�Ǹ��� ������ ��ȣ�� �Է����ּ��� .");
			int idx = sc.nextInt();
			if(idx >= 0 && idx < this.member.size()) {
				if(this.member.get(idx).getParty() == true) {
					this.partyCount --;
				}
				//�������� �����ϰ� ���� ��� 
				if(this.member.get(idx).getWeapon() != null) { //
					Inventory tempItem = this.member.get(idx).getWeapon(); // ������ ������ �������� ������
					for(int i=0; i<this.im.inventory.size(); i++) {
						if(this.im.inventory.get(i).getName().equals(tempItem.getName())) {
							this.im.inventory.get(i).setUse(false);
							this.im.inventory.get(i).setUserName(null);
						}
					}
				}
				if(this.member.get(idx).getArmor() != null) { //
					Inventory tempItem = this.member.get(idx).getArmor(); // ������ ������ �������� ������
					for(int i=0; i<this.im.inventory.size(); i++) {
						if(this.im.inventory.get(i).getName().equals(tempItem.getName())) {
							this.im.inventory.get(i).setUse(false);
							this.im.inventory.get(i).setUserName(null);
						}
					}
				}
				if(this.member.get(idx).getAccessorise() != null) { //
					Inventory tempItem = this.member.get(idx).getAccessorise(); // ������ ������ �������� ������
					for(int i=0; i<this.im.inventory.size(); i++) {
						if(this.im.inventory.get(i).getName().equals(tempItem.getName())) {
							this.im.inventory.get(i).setUse(false);
							this.im.inventory.get(i).setUserName(null);
						}
					}
				}
				this.member.remove(idx);
				Player.money += 5000;
			}else System.out.println("��ȣ�� �ٽ� Ȯ�����ּ��� . ");
		}else System.out.println("�Ǹ��� ������ �����ϴ�.");
	}
	
	public void partyListPrint() {
		if(this.partyCount != 0) {
			System.out.println("��ȣ\t�̸�\t����\tü��\t���ݷ�\t����\t����ġ\t��Ƽ");
			for(int i=0; i<this.member.size(); i++) {
				if(this.member.get(i).getParty() == true) {
					this.printInfo(i);
				}
			}			
		}else System.out.println("��Ƽ���� �������� �ʽ��ϴ�.");
	}
	
	private void addPartyMember() {
		if(this.partyCount < 4) {
			System.out.println("�߰��� ��Ƽ���� ��ȣ�� �Է����ּ��� . ");
			System.out.println("��ȣ\t�̸�\t����\tü��\t���ݷ�\t����\t����ġ\t��Ƽ");
			for(int i=0; i<this.member.size(); i++) {
				if(this.member.get(i).getParty() == false) {
					this.printInfo(i);
				}
			}
			int idx = sc.nextInt();
			if(idx >= 0 && idx < this.member.size() && this.member.get(idx).getParty() == false) {
				this.partyCount ++;
				this.member.get(idx).setParty(true);
				System.out.printf("%s�� ��Ƽ�� �շ��߽��ϴ�.\n",this.member.get(idx).getName());
			}else System.out.println("��ȣ�� �ٽ� Ȯ�����ּ��� . ");
		}else System.out.println("��Ƽ���� ���� á���ϴ�.");
	}
	
	private void delectPartyMember() {
		if(this.partyCount != 0) {
			System.out.println("�߹��� ��Ƽ���� ��ȣ�� �Է����ּ���.");
			for(int i=0; i<this.member.size(); i++) {
				if(this.member.get(i).getParty() == true) {
					this.printInfo(i);
				}
			}
			int idx = sc.nextInt();
			if(idx >= 0 && idx < this.member.size() && this.member.get(idx).getParty() == true) {
				this.partyCount --;
				this.member.get(idx).setParty(false);
				System.out.printf("%s�� ��Ƽ���� �߹�ƽ��ϴ�..\n",this.member.get(idx).getName());
			}else System.out.println("��ȣ�� �ٽ� Ȯ�����ּ��� . ");
		}else System.out.println("�߹��� ��Ƽ���� �����ϴ�.");
	}
	
	private void curePartyMember() {
		if(this.partyCount != 0 ) {
			System.out.println("��Ƽ������ ġ���Ͻðڽ��ϱ� ? \n[1.Ȯ��]     [2.���]");
			int sel = sc.nextInt();
			if(sel == 1) {
				if(Player.money >= 5000) {
					for(int i=0; i<this.member.size(); i++) {
						if(this.member.get(i).getParty() == true) {
							this.member.get(i).setHp(this.member.get(i).getMaxHp());
						}
					}
					Player.money -= 5000;
				}else System.out.println("���� ��尡 �����մϴ�.");
			}
		}else System.out.println("ġ���� ��Ƽ���� �������� �ʽ��ϴ�.");
	}
	
	private void printInfo(int i) {
		System.out.println(i+"\t"+this.member.get(i).getName()+"\t"+
				this.member.get(i).getLevel()+"\t"+this.member.get(i).getHp()+"/"+this.member.get(i).getMaxHp()+"\t"+
				this.member.get(i).getAtk()+"\t"+this.member.get(i).getDef()+"\t"+this.member.get(i).getExp()+"\t"+
				this.member.get(i).getParty());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
