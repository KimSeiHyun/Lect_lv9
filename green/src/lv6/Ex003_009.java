package lv6;

import java.util.Scanner;

class Ex003_09 {
	Scanner sc = new Scanner(System.in);
	int arr[] = {0, 1, 0, 0, 0, 0, 0, 0, 1 ,0} ;
	int x = arr.length-1;
	int P = 8;
	
	
	void print() {
		arr[x] = P;
		for(int i=0; i<this.arr.length; i++) {
			if(this.arr[i] == 8) {
				System.out.print("�� ");
			}
			else if(this.arr[i] == 1) {
				System.out.print("�� ");
			}
			else System.out.print("_ ");
		}System.out.println();
	}
	
	void move_break() {
		
		System.out.println("1.����   2.������  3.���� ! ");
		int sel = sc.nextInt();
		
		if(sel == 1) {
			if(x>0 && this.arr[x-1] == 0) {
				arr[x] = 0;
				x--;
			}
		}
		else if(sel == 2) {
			if(x<this.arr.length-1 && this.arr[x+1] == 0) {
				arr[x] = 0;
				x++;
			}
		}
		else if(sel == 3) {
			if(x == 0 && this.arr[x+1] == 1) {
				this.arr[x+1] = 0;
			}
			else if (x == this.arr.length-1 && this.arr[x-1] == 1) {
				this.arr[x-1] = 0;
			}
			else if ( x >0 && x < this.arr.length-1) {
				if(this.arr[x-1] == 1 || this.arr[x+1] == 1) {
					this.arr[x-1] = 0;
					this.arr[x+1] = 0;
				}
			}
		}
		
		
	}
	


	
	public void run() {
		while(true) {
			print();
			move_break();
		}
	}
}
public class Ex003_009 {

	public static void main(String[] args) {
		/*
		 * # ���� �̵��ϱ� : Ŭ���� + �޼���
		 * 1. ���� 8�� ĳ�����̴�.
		 * 2. ���� 1�� �Է��ϸ�, ĳ���Ͱ� �������� �̵��Ѵ�.
		 * 3. ���� 2�� �Է��ϸ�, ĳ���Ͱ� �����������̵��Ѵ�.
		 * 4. �¿� ���� �������� �� ������ �߻����� �ʵ��� ����ó���� ���ش�.
		 */
		
		Ex003_09 ex = new Ex003_09();
		
		ex.run();
	}

}
