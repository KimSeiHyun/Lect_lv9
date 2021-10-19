package lv8.test;

import java.util.Scanner;

//시작 10:30
//종료 10:54
//소요 00:24

class MyArrayList {
	private int size;
	private Integer list[];
	
	public boolean add(Integer x) {
		Integer temp[] = this.list;
		this.size ++;
		this.list = new Integer[this.size];
		if(temp != null) {
			for(int i=0; i<temp.length; i++) {
				this.list[i] = temp[i];
			}
			
		}
		this.list[this.size-1] = x;
		return true;
	}
	public void add(int idx , Integer x) {
		if(this.size != 0 && idx >= 0 && idx < this.size) {
			Integer temp[] = this.list;
			this.size ++;
			this.list = new Integer[this.size];
			
			int y = 0;
			for(int i=0; i<this.size; i++) {
				if(i != idx) {
					this.list[i] = temp[y];
					y++;
				}
			}
			this.list[idx] = x;
		}
		
	}
	public void remove(int idx ) {
		if(this.size != 0 && idx >= 0 && idx < this.size) {
			Integer temp[] = this.list;
			this.size --;
			this.list = new Integer[this.size];
			
			int y = 0;
			for(int i=0; i<temp.length; i++) {
				if(i != idx ) {
					this.list[y] = temp[i];
					y++;
				}
			}
		}
		
	}
	public boolean remove(Integer x) {
		int size = this.size;
		for(int i=0; i<size; i++) {
			if(this.list[i] == x) this.size --;
		}
		
		Integer temp[] = this.list;
		int y = 0;
		this.list = new Integer[this.size];
		for(int i=0; i<temp.length; i++) {
			if(temp[i] != x ) {
				this.list[y] = temp[i];
				y++;
			}
		}
		return true;
	}
	public boolean set(int idx , Integer x ) {
		if(this.size != 0 && idx >=0 && idx < this.size) {
			this.list[idx] = x;
		}
		return true;
	}
	public Integer get(int idx) {
		if(this.size != 0 && idx >=0 && idx < this.size) {
			return this.list[idx];
		}
		return null;
	}
	
	
		public int size() {
			return this.size;
		}
	
	
	public void print() {
		for(int i=0; i<this.size; i++) {
			System.out.println(this.list[i]);
		}
	}
}

public class test003 {

	public static void main(String[] args) {
		MyArrayList arr = new MyArrayList(); 
		Scanner sc = new Scanner(System.in);
		while(true) {
			arr.print();
			System.out.println("1.추가\n2.삽입\n3.삭제(인덱스)\n4.삭제(값)\n5.수정\n6.원하는인덱스출력\n7.크기출력");
			int sel =  sc.nextInt();
			if(sel == 1) {
				System.out.print("추가할 값 입력 : ");
				Integer x = sc.nextInt();
				arr.add(x);
			}
			if(sel == 2) {
				System.out.print("삽입할 인덱스 입력 : ");
				int idx = sc.nextInt();
				System.out.print("삽입할 값 입력 : ");
				Integer x = sc.nextInt();
				arr.add(idx, x);
			}
			if(sel == 3) {
				System.out.print("삭제할 인덱스 입력 : ");
				int idx = sc.nextInt();
				arr.remove(idx);
			}
			if(sel == 4) {
				System.out.print("삭제할 값 입력 : ");
				Integer x = sc.nextInt();
				arr.remove(x);
			}
			if(sel == 5) {
				System.out.print("수정할 인덱스 입력 : ");
				int idx = sc.nextInt();
				System.out.print("수정할 값 입력 : ");
				Integer x = sc.nextInt();
				arr.set(idx, x);
			}
			if(sel == 6) {
				System.out.print("출력할 인덱스 입력 : " );
				int idx = sc.nextInt();
				arr.get(idx);
			}
			if(sel == 7) {
				System.out.println(arr.size());
			}
		}
		
	}
}