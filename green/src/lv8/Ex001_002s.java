package lv8;

import java.util.Scanner;

class MyArrayList2<T> { // ���׸� Ŭ����
	int size;
	Object list[]; // �ֻ��� Ŭ���� Object
	
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
				
			}else System.out.println("�ε����� ������ �ٽ� Ȯ�����ּ���");
			
		}else System.out.println("������ �߰��� ���� ���ּ��� .");
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
				
			}else System.out.println("�ε����� ������ �ٽ� Ȯ�����ּ��� . ");
			
		}else System.out.println("������ �����Ͱ� �����ϴ�.");
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
				
			}else System.out.println("������ ���� ã�� ���߽��ϴ� . ");
			
		}else System.out.println("������ ���� �����ϴ�.");
	}
	
	public void set(T idx , T x) {
		if(this.size != 0) {
			if((int)idx >= 0 && (int)idx < this.size) {
				list[(int)idx] = x;
			}else System.out.println("�ε������� ������ ������ϴ� .");
		}else System.out.println("�����͸� ���� �߰����ּ��� .");
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
			System.out.println("1.�߰�\n2.����\n3.����(�ε���)\n4.����(��)\n5.����\n6.����\n0.����");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("�߰��� �� �Է� : ");
				Integer x = sc.nextInt();
				arr.add(x);
			}
			if(sel == 2) {
				System.out.print("������ �ε��� �Է� : ");
				int idx = sc.nextInt();
				System.out.print("������ �� �Է� : ");
				int x = sc.nextInt();
				arr.add((Integer)idx,(Integer)x);
			}
			if(sel == 3) {
				System.out.print("������ �ε��� �Է� : ");
				int idx = sc.nextInt();
				arr.remove((Integer)idx);
			}
			if(sel == 4) {
				System.out.print("������ �� �Է� : ");
				int x = sc.nextInt();
				arr.remove(x);
			}
			if(sel == 5) {
				System.out.print("������ �ε��� �Է� :");
				int idx = sc.nextInt();
				System.out.print("������ �� �Է� : ");
				int x = sc.nextInt();
				arr.set((Integer)idx, (Integer)x);
			}
			if(sel == 6) {
				arr.size();
			}
			if(sel == 0) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}
}