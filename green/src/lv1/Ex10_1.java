package lv1;

import java.util.Random;
import java.util.Scanner;
public class Ex10_1 {

	public static void main(String[] args) {
		/*
		 * # 코인 게임
		 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
		 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
		 * 3. 동전의 앞뒷면을 맞추는 게임이다.
		 */
		
		Random ran = new Random();
		
		int r  = ran.nextInt();
		
		r = ran.nextInt(2);
		
		if(r == 1) { 
			System.out.println("뒷면입니다.");
		}
		else  if(r !=1 ) { // = else
			System.out.println("앞면입니다.");
		}
			
		
			/*
			 * # 홀짝 게임
			 * 1. 1~100사이의 랜덤 숫자를 저장한다.
			 * 2. 저장된 랜덤 숫자를 보여주고,
			 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
			 */
		 Scanner sc = new Scanner(System.in);
		 
		 int r2 = ran.nextInt();
		 
		 r2 = ran.nextInt(100) +1 ;
		 
		 if (r2 %2 == 0) {
			 System.out.println("짝수입니다.");
		 }
		 else if (r2 %2 != 0 ) {
			 System.out.println("홀수입니다.");
		 }
		 
		 
			/*
			 * # 가위(0)바위(1)보(2) 게임[2단계] 
			 * 1. com은 0~2 사이의 랜덤한 숫자를 저장한다.
			 * 2. me는 0~2 사이의 숫자를 입력받는다. 
			 * 3. com과 me를 비교해, 1) 비겼다. 2) 내가 이겼다. 3) 내가 졌다. 를 출력한다.
			 */
		 System.out.println("가위바위보를 입력하세요 . ");
		 int com = sc.nextInt();
		 int me = ran.nextInt(3);
		 
//       내가한것 
//		 System.out.println("가위바위보를 입력하세요 . ");
//		 if(me == com) {
//			 System.out.println("비겻다 ! ");
//		 }
//		 else if (me == 0 && com == 1) {
//			 System.out.println("내가 졋다 ...");
//		 }
//		 else if (me ==0 && com == 2 ) {
//			 System.out.println("내가 이겻다 !");
//		 }
//		 else if ( me == 1 && com == 0 ) {
//			 System.out.println("내가 이겻다 !");
//		 }
//		 else if (me == 1 && com == 2 ) {
//			 System.out.println("내가 졋다 ...");
//		 }
//		 else if ( me == 2 && com == 0) {
//			 System.out.println("내가 졋다 ...");
//		 }
//		 else if (me ==2 && com ==1) {
//			 System.out.println("내가 이겻다 !");
//		 }
//		 else {
//			 System.out.println("잘못 입력했습니다 . ");
//		 }
//		 
		 //
		 int win = 0; // me(1) , com(2)
		 
		 if(me == com) {
			 System.out.println("비겻다 ! ");
		 }
		 else if (me == 0 && com == 1) {
			 System.out.println("컴퓨터 : 주먹");
			 System.out.println("나 : 가위 ");
			 win = 2;
		 }
		 else if (me ==0 && com == 2 ) {
			 System.out.println("나 : 가위");
			 System.out.println("컴퓨터 : 보자기");
			 win = 1;
		 }
		 else if ( me == 1 && com == 0 ) {
			 win = 1;
			 System.out.println("나 : 주먹");
			 System.out.println("컴퓨터 : 가위");
		 }
		 else if (me == 1 && com == 2 ) {
			 win = 2;
			 System.out.println("나 : 주먹");
			 System.out.println("컴퓨터 : 보자기");
		 }
		 else if ( me == 2 && com == 0) {
			 win = 2;
			 System.out.println("나 : 보자기");
			 System.out.println("컴퓨터 : 주먹");
		 }
		 else if (me ==2 && com ==1) {
			 win = 1;
			 System.out.println("나 : 보자기");
			 System.out.println("컴퓨터 : 주먹");
		 }
		 else {
			 System.out.println("잘못 입력했습니다 . ");
		 }
		 if(win == 1 ) {
			 System.out.println("이겻다 !!");
		 }
		 else if(win == 2){
			 System.out.println("컴퓨터가 이겻다 !!");
		 }

		 

	}

}
