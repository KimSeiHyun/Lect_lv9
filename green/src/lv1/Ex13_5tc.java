package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex13_5tc {

	public static void main(String[] args) {
		//���
		// �� ���ǹ� if 
		// �� �ݺ��� while , for 
		// �� ������� break , continue
		
		//while 
		// ���ѷ��� -> �ݺ��� �������� .
		// 1. �ʱ�� 
		// 2. ���ǽ�
		// 3. ������ 
		
		// ���� n�� 5���� �����ϸ� -> �ݺ��� ���� .
		int n = 0; //�ʱ�� 
		
		while(n < 10) { // ���ǽ� 

			if ( n < 5 ) {
				System.out.println("���� �ݺ��� ..");
			}
		//	if ( n == 4 ) {
	//			n = 11;
//			}
			n++;
		}
		
		/*
		 * # Up & Down ����[2�ܰ�]
		 * 1. com �� �������� 1~100���̸� �����Ѵ�.
		 * 2. me �� 1~100���̸� �Է��Ѵ�. 	 
		 * 3. com �� me �� ���ؼ� com ũ�� "ũ��" , com �������� "�۴�" ��Ʈ���� 
		 * 4. ������ ���߸� ������ ����ȴ�.
		 */
		Scanner sc= new Scanner(System.in);
		Random rn = new Random();
		
		int quiz = rn.nextInt(100) +1 ;
		System.out.println("quiz :" + quiz);
		
//		boolean isRun = true ; 
		int isRun = 1 ;
		while(isRun == 1) {
			System.out.println("������ �Է��ϼ��� ! ");
			int answer = sc.nextInt();
			
			if (quiz == answer ) {
				System.out.println("�����Դϴ� .");
				//�ݺ��� ����
//				isRun = false;
				isRun = 0;
			}
			else if ( quiz > answer ) {
				System.out.println("up!");
			}
			else if (quiz < answer ) {
				System.out.println("down!");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}