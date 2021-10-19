package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex12_3 {


	public static void main(String[] args) {
		/*
		 * # 가위바위보 게임[2단계]를
		 *   if - else if 구문으로 변경해보자.
		 *   가위 0 바위 1 보 2
		 *   나 = a 컴퓨터 = com
		 *   시작 : 9:33
		 *   종료 : 9:40
		 *   소요 : 7분
		 */ 
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위바위보 게임 !");
		System.out.println("가위바위보를 입력하세요 : 가위 0 , 바위 1 , 보 2");
		int me = sc.nextInt();
		int com = ran.nextInt(3);
		if ( me == com ) {
			System.out.println("비겼다 !" );
		}
		else if (me == 0 && com == 1) {
			System.out.println("졋다!");
		}
		else if (me == 0 && com == 2) {
			System.out.println("이겻다 !");
		}
		else if (me == 1 && com == 0) {
			System.out.println(" 이겻다 !");
		}
		else if (me == 1 && com == 2) {
			System.out.println("졋다!");
		}
		else if (me == 2 && com == 0) {
			System.out.println("이겻다 !");
		}
		else if (me == 2 && com == 1) {
			System.out.println("졋다!");
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
			

	}
}
