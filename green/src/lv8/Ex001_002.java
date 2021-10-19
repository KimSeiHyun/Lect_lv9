package lv8;

import java.util.ArrayList;
import java.util.Scanner;

class MyArrayList {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> arr = new ArrayList<>();
	Integer nums[];
	int size;
	// add(�߰�)
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

	// add(����)
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
				
			}else System.out.println("������ �ε����� ������ �߸��ƽ��ϴ�. ");
		}else System.out.println("������ ������ �����ϴ� �߰��� ���� ���ּ���  .");
		
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
				
			}else System.out.println("������ �ε����� ������ �ٽ� Ȯ�����ּ��� . ");
			
		}else System.out.println("������ �����Ͱ� �����ϴ�.");
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
			System.out.println("�Է��� ���� ã�� �� �����ϴ�.");
		}
	}
	// set
	void set(Integer idx , Integer x) {
		if(this.size != 0) {
			if(idx >= 0 && idx < this.size) {
				nums[idx] = x;
			}else System.out.println("�ε����� ������ �ٽ� Ȯ�����ּ��� . ");
			
		}else System.out.println("������ ���� �����ϴ�.");
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
		// ������ ArrayList ����
		// 1.�߰� 2.���� 3.���� 4.����
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		MyArrayList list = new MyArrayList();
		
		while(true) {
			list.print();
			System.out.println("1.�߰�\n2.����\n3.����(�ε���)\n4.����(��)\n5.����\n6.����\n0.����");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("�߰����Է� : ");
				Integer x = sc.nextInt();
				list.add(x);
			}
			if(sel == 2) {
				System.out.print("������ �ε��� �Է� : ");
				Integer idx = sc.nextInt();
				System.out.print("������ �� �Է� : ");
				Integer x = sc.nextInt();
				list.add(idx, x);
			}
			if(sel == 3) {
				System.out.print("������ �ε��� �Է� : ");
				int idx = sc.nextInt();
				list.remove(idx);
			}
			if(sel == 4) {
				System.out.print("������ �� �Է� : ");
				Integer x = sc.nextInt();
				list.remove(x);
			}
			if(sel == 5) {
				System.out.print("������ �ε��� �Է� : ");
				Integer idx = sc.nextInt();
				System.out.print("������ �� �Է� : ");
				Integer x = sc.nextInt();
				list.set(idx, x);
			}
			if(sel == 6) {
				list.size();
			}
			if(sel == 0) {
				System.out.println("�����մϴ�");
				break;
			}
			
		}
		
		

	}

}
