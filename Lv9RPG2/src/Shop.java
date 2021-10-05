import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
	private Scanner sc = new Scanner(System.in);
	public static Shop instance = new Shop();
	public static ArrayList<Item> itemList = new ArrayList<>();
	Inventory inventory = Inventory.instance;
	
	public void buyItem() {
		if(this.itemList.size() != 0) {
			shopList();
			System.out.print("������ �������� �̸��� �Է����ּ���. ");
			String name = sc.next();
			int idx = -1;
			for(int i=0; i<this.itemList.size(); i++) {
				if(this.itemList.get(i).getName().equals(name)) idx = i;
			}
			if(idx != -1) {
				if(this.itemList.get(idx).getPrice() <= Player.money) {
					String kind2 = this.itemList.get(idx).getKind();
					String name2 = this.itemList.get(idx).getName();
					int power = this.itemList.get(idx).getPower();
					int price = this.itemList.get(idx).getPrice();
					Item temp = new Item(kind2 , name2 , power , price);
					this.inventory.itemList.add(temp);	
					
					Player.money -= this.itemList.get(idx).getPrice();
				}else System.out.println("�����Ӵϰ� �����մϴ�.");
			}else System.out.println("������ �������� �̸��� ��Ȯ�� �Է����ּ��� . ");
		}else System.out.println("������ �������� �������� �ʽ��ϴ� .�������� ���� �߰����ּ��� . ");
	}
	
	public void sellItem() {
		if(this.inventory.itemList.size() != 0) {
			inventoryList();
			System.out.print("�Ǹ��� �������� �̸��� �Է����ּ��� . ");
			String name = sc.next();
			int idx = -1;
			for(int i=0; i<this.inventory.itemList.size(); i++) {
				if(this.inventory.itemList.get(i).getName().equals(name)) idx = i;
			}
			if(idx != -1) {
				if(this.inventory.itemList.get(idx).getUse() == false) {
					Player.money += this.inventory.itemList.get(idx).getPrice()/2;
					this.inventory.itemList.remove(idx);					
				}else System.out.println("�������� �������� �Ǹ��� �� �����ϴ�.");
			}else System.out.println("�Ǹ��� �������� �̸��� ��Ȯ�� �Է����ּ��� . ");
		}else System.out.println("�Ǹ��� �������� �������� �ʽ��ϴ�.");
	}
	
	public void addItem() {
		
		System.out.println("�߰��� �������� ������ �������ּ���.");
		System.out.println("1.[����]\t2.[��]\t3.[��ű�]");
		String kind = "";
		int selKind = sc.nextInt();
		if(selKind >= 1 && selKind <= 3) {
			if(selKind == 1) {
				kind = "����";
			}else if (selKind == 2) {
				kind = "��";
			}else kind = "��ű�";
			System.out.print("�߰��� �������� �̸��� �Է����ּ��� .");
			String name = sc.next();
			int check = 0;
			for(int i=0; i<this.itemList.size(); i++) {
				if(this.itemList.get(i).getName().equals(name)) check = 1;
			}
			if(check == 0) {
				System.out.println("������ �Ŀ���ġ \t> ���ݷ� ���� ");
				System.out.println("���� �Ŀ���ġ \t> ���� ����");
				System.out.println("��ű��� �Ŀ���ġ \t> ü���߰�");
				System.out.print("�߰��� �������� �Ŀ��� �Է����ּ��� . ");
				int power = sc.nextInt();
				System.out.print("�߰��� �������� ������ �Է����ּ��� . ");
				int price = sc.nextInt();
				this.itemList.add(new Item(kind , name , power , price));
				sort();
				sort();
				sort();
			}else System.out.println("�ش� �������� �̸��� �̹� �����մϴ�. ");
		}else System.out.println("������ ������ ������ϴ�.");
	}
	public void delItem() {
		if(this.itemList.size() != 0 ) {
			shopList();			
			System.out.print("������ �������� �̸��� �Է� : ");
			String name = sc.next();
			int idx = -1;
			for(int i=0; i<this.itemList.size(); i++) {
				if(this.itemList.get(i).getName().equals(name)) idx = i;
			}
			if(idx != -1) {
				this.itemList.remove(idx);
				sort();
			}else System.out.println("������ �������� �̸��� �ٽ� Ȯ�����ּ���.  ");
		}else System.out.println("������ �������� �����ϴ�.");
	}
	
	public void shopList() {
		System.out.println("------------����-------------");
		System.out.println("����\t�̸�\t�Ŀ�\t����");
		for(int i=0; i<this.itemList.size(); i++) {
			
			System.out.print(this.itemList.get(i).getKind()+"\t"+this.itemList.get(i).getName()+"\t"
					+this.itemList.get(i).getPower()+"\t"+this.itemList.get(i).getPrice()+"\n");
		}
		System.out.println("----------------------------");
	}
	public void inventoryList() {
		System.out.println("=============�κ��丮===========");
		System.out.println("��ȣ\t����\t�̸�\t�Ŀ�\t����\t����/������\t��������");
		for(int i=0; i<this.inventory.itemList.size(); i++) {
			System.out.print("["+(i+1)+"]\t" +this.inventory.itemList.get(i).getKind()+"\t"+this.inventory.itemList.get(i).getName()+"\t"
					+this.inventory.itemList.get(i).getPower()+"\t"+this.inventory.itemList.get(i).getPrice()
					+"\t"+this.inventory.itemList.get(i).getUse()+"\t"+this.inventory.itemList.get(i).getUserName()+"\n");
		}
		System.out.println("================================");
	}
	
	public void sort() {
		for(int i=0; i<this.itemList.size(); i++) {
			for(int j=0; j<this.itemList.size(); j++) {
				if( i != j && this.itemList.get(i).getKind().compareTo(this.itemList.get(j).getKind()) < 0) {
					Item temp = this.itemList.get(i);
					this.itemList.set(i, this.itemList.get(j));
					this.itemList.set(j, temp);
				}
			}
		}
		for(int i=0; i<this.itemList.size(); i++) {
			for(int j=0; j<this.itemList.size(); j++) {
				if( i != j && this.itemList.get(i).getKind().equals(this.itemList.get(j).getKind()) && this.itemList.get(i).getPower() <  this.itemList.get(j).getPower()) {
					Item temp = this.itemList.get(i);
					this.itemList.set(i, this.itemList.get(j));
					this.itemList.set(j, temp);
				}
			}
		}
	}
	
}
