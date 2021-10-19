package lv3;

import java.util.Scanner;

public class Ex01_07tc {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		// 문제1)  인덱스(방번호)를 입력하면 값출력
		int a[] = { 10,20,30,40,50 };
		// 예) 3 ==> 40
		System.out.println("인덱스 입력 : 0~4 ");
		int idx = sc.nextInt();
		System.out.println(a[idx]);
		// 문제2) 아래배열중 가장큰값 출력 
		int b[] = { 12,54,23,87,1 };
		// 예) 87
		
		int max = b[0]; //   초기값이 0은 아니지만 편의성이있음
		
		for ( int i=0; i<5; i++) {
			if(max <b[i] ) {
				max = b[i];
			}
		}
		System.out.println("max : " + max);
		
		
		// 문제3) 아래 배열중 홀수의 개수 출력 
		int c[] = { 12,54,23,87,1 };
		// 예) 홀수의 개수 : 3
		int cnt = 0;
		for (int i=0; i<5; i++) {
			if(c[i]%2 == 1) {
				cnt ++;
			}
		}
		System.out.println("cnt : " + cnt );
		
		
		// 문제4) 아래배열을 거꾸로 저장 
		int d[] = { 1,2,3,4,5 };
		int e[] = { 0,0,0,0,0 };
		//예)  ={5,4,3,2,1};
		
		for(int i=0; i<5; i++) { // i : 0 1 2 3 4   
			e[i] = d[4-i];		 //   : 4 3 2 1 0 
			System.out.print(e[i] + "   ");
		}
	}

}
