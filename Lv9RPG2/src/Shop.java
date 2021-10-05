import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
	private Scanner sc = new Scanner(System.in);
	ArrayList<Item> itemList = new ArrayList<>();
	private Inventory inventory = Inventory.instance;
	public void buyItem() {
		if(this.itemList.size() != 0) {
			itemList();
			System.out.print("������ �������� �̸��� �Է����ּ���. ");
			String name = sc.next();
			int idx = -1;
			for(int i=0; i<this.itemList.size(); i++) {
				if(this.itemList.get(i).equals(name)) idx = i;
			}
			if(idx != -1) {
				
				Item temp = this.itemList.get(idx);
				this.inventory.itemList.add(temp);
			}else System.out.println("������ �������� �̸��� ��Ȯ�� �Է����ּ��� . ");
		}else System.out.println("������ �������� �������� �ʽ��ϴ� .�������� ���� �߰����ּ��� . ");
	}
	public void sellItem() {
		itemList();
	
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
				System.out.print("�߰��� �������� �Ŀ��� �Է����ּ��� . ");
				int power = sc.nextInt();
				System.out.print("�߰��� �������� ������ �Է����ּ��� . ");
				int price = sc.nextInt();
				this.itemList.add(new Item(kind , name , power , price));
			}else System.out.println("�ش� �������� �̸��� �̹� �����մϴ�. ");
		}else System.out.println("������ ������ ������ϴ�.");
	}
	public void delItem() {
		itemList();
	}
	
	public void itemList() {
		System.out.println("----------����-------------");
		System.out.println("����\t�̸�\t�Ŀ�\t����");
		for(int i=0; i<this.itemList.size(); i++) {
			
			System.out.print(this.itemList.get(i).getKind()+"\t"+this.itemList.get(i).getName()+"\t"
					+this.itemList.get(i).getPower()+"\t"+this.itemList.get(i).getPrice()+"\n");
		}
		System.out.println("----------------------------");
	}
	
}
