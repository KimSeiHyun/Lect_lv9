package lv4;

import java.util.Scanner;

public class Ex03_07 {

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
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number ? ");
		int number = scan.nextInt();
		
		int x = number+1;
		while(x > number) {
			int cnt = 0;
			x++;
			for(int i=1; i<=x; i++) {
				if(x % i  == 0 ) {
					cnt ++;
				}


			}
			if(cnt == 2) {
				System.out.println(x);
				break;
			}
			
		}

	}//c

}
