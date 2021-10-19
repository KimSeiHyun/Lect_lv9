package lv3;

import java.util.Scanner;

public class Ex01_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = { 10, 20, 30, 40, 50 };
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1  , 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}
		
		int idx = 0;
		int a = 0;
		System.out.println("문제1: 0~4값을 입력해주세요 . ");
		int inIdx = sc.nextInt();
		int inIdx2 = sc.nextInt();
		while(idx < 5) {
			if (inIdx >4 || inIdx  <0  ) {
				System.out.println("범위를 벗어난 숫자입니다.");
				break;
			}
			if (inIdx2 >4 || inIdx2  <0 ) {
				System.out.println("범위를 벗어난 숫자입니다.");
				break;
			}
			if ( idx == inIdx && inIdx >= 0 && inIdx <5) {
				a = arr[idx];
				arr[idx] = arr[inIdx2];
			}
			 if (idx == inIdx2 && inIdx2 >= 0 && inIdx2 <5) {
				arr[idx] = a;				
			}
			if(	inIdx == inIdx2 ) {
				System.out.println("중복된 숫자입니다.");
				break;
			}
			idx ++;
		}
		
		for (int i =0; i<5; i++) {
			System.out.print(arr[i] + "  ");
		}
		
//		int[] arr = { 10, 20, 30, 40, 50 };
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40 , 값2 입력 : 20
		// {10, 40, 30, 20, 50}
		System.out.println();
		System.out.println("문제2 : 10,20,30,40,50중에 2개를 입력해주세요 .  ");
		int b = sc.nextInt();
		int c = sc.nextInt();
		int a2 = 0;
		for(int i=0; i<5; i++) {
			if (arr[i] == b) {
				a2 = arr[i];
				arr[i] = c;
			}
			if (arr[i] == c ) {
				arr[i] = a2;
			}
		}
			
		for (int i =0; i<5; i++) {
			System.out.print(arr[i] + "  ");
		}
		
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예 3) 학번1 입력 : 1002 , 학번2 입력 : 1003
		// {87, 45, 11, 98, 23}

	}

}
