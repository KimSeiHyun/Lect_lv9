package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex11_1 {

	public static void main(String[] args) {
		
		/*
		 * # ��� ���� ���߱� ����
		 * 1. 150~250 ������ ���� ���� ����
		 * 2. ���� ������ ��� ���ڸ� ���ߴ� �����̴�.
		 * ��)
		 * 		249		: 4
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� ���� ���߱� ���� ! ");
		int a = ran.nextInt(101) + 150 ; 
		System.out.println(a);
		
		int answer = a / 10 % 10 ; // �����ڸ����� ���� . ex 150 / 10 % 10 = 5 
		System.out.println("��� ���ڸ� �Է����ּ��� !");
		int b = sc.nextInt();
		
		if (b == answer) {
			System.out.println("�����Դϴ�.");
		} 
		else {
			System.out.println("Ʋ�Ƚ��ϴ� .");
		}
		
		/*
		 * # 369����[1�ܰ�]
		 * 1. 1~50 ������ ���� ���ڸ� �����Ѵ�.
		 * 2. �� ���� 369�� ������
		 * 	1) 2���̸�, ¦¦�� ���
		 *  2) 1���̸�, ¦�� ���
		 *  3) 0���̸�, �ش� ���ڸ� ���
		 * ��)
		 * 		33	 : ¦¦
		 * 		16	 : ¦
		 * 		 7	 : 7
		 */
		
		int quiz = ran.nextInt(50) +1;
		
		int ten = quiz / 10;
		int one = quiz % 10;
		
		int clap = 0;
		
		if(ten % 3 == 0  && ten != 0) {
			clap ++;
		}
		if (one % 3 == 0 && one != 0) {
			clap ++;
			
		}
		
		//�ڼ�����
		System.out.println("quiz : " + quiz);
		if(clap == 2 ) {
			System.out.println("¦¦");
		}
		else if (clap == 1) {
			System.out.println("¦");
		}
		else if (clap == 3) {
			System.out.println(quiz);
		}

	}

}
