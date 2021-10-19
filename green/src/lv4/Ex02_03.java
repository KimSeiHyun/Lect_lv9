package lv4;

import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		Scanner sc = new Scanner(System.in);
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.println("문제1. 인덱스 2개를 입력받아 값 출력.");
		System.out.print("첫번째 인덱스를 입력하세요 .");
		int idx1 = sc.nextInt();
		System.out.print("두번째 인덱스를 입력하세요 .");
		int idx2 = sc.nextInt();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == arr[idx1][idx2]) {
					System.out.println(arr[i][j]);
				}
			}
		}
		
		System.out.println();
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.println("문제2. 값을 입력받아 인덱스 2개 출력.");
		int num = sc.nextInt();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == num) {
					System.out.println(i + " , " + j );
				}
			}
		}
		
		System.out.println();
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int max =0;
		int temp1 = 0;
		int temp2 = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if ( max < arr[i][j]) {
					max = arr[i][j];
					temp1 = i;
					temp2 = j;
				}
			}
		}
		System.out.println("문제3. 가장 큰 값의 인덱스 2개 출력 :\n" + temp1 + " , " + temp2);
		
		System.out.println();
		// 문제 4) 값 2개를 입력받아 값 교체
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		System.out.println("문제4. 값 2개를 입력받아 값 교체 ");
		System.out.print("첫번째 값을 입력해주세요 . ");
			num = sc.nextInt();
		System.out.print("두번째 값을 입력해주세요 . ");
		int num2 = sc.nextInt();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == num) {
					a = i;
					b = j;
				}
				if(arr[i][j] == num2) {
					c = i;
					d = j;
				}
			}

		}
		
		arr[a][b] = num2;
		arr[c][d] = num;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}//clear

}
