package lv.test_3;

import java.util.Scanner;

public class lv3_14s {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1  , 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}
		System.out.println("문제1");
		System.out.println("인덱스1 입력");
		int idx1 = sc.nextInt();
		System.out.println("인덱스2 입력");
		int idx2 = sc.nextInt();
		
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40 , 값2 입력 : 20
		// {10, 20, 30, 40, 50}
		System.out.println("문제2");
		System.out.println("값1 을 입력 ");
		int num1 = sc.nextInt();
		System.out.println("값2 을 입력 ");
		int num2 = sc.nextInt();
		int x = 0;
		int y = 0;
		for(int i=0; i<5; i++) {
			if(arr[i] == num1) {
				x = i;
			}
			if(arr[i] == num2) {
				y = i;
			}
		}
		
		temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		
		for(int i=0;i<5; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예 3) 학번1 입력 : 1002 , 학번2 입력 : 1003
		// {87, 45, 11, 98, 23}
		System.out.println("문제3");
		System.out.println("학번1 입력 : ");
		int a = sc.nextInt();
		System.out.println("학번2 입력 : ");
		int b = sc.nextInt();
		for(int i=0; i<5; i++) {
			if(a == hakbuns[i]) {
				x = i;
			}
			if(b == hakbuns[i]) {
				y = i;
			}
		}
		
		temp = scores[x];
		scores[x] = scores[y];
		scores[y] = temp;
		
		for(int i=0; i<5; i++) {
			System.out.print(scores[i] + " ");
		}System.out.println();

	}

}
