package lv3;

import java.util.Scanner;

public class Ex01_23tc {

	public static void main(String[] args) {
		/*
		 * # 미니마블
		 * 1. 플레이어는 p1과 p2 2명이다.
		 * 2. 번갈아가며 1~3 사이의 숫자를 입력해 이동한다.
		 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
		 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
		 * 4. 먼저 3바퀴를 돌면 이긴다.
		 *    
		 *  [p2]1~3 입력 : 1
		 *  1 2 3 4 5 6 7 8 
		 *  0 1 0 0 0 0 0 0 
		 *  0 0 0 2 0 0 0 0 
		 *  
		 *  [p1]1~3 입력 : 3
		 *  [p1]이 p2를 잡았다!
		 *  1 2 3 4 5 6 7 8 
		 *  0 0 0 0 1 0 0 0 
		 *  2 0 0 0 0 0 0 0 
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		int turn = 0;
		
		int idx1 = 0;	
		int idx2 = 0;
		p1[idx1] = 1; // 0좌표에 캐릭터 배치 	
		p2[idx2] = 2;

		int win1 = 0; // 1 2 3
		int win2 = 0;
		
		while(true) {
			System.out.println("win1 : " + win1 + "바퀴" );
			System.out.println("win2 : " + win2 + "바퀴" );
			for(int i=0; i<8; i++) {
				System.out.print(game[i] + " ");
			}
			System.out.println();
			for(int i=0; i<8; i++) {
				System.out.print(p1[i] + " ");
			}
			System.out.println();
			for(int i=0; i<8; i++) {
				System.out.print(p2[i] + " ");
			}
			System.out.println();
			
			//종료
			if(win1 == 3 ) {
				System.out.println("3바퀴를 돌았다, p1의 승리.");
			}
			else if(win2 == 3 ) {
				System.out.println("3바퀴를 돌았다, p2의 승리.");
			}
			
			if(turn %2 == 0) {
			System.out.println("p2 : ");
			turn++;
			}
			else { 
				System.out.println("p1 :");
				turn--;
			}
			int move = sc.nextInt();
			
			//이동 
			
			if(turn %2 == 0) {
				int tempIdx = idx1 + move;
				
				if(tempIdx < 8  ) {
					p1[idx1] = 0;
					p1[tempIdx] = 1;
				}
				else { // 바퀴 수 증가. 
					p1[idx1] = 0;
					tempIdx %= 8;
					p1[tempIdx] = 1; // 11 > 2
					win1 ++;
				}
				
				//잡았다 확인
				if (p1[tempIdx] != 0 ) { 
					System.out.println("p1를 잡았다 !");
					p1[idx1] = 0;
					idx1 = 0;
					p1[idx1] = 1;
				}
				idx1= tempIdx;

				//인덱스 갱신 

			}
			else {
				int tempIdx = idx2 + move;
				if(tempIdx < 8  ) {
					p2[idx2] = 0;
					p2[tempIdx] = 2;
				}
				else { // 바퀴 수 증가. 
					p2[idx2] = 0;
					tempIdx %= 8;
					p2[tempIdx%8] = 2; // 11 > 2
					win2 ++;
				}
				//잡았다 확인
				if (p1[tempIdx] != 0 ) { 
					System.out.println("p1를 잡았다 !");
					p1[idx1] = 0;
					idx1 = 0;
					p1[idx1] = 1;
				}
				
				idx2 = tempIdx; 
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
