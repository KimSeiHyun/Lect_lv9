package lv2;

import java.util.Random;
import java.util.Scanner;

public class Level_Test_2 {

	public static void main(String[] args) {
		/*
		 * # Up & Down 게임[2단계]
		 * 1. com 은 랜덤으로 1~100사이를 저장한다.
		 * 2. me 는 1~100사이를 입력한다. 	 
		 * 3. com 과 me 를 비교해서 com 크면 "크다" , com 이작으면 "작다" 힌트제공 
		 * 4. 정답을 맞추면 게임은 종료된다.
		 */
		//	시작 : 09:35
		//	종료 : 09:46
		//	소요 : 11분
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int com = ran.nextInt(100) +1 ;
		int me = 0;
		System.out.println("업다운 게임!");
		System.out.println("com = " + com);
		boolean t = true;
		while (t) {
		 me = sc.nextInt();
	
		if (com == me ) {
			System.out.println("정답 ! ");
			break;
		}
		else if ( com < me ) {
			System.out.println("down!");
		}
		else if ( com > me ) {
			System.out.println("up !");
		}

		
		}
		

	}

}
