package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_23s {

	public static void main(String[] args) {
		/*
		 * # 가운데 숫자 맞추기 게임
		 * 1. 150~250 사이의 랜덤 숫자 저장
		 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
		 * 예)
		 * 		249		: 4
		 */
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가운데 숫자 맞추기 게임 ! ");
		
		int ranNum = rn.nextInt(101)+150;
		System.out.println("관리자 시점 랜덤 숫자 : " + ranNum);
		
		System.out.println("가운데 숫자를 입력해주세요 ! ");
		int num = sc.nextInt();
		
		int temp = ranNum %100 / 10;
		
		if(num == temp) {
			System.out.println("정답!");
		}
		else {
			System.out.println("오답 ! ");
		}

		
	}

}
