package lv.test_4;

import java.util.Scanner;

public class lv4_23s {

	public static void main(String[] args) {
		/*
		 * # �Ҽ� ã��[3�ܰ�]
		 * 1. ���ڸ� �� �� �Է¹޴´�.
		 * 2. �Է¹��� ���ں��� ū ù ��° �Ҽ��� ����Ѵ�.
		 * 
		 * ��) Enter Number ? 1000
		 *    1000���� ū ù���� �Ҽ��� 1009
		 * ��) Enter Number ? 500
		 *    500���� ū ù��° �Ҽ��� 503
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int number = sc.nextInt();
		
		while(true) {
			int check = 0;
			for(int i=1; i<=number; i++) {
				if(number%i == 0) {
					check ++;
				}
			}
			if(check == 2) {
				break;
			}
			number ++;
		}
		
		System.out.println(number);
	}

}
