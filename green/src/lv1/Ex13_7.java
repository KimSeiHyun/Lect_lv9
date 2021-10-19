package lv1;

import java.util.Scanner;

public class Ex13_7 {

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

		boolean a = true;
		System.out.println("베스킨라빈스게임! ");
		System.out.println("p1 차례입니다. 숫자를 입력해주세요 .");
		while (a) {
			turn ++; 

			br = p1 + p2 ;
			if (turn %2 == 1 ) {
				p1 = sc.nextInt();
				System.out.println(turn+"턴 : "+ "p1("+p1  +")   br(" + br+ ")" );
			}
			else    {
				p2 = sc.nextInt();
				System.out.println(turn+"턴 : "+ "p2("+p2  +")   br(" + br+ ")" );
				}

			}
		
		}
		}
	

