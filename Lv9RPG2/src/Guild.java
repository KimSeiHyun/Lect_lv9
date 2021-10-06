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
		System.out.println("1.�������\n2.��������\n3.�����߹�\n4.��Ƽ�����\n5.��Ƽ���߰�\n6.��Ƽ���߹�\n7.�ڷΰ���");
	}
	
	public void GuildMemberList() {
		if(this.member.size() != 0) {
			System.out.println("��ȣ\t�̸�\t����\tü��\t���ݷ�\t����\t����ġ\t��Ƽ����");
			for(int i=0; i<this.member.size(); i++) {
				System.out.println("["+(i+1)+"]\t"+this.member.get(i).getName()+"\t"+this.member.get(i).getLevel()+"\t"
						+this.member.get(i).getHp()+"/"+this.member.get(i).getMaxHp()+"\t"
						+this.member.get(i).getAtk()+"\t"+this.member.get(i).getDef()+"\t"
						+this.member.get(i).getExp()+"\t"+this.member.get(i).getParty());
			}
		}else System.out.println("������ �������� �ʽ��ϴ�.");
	}
	
	private void addGuildMember() {
		System.out.println("������ �����ϴ� ����� 10,000�� �Դϴ�. �����Ͻðڽ��ϱ� ? ");
		System.out.println("1.[YES]\t2.[No]");
		int sel = sc.nextInt();
		if(sel == 1) {
			if(Player.money >= 10000) {
				int asdasd = 0;
				String name = "";
				String nameTemp1[] = {"��" , "��" , "��" , "��" , "��" , "��" , "��" };
				String nameTemp2[] = {"��" , "��" , "��" , "��" , "��" , "¥" , "��" };
				String nameTemp3[] = {"«" , "��" , "��" , "��" , "��" , "��" , "��" };
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
			}else System.out.println("����� ���ڶ��ϴ�.");
		}
	}
	
	private void deleteGuildMember() {
		if(this.member.size() != 0 ) {
			System.out.println("�߹��� ������ �̸� �Է� : ");
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
			}else System.out.println("������ �̸��� ã�� �� �����ϴ�.");
		}else System.out.println("�߹��� ������ �����ϴ�.");
	}
	
	private void partyMemberList() {
		if(this.partyMember != 0) {
			System.out.println("==��Ƽ��==");
			for(int i=0; i<this.member.size(); i++) {
				if(this.member.get(i).getParty() == true) System.out.println(this.member.get(i).getName());
			}
			System.out.println("========");
		}else System.out.println("��Ƽ���� �������� �ʽ��ϴ�.");
	}
	
	private void addPartyMember() {
		if(this.member.size() != 0) {
			if(this.partyMember != 4) {
				System.out.println("�߰��� ������ ��ȣ�� �Է����ּ��� . ");
				GuildMemberList();
				int sel = sc.nextInt()-1;
				if(sel >= 0 && sel < this.member.size()) {
					if(this.member.get(sel).getParty() == false) {
						this.partyMember ++;
						this.member.get(sel).setParty();
					}else System.out.println("�ش� ��Ƽ���� �̹� ��Ƽ�� ���Կ� ���Եž��ֽ��ϴ�.");
				}else System.out.println("������ ��ȣ������ ������ϴ�.");
			}else System.out.println("��Ƽ�ɹ��� ���̻� �߰� �� �� �����ϴ�. ");
		}else System.out.println("������ ���� �������ּ��� ! ");
	}
	
	private void deletePartyMember() {
		if(this.partyMember != 0) {
			partyMemberList();
			System.out.print("�߹��� ��Ƽ���� �̸� �Է� : ");
			String name = sc.next();
			int idx = -1;
			for(int i=0; i<this.member.size(); i++) {
				if(this.member.get(i).getName().equals(name)) idx = i;
			}
			if(idx != -1) {
				if(this.member.get(idx).getParty() == true) {
					this.member.get(idx).setParty();
					this.partyMember--;
				}else System.out.println("�ش� ��Ƽ���� ��Ƽ�� ���ԵǾ����� �ʽ��ϴ�.");
			}else System.out.println("�߹��� ��Ƽ���� �̸��� �ٽ� Ȯ�����ּ��� . ");
		}else System.out.println("�߹��� ��Ƽ���� �������� �ʽ��ϴ� . ");
	}
}
