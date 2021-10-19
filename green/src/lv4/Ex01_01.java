package lv4;

import java.util.Scanner;

public class Ex01_01 {

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
		
		int[] arr = {11, 87, 42, 100, 24};
		
		Scanner sc = new Scanner(System.in);
		
		boolean t = true;
		int cnt = 0;
		while(t) {
			int max = 0;
			int k = 0;
			
			for(int i=0; i<5; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("가장 큰 값부터 입력해주세요 . ");
			int input = sc.nextInt();
			
			for (int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(max < arr[j]) {
						max = arr[j];
						k = j;
					}
				}
			}
			if(max == input) {
				arr[k] = 0;			
				cnt ++;
			}
			
			if(cnt ==5 ) {
				System.out.println("정답을 다 맞췄습니다. 게임이 종료됩니다.");
				t = false;
			}
			
		}//while

	}

}
