package lv.test_1;

import java.util.Scanner;

public class lv1_07s {

	public static void main(String[] args) {
		/*
		 * # Up & Down ����[1�ܰ�]
		 * 1. com�� 8�̴�.
		 * 2. me�� ���ڸ� �ϳ��Է¹޴´�.
		 * 3. com �� me �� ���ؼ� ������ ���� �޼����� ����Ѵ�.
		 * 1) me < com	: Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		int com = 8;
		
		Scanner sc = new Scanner(System.in);
		
		int me = sc.nextInt();
		
		if(me < com) {
			System.out.println("up!");
		}
		if(me == com) {
			System.out.println("bingo!");
		}
		if(me > com) {
			System.out.println("down!");
		}
	}

}
