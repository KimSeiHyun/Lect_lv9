package lv.test_2;

import java.util.Scanner;

public class lv2_08 {

	public static void main(String[] args) {
		/*
		 * # ����Ų���31
		 * 1. p1�� p2�� �����ư��鼭 1~3�� �Է��Ѵ�.
		 * 2. br�� p1�� p2�� �Է°��� �����ؼ� �����Ѵ�.
		 * 3. br�� 31�� ������ ������ ����ȴ�.
		 * 4. �¸��ڸ� ����Ѵ�.
		 * 
		 * ��) 
		 * 1�� : p1(2)	br(2)
		 * 2�� : p2(1)	br(3)
		 * 3�� : p1(3)	br(6)
		 * ...
		 */
		
		Scanner sc = new Scanner(System.in);
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 1;
		
		boolean t = true;
		System.out.println("����Ų���31 game ! ");
		while (t) {
			
			System.out.printf("%d���� �����Դϴ� .",turn);
			int num = sc.nextInt();
			if(num <1 || num >3) {
				System.out.println("1~3������ �Է����ּ��� !");
				continue;
			}

			br += num;
			System.out.printf("%d�� : p%d(%d)   br(%d)\n",turn,turn,num,br);
			if(br >30) {
				if(turn == 1) {
					System.out.println("2���� �¸� ! ");
				}
				else {
					System.out.println("1���� �¸� ! ");
				}
				t = false;
			}
			turn = turn == 1? 2 : 1;
		}

	}

}
