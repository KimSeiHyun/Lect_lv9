package lv.test_2;

import java.util.Scanner;

public class lv2_08 {

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
		
		Scanner sc = new Scanner(System.in);
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 1;
		
		boolean t = true;
		System.out.println("베스킨라빈스31 game ! ");
		while (t) {
			
			System.out.printf("%d턴의 차례입니다 .",turn);
			int num = sc.nextInt();
			if(num <1 || num >3) {
				System.out.println("1~3까지만 입력해주세요 !");
				continue;
			}

			br += num;
			System.out.printf("%d턴 : p%d(%d)   br(%d)\n",turn,turn,num,br);
			if(br >30) {
				if(turn == 1) {
					System.out.println("2턴의 승리 ! ");
				}
				else {
					System.out.println("1턴의 승리 ! ");
				}
				t = false;
			}
			turn = turn == 1? 2 : 1;
		}

	}

}
