package lv8;

import java.util.Scanner;

class Tv3 {
	String name;
	String brand;
	int price;

	Tv3(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public void print() {
		System.out.printf("%s %s %d\n",this.name , this.brand, this.price);
	}
	

}

class MyVector3 {
	private int size;
	private Tv3[] arr;
	
	// add()
	public boolean add(Tv3 tv) {
		try {
			Tv3[] temp = this.arr;
			arr = new Tv3[this.size +1];
			if(this.size > 0) {
				for(int i=0; i<this.size ;i++) {
					this.arr[i]= temp[i];
				}
			}
			this.arr[this.size]= tv;
			this.size ++;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	// add()
	public void add(int index , Tv3 tv) {
		Tv3 temp[] = this.arr;
		this.arr = new Tv3[this.size +1];
		for(int i=0; i<this.size; i++) {
			if(i < index) {
				this.arr[i] = temp[i];
			}
			else {
				this.arr[i+1] = temp[i];
			}
		}
		this.arr[index] = tv;
		this.size ++;
	}
	// remove()
	public void remove(int index) {
		Tv3 temp[] = this.arr;
		this.arr = new Tv3[this.size-1];
		int idx = 0;
		for(int i=0; i<this.size; i++) {
			if( i!= index) {
				this.arr[idx] = temp[i];
				idx ++;
			}
		}
		this.size --;
	}
	// remove()
	public void remove(Tv3 tv) {
		int index = -1;
		for(int i=0; i<this.size; i++) {
			if(this.arr[i].brand.equals(tv.brand) 
					&& this.arr[i].name.equals(tv.name)
					&& this.arr[i].price == tv.price) {
				index = i;
			}
		}
		if(index != -1) {
			Tv3 temp[] = this.arr;
			this.arr = new Tv3[this.size-1];
			int idx = 0;
			for(int i=0; i<this.size; i++) {
				if( i!= index) {
					this.arr[idx] = temp[i];
					idx ++;
				}
			}
			this.size --;
			
		}
	}
	// size()
	public int size() {
		return this.size;
	}
	// sort()
	public void sort() {
		for(int i=0; i<this.size; i++) {
			String first = this.arr[i].name;
			int idx = i;
			
			for(int j=i; j<this.size; j++) {
				if(first.compareTo(this.arr[j].name) > 0) {
					first = this.arr[j].name;
					idx = j;
				}
			}
			
			Tv3 temp = this.arr[i];
			this.arr[i] = this.arr[idx];
			this.arr[idx] = temp;
		}
	}
	// toStriong()
	@Override
	public String toString() {
		String str = "[";
		for(int i=0; i<this.size; i++) {
			str += this.arr[i].name + "/";
			str += this.arr[i].brand + " : ";
			str += this.arr[i].price;
			if(i <this.size -1) str+= ", ";
		}
		str += "]";
		return str;
	}
	
}

public class Ex001_004tc {

	public static void main(String[] args) {
		MyVector3 arr = new MyVector3();
		
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println(arr.size());
			System.out.println(arr.toString());
			
			System.out.println("1.추가\n2.삽입\n3.삭제(인덱스)\n4.삭제(값)\n5.정렬");
			System.out.print("선택 : ");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("Tv : ");
				String name = sc.next();
				System.out.print("brand : ");
				String brand = sc.next();
				System.out.print("price : ");
				int price = sc.nextInt();
				arr.add(new Tv3(name,brand,price));
			}
			if(sel == 2) {
				System.out.print("idx : ");
				int idx = sc.nextInt();
				System.out.print("Tv : ");
				String name = sc.next();
				System.out.print("brand : ");
				String brand = sc.next();
				System.out.print("price : ");
				int price = sc.nextInt();
				Tv3 a = new Tv3(name,brand,price);
				arr.add(idx, a);
			}
			if(sel == 3) {
				System.out.print("idx : ");
				int idx = sc.nextInt();
				arr.remove(idx);
			}
			if(sel == 4) {
				System.out.print("Tv : ");
				String name = sc.next();
				System.out.print("brand : ");
				String brand = sc.next();
				System.out.print("price : ");
				int price = sc.nextInt();
				Tv3 a = new Tv3(name,brand,price);
				arr.remove(a);
			}
			if(sel == 5) {
				arr.sort();
			}
			
			
		}
	}

}
