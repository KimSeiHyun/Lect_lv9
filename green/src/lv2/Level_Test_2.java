package lv2;

import java.util.Random;
import java.util.Scanner;

public class Level_Test_2 {

	public static void main(String[] args) {
		/*
		 * # Up & Down ����[2�ܰ�]
		 * 1. com �� �������� 1~100���̸� �����Ѵ�.
		 * 2. me �� 1~100���̸� �Է��Ѵ�. 	 
		 * 3. com �� me �� ���ؼ� com ũ�� "ũ��" , com �������� "�۴�" ��Ʈ���� 
		 * 4. ������ ���߸� ������ ����ȴ�.
		 */
		//	���� : 09:35
		//	���� : 09:46
		//	�ҿ� : 11��
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int com = ran.nextInt(100) +1 ;
		int me = 0;
		System.out.println("���ٿ� ����!");
		System.out.println("com = " + com);
		boolean t = true;
		while (t) {
		 me = sc.nextInt();
	
		if (com == me ) {
			System.out.println("���� ! ");
			break;
		}
		else if ( com < me ) {
			System.out.println("down!");
		}
		else if ( com > me ) {
			System.out.println("up !");
		}

		
		}
		

	}

}
