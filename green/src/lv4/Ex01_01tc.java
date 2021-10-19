package lv4;

import java.util.Scanner;

public class Ex01_01tc {

	public static void main(String[] args) {
		
		/*
		 * # 최대값 구하기
		 * 1. 가장 큰 값을 찾아 입력한다.
		 * 2. 정답이면 해당 값을 0으로 변경한다.
		 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
		 * 예)
		 * 11, 87, 42, 100, 24
		 * 입력 : 100
		 * 
		 * 11, 87, 42, 0, 24
		 * 입력 : 87
		 * 
		 * 11, 0, 42, 0, 24
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {11, 87, 42, 100, 24};
		
		
		
		
		while (true) {
			int cnt = 0; // 종료하기 위한 변수의 활용 . 
			
			int idx = 0;
			int max = arr[idx] ;
//			int min = arr[idx];
			for(int i=0; i<5; i++) {
				System.out.print(arr[i] + " ");
				if(max < arr[i]) { // 최대값 갱신 . 
					max = arr[i];
					idx = i;
				}
				if(arr[i] == 0 ) { // 종료조건 확인 . 
					cnt ++;
				}
			}
			System.out.println();
			
			//종료문 
			
			if(cnt == 5) {
				break;
			}
			System.out.print("최대값 : ");
			int answer = sc.nextInt();
		
			if(answer == max ) {
				arr[idx] = 0;
			}
			

		}
		
		
		
		
		
	}

}
