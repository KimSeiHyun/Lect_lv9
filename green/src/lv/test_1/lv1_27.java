package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_27 {

	public static void main(String[] args) {
		/*
		 * # ����(0)����(1)��(2) ����[2�ܰ�] 
		 * 1. com�� 0~2 ������ ������ ���ڸ� �����Ѵ�.
		 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�. 
		 * 3. com�� me�� ����, 1) ����. 2) ���� �̰��. 3) ���� ����. �� ����Ѵ�.
		 */
		
		/*
		 * # ���������� ����[2�ܰ�]��
		 *   if - else if �������� �����غ���.
		 */
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������� ���� ! ");
		int com = rn.nextInt(3);
		System.out.println("0.���� 1.���� 2.��");
		int me = sc.nextInt();
		
		if(me == com ) {
			System.out.println("���� !! ");
		}
		else if (me == 0 && com == 2) {
			System.out.println("���� �̰��!!");
		}
		else if (me == 1 && com == 0) {
			System.out.println("���� �̰��!!");	
		}
		else if (me == 2 && com == 1) {
			System.out.println("���� �̰��!!");
		}
		else {
			System.out.println("���� ���� .. ");
		}
		

		
	}

}
