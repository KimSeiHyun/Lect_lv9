package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex01_04 {

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
		
		int i = 0 ;
		
		while(i<3) {
			int rNum = rn.nextInt(9)+1;		
			int check = -1;
			
			for(int j =0; j<3; j++) {
				if(rNum == com[j]) {
					check = i;
				}
			}
			if(check == -1) {
				com[i] = rNum;
				i++;
			}
		}
		
		boolean t = true;
		int ball = 0;
		int strike = 0;
		while(t) {

		System.out.print("com : ");
		for(i =0; i<3; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println();
		
		System.out.print("me  : ");
		for(i =0; i<3; i++) {
			System.out.print(me[i] + " ");
		}
		System.out.println();
		System.out.println("strike : " + strike);
		System.out.println("ball   : " + ball);
		if( strike == 3) {
			System.out.println("3�� �ƿ� ������ ����˴ϴ�.");
			break;
		}
		strike = 0;
		ball = 0;
		me = new int[3];	
		for(i = 0; i<3; i++) {
			System.out.printf("%d��������" ,i+1);
			int inMe = sc.nextInt();
			int check = 1;
			
			for(int j =0; j<3; j++) {
			if(me[j] == inMe) {
				check = -1;
			}
			}
			
			if(inMe >0 && inMe <10 && check == 1) {
				me[i] = inMe;
			}
			else {
				System.out.println("������ ��� �����̰ų� �ߺ��� ���Դϴ�.");
				i--;
			}
		}
		
		for(i =0; i<3; i++) {
			if ( com[i] == me[i]) {
				strike ++;
			}
			for(int j=0; j<3; j++) {
				if ( i != j && com[i] == me[j]) {
					ball ++;
				}
			}
		}

		}
		
	
	}

}
