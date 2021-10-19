package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex01_05 {

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

		int i =0;
		while(i<9) {
			int fNum = rn.nextInt(9)+1;
			int check = -1;
			
			for(int j=0; j<9; j++) {
				if(fNum == front[j]) {
					check = i;
				}
			}
			if(check == -1) {
				front[i] = fNum;
				i++;
			}
		}
		
		int j = 0;
		while(j<9) {
			int bNum = rn.nextInt(9)+10;
			int check = -1;
			
			for(int k=0; k<9; k++) {
				if(bNum == back[k]) {
					check = j;
				}
			}
			if( check == -1) {
				back[j] = bNum;
				j++;
			}			
		}
		
		int cnt = 0;
		boolean t = true;
		while(t) {
			
			for(i = 0; i<9; i++) {
				System.out.print(front[i] + "  ");
				if(i%3 == 2) {
					System.out.println();
				}
			}			
			int min = 100;
			int min2 = 101;;
			int temp1 = 0;
			int temp2 = 0;
			System.out.println("작은수부터 차례대로 입력해나가세요.");
			int num = sc.nextInt()-1;

			if (num < 0 || num >8) {
				System.out.println("범위가 벗어난 숫자입니다.");
				continue;
			}
			for(i=0; i<9; i++) {
				if(min > front[i]) {
					min = front[i];	
					temp1 = i;
				}
				if(min2 > front[i] && front[i] != 0) {
					min2 = front[i];	
					temp2 = i;
				}
			}
			if(front[num] == min ) {
				front[temp1] = back[temp1];
				back[temp1] = 0;
				cnt ++;
			}
			if(front[num] == min2 ) {
				front[temp2] = 0;
				cnt ++;
			}
			if(cnt == 18) {
				System.out.println("game clear ! ");
				break;
			}
	
		}//while

	}

}