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
	private String nameArray1[] = {"김" , "이" , "짜" ,"장" , "면" , "탕" , "수" ,"육"};
	private String nameArray2[] = {"볶" , "음" , "밥" ,"짬" , "뽕" , "라" , "조" ,"기"};
	private String nameArray3[] = {"프" , "링" , "글" ,"스" , "아" , "주" , "최" ,"고"};
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	

	public void guildManageRun() {
		while(true) {
			System.out.println("현재 보유 골드 : " +Player.money);
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
		System.out.println("1.길드원목록\n2.길드원영입(money -10,000)\n3.길드원판매(money +5,000)\n4.파티리스트\n5.파티추가\n6.파티추방\n7.파티원치료(money - 5,000)\n8.뒤로가기");
	}
	
	public void guildMemberPrint() {
		System.out.println("---길드원리스트---");
		if(this.member.size() != 0) {
			System.out.println("번호\t이름\t레벨\t체력\t공격력\t방어력\t경험치\t파티");
			for(int i=0; i<this.member.size(); i++) {
				this.printInfo(i);
			}System.out.println("--------------");
		}else System.out.println("길드원이 한명도 없습니다.");
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
			System.out.printf("%s을 영입했습니다.\n",name);
		}else System.out.println("길드원을 영입할 돈이 부족합니다 . ");
		
	}
	
	//길드원을 판매할경우 추가해야할것들
	// 파티원일경우 해제 - clear
	// 아이템착용중인것 해제 - clear
	
	private void sellGuildMember() {
		if(this.member.size() != 0) {
			this.guildMemberPrint();
			System.out.println("판매할 길드원의 번호를 입력해주세요 .");
			int idx = sc.nextInt();
			if(idx >= 0 && idx < this.member.size()) {
				if(this.member.get(idx).getParty() == true) {
					this.partyCount --;
				}
				//아이템을 착용하고 있을 경우 
				if(this.member.get(idx).getWeapon() != null) { //
					Inventory tempItem = this.member.get(idx).getWeapon(); // 삭제할 길드원의 착용중인 아이템
					for(int i=0; i<this.im.inventory.size(); i++) {
						if(this.im.inventory.get(i).getName().equals(tempItem.getName())) {
							this.im.inventory.get(i).setUse(false);
							this.im.inventory.get(i).setUserName(null);
						}
					}
				}
				if(this.member.get(idx).getArmor() != null) { //
					Inventory tempItem = this.member.get(idx).getArmor(); // 삭제할 길드원의 착용중인 아이템
					for(int i=0; i<this.im.inventory.size(); i++) {
						if(this.im.inventory.get(i).getName().equals(tempItem.getName())) {
							this.im.inventory.get(i).setUse(false);
							this.im.inventory.get(i).setUserName(null);
						}
					}
				}
				if(this.member.get(idx).getAccessorise() != null) { //
					Inventory tempItem = this.member.get(idx).getAccessorise(); // 삭제할 길드원의 착용중인 아이템
					for(int i=0; i<this.im.inventory.size(); i++) {
						if(this.im.inventory.get(i).getName().equals(tempItem.getName())) {
							this.im.inventory.get(i).setUse(false);
							this.im.inventory.get(i).setUserName(null);
						}
					}
				}
				this.member.remove(idx);
				Player.money += 5000;
			}else System.out.println("번호를 다시 확인해주세요 . ");
		}else System.out.println("판매할 길드원이 없습니다.");
	}
	
	public void partyListPrint() {
		if(this.partyCount != 0) {
			System.out.println("번호\t이름\t레벨\t체력\t공격력\t방어력\t경험치\t파티");
			for(int i=0; i<this.member.size(); i++) {
				if(this.member.get(i).getParty() == true) {
					this.printInfo(i);
				}
			}			
		}else System.out.println("파티원이 존재하지 않습니다.");
	}
	
	private void addPartyMember() {
		if(this.partyCount < 4) {
			System.out.println("추가할 파티원의 번호를 입력해주세요 . ");
			System.out.println("번호\t이름\t레벨\t체력\t공격력\t방어력\t경험치\t파티");
			for(int i=0; i<this.member.size(); i++) {
				if(this.member.get(i).getParty() == false) {
					this.printInfo(i);
				}
			}
			int idx = sc.nextInt();
			if(idx >= 0 && idx < this.member.size() && this.member.get(idx).getParty() == false) {
				this.partyCount ++;
				this.member.get(idx).setParty(true);
				System.out.printf("%s가 파티에 합류했습니다.\n",this.member.get(idx).getName());
			}else System.out.println("번호를 다시 확인해주세요 . ");
		}else System.out.println("파티원이 가득 찼습니다.");
	}
	
	private void delectPartyMember() {
		if(this.partyCount != 0) {
			System.out.println("추방할 파티원의 번호를 입력해주세요.");
			for(int i=0; i<this.member.size(); i++) {
				if(this.member.get(i).getParty() == true) {
					this.printInfo(i);
				}
			}
			int idx = sc.nextInt();
			if(idx >= 0 && idx < this.member.size() && this.member.get(idx).getParty() == true) {
				this.partyCount --;
				this.member.get(idx).setParty(false);
				System.out.printf("%s가 파티에서 추방됐습니다..\n",this.member.get(idx).getName());
			}else System.out.println("번호를 다시 확인해주세요 . ");
		}else System.out.println("추방할 파티원이 없습니다.");
	}
	
	private void curePartyMember() {
		if(this.partyCount != 0 ) {
			System.out.println("파티원들을 치료하시겠습니까 ? \n[1.확인]     [2.취소]");
			int sel = sc.nextInt();
			if(sel == 1) {
				if(Player.money >= 5000) {
					for(int i=0; i<this.member.size(); i++) {
						if(this.member.get(i).getParty() == true) {
							this.member.get(i).setHp(this.member.get(i).getMaxHp());
						}
					}
					Player.money -= 5000;
				}else System.out.println("보유 골드가 부족합니다.");
			}
		}else System.out.println("치료할 파티원이 존재하지 않습니다.");
	}
	
	private void printInfo(int i) {
		System.out.println(i+"\t"+this.member.get(i).getName()+"\t"+
				this.member.get(i).getLevel()+"\t"+this.member.get(i).getHp()+"/"+this.member.get(i).getMaxHp()+"\t"+
				this.member.get(i).getAtk()+"\t"+this.member.get(i).getDef()+"\t"+this.member.get(i).getExp()+"\t"+
				this.member.get(i).getParty());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
