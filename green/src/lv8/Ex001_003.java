package lv8;

import java.util.Scanner;
import java.util.Vector;

class Tv {
	String name;
	String brand;
	int price;

	Tv(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public void print() {
		System.out.printf("%s %s %d\n",this.name , this.brand, this.price);
	}
	

}

	

public class Ex001_003 {

	public static void main(String[] args) {
		Vector<Tv> arr = new Vector<Tv>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			for(Tv e : arr) {
				e.print();
			}
			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("3.����(�ε���)");
			System.out.println("4.����(��)");
			System.out.println("5.����");
			System.out.println("6.����ȸ(�ε���)");
			System.out.println("7.ũ�����");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("�߰��� Ƽ�� �̸� �Է� : ");
				String name = sc.next();
				System.out.print("�߰��� �귣�� �Է� : ");
				String brand = sc.next();
				System.out.print("�߰��� ���� �Է� : ");
				int price = sc.nextInt();
				Tv a = new Tv(name,brand,price);
				arr.add(a);
				
			}
			if(sel == 2) {
				if(arr.size() != 0) {
					System.out.print("������ �ε��� �Է� : ");
					int idx = sc.nextInt();
					if(idx >= 0 && idx <= arr.size()) {
						System.out.print("�߰��� Ƽ�� �̸� �Է� : ");
						String name = sc.next();
						System.out.print("�߰��� �귣�� �Է� : ");
						String brand = sc.next();
						System.out.print("�߰��� ���� �Է� : ");
						int price = sc.nextInt();
						Tv a = new Tv(name,brand,price);
						arr.add(idx, a);
					}else System.out.println("�ε��� ������ Ȯ�����ּ��� ");
				}else System.out.println("������ �߰��� ���� ���ּ��� ");
			}
			if(sel == 3) {
				if(arr.size() != 0) {
					System.out.print("������ �ε��� �Է� : ");
					int idx = sc.nextInt();
					if(idx >= 0 && idx <= arr.size()) {
						arr.remove(idx);
					}else System.out.println("�ε��� ������ Ȯ�����ּ���.");
				}else System.out.println("������ �����Ͱ� �����ϴ� .");
			}
			if(sel == 4) {
				if(arr.size() != 0) {
					System.out.println("������ �������� �������� �Է����ּ��� . ");
					System.out.print("�̸� �Է� : ");
					String name = sc.next();
					System.out.print("�귣�� �Է� : ");
					String brand = sc.next();
					System.out.print("���� �Է� : ");
					int price = sc.nextInt();
					int idx = -1;
					for(int i=0; i<arr.size(); i++) {
						if(arr.get(i).name.equals(name) && arr.get(i).brand.equals(brand) 
								&& arr.get(i).price == price) {
									idx = i;
								}
					}
					if(idx != -1) {
//						Tv a = new Tv(name,brand,price); 
//						�ּҰ��� ���ϰ��ֱ� ������ �ش簪���� ����ã�Ƽ� �ּҸ� �̾�޾ƾ��� .  
						Tv a = arr.get(idx);
						arr.remove(a);
						
					}else System.out.println("��ġ�ϴ� �����Ͱ� �����ϴ�.");
				}else System.out.println("������ �����Ͱ� �����ϴ�.");
			}
			if(sel == 5) {
				if(arr.size() != 0) {
					System.out.print("������ �ε��� �Է� : ");
					int idx = sc.nextInt();
					if(idx >= 0 && idx <arr.size()) {
						System.out.print("������ Ƽ�� �̸� �Է� : ");
						String name = sc.next();
						System.out.print("������ �귣�� �Է� : ");
						String brand = sc.next();
						System.out.print("������ ���� �Է� : ");
						int price = sc.nextInt();
						Tv a = new Tv(name,brand,price);
						arr.set(idx, a);
							
					}else System.out.println("�ε��� ������ Ȯ�����ּ��� .");
				}else System.out.println("������ �����Ͱ� �����ϴ�.");
			}
			if(sel == 6) {
				if(arr.size() != 0) {
					System.out.print("��ȸ�� �ε��� �Է� : ");
					int idx = sc.nextInt();
					if(idx >=0 &&  idx < arr.size()) {
						
							arr.get(idx).print();
							System.out.println();
					}else System.out.println("�ε��� ������ Ȯ�����ּ��� . ");
				}else System.out.println("������ �߰��� ���� ���ּ��� . ");
			}
			if(sel == 7) {
				System.out.println("ũ�� : " +arr.size());
			}
		}
	}

}
