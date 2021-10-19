package lv8;

import java.util.Scanner;

class MyVector5<T> {
	private int size;
	private Tv5[] arr;
	
	//add()
	public boolean add(Tv5 tv) {
		try {
			if(this.size == 0) {
				this.size ++;
				arr = new Tv5[this.size];
				arr[this.size-1] = tv;
			}else {
				Tv5 temp[] = arr;
				this.size ++;
				arr = new Tv5[this.size];
				for(int i=0; i<temp.length; i++) {
					arr[i] = temp[i];
				}
				arr[this.size-1] = tv;
			}
			return true;
		} catch (Exception e) {
			return false;			
		}
	}
	//add()
	public boolean add(T idx , Tv5 tv) {
		try {
			if(this.size != 0) {
				if((int)idx >=0 && (int)idx < this.size) {
					Tv5 temp[] = arr;
					this.size ++;
					arr = new Tv5[this.size];
					int x = 0;
					for(int i=0; i<this.size; i++) {
						if(i != (int)idx) {
							arr[i] = temp[x];
							x++;
						}
					}
					arr[(int)idx] = tv;
				}else System.out.println("인덱스의 범위를 확인해주세요 .");
				
			}else System.out.println("데이터 추가를 먼저 해주세요.");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	//remove()
	public void remove(T idx) {
		if(this.size != 0) {
			if((int)idx >= 0 && (int)idx < this.size ) {
				Tv5 temp[] = arr;
				this.size --;
				arr = new Tv5[this.size];
				int x = 0;
				for(int i=0; i<temp.length;i ++) {
					if(i != (int)idx) {
						arr[x] = temp[i];
						x++;
					}
				}
				 
			}
			
		}else System.out.println("데이터를 먼저 추가해주세요 ");
	}
	//remove()
	public void remove(Tv5 tv) {
		if(this.size !=0 ) {
			int check = 0;
			for(int i=0; i<this.size; i++) {
				if(this.arr[i].name.equals(tv.name) && this.arr[i].brand.equals(tv.brand)
						&& this.arr[i].price == tv.price) {
					this.arr[i].name = null;
					check ++;
				}
			}
			Tv5 temp[] = arr;
			this.size -= check;
			arr = new Tv5[this.size];
			int x = 0;
			for(int i=0; i<temp.length; i++) {
				if(temp[i].name != null) {
					arr[x] = temp[i];
					x++;
				}
			}
			
		}else System.out.println("데이터를 먼저 추가해주세요 . ");
	}
	//set()
	public void set(T idx , Tv5 tv) {
		if(this.size != 0) {
			arr[(int)idx] = tv;
			
		}else System.out.println("데이터 추가를 먼저 해주세요 .");
	}
	//sort()
	public void nameSort() {
		for(int i=0; i<this.size; i++) {
			for(int j=i; j<this.size; j++) {
				if(j != i && this.arr[i].name.compareTo(this.arr[j].name) > 0) {
					String nameTemp = this.arr[i].name;
					String brandTemp = this.arr[i].brand;
					int priceTemp = this.arr[i].price;
					
					this.arr[i].name = this.arr[j].name; 
					this.arr[i].brand = this.arr[j].brand; 
					this.arr[i].price = this.arr[j].price;
					
					this.arr[j].name = nameTemp;
					this.arr[j].brand = brandTemp;
					this.arr[j].price = priceTemp;
					
				}
			}
		}
	}
	public void brandSort() {
		for(int i=0; i<this.size; i++) {
			for(int j=i; j<this.size; j++) {
				if(j != i && this.arr[i].brand.compareTo(this.arr[j].brand) > 0) {
					String nameTemp = this.arr[i].name;
					String brandTemp = this.arr[i].brand;
					int priceTemp = this.arr[i].price;
					
					this.arr[i].name = this.arr[j].name; 
					this.arr[i].brand = this.arr[j].brand; 
					this.arr[i].price = this.arr[j].price;
					
					this.arr[j].name = nameTemp;
					this.arr[j].brand = brandTemp;
					this.arr[j].price = priceTemp;
					
				}
			}
		}
	}
	public void priceSort() {
		for(int i=0; i<this.size; i++) {
			for(int j=i; j<this.size; j++) {
				if(j != i && this.arr[i].price > this.arr[j].price) {
					String nameTemp = this.arr[i].name;
					String brandTemp = this.arr[i].brand;
					int priceTemp = this.arr[i].price;
					
					this.arr[i].name = this.arr[j].name; 
					this.arr[i].brand = this.arr[j].brand; 
					this.arr[i].price = this.arr[j].price;
					
					this.arr[j].name = nameTemp;
					this.arr[j].brand = brandTemp;
					this.arr[j].price = priceTemp;
					
				}
			}
		}
	}
	
	public int getSize() {
		return this.size;
	}
	public void print() {
		for(int i=0; i<this.size; i++) {
			arr[i].print();
		}
	}
	
}

class Tv5 {
	String name;
	String brand;
	int price;

	Tv5(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public void print() {
		System.out.printf("%s %s %d\n",this.name , this.brand, this.price);
	}
	

}

public class Ex001_004v2 {

	public static void main(String[] args) {
		MyVector5<Integer> mv = new MyVector5<>();
		Scanner sc= new Scanner(System.in);
		while(true) {
			mv.print();
			System.out.println("1.추가\n2.삽입\n3.삭제(인덱스)\n4.삭제(값)\n5.수정\n6.이름정렬\n7.브랜드정렬\n8.가격정렬");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("브랜드 입력 : ");
				String brand = sc.next();
				System.out.print("가격 입력 : ");
				int price = sc.nextInt();
				Tv5 a = new Tv5(name,brand,price);
				mv.add(a);
			}
			if(sel == 2) {
				System.out.print("삽입할 인덱스 입력 : ");
				int idx = sc.nextInt();
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("브랜드 입력 : ");
				String brand = sc.next();
				System.out.print("가격 입력 : ");
				int price = sc.nextInt();
				Tv5 a = new Tv5(name,brand,price);
				mv.add(idx, a);
			}
			if(sel == 3) {
				System.out.print("삭제할 인덱스 입력 : ");
				int idx = sc.nextInt();
				mv.remove(idx);
			}
			if(sel == 4) {
				System.out.println("삭제할 값들을 입력");
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("브랜드 입력 : ");
				String brand = sc.next();
				System.out.print("가격 입력 : ");
				int price = sc.nextInt();
				Tv5 a = new Tv5(name,brand,price);
				mv.remove(a);
			}
			if(sel == 5) {
				System.out.print("수정할 인덱스 입력 : ");
				int idx = sc.nextInt();
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("브랜드 입력 : ");
				String brand = sc.next();
				System.out.print("가격 입력 : ");
				int price = sc.nextInt();
				Tv5 a = new Tv5(name,brand,price);
				mv.set(idx, a);
			}
			if(sel == 6) {
				mv.nameSort();
			}
			if(sel == 7) {
				mv.brandSort();
			}
			if(sel == 8) {
				mv.priceSort();
			}

		}
		
	}

}
