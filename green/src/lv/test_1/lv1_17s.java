package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_17s {

	public static void main(String[] args) {
		/*
		 * # 코인 게임
		 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
		 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
		 * 3. 동전의 앞뒷면을 맞추는 게임이다.
		 */
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int coin = rn.nextInt(2);
		System.out.println("--------");
		System.out.println("관리자모드");
		System.out.println("coin의 숫자 : " + coin);
		System.out.println("---------");
		System.out.println("동전의 앞뒷면을 선택해주세요 . (0:앞  1:뒤)");
		int sel = sc.nextInt();
		
		if(sel == 1 && coin == 1) {
			System.out.println("정답 ! 코인은 뒷면이였습니다. ");
		}
		if(sel == 0 && coin == 0) {
			System.out.println("정답 ! 코인은 앞면이였습니다. ");
		}
		if(sel != coin ) {
			System.out.println("땡 !");
		}

	}

}
