package lv.test_1;

import java.util.Scanner;

public class lv1_16 {

	public static void main(String[] args) {
		/*
		 * # ������ ����[1�ܰ�]
		 * 1. ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�.
		 * 2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�.
		 * ��)	3 x 7 = ?
		 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
		 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է����ּ��� . ");
		int x = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է����ּ��� . ");
		int y = sc.nextInt();
		
		System.out.println(x + " x " + y + " =  ?" );
		
		int z = x*y;
		
		System.out.println("������ �Է����ּ��� .");
		int answer = sc.nextInt();
		
		if(answer == z) {
			System.out.println("���� ! ");
		}
		if(answer != z) {
			System.out.println("�� !  ");
		}
		

	}

}
