package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex01_04tc {

	public static void main(String[] args) {
		/*
		 * # ���� �߱� ����
		 * 1. me�� 1~9 ������ ���� 3���� ����
		 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
		 * 2. com�� me�� ���� ������ ���� ������ �ݺ�
		 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
		 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
		 * ��)
		 * ���� : 1 7 3
		 * 3 1 5		: 2b
		 * 1 5 6		: 1s
		 * ...
		 */
		int[] com = {1, 7, 3};
		int[] me = new int[3];	
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		boolean win = false;
		
		while(!win) {
			int strike = 0;
			int ball = 0;
			//���
			for(int i=0; i<3; i++) {
				System.out.print(com[i] + " ");
			}
			for(int i=0; i<3; i++) {
				System.out.print(me[i] + " ");
			}
			System.out.println();
			
			//�Է�
			for(int i=0; i<3; i++) {
				System.out.printf("����%d : " , i+1);
				int num = sc.nextInt();
				
				int check  = 1;
				for(int j=0; j<3; j++) {
					if(me[j] == num) {
						check = -1;
					}
				}
				
				if(check == 1) {
					me[i] = num;
				}
				else {
					System.out.println("�ߺ��� �Է� �Ұ� .");
					i --;
				}				
			}
			
			//�˻�
			for(int i=0; i<3; i++) { // com �迭 ����
				for(int j=0; j<3; j++) {
					if(com[i] == me[j]) {
						if(i == j ) {
							strike ++;
						}
						else {
							ball ++;
							
						}
					}
				}
				
			}
			
			//��������
			if(strike == 3) {
				System.out.println("gmae clear ! ");
				win =true;
			}
			
			
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
