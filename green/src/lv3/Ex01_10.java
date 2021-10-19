package lv3;

import java.util.Scanner;

public class Ex01_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문제 1) 아래 배열 a 에서 내가 입력한 값만 빼고 b 에 저장 
		int a[] = { 10,20,30,40,50 };
		int b[] = { 0,0,0,0,0 };
		// 예) 30 ==> b[] = {10,20,40,50,0};
		
		System.out.println("문제1 : 10,20,30,40,50중 하나를 입력해주세요 . ");
		int intA = sc.nextInt();;
		int bIdx = 0;
		for (int i=0; i<5; i++) {
			if ( intA != a[i]) {
				b[bIdx] = a[i];
				bIdx++;
			}
		}
		for(int i=0; i<5; i++) {
			System.out.print(b[i] + "  ");
		}
		
		
		
		// 문제 2) 아래 배열에서 내가 입력한 번호 와 값 만 빼고 d 에 저장
		int c[] = { 1001, 40, 1002, 65, 1003,  70 };
		int d[] = { 0,0,0,0,0,0 };
		// 예) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};

		int dIdx = 0;
		int dIdx2 = 0;
		System.out.println();
		System.out.println("문제2: 1001, 1002, 1003,중에 하나를 입력해주세요.");
		int intC = sc.nextInt();
		for (int i=0; i<6; i++ ) {
			if (intC != c[i] ) {
				d[dIdx] = c[i];
				dIdx++;			
			}
		}
		
		for (int i=0; i<6; i++ ) {
			System.out.print(d[i]+ "  ");
		}
		
		
		
	}
}
