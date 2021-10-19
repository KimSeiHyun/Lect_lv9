package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex12_1 {

	public static void main(String[] args) {
		// 직접구현 1. 가위바위보 3단계 
				// 시작 9:28
				// 종료 9:30
				// 소요 2분 
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		/*
		 * # 가위바위보 게임[2단계]를
		 *   if - else if 구문으로 변경해보자.
		 *   가위 0 바위 1 보 2
		 *   나 = a 컴퓨터 = com
		 *   시작 : 9:33
		 *   종료 : 9:40
		 *   소요 : 7분
		 */ 
		

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
			
		/*
		 * # 홀짝 게임
		 * 1. 1~100사이의 랜덤 숫자를 저장한다.
		 * 2. 저장된 랜덤 숫자를 보여주고,
		 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
		 * 시작 : 9:41
		 * 종료 : 9:45
		 * 소요시간 : 4분
		 */
		
		int random = ran.nextInt(100)+1;
		System.out.println("홀짝게임 !");
		if (random %2 == 0  ) {
			System.out.println(random);
			System.out.println("짝수입니다 !");
		}
		else {
			System.out.println(random);
			System.out.println("홀수입니다 .");
		}
			
		/*
		 * # 코인 게임
		 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
		 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
		 * 3. 동전의 앞뒷면을 맞추는 게임이다.
		 * 시작 : 9:47
		 * 종료 : 9:59
		 * 소요시간 : 12분
		 */
		
		System.out.println("동전 앞뒤 맞추기 게임 ! ");
		System.out.println("숫자를 입력해주세요 : 앞 : 0 , 뒤 : 1");
		int coin = ran.nextInt(2);
		int incoin = sc.nextInt();
		
		if (coin == 1 && incoin == 1) {
			System.out.println("정답 !");
		}
		else if (coin == 1 && incoin == 0) {
			System.out.println("틀렸습니다.");
		}
		else if (coin == 0 && incoin == 0) {
			System.out.println("정답 ! ");
		}
		else if (coin == 0 && incoin == 1) {
			System.out.println("틀렸습니다.");
		}
		else {
			System.out.println("범위를 벗어난 숫자입니다. .");
		}
		
		/*
		 * # 놀이기구 이용제한
		 * 1. 키를 입력받는다.
		 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
		 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
		 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
		 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
		 *    시작 : 10 : 03
		 *    종료 : 10 : 11
		 *    소요시간 : 8분
		 */
			
		System.out.println("놀이기구 이용제한 !");
		System.out.println("자신의 키를 입력하세요 !");
		int cm = sc.nextInt();
		
		
		if (cm > 120 ) {
			System.out.println("놀이기구를 이용할 수 있습니다.");
		}
		else if ( cm < 120) {
		System.out.println("놀이기구를 이욯불가.");
		System.out.println("부모님과 함께 오셧나요 ?  yes : 1  , no : 0");
		int to = sc.nextInt();
		 if ( to == 1 ) {
			 System.out.println("놀이기구 사용 가능 !");
		 }
		 else {
			 System.out.println("놀이기구 이용불가 !");
		 }
		
		}
		
		/*
		 * # 영수증 출력[1단계]
		 * 1. 메뉴판을 출력한다.
		 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		 * 3. 현금을 입력받는다.
		 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
		 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
		 *  시작 : 10 : 12
		 *  종료 : 10 : 50
		 *  소요 : 38분 ..
		 */
		
		int menu1 = 1000;
		int menu2 = 2000;
		int menu3 = 3000;
		int myMoney = 2100;
		System.out.println("----------메뉴----------");
		System.out.println("menu1 = " + menu1);
		System.out.println("menu2 = " + menu2);
		System.out.println("menu2 = " + menu2);
		System.out.println("----------메뉴----------");
		
		System.out.println("주문할 메뉴와 현금을 입력해주세요 . .");
		System.out.println("1 = 1000원 , 2 = 2000원 , 3 = 3000원");
		int inMenu = sc.nextInt();
		int inMoney = sc.nextInt();
		int total = 0;
		
		if (inMenu == 1 ) {
			total = menu1;
		}
		else if (inMenu == 2) {
			total = menu2;
		}
		else if  (inMenu == 3) {
			total = menu3;
		}
		else {
			System.out.println("없는 메뉴입니다.");
		}
		

		if (total != 0  ) {
			if (inMenu == 1 && total < myMoney) {
				System.out.println("---------영수증--------");
				System.out.println("나의 현금 = " + myMoney);
				System.out.println("menu1 의 가격 = " + menu1);
				System.out.println("현재 잔액 = " + (myMoney - total));				
			}
			else if (inMenu == 2 && total < myMoney) {
				System.out.println("---------영수증--------");
				System.out.println("나의 현금 = " + myMoney);
				System.out.println("menu2 의 가격 = " + menu2);
				System.out.println("현재 잔액 = " + (myMoney - total));	
		}
			else if (inMenu == 3 && total < myMoney) {
				System.out.println("---------영수증--------");
				System.out.println("나의 현금 = " + myMoney);
				System.out.println("menu3 의 가격 = " + menu3);
				System.out.println("현재 잔액 = " + (myMoney - total));	
		}
			else {
				if ( total > myMoney) {
					System.out.println("현금이 부족합니다.");
				}
			}

	
		}

	}
}