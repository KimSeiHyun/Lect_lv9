package lv1;

import java.util.Scanner;

public class Ex13_7tc {

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
		int p1 = 0;
		int p2 = 0;
		int br = 0;
		int turn = 0;

		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			System.out.println("br : " + br);
			// turn�� ���� �Է� .
			int answer = 0;

			if (turn % 2 == 0) {
				// p1
				System.out.println("p1 : ");
				answer = sc.nextInt();
			} else {
				// p2
				System.out.println("p2 : ");
				answer = sc.nextInt();
			}

			if (answer <= 0 || answer > 3) {
				System.out.println("�߸����Է��Դϴ�");
				turn++; // turn --;

			} else {
				br += answer; 
				// ���Ӽ��ڰ� �����ؼ� ���� .
				// ����
				if (br >= 31) {
					if (turn % 2 == 0) {
						System.out.println("p2�� �¸��޴�.");
					} else {
						System.out.println("p1�� �¸��޴�.");
					}
					isRun = false;
				}
			}

			turn++;
		}
	}

}
