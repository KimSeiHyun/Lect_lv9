package lv2;

import java.util.Scanner;

public class Level_Test_1 {

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
		 * 
		 */
		//	���� : 10:03
		//	���� : 10:40
		//	�ҿ� : 37��
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����Ų��� 31 ���� !");
		
		int p1 = 0;
		int p2 = 0;
		int turn = 0;
		int answer = 0 ;
		int br = 0 ;
		boolean t= true;
		while (t) {
			
			System.out.println(turn + "�� :" + "p1(" + answer +")    br(" + br + ")"   );
			if (turn % 2 == 0) {
				System.out.println("p1�� ���Դϴ� : ");
				answer = sc.nextInt();
				turn++; 
			} else {
				System.out.println("p2�� ���Դϴ�. : ");
				answer = sc.nextInt();
				turn++; 
			}
			
			if (answer <= 0 || answer > 3) {
				System.out.println("�߸����Է��Դϴ�.");
				turn--;
			}
			else {
				br += answer;
				if ( br >= 31 ) {
					if (turn % 2 == 1) {
						System.out.println("p2�� �¸��߽��ϴ�.");
						break;
					} else {
						System.out.println("p1�� �¸��߽��ϴ�.");
						break;
					}
				}
			}
		}
	
	}

}
