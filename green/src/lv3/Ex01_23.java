package lv3;

import java.util.Scanner;

public class Ex01_23 {

	public static void main(String[] args) {
		
		
		/*
		 * # �̴ϸ���
		 * 1. �÷��̾�� p1�� p2 2���̴�.
		 * 2. �����ư��� 1~3 ������ ���ڸ� �Է��� �̵��Ѵ�.
		 * 3. �̵��ϴٰ� ���� �÷��̾�� ���� ��ġ�� ���̰� �Ǹ�,
		 *    ��� �÷��̾�� ������ �Ǿ� �������� �ǵ��ư���.
		 * 4. ���� 3������ ���� �̱��.
		 *    
		 *  [p2]1~3 �Է� : 1
		 *  1 2 3 4 5 6 7 8 
		 *  0 1 0 0 0 0 0 0 
		 *  0 0 0 2 0 0 0 0 
		 *  
		 *  [p1]1~3 �Է� : 3
		 *  [p1]�� p2�� ��Ҵ�!
		 *  1 2 3 4 5 6 7 8 
		 *  0 0 0 0 1 0 0 0 
		 *  2 0 0 0 0 0 0 0 
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		int turn = 1;
		
		int idx1 = 0;	
		int idx2 = 0;
		int c = 0;
		p1[idx1] = 1;	
		p2[idx2] = 2;

		while(true) {
			
			for(int i = 0; i<8; i++) {
				System.out.print(game[i] + " ");
			}
			System.out.println();
			for(int i = 0; i<8; i++) {
				System.out.print(p1[i] + " ");
			}
			System.out.println();
			for(int i = 0; i<8; i++) {
				System.out.print(p2[i] + " ");
			}
			System.out.println();
			System.out.printf("%d���� �����Դϴ�. 1~3���ڸ� �Է����ּ��� . ",turn);
			int input = sc.nextInt();
			
			if (input >= 1 && input <= 3 && turn == 1) {
				p1[idx1] = 0; 
				p1[idx1+input] = 1;
				turn++;
			}
			else if (input >= 1 && input <= 3 && turn == 2) {	
				p2[idx2+input] = 2;
				p2[idx2] = 0; 
				turn--;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
