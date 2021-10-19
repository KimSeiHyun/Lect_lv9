package lv3;

import java.util.Random;
import java.util.Scanner;

public class Ex01_21 {

	public static void main(String[] args) {
		/*
		 * #  1 to 4
		 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
		 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
		 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
		 * 예)
		 * 4 2 3 1
		 * 입력 : 3
		 * 4 2 3 9
		 * 입력 : 1
		 * 4 9 3 9
		 * ...
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		for (int i =0; i<4; i++) {
			int r = ran.nextInt(4);
			if ( check[i] == 0 ) {
				arr[i] = r;
				check[r] = 1;
			}
			System.out.println(arr[i]);
		}
		
		
	}
}
