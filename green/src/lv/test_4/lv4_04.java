package lv.test_4;

import java.util.Random;
import java.util.Scanner;

public class lv4_04 {

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
			int x = 0;
			int cnt = 0;
			int cnt2 = 0;
			while(x<3) {
				int check = 0;
				int num = rn.nextInt(9)+1;
				for(int i=0; i<3; i++) {
					if(me[i] == num) {
						check = 1;
					}
				}
				if(check == 0 ) {
					me[x] = num;
					x++;
				}
			}//w
			for(int i=0; i<3; i++) {
				if(com[i] == me[i]) {
					cnt2 ++;
				}
				for(int j=0; j<3; j++ ) {
					if(me[i] == com[j]) {
						cnt ++;
					}
				}
			}
			for(int i=0; i<3; i++) {
				System.out.print(com[i] + " ");
			}System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(me[i] + " ");
		}System.out.println();
		System.out.printf("%db , %ds\n" ,cnt,cnt2);
		if(cnt2 == 3) {
			System.out.println("3strike !! ");
			break;
		}
		}//w2
		

	}

}
