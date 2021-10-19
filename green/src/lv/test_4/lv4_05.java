package lv.test_4;

import java.util.Random;
import java.util.Scanner;

public class lv4_05 {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50을 ==> 1 to 18
		 * 1. 구글에서 1 to 50 이라고 검색한다.
		 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
		 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
		 * 4. 숫자 1~9는 front 배열에 저장하고,
		 *    숫자 10~18은 back 배열에 저장한다.
		 */
		
		// 변수 : 변할 수 있는 수
		// 상수 : 변할 수 없는 수 
		// 상수는 코드가 복잡할 경우 밑에서 확인이 햇갈릴 수가 있어 
		// 암묵적으로 상수의 이름은 전부다 대문자로 통일한다.
		
		final int SIZE = 9; // 상수
		
		int[] front = new int[SIZE];
		int[] back  = new int[SIZE];
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		while(x <9) {
			int check  = 0;
			int num = rn.nextInt(9)+1;
			for(int i=0; i<9; i++) {
				if(front[i] == num) {
					check = 1;
				}
			}
			if(check == 0) {
				front[x] = num;
				x++;
			}
			
		}
		x = 0;
		while(x <9) {
			int check  = 0;
			int num = rn.nextInt(9)+10;
			for(int i=0; i<9; i++) {
				if(back[i] == num) {
					check = 1;
				}
			}
			if(check == 0) {
				back[x] = num;
				x++;
			}
			
		}
		int cnt = 0;
		while(true) {
			
			int min = 100;
		for(int i=0; i<9; i++) {
			if(min > front[i]) {
				min = front[i];
			}
			if(min > front[i]) {
				min = back[i];
			}
			if(front[i] == 100) {
				System.out.print("   ");
			}
			else {
				System.out.print(front[i] + " ");
			}
			
			if(i%3 == 2) {
				System.out.println();
			}
		}System.out.println();
		for(int i=0; i<9; i++) {
			System.out.print(back[i] + " ");
			if(i%3 == 2) {
				System.out.println();
			}
		}System.out.println();
		
		System.out.println("작은수부터 지워나가세요 ! ");
		int num = sc.nextInt();
		if(cnt < 9) {
		for(int i=0; i<9; i++) {
			if(front[i] == min && num == i) {
				front[i] = back[i];
				cnt ++;
			}			
		}
		}
		else {
			for(int i=0; i<9; i++) {
				if(front[i] == min && num == i) {
					front[i] = 100;
					cnt ++;
				}			
			}
		}
		if(cnt == 18) {
			System.out.println("게임 클리어 !");
			break;
		}
		
		}//w

	}

}
