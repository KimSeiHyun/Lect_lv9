package lv.test_3;

import java.util.Scanner;

public class lv3_22 {

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
		 *  [p1]1~3 입력 : 2
		 *  [p1]이 p2를 잡았다!
		 *  1 2 3 4 5 6 7 8 
		 *  0 0 0 1 0 0 0 0 
		 *  2 0 0 0 0 0 0 0 
		 */
		Scanner sc = new Scanner(System.in);
		int[] game = {0, 1, 2, 3, 4, 5, 6, 7};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		int turn = 1;
		int idx1 = 0;	int idx2 = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		p1[idx1] = 1;	p2[idx2] = 2;
		while(true) {
			for(int i=0; i<8;i ++) {
				System.out.print(game[i] + " ");
			}System.out.println();
			for(int i=0; i<8;i ++) {
				System.out.print(p1[i] + " ");
			}System.out.println();
			for(int i=0; i<8;i ++) {
				System.out.print(p2[i] + " ");
			}System.out.println();
			System.out.printf("%d턴의 차례입니다 1~3숫자를 입력해주세요 . ",turn);
			int x = sc.nextInt();
			if(turn == 1) {
				for(int i=0;i<8;i++) {
					if(p1[i] == 1) {
						if(i+x >= 8) {
							p1[i] = 0;
							p1[(x-1)-(7-i)] = 1;
							cnt1 ++;
							break;
						}
						p1[i] = 0;
						p1[i+x] = 1;
						break;
					}
				}
			}
			if(turn == 2) {
				for(int i=0;i<8;i++) {
					if(p2[i] == 2) {
						if(i+x >= 8) {
							p2[i] = 0;
							p2[(x-1) - (7-i)] = 2;
							cnt2 ++;
							break;
						}
						p2[i] = 0;
						p2[i+x] = 2;
						break;
					}
				}
			}
			for(int i=0; i<8; i++) {//잡았을경우
				if(p1[i] == 1 && p2[i] == 2) {
					if(turn == 1) {
						p2[i] = 0;
						p2[0] = 2;
					}
					if(turn == 2) {
						p1[i] = 0;
						p1[0] = 1;
					}
				}
			}
			if (cnt1 == 3) {
				System.out.println("1턴의 승리입니다 !! ");
				break;
			}
			if (cnt2 == 3) {
				System.out.println("2턴의 승리입니다 !! ");
				break;
				
			}
			
			
			
			turn = turn == 1? 2: 1;
		
		}//w

		
	}

}
