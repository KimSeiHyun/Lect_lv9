package lv8;

import java.util.Scanner;



class MyVector {
	Scanner sc = new Scanner(System.in);
	int size;
	Tv2[] arr;
	String nameTemp[];
	String brandTemp[];
	int priceTemp[];
	String name;
	String brand;
	int price;
	
	void tempSet() {
		this.nameTemp = new String[this.size];
		this.brandTemp = new String[this.size];
		this.priceTemp = new int[this.size];
		for(int i=0; i<this.size; i++) {
			this.nameTemp[i] = this.arr[i].name;
			this.brandTemp[i] = this.arr[i].brand;
			this.priceTemp[i] = this.arr[i].price;
		}
	}
	
	void inputSet() {
		System.out.print("Tv�� �̸� �Է� : ");
		this.name = sc.next();
		System.out.print("Tv�� �귣�� �Է� : ");
		this.brand = sc.next();
		System.out.print("Tv�� ���� �Է� : ");
		this.price = sc.nextInt();
	}
	

	public void add() {
		inputSet();
		Tv2 a = new Tv2(this.name,this.brand,this.price);
		if(this.size == 0) {
			this.size ++;
			this.arr = new Tv2[this.size];
			this.arr[this.size-1] = a;
		}
		else {
			tempSet();
			this.size ++;
			this.arr = new Tv2[this.size];
			this.arr[this.size-1] = a;
			for(int i=0; i<this.size-1; i++) {
				Tv2 b = new Tv2(this.nameTemp[i],this.brandTemp[i],this.priceTemp[i]);
				this.arr[i] = b;
			}
		}
	}
	
	public void insert() {
		if(this.size != 0 ) {
			System.out.print("������ �ε��� �Է� : ");
			int idx = sc.nextInt();
			if(idx >=0 && idx < this.size) {
				inputSet();
				Tv2 a = new Tv2(this.name,this.brand,this.price);
				tempSet();
				this.size ++;
				this.arr = new Tv2[this.size];
				this.arr[idx] = a;
				
				int x = 0;
				for(int i=0; i<this.size; i++) {
					if(i != idx) {
						Tv2 b = new Tv2(this.nameTemp[x],this.brandTemp[x],this.priceTemp[x]);
						this.arr[i] = b;
						x++;
					}
				}
				
			}else System.out.println("�ε����� ������ �ٽ� Ȯ�����ּ��� . ");
			
		}else System.out.println("������ �߰��� ���� ���ּ��� . ");
	}
	
	public void removeIndex() {
		if(this.size != 0) {
			System.out.print("������ �ε��� �Է� : ");
			int idx = sc.nextInt();
			if(idx >= 0 && idx < this.size ) {
				tempSet();
				this.size --;
				this.arr = new Tv2[this.size];
				int x = 0;
				for(int i=0; i<this.size +1 ;i ++) {
					Tv2 b = new Tv2(this.nameTemp[i],this.brandTemp[i],this.priceTemp[i]);
					if(i != idx ) {
						this.arr[x] = b;
						x++;
					}
 				}
				
			}else System.out.println("�ε����� ������ �ٽ� Ȯ�����ּ��� .");
			
		}else System.out.println("������ �����Ͱ� �����ϴ�.");
	}
	public void removeValue() {
		if(this.size != 0) {
			System.out.println("������ ������ �Է����ּ��� . ");
			inputSet();
			int check = 0;
			for(int i=0; i<this.size ;i++) {
				if(this.arr[i].name.equals(this.name) && this.arr[i].brand.equals(this.brand)&&
						this.arr[i].price == this.price) {
					this.arr[i].price = -1;
					check ++;
				}
			}
			if(check != 0) {
				tempSet();
				this.size -= check;
				arr  = new Tv2[this.size];
				int x = 0;
				for(int i=0; i<this.nameTemp.length; i++) {
					Tv2 b = new Tv2(this.nameTemp[i],this.brandTemp[i],this.priceTemp[i]);
					if(this.priceTemp[i] != -1) {
						arr[x] = b;
						x++;
					}
				}
				
			}else System.out.println("������ ������ �ٽ� Ȯ�����ּ��� .");
			
		}else System.out.println("������ �����Ͱ� �����ϴ�.");
	}
	
	public void set() {
		if(this.size != 0 ) {
			System.out.print("������ �ε��� �Է� : ");
			int idx = sc.nextInt();
			if(idx >=0 && idx < this.size) {
				System.out.println("������ ������ �Է�");
				inputSet();
				this.arr[idx].name = this.name;
				this.arr[idx].brand = this.brand;
				this.arr[idx].price = this.price;
				
			}else System.out.println("�ε����� ������ �ٽ� Ȯ�����ּ���  ");
			
		}else System.out.println("�����͸� ���� �߰����ּ��� .");
	}
	//compareto ���ϴ� �տ����� �� �������ڸ� -
	//          ���ϴ� �տ����� �� �������ڸ� +���� ���� . 
	
	public void nameSort() {
		for(int i=0; i<this.size; i++) {
			for(int j=i; j<this.size; j++) {
				if(i != j && this.arr[i].name.compareTo(this.arr[j].name) >0) {
					String nTemp = this.arr[i].name;
					String bTemp = this.arr[i].brand;
					int pTemp = this.arr[i].price;
					
					this.arr[i].name = this.arr[j].name;
					this.arr[i].brand = this.arr[j].brand;
					this.arr[i].price = this.arr[j].price;
					
					this.arr[j].name = nTemp;
					this.arr[j].brand = bTemp;
					this.arr[j].price = pTemp;
					
				}
			}
		}
	}
	
	public void brandSort() {
		for(int i=0; i<this.size; i++) {
			for(int j=i; j<this.size; j++) {
				if(i != j && this.arr[i].brand.compareTo(this.arr[j].brand) >0) {
					String nTemp = this.arr[i].name;
					String bTemp = this.arr[i].brand;
					int pTemp = this.arr[i].price;
					
					this.arr[i].name = this.arr[j].name;
					this.arr[i].brand = this.arr[j].brand;
					this.arr[i].price = this.arr[j].price;
					
					this.arr[j].name = nTemp;
					this.arr[j].brand = bTemp;
					this.arr[j].price = pTemp;
					
				}
			}
		}
	}
	
	public void priceSort() {
		for(int i=0; i<this.size; i++) {
			for(int j=i; j<this.size; j++) {
				if(i != j && this.arr[i].price > this.arr[j].price) {
					String nTemp = this.arr[i].name;
					String bTemp = this.arr[i].brand;
					int pTemp = this.arr[i].price;
					
					this.arr[i].name = this.arr[j].name;
					this.arr[i].brand = this.arr[j].brand;
					this.arr[i].price = this.arr[j].price;
					
					this.arr[j].name = nTemp;
					this.arr[j].brand = bTemp;
					this.arr[j].price = pTemp;
					
				}
			}
		}
	}

}
class Tv2 {
	String name;
	String brand;
	int price;

	Tv2(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public void print() {
		System.out.printf("%s %s %d\n",this.name , this.brand, this.price);
	}
	

}

public class Ex001_004 {

	public static void main(String[] args) {
		MyVector arr = new MyVector();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("this.size" +arr.size);
			for(int i=0; i<arr.size; i++) {
				arr.arr[i].print();
			}
			System.out.println("1.�߰�\n2.����\n3.����(�ε���)\n4.����(��)\n5.����\n6.����\n0.����");
			int sel = sc.nextInt();
			if (sel == 1) {
				arr.add();
			}
			if (sel == 2) {
				arr.insert();
			}
			if (sel == 3) {
				arr.removeIndex();
			}
			if (sel == 4) {
				arr.removeValue();
			}
			if (sel == 5) {
				arr.set();
			}
			if (sel == 6) {
				System.out.println("1.�̸������� ����\n2.�귣������� ����\n3.���ݼ����� ����");
				int sel2 = sc.nextInt();
				if(sel2 == 1) {
					arr.nameSort();
				}
				if(sel2 == 2) {
					arr.brandSort();
				}
				if(sel2 == 3) {
					arr.priceSort();
				}
			}
			if (sel == 0) {
				System.out.println("�����մϴ�");
				break;
			}
			
		}

	}

}
