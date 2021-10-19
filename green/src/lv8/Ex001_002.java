package lv8;

import java.util.ArrayList;
import java.util.Scanner;

class MyArrayList {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> arr = new ArrayList<>();
	Integer nums[];
	int size;
	// add(추가)
	boolean add(Integer integer) {
		try {
			Integer temp[] = nums;
			nums = new Integer[this.size +1];
			if(this.size > 0) {
				for(int i=0; i<this.size; i++) {
					nums[i] = temp[i];
				}
			}
			nums[this.size] = integer;
			this.size ++;
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// add(삽입)
	void add(Integer idx , Integer x) {
		if(this.size != 0 ) {
			if(idx >= 0 && idx < this.size) {
				Integer temp[] = nums;
				this.size ++;
				nums = new Integer[this.size];
				this.nums[idx] = x;
				int y = 0;
				for(int i=0; i<this.size; i++) {
					if(i != idx ) {
						this.nums[i] = temp[y];
						y++;
					}
				}
				
			}else System.out.println("삽입할 인덱스의 범위가 잘못됐습니다. ");
		}else System.out.println("삽입할 공간이 없습니다 추가를 먼저 해주세요  .");
		
	}
	// remove
	void remove(int idx ) {
		if(this.size != 0) {
			if(idx >= 0 && idx < this.size) {
				Integer temp[] = nums;
				this.size --;
				nums = new Integer[this.size];
				int y = 0;
				for(int i=0; i<temp.length; i++) {
					if( i != idx ) {
						nums[y] = temp[i];
						y++;
					}
				}
				
			}else System.out.println("삭제할 인덱스의 범위를 다시 확인해주세요 . ");
			
		}else System.out.println("삭제할 데이터가 없습니다.");
	}
	// remove
	void remove(Integer x) {
		int check = 0;
		for(int i=0; i<this.nums.length; i++) {
			if(this.nums[i] == x) {
				check = 1;
				this.nums[i] = 0;
				this.size --;
			}
		}
		if(check == 1) {
			Integer temp[] = this.nums;
			this.nums = new Integer[this.size];
			int y = 0;
			for(int i=0; i<temp.length; i++) {
				if( temp[i] != 0) {
					this.nums[y] = temp[i];
					y++;
				}
			}
		}else {
			System.out.println("입력한 값을 찾을 수 없습니다.");
		}
	}
	// set
	void set(Integer idx , Integer x) {
		if(this.size != 0) {
			if(idx >= 0 && idx < this.size) {
				nums[idx] = x;
			}else System.out.println("인덱스의 범위를 다시 확인해주세요 . ");
			
		}else System.out.println("수정할 값이 없습니다.");
	}
	// size
	void size() {
		System.out.println("nums.size : " + this.nums.length);
		
	}
	void print() {
		if(this.size != 0) {
			for(int i=0; i<this.size; i++) {
				System.out.print(nums[i] + " ");
			}System.out.println();
		}
	}
	// ,,,
	
	
}
public class Ex001_002 {

	public static void main(String[] args) {
		// 나만의 ArrayList 구현
		// 1.추가 2.삭제 3.삽입 4.종료
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		MyArrayList list = new MyArrayList();
		
		while(true) {
			list.print();
			System.out.println("1.추가\n2.삽입\n3.삭제(인덱스)\n4.삭제(값)\n5.수정\n6.길이\n0.종료");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("추가값입력 : ");
				Integer x = sc.nextInt();
				list.add(x);
			}
			if(sel == 2) {
				System.out.print("삽입할 인덱스 입력 : ");
				Integer idx = sc.nextInt();
				System.out.print("삽입할 값 입력 : ");
				Integer x = sc.nextInt();
				list.add(idx, x);
			}
			if(sel == 3) {
				System.out.print("삭제할 인덱스 입력 : ");
				int idx = sc.nextInt();
				list.remove(idx);
			}
			if(sel == 4) {
				System.out.print("삭제할 값 입력 : ");
				Integer x = sc.nextInt();
				list.remove(x);
			}
			if(sel == 5) {
				System.out.print("수정할 인덱스 입력 : ");
				Integer idx = sc.nextInt();
				System.out.print("수정할 값 입력 : ");
				Integer x = sc.nextInt();
				list.set(idx, x);
			}
			if(sel == 6) {
				list.size();
			}
			if(sel == 0) {
				System.out.println("종료합니다");
				break;
			}
			
		}
		
		

	}

}
