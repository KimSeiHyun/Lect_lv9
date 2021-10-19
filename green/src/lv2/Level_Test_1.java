package lv2;

import java.util.Scanner;

public class Level_Test_1 {

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
		 * 
		 */
		//	시작 : 10:03
		//	종료 : 10:40
		//	소요 : 37분
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("베스킨라빈스 31 게임 !");
		
		int p1 = 0;
		int p2 = 0;
		int turn = 0;
		int answer = 0 ;
		int br = 0 ;
		boolean t= true;
		while (t) {
			
			System.out.println(turn + "턴 :" + "p1(" + answer +")    br(" + br + ")"   );
			if (turn % 2 == 0) {
				System.out.println("p1의 턴입니다 : ");
				answer = sc.nextInt();
				turn++; 
			} else {
				System.out.println("p2의 턴입니다. : ");
				answer = sc.nextInt();
				turn++; 
			}
			
			if (answer <= 0 || answer > 3) {
				System.out.println("잘못된입력입니다.");
				turn--;
			}
			else {
				br += answer;
				if ( br >= 31 ) {
					if (turn % 2 == 1) {
						System.out.println("p2이 승리했습니다.");
						break;
					} else {
						System.out.println("p1가 승리했습니다.");
						break;
					}
				}
			}
		}
	
	}

}
