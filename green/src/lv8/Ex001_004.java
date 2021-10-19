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
		System.out.print("Tv의 이름 입력 : ");
		this.name = sc.next();
		System.out.print("Tv의 브랜드 입력 : ");
		this.brand = sc.next();
		System.out.print("Tv의 가격 입력 : ");
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
			System.out.print("삽입할 인덱스 입력 : ");
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
				
			}else System.out.println("인덱스의 범위를 다시 확인해주세요 . ");
			
		}else System.out.println("데이터 추가를 먼저 해주세요 . ");
	}
	
	public void removeIndex() {
		if(this.size != 0) {
			System.out.print("삭제할 인덱스 입력 : ");
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
				
			}else System.out.println("인덱스의 범위를 다시 확인해주세요 .");
			
		}else System.out.println("삭제할 데이터가 없습니다.");
	}
	public void removeValue() {
		if(this.size != 0) {
			System.out.println("삭제할 값들을 입력해주세요 . ");
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
				
			}else System.out.println("삭제할 값들을 다시 확인해주세요 .");
			
		}else System.out.println("삭제할 데이터가 없습니다.");
	}
	
	public void set() {
		if(this.size != 0 ) {
			System.out.print("수정할 인덱스 입력 : ");
			int idx = sc.nextInt();
			if(idx >=0 && idx < this.size) {
				System.out.println("수정할 값들을 입력");
				inputSet();
				this.arr[idx].name = this.name;
				this.arr[idx].brand = this.brand;
				this.arr[idx].price = this.price;
				
			}else System.out.println("인덱스의 범위를 다시 확인해주세요  ");
			
		}else System.out.println("데이터를 먼저 추가해주세요 .");
	}
	//compareto 비교하는 앞에수가 더 빠른문자면 -
	//          비교하는 앞에수가 더 느린문자면 +값이 나옴 . 
	
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
			System.out.println("1.추가\n2.삽입\n3.삭제(인덱스)\n4.삭제(값)\n5.수정\n6.정렬\n0.종료");
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
				System.out.println("1.이름순으로 정렬\n2.브랜드순으로 정렬\n3.가격순으로 정렬");
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
				System.out.println("종료합니다");
				break;
			}
			
		}

	}

}
