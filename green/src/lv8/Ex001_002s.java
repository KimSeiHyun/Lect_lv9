package lv8;

import java.util.Scanner;

class MyArrayList2<T> { // 제네릭 클래스
	int size;
	Object list[]; // 최상위 클래스 Object
	
	public void add(T element) {
		Object temp[] = this.list;
		list = new Object[this.size +1];
		if(this.size > 0) {
			for(int i=0; i<this.size; i++)
				list[i] = temp[i];	
		}
		list[this.size] = element;
		this.size ++;
	}

	public void add(T idx, T x) {
		if(this.size != 0 ) {
			if((int)idx >= 0 && (int)idx < this.size ) {
				Object temp[] = list;
				this.size ++;
				list = new Object[this.size];
				int y = 0 ;
				for(int i=0; i<this.size; i++) {
					if((int)idx != i) {
						list[i] = temp[y];
						y++;
					}
				}
				list[(int)idx] = x;
				
			}else System.out.println("인덱스의 범위를 다시 확인해주세요");
			
		}else System.out.println("데이터 추가를 먼저 해주세요 .");
	}
	
	public void remove(T idx) {
		if(this.size !=0 ) {
			if((int)idx >= 0 && (int)idx < this.size) {
				Object temp[] = list;
				this.size --;
				list = new Object[this.size];
				int y = 0;
				for(int i=0; i<temp.length; i++) {
					if((int)idx != i) {
						list[y] = temp[i];
						y++;
					}
				}
				
			}else System.out.println("인덱스의 범위를 다시 확인해주세요 . ");
			
		}else System.out.println("삭제할 데이터가 없습니다.");
	}
	
	public void remove(int x ) {
		if(this.size != 0) {
			int check = 0;
			for(int i=0; i<list.length; i++) {
				if(x == (int)list[i]) {
					check = 1;
					list[i] = null;
					this.size--;
				}
			}
			if(check == 1) {
				Object temp[] = list;
				list = new Object[this.size];
				int y = 0;
				for(int i=0; i<temp.length; i++) {
					if(temp[i] != null) {
						list[y] = temp[i];
						y++;
					}
				}
				
			}else System.out.println("삭제할 값을 찾지 못했습니다 . ");
			
		}else System.out.println("삭제할 값이 없습니다.");
	}
	
	public void set(T idx , T x) {
		if(this.size != 0) {
			if((int)idx >= 0 && (int)idx < this.size) {
				list[(int)idx] = x;
			}else System.out.println("인덱스값이 범위를 벗어났습니다 .");
		}else System.out.println("데이터를 먼저 추가해주세요 .");
	}
	
	public void size() {
		System.out.println("size  :" + this.size);
	}
	@Override
	public String toString() {
		String str = "";
		for(int i=0; i<this.size; i++) 
			str += String.valueOf(list[i]) + " ";
		return str;

	}

}

public class Ex001_002s {

	public static void main(String[] args) {
		MyArrayList2<Integer> arr = new MyArrayList2<>(); 
		int abcd = 30;
		arr.add((Integer)abcd);
		arr.add(abcd);
		arr.add((Integer)30);
		


		System.out.println(arr.toString());
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println(arr.toString());
			System.out.println("1.추가\n2.삽입\n3.삭제(인덱스)\n4.삭제(값)\n5.수정\n6.길이\n0.종료");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("추가할 값 입력 : ");
				Integer x = sc.nextInt();
				arr.add(x);
			}
			if(sel == 2) {
				System.out.print("삽입할 인덱스 입력 : ");
				int idx = sc.nextInt();
				System.out.print("삽입할 값 입력 : ");
				int x = sc.nextInt();
				arr.add((Integer)idx,(Integer)x);
			}
			if(sel == 3) {
				System.out.print("삭제할 인덱스 입력 : ");
				int idx = sc.nextInt();
				arr.remove((Integer)idx);
			}
			if(sel == 4) {
				System.out.print("삭제할 값 입력 : ");
				int x = sc.nextInt();
				arr.remove(x);
			}
			if(sel == 5) {
				System.out.print("수정할 인덱스 입력 :");
				int idx = sc.nextInt();
				System.out.print("수정할 값 입력 : ");
				int x = sc.nextInt();
				arr.set((Integer)idx, (Integer)x);
			}
			if(sel == 6) {
				arr.size();
			}
			if(sel == 0) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}