package lv1;

import java.util.Random;
import java.util.Scanner;

public class EX13_3tc {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int score = 0;
//		int count = 0; // �߿� !!!!!! ��ȭ�ϸ� �ȵǴ� ������ �ݵ�� �ݺ��� �ۿ� !

		while (n < 5) {
			int num1 = ran.nextInt(8) + 2; // 2~9
			int num2 = ran.nextInt(10) + 1; // 1~10
			int result = num1 * num2; // ����
			System.out.println(num1 + " x " + num2 + " =?");
			int answer = sc.nextInt(); // �亯
			// ���� �Ǵ� ��
			if (answer == result) {
				System.out.println("����!");
//				count++;
				score += 20;
			} else {
				System.out.println("�� .");
			}
			// ���� -> ������ ī��Ʈ or ���� ����
			n++;
		}
		//���� ���� . 
//		System.out.println("���� :" + (count*20));
		System.out.println("���� :" + score + "��");
// �� �������� ������ ��Ÿ���� ��� 2���� .
// ù��° : count ó�� ǥ�� .
// �ι�° : score ó�� ǥ�� . 
	}

}
