package lv.test_4;

import java.util.Random;
import java.util.Scanner;

public class lv4_05 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50�� ==> 1 to 18
		 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
		 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
		 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
		 * 4. ���� 1~9�� front �迭�� �����ϰ�,
		 *    ���� 10~18�� back �迭�� �����Ѵ�.
		 */
		
		// ���� : ���� �� �ִ� ��
		// ��� : ���� �� ���� �� 
		// ����� �ڵ尡 ������ ��� �ؿ��� Ȯ���� �ް��� ���� �־� 
		// �Ϲ������� ����� �̸��� ���δ� �빮�ڷ� �����Ѵ�.
		
		final int SIZE = 9; // ���
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		while(x <9) {
			int check  = 0;
			int num = rn.nextInt(9)+1;
			for(int i=0; i<9; i++) {
				if(front[i] == num) {
					check = 1;
				}
			}
			if(check == 0) {
				front[x] = num;
				x++;
			}
			
		}
		x = 0;
		while(x <9) {
			int check  = 0;
			int num = rn.nextInt(9)+10;
			for(int i=0; i<9; i++) {
				if(back[i] == num) {
					check = 1;
				}
			}
			if(check == 0) {
				back[x] = num;
				x++;
			}
			
		}
		int cnt = 0;
		while(true) {
			
			int min = 100;
		for(int i=0; i<9; i++) {
			if(min > front[i]) {
				min = front[i];
			}
			if(min > front[i]) {
				min = back[i];
			}
			if(front[i] == 100) {
				System.out.print("   ");
			}
			else {
				System.out.print(front[i] + " ");
			}
			
			if(i%3 == 2) {
				System.out.println();
			}
		}System.out.println();
		for(int i=0; i<9; i++) {
			System.out.print(back[i] + " ");
			if(i%3 == 2) {
				System.out.println();
			}
		}System.out.println();
		
		System.out.println("���������� ������������ ! ");
		int num = sc.nextInt();
		if(cnt < 9) {
		for(int i=0; i<9; i++) {
			if(front[i] == min && num == i) {
				front[i] = back[i];
				cnt ++;
			}			
		}
		}
		else {
			for(int i=0; i<9; i++) {
				if(front[i] == min && num == i) {
					front[i] = 100;
					cnt ++;
				}			
			}
		}
		if(cnt == 18) {
			System.out.println("���� Ŭ���� !");
			break;
		}
		
		}//w

	}

}
