package lv8;

import java.util.Scanner;

class MyArrayList3 {
	private int size;
	private Integer nums[];

	// public boolean add() {}
	public boolean add(Integer integer) {
		try {
			Integer temp[] = nums;
			nums = new Integer[this.size + 1];
			if (this.size > 0) {
				for (int i = 0; i < this.size; i++) {
					nums[i] = temp[i];
				}
			}
			nums[this.size] = integer;
			this.size++;
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void add(int index, Integer data) {
		if (this.nums != null && index >= 0 && index < this.size) {
			Integer temp[] = this.nums;
			this.nums = new Integer[this.size + 1];
			for (int i = 0; i < this.size; i++) {
				if (i < index) {
					this.nums[i] = temp[i];
				} else {
					this.nums[i + 1] = temp[i];
				}
			}
			this.nums[index] = data;
			this.size++;
		}
	}

	public void remove(int index) {
		if (this.nums != null && index >= 0 && index < this.size) {
			Integer temp[] = this.nums;
			this.nums = new Integer[this.size - 1];

			int idx = 0;
			for (int i = 0; i < this.size; i++) {
				if (i != index) {
					this.nums[idx] = temp[i];
					idx++;
				}
			}
			this.size--;
		}
	}

	public boolean remove(Integer data) {
		try {
			int index = -1;
			for (int i = 0; i < this.size; i++) {
				if (this.nums[i] == data) {
					index = i;
				}
			}
			Integer temp[] = this.nums;
			this.nums = new Integer[this.size - 1];

			int idx = 0;
			for (int i = 0; i < this.size; i++) {
				if (i != index) {
					this.nums[idx] = temp[i];
					idx++;
				}
			}
			this.size--;

			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean set(int index, Integer data) {
		try {
			if (this.nums != null && index >= 0 && index < this.size) {
				this.nums[index] = data;
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Integer get(int index) {
		if (this.nums != null && index >= 0 && index < this.size) {
			return this.nums[index];			
		}
		return -1;
	}
	 public int size() {
		 return this.size;
	 }
	 
	 @Override
	public String toString() {
		 String str = "";
		for(int i=0; i<this.size; i++) {
			str += this.nums[i] + " ";
		}
		return str;
	}

}

public class Ex001_002tc {

	public static void main(String[] args) {
//		ArrayList3<Integer> arr3 = new ArrayList3<Integer>();
		Scanner sc = new Scanner(System.in);
		MyArrayList3 list = new MyArrayList3();
		list.add((Integer) 10);
		while(true) {
			System.out.println(list.toString());
			System.out.println("1.추가");
			System.out.println("2.삽입");
			System.out.println("3.삭제(인덱스)");
			System.out.println("4.삭제(값)");
			System.out.println("5.수정");
			System.out.println("6.값조회(인덱스)");
			System.out.println("7.크기출력");
			int sel =  sc.nextInt();
			if(sel == 1) {
				System.out.print("추가할 값 입력 : ");
				int idx = sc.nextInt();
				list.add((Integer)idx);
			}
			if(sel == 2) {
				System.out.print("삽입할 인덱스 입력 : "); 
				int idx = sc.nextInt();
				System.out.print("삽입할 값 입력 : ");
				Integer data = sc.nextInt();
				list.add(idx, data);
			}
			if(sel == 3) {
				System.out.print("삭제할 인덱스 입력 : ");
				int idx = sc.nextInt();
				list.remove(idx);
			}
			if(sel == 4) {
				System.out.print("삭제할 값 입력 : ");
				Integer data = sc.nextInt();
				list.remove(data);
			}
			if(sel == 5) {
				System.out.print("수정할 인덱스 입력 : ");
				int idx = sc.nextInt();
				System.out.print("수정할 값 입력 : ");
				Integer data = sc.nextInt();
				list.set(idx, data);
			}
			if(sel == 6) {
				System.out.print("값을 조회할 인덱스 입력 : ");
				int idx = sc.nextInt();
				System.out.println(list.get(idx));
			}
			if(sel == 7) {
				System.out.println(list.size());
			}
		}

		
		
		
		
		
		
		
		
		
	}

}
