package lv.test_4;

import java.util.Random;
import java.util.Scanner;

public class lv4_04s {

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
		while(true) {
			int s = 0;
			int b = 0;
			for(int i=0; i<3; i++) {
				System.out.print(com[i] + " ");
			}System.out.println();
			for(int i=0; i<3; i++) {
				System.out.print(me[i] + " ");
			}System.out.println();
			
			System.out.println("���ڸ� ���� �Է����ּ��� ! ");
			for(int i=0; i<3; i++) {
				int num = sc.nextInt();
				me[i] = num;
			}
			for(int i=0; i<3; i++) {
				if(me[i] == com [i] ) {
					s++;
				}
				for(int j=0; j<3; j++) {
					if(me[i] == com[j] && me[i] != com[i]) {
						b++;
					}
				}
			}
			System.out.println(s+"s  ,  " + b+"b" );
			
			if(s == 3) {
				System.out.println("clear !!");
				break;
			}
		}//w
	}

}
