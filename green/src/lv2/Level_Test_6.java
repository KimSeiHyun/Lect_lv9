package lv2;

import java.util.Scanner;

public class Level_Test_6 {

	public static void main(String[] args) {
	    /*  5ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
		 * 2. �Է¹��� ������ ���� ���� ����Ѵ�. 
		 * 3. ���࿡ �Է¹��� ���� 100 �̻��̸�  �ݺ��� 5ȸ�� �ƴ����� ��� ���� 
		 * 
		 * ��) 7 ==> �� : 7 ,  14 ==> �� : 21 , 1000 ==> �� : 1021 !����
		 * 
		 */	
		//	���� : 12:33
		//	���� : 12:54
		//	�ҿ� : 21��
		
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		int sum = 0;
		System.out.println("������ �Է����ּ��� . ");
		System.out.println("���� 100 �̻��̰ų� 5���� ������ �Է��ϸ� ����˴ϴ�. ");
		while (a <=5) {
			System.out.print(a + "��° ������ �Է����ּ��� : ");
			int score = sc.nextInt();
			sum += score;
			System.out.println("�������� �� : " + sum);
			if (sum >= 100) {
				System.out.println("���� 100 �̻��̹Ƿ� �����մϴ�.");
				break;
			}
			a++;
		}
	}

}
