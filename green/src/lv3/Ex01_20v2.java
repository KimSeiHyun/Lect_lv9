package lv3;

import java.util.Random;
import java.util.Scanner;

public class Ex01_20v2 {

	public static void main(String[] args) {
		/*
		 * # 기억력 게임
		 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
		 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
		 *    back에 모든 수가 채워지면 게임은 종료된다.
		 * 예)
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		 * 입력1 : 0
		 * 입력2 : 1
		 * 
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
		 */
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		// 셔플(shuffle)
		int i = 0;
		while(i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			i += 1;
		}
		
		while(true) {
		//출력
		System.out.print("카드번호: ");
		for(int j=0; j<10; j++) {
			System.out.print(j+1 + " ");
		}
		System.out.println();
		System.out.print("카드의값: ");
		for(int j=0; j<10; j++) {
			System.out.print(front[j] + " ");
		}
		System.out.println();
		System.out.print("게임카드: ");
		for(int j=0; j<10; j++) {
			System.out.print(back[j] + " ");
		}
		
		//입력
		System.out.print("\n카드번호 입력1 : ");
		int idx1 = scan.nextInt() -1; // 인덱스로 변환 
		System.out.print("\n카드번호 입력2 : ");
		int idx2 = scan.nextInt() -1; // 인덱스로 변환 

		if(back[idx1] != 0) {
			System.out.println("이미답을 맞춘 카드입니다.");
			continue;
		}
		if ( idx1 == idx2 ) {
			System.out.println("같은 카드를 고르면 안되요!");
		}
		else {
			// 카드의 값을 검사 (일치하는가 )
			if (front[idx1] == front[idx2]) {
				System.out.println("딩동댕!");
				back[idx1] = front[idx1];
				back[idx2] = front[idx2];

			}
			else {
				System.out.println("땡 ");
			}
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
