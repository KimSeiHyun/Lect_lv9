package lv1;

import java.util.Scanner;

public class Ex13_7tc {

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
		int p1 = 0;
		int p2 = 0;
		int br = 0;
		int turn = 0;

		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			System.out.println("br : " + br);
			// turn에 따를 입력 .
			int answer = 0;

			if (turn % 2 == 0) {
				// p1
				System.out.println("p1 : ");
				answer = sc.nextInt();
			} else {
				// p2
				System.out.println("p2 : ");
				answer = sc.nextInt();
			}

			if (answer <= 0 || answer > 3) {
				System.out.println("잘못된입력입니다");
				turn++; // turn --;

			} else {
				br += answer; 
				// 게임숫자가 누적해서 증가 .
				// 종료
				if (br >= 31) {
					if (turn % 2 == 0) {
						System.out.println("p2가 승리햇다.");
					} else {
						System.out.println("p1가 승리햇다.");
					}
					isRun = false;
				}
			}

			turn++;
		}
	}

}
