package lv.test_3;

import java.util.Scanner;

public class lv3_09 {

	public static void main(String[] args) {
		// 문제 1) 아래 배열 a 에서 내가 입력한 값만 빼고 b 에 저장 
		int a[] = { 10,20,30,40,50 };
		int b[] = { 0,0,0,0,0 };
		// 예) 30 ==> b[] = {10,20,40,50,0};
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int x = 0;
		for(int i=0; i<5; i++) {
			if(num != a[i]) {
				b[x] = a[i];
				x++;
			}
		}
		System.out.println("문제1");
		for(int i=0; i<5; i++) {
			System.out.print(b[i] + " ");
		}
		
		// 문제 2) 아래 배열에서 내가 입력한 번호 와 값 만 빼고 d 에 저장
		int c[] = { 1001, 40, 1002, 65, 1003,  70 };
		int d[] = { 0,0,0,0,0,0 };
		// 예) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
		int num2 = sc.nextInt();
		x = 0;
		for(int i=0; i<6; i+=2) {

			if(num2 != c[i]) {
				d[x] =c[i]; 
				d[x+1] = c[i+1];
				x+=2;
			}
		}
		System.out.println("문제2");
		for(int i=0; i<6; i++) {
			System.out.print(d[i] + " ");
		}
		
		
	}

}
