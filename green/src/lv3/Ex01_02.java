package lv3;

import java.util.Random;

public class Ex01_02 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Random ran = new Random();
		int score = ran.nextInt(100)+1;
		int n = 0 ;
		int sum = 0;
		int avr = 0;
		int cnt = 0;
		// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		System.out.println("����1 : 5���� ���� ����");
		for (n =0; n <5; n++) {
			score = ran.nextInt(100)+1;
			arr[n] += score;
			sum += score;
			System.out.print(arr[n]);
			if (arr[n] >= 60) {
				System.out.println("(�հ�!)");
				cnt ++ ; 
			}
			else {
				System.out.println();
			}
		}
		
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		
		avr = sum /n;
		System.out.println("����2 : ������ ��� ���.");
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avr);

		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��
		
		System.out.println("����3 : �հݻ� �� ���.");
		System.out.println("�հݻ� �� :" + cnt);
		
		
	}

}
