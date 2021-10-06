import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Guild {
	private int partyMember = 0;
	private Inventory inventory = Inventory.instance;
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	public static Guild instance = new Guild();
	public static ArrayList<Member> member = new ArrayList<>();
	public void guildManager() {
		while(true) {
			guildMainMenuPrint();
			int sel = sc.nextInt();
			if(sel == 1) {
				GuildMemberList();
			}
			if(sel == 2) {
				addGuildMember();
			}
			if(sel == 3) {
				deleteGuildMember();
			}
			if(sel == 4) {
				partyMemberList();
			}
			if(sel == 5) {
				addPartyMember();
			}
			if(sel == 6) {
				deletePartyMember();
			}
			if(sel == 7) {
				break;
			}
		}
	}
	
	public void guildMainMenuPrint() {
		System.out.println("1.길드원목록\n2.길드원영입\n3.길드원추방\n4.파티원목록\n5.파티원추가\n6.파티원추방\n7.뒤로가기");
	}
	
	public void GuildMemberList() {
		if(this.member.size() != 0) {
			System.out.println("번호\t이름\t레벨\t체력\t공격력\t방어력\t경험치\t파티가입");
			for(int i=0; i<this.member.size(); i++) {
				System.out.println("["+(i+1)+"]\t"+this.member.get(i).getName()+"\t"+this.member.get(i).getLevel()+"\t"
						+this.member.get(i).getHp()+"/"+this.member.get(i).getMaxHp()+"\t"
						+this.member.get(i).getAtk()+"\t"+this.member.get(i).getDef()+"\t"
						+this.member.get(i).getExp()+"\t"+this.member.get(i).getParty());
			}
		}else System.out.println("길드원이 존재하지 않습니다.");
	}
	
	private void addGuildMember() {
		System.out.println("길드원을 영입하는 비용은 10,000원 입니다. 영입하시겠습니까 ? ");
		System.out.println("1.[YES]\t2.[No]");
		int sel = sc.nextInt();
		if(sel == 1) {
			if(Player.money >= 10000) {
				int asdasd = 0;
				String name = "";
				String nameTemp1[] = {"김" , "이" , "박" , "우" , "손" , "베" , "프" };
				String nameTemp2[] = {"세" , "은" , "지" , "광" , "좌" , "짜" , "장" };
				String nameTemp3[] = {"짬" , "뽕" , "탕" , "수" , "육" , "춘" , "장" };
				while(true) {
					int r1 = rn.nextInt(nameTemp1.length);
					name += nameTemp1[r1];
					int r2 = rn.nextInt(nameTemp1.length);
					name += nameTemp2[r2];
					int r3 = rn.nextInt(nameTemp1.length);
					name += nameTemp3[r3];
					
					int check = 0;
					for(int i=0; i<this.member.size(); i++) {
						if(this.member.get(i).getName().equals(name)) {
							check = 1;
						}
					}
					if(check == 1) {
						name = "";
					}else {
						break;
					}
				}
				int level = 1;
				int rHp = rn.nextInt(5)+5;
				int hp = rHp*10;
				int maxHp = rHp*10;
				int atk = rn.nextInt(3)+1;
				int def = rn.nextInt(3)+1;
				int exp = 0;
				if(this.partyMember <4) {
					this.member.add(new Member(name , level , hp , maxHp , atk , def , exp , true));
					partyMember ++;
				}else {
					this.member.add(new Member(name , level , hp , maxHp , atk , def , exp));
				}
				Player.money -= 10000;
			}else System.out.println("비용이 모자랍니다.");
		}
	}
	
	private void deleteGuildMember() {
		if(this.member.size() != 0 ) {
			System.out.println("추방할 길드원의 이름 입력 : ");
			String name = sc.next();
			int idx = -1;
			for(int i=0; i<this.member.size(); i++) {
				if(this.member.get(i).getName().equals(name)) idx = i;
			}
			if(idx != -1) {
				if(this.member.get(idx).getWeapon() != null) {
					String itemName = this.member.get(idx).getWeapon().getName();
					for(int i=0; i<this.inventory.itemList.size(); i++) {
						if(this.inventory.itemList.get(i).getName().equals(itemName)) {
							this.inventory.itemList.get(i).setUse();
						}
					}
				}
				if(this.member.get(idx).getArmor() != null) {
					String itemName = this.member.get(idx).getArmor().getName();
					for(int i=0; i<this.inventory.itemList.size(); i++) {
						if(this.inventory.itemList.get(i).getName().equals(itemName)) {
							this.inventory.itemList.get(i).setUse();
						}
					}
				}
				if(this.member.get(idx).getAccessorise() != null) {
					String itemName = this.member.get(idx).getAccessorise().getName();
					for(int i=0; i<this.inventory.itemList.size(); i++) {
						if(this.inventory.itemList.get(i).getName().equals(itemName)) {
							this.inventory.itemList.get(i).setUse();
						}
					}
				}
				this.member.remove(idx);
			}else System.out.println("길드원의 이름을 찾을 수 없습니다.");
		}else System.out.println("추방할 길드원이 없습니다.");
	}
	
	private void partyMemberList() {
		if(this.partyMember != 0) {
			System.out.println("==파티원==");
			for(int i=0; i<this.member.size(); i++) {
				if(this.member.get(i).getParty() == true) System.out.println(this.member.get(i).getName());
			}
			System.out.println("========");
		}else System.out.println("파티원이 존재하지 않습니다.");
	}
	
	private void addPartyMember() {
		if(this.member.size() != 0) {
			if(this.partyMember != 4) {
				System.out.println("추가할 길드원의 번호를 입력해주세요 . ");
				GuildMemberList();
				int sel = sc.nextInt()-1;
				if(sel >= 0 && sel < this.member.size()) {
					if(this.member.get(sel).getParty() == false) {
						this.partyMember ++;
						this.member.get(sel).setParty();
					}else System.out.println("해당 파티원은 이미 파티에 가입에 가입돼어있습니다.");
				}else System.out.println("길드원의 번호범위를 벗어났습니다.");
			}else System.out.println("파티맴버를 더이상 추가 할 수 없습니다. ");
		}else System.out.println("길드원을 먼저 영입해주세요 ! ");
	}
	
	private void deletePartyMember() {
		if(this.partyMember != 0) {
			partyMemberList();
			System.out.print("추방할 파티원의 이름 입력 : ");
			String name = sc.next();
			int idx = -1;
			for(int i=0; i<this.member.size(); i++) {
				if(this.member.get(i).getName().equals(name)) idx = i;
			}
			if(idx != -1) {
				if(this.member.get(idx).getParty() == true) {
					this.member.get(idx).setParty();
					this.partyMember--;
				}else System.out.println("해당 파티원은 파티에 가입되어있지 않습니다.");
			}else System.out.println("추방할 파티원의 이름을 다시 확인해주세요 . ");
		}else System.out.println("추방할 파티원이 존재하지 않습니다 . ");
	}
}
