package lv.test_2;

import java.util.Scanner;

public class lv2_21s {

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
		Scanner sc= new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 1;
		System.out.println("����Ų��� 31 game !! ");
		
		while(true) {
			System.out.println(turn+"�� �����Դϴ� . 1~3���ڸ� �Է����ּ��� ! ");
			int num = sc.nextInt();
			br += num;
			
			
			System.out.printf("%d�� : p%d(%d)   br(%d)\n",turn,turn,num,br);
			if(br > 30) {
				if(turn == 1) {
					System.out.println("p2�� �̰���ϴ� ! ");
				}
				if(turn == 2) {
					System.out.println("p1�� �̰���ϴ� ! ");
				}
				break;
			}
			turn = turn == 1? 2 : 1;
		}//w
		
	}

}
