package lv3.test;

import java.util.Random;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		/*
		 * #  1 to 4
		 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
		 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
		 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
		 * 예)
		 * 4 2 3 1
		 * 입력 : 3
		 * 4 2 3 9
		 * 입력 : 1
		 * 4 9 3 9
		 * ...
		 */
		// 시작 02:04
		// 종료 06:09
		// 소요 4시간4분 
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[4];
		int arr2[] = new int[4];
		int arr3[] = {1,2,3,4};
		
		int cnt = 1;
		int score = 0;
		
		boolean t = true;
		int a = 0;
		while(a<4) {
			int num = ran.nextInt(4)+1;
			if(arr2[num-1] == 0) {
				arr[a] = num;
				arr2[num-1] = 1;
				a++;
			}
		}

		while(t) {
			System.out.print("위치값 : ");
			for(int i=0; i<4; i++) {
				System.out.print(arr3[i] + " ");
			}
			System.out.println();
			System.out.print("저장값 : ");
			for(int i=0; i<4; i++) {
				System.out.print(arr[i] + " ");
			}
			 if( score >= 36) {
				 System.out.println();
				 System.out.println("정답을 다 맞췃습니다. 게임을 종료합니다.");
				 break;
			 }
			System.out.println();
			System.out.println("작은수부터 저장값의 위치값을 입력해주세요 . ");
			int in = sc.nextInt()-1;
			if (in <0 || in > 3 ) {
				System.out.println("지정된 범위가 벗어났습니다.");
				continue;
			}

			 if(arr[in] == cnt ) {
				 cnt++;
				 arr[in] =9;
				 score += 9;
				 System.out.println("정답 ! ");
			 }
			 else { 
				 System.out.println("틀렸습니다 ! ");
			 }
			 		 
		}
		

		
	}

}
