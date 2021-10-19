package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex01_05 {

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

		int i =0;
		while(i<9) {
			int fNum = rn.nextInt(9)+1;
			int check = -1;
			
			for(int j=0; j<9; j++) {
				if(fNum == front[j]) {
					check = i;
				}
			}
			if(check == -1) {
				front[i] = fNum;
				i++;
			}
		}
		
		int j = 0;
		while(j<9) {
			int bNum = rn.nextInt(9)+10;
			int check = -1;
			
			for(int k=0; k<9; k++) {
				if(bNum == back[k]) {
					check = j;
				}
			}
			if( check == -1) {
				back[j] = bNum;
				j++;
			}			
		}
		
		int cnt = 0;
		boolean t = true;
		while(t) {
			
			for(i = 0; i<9; i++) {
				System.out.print(front[i] + "  ");
				if(i%3 == 2) {
					System.out.println();
				}
			}			
			int min = 100;
			int min2 = 101;;
			int temp1 = 0;
			int temp2 = 0;
			System.out.println("���������� ���ʴ�� �Է��س�������.");
			int num = sc.nextInt()-1;

			if (num < 0 || num >8) {
				System.out.println("������ ��� �����Դϴ�.");
				continue;
			}
			for(i=0; i<9; i++) {
				if(min > front[i]) {
					min = front[i];	
					temp1 = i;
				}
				if(min2 > front[i] && front[i] != 0) {
					min2 = front[i];	
					temp2 = i;
				}
			}
			if(front[num] == min ) {
				front[temp1] = back[temp1];
				back[temp1] = 0;
				cnt ++;
			}
			if(front[num] == min2 ) {
				front[temp2] = 0;
				cnt ++;
			}
			if(cnt == 18) {
				System.out.println("game clear ! ");
				break;
			}
	
		}//while

	}

}