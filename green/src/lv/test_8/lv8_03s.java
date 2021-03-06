package lv.test_8;

import java.util.Scanner;

class MyArrayLists {
	private int size;
	private Integer list[];
	
		public boolean add(Integer x) {
			if(this.size == 0) {
				this.size ++;
				this.list = new Integer[this.size];
				this.list[this.size-1] = x;
			}else {
				Integer temp[] = this.list;
				this.size++;
				this.list = new Integer[this.size];
				for(int i=0; i<temp.length; i++) {
					this.list[i] = temp[i];
				}
				this.list[this.size-1] = x;
			}
			return true;
		}
		public void add(int idx , Integer x ) {
			if(this.size > 0 && idx >= 0 && idx < this.size) {
				Integer temp[] = this.list;
				this.size ++;
				this.list = new Integer[this.size];
				int y = 0;
				for(int i=0; i<this.size ;i++) {
					if(i != idx) {
						this.list[i] = temp[y];
						y++;
					}
				}
				this.list[idx] = x;
			}
		}
		public void remove(int idx) {
			if(this.size > 0 && idx >= 0 && idx < this.size) {
				Integer temp[] = this.list;
				this.size --;
				this.list = new Integer[this.size];
				int x = 0;
				for(int i=0; i<temp.length; i++) {
					if(i != idx) {
						this.list[x] = temp[i];
						x ++;
					}
				}
			}
		}
		public boolean remove(Integer x ) {
			int a = this.size;
			for(int i=0; i<a; i++) {
				if(this.list[i] == x) {
					this.size --;
				}
			}
			Integer temp[] = this.list;
			this.list = new Integer[this.size];
			int y = 0;
			for(int i=0; i<temp.length; i++) {
				if(temp[i] != x) {
					this.list[y] = temp[i];
					y++;
				}
			}
			return true;
		}
		public boolean set(int idx , Integer x ) {
			if(this.size > 0 && idx >=0 && idx < this.size) {
				this.list[idx] = x;
			}
			return true;
		}
		public Integer get(int idx) {
			if(this.size > 0 && idx >= 0 && idx < this.size) {
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

public class lv8_03s {

	public static void main(String[] args) {
		MyArrayLists arr = new MyArrayLists(); 
		Scanner sc = new Scanner(System.in);
		while(true) {
			arr.print();
			System.out.println("1.????\n2.????\n3.????(??????)\n4.????(??)\n5.????\n6.????\n7.????????");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("?????? ?? ???? : ");
				Integer x = sc.nextInt();
				arr.add(x);
			}
			if(sel == 2) {
				System.out.print("?????? ?????? ???? : ");
				int idx = sc.nextInt();
				System.out.print("?????? ?? ???? : ");
				Integer x = sc.nextInt();
				arr.add(idx, x);
			}
			if(sel == 3) {
				System.out.print("?????? ?????? ???? : ");
				int idx = sc.nextInt();
				arr.remove(idx);
			}
			if(sel == 4) {
				System.out.print("?????? ?? ????: ");
				Integer x = sc.nextInt(); 
				arr.remove(x);
			}
			if(sel == 5) {
				System.out.print("?????? ?????? ???? : ");
				int idx = sc.nextInt();
				System.out.print("?????? ?? ???? : ");
				Integer x = sc.nextInt();
				arr.set(idx, x);
			}
			if(sel == 6) {
				System.out.print("?????? ?????? ???? : ");
				int idx = sc.nextInt();
				arr.get(idx);
			}
			if(sel == 7) {
				System.out.println(arr.size());
			}
		}
		
	}
}