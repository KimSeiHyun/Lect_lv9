package lv.test_2;

import java.util.Random;
import java.util.Scanner;

public class lv2_03s {

	public static void main(String[] args) {
		/*
		 * # ������ ����[3�ܰ�]
		 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
		 * 2. ������ ���߸� 20���̴�.
		 * 3. ���� ���� ��, ������ ����Ѵ�.
		 */
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int score = 0;
		while (x <5 ) {
			int a = rn.nextInt(9)+1;
			int b = rn.nextInt(9)+1;
			int c = a*b;
			
			System.out.println(a + " x " + b + " = ?");
			
			System.out.println("������ �Է����ּ��� . ");
			int answer = sc.nextInt();
			
			if (answer == c ) {
				score += 20;
			}
			
			x++;
		}
		
		System.out.println("���� : " + score);
	}

}
