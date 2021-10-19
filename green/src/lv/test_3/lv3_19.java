package lv.test_3;

import java.util.Random;
import java.util.Scanner;

public class lv3_19 {

	public static void main(String[] args) {
		/*
		 * # ���� ����
		 * 1. ���� ������ ��ġ�� 2�� �Է��� ������ ���ߴ� �����̴�.
		 * 2. ������ ���߸� back�� �ش� ���ڸ� ������,
		 *    back�� ��� ���� ä������ ������ ����ȴ�.
		 * ��)
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		 * �Է�1 : 0
		 * �Է�2 : 1
		 * 
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		// ����(shuffle)
		int i = 0;
		while(i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			i += 1;
		}
		int x = 0;
		while(true) {
			int check = 0;
			int win = 0;
		for(int j=0; j<10; j++) {
			System.out.print(front[j] + " ");
		}
		System.out.println();
		for(int j=0; j<10; j++) {
			System.out.print(back[j] + " ");
		}
		System.out.println();
		System.out.println("���� ���ڰ� �ִ� �ε����� �Է�(ù��°) . ");
		int sel1 = sc.nextInt();
		System.out.println("���� ���ڰ� �ִ� �ε����� �Է�(�ι�°) . ");
		int sel2 = sc.nextInt();
		
		for(int j=0; j<10; j++ ) {
			if(front[sel1] == back[j]) {
				check = -1;
			}
		}
		if(check == -1) {
			System.out.println("�̹� ������ ���Դϴ�.");
			continue;
		}
			if(front[sel1] == front[sel2]) {
				back[x] = front[sel1];
				back[x+1] = front[sel2];
				x+=2;
			}
		for(int j=0; j<10; j++) {
			if(back[j] != 0) {
				win++;
			}
		}
		if(win == 10) {
			System.out.println("��� �� �­����ϴ� ! ");
			break;
		}

		}//w
	}

}
