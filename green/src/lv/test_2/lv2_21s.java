package lv.test_2;

import java.util.Scanner;

public class lv2_21s {

	public static void main(String[] args) {
		/*
		 * # 베스킨라빈스31
		 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
		 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
		 * 3. br이 31을 넘으면 게임은 종료된다.
		 * 4. 승리자를 출력한다.
		 * 
		 * 예) 
		 * 1턴 : p1(2)	br(2)
		 * 2턴 : p2(1)	br(3)
		 * 3턴 : p1(3)	br(6)
		 * ...
		 */
		Scanner sc= new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 1;
		System.out.println("베스킨라빈스 31 game !! ");
		
		while(true) {
			System.out.println(turn+"의 차례입니다 . 1~3숫자를 입력해주세요 ! ");
			int num = sc.nextInt();
			br += num;
			
			
			System.out.printf("%d턴 : p%d(%d)   br(%d)\n",turn,turn,num,br);
			if(br > 30) {
				if(turn == 1) {
					System.out.println("p2가 이겼습니다 ! ");
				}
				if(turn == 2) {
					System.out.println("p1이 이겻습니다 ! ");
				}
				break;
			}
			turn = turn == 1? 2 : 1;
		}//w
		
	}

}
