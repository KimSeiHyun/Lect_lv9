package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex13_3 {

	public static void main(String[] args) {
		/*
		 * # ������ ����[3�ܰ�]
		 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
		 * 2. ������ ���߸� 20���̴�.
		 * 3. ���� ���� ��, ������ ����Ѵ�.
		 */

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int a = 1;
		int score = 0;

		while (a <= 5) {
			int x = ran.nextInt(8) + 2;
			int y = ran.nextInt(10) + 1;
			System.out.println(x + "*" + y + "= ?");
			int answer = x * y;
			int myAnswer = sc.nextInt();
			if (answer == myAnswer) {
				System.out.println("�����Դϴ� .");
				score += 20;
			} else if (answer != myAnswer) {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}

			a++;
		}
		System.out.println("���� : " + score + "��.");
	}

}
