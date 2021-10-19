package lv.test_4;

import java.util.Scanner;

public class lv4_13s {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}System.out.println();
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.println("문제1");
		System.out.println("첫번째 인덱스 입력");
		int idx1 = sc.nextInt();
		System.out.println("두번째 인덱스 입력");
		int idx2 = sc.nextInt();
		System.out.println(arr[idx1][idx2]);
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.println("문제2");
		System.out.println("인덱스 값을 추출할 값을 입력");
		int num = sc.nextInt();
		int x = 0;
		int y = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == num) {
					x = i;
					y = j;
				}
			}
		}
		System.out.println("인덱스1 : " + x );
		System.out.println("인덱스2 : " + y );
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int max = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(max < arr[i][j] ) {
					max = 0;
					x = i;
					y = j;
				}
			}
		}
		System.out.println("문제3");
		System.out.println("가장 큰 값의 인덱스 2개 ");
		System.out.println(x + " " + y);
		
		// 문제 4) 값 2개를 입력받아 값 교체
		System.out.println("문제5");
		System.out.println("첫번쨰 값 입력");
		int a = sc.nextInt();
		System.out.println("두번쨰 값 입력");
		int b = sc.nextInt();
		
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int x4 = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == a) {
					x1 = i;
					x2 = j;
				}
				if(arr[i][j] == b) {
					x3 = i;
					x4 = j;
				}
			}
		}System.out.println();
		int temp = arr[x1][x2];
		arr[x1][x2] = arr[x3][x4];
		arr[x3][x4] = temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}System.out.println();

	}

}
