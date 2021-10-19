package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_18 {

	public static void main(String[] args) {
		/*
		 * # 홀짝 게임
		 * 1. 1~100사이의 랜덤 숫자를 저장한다.
		 * 2. 저장된 랜덤 숫자를 보여주고,
		 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
		 */
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int ranNum = rn.nextInt(100)+1;
		System.out.println("저장된 랜덤 숫자는 : " + ranNum);
		System.out.println("1.홀수");
		System.out.println("2.짝수");

		System.out.print("번호를 선택하세요 : ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			if(ranNum %2 == 1) {
				System.out.println("정답 ! ");
			}
			if(ranNum %2 != 1) {
				System.out.println("땡 !  ! ");
			}
		}
		if(choice == 2) {
			if(ranNum %2 == 0) {
				System.out.println("정답 ! ");
			}
			if(ranNum %2 != 0) {
				System.out.println("땡 !! ");
			}
			
		}

		
	}

}
