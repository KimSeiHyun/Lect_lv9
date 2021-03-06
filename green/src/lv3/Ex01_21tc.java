package lv3;

import java.util.Random;
import java.util.Scanner;

public class Ex01_21tc {

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
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		int gameNum = 1;
		
		int idx = 0;
		
		while(idx < 4) { // arr 배열에 차곡차곡 중복없는 값을 저장 (1~4)
			int rNum = rn.nextInt(4) +1;
			if (check[rNum-1] == 0 ) {
				arr[idx] = rNum;
				check[rNum-1] = 1;
				idx++;
			}
		}
		
		while(true) {
		System.out.print("번호 :");
		for(int i=0; i<4; i++) {
			System.out.print(i+1 + " ");
		}
		System.out.print("\n블럭 :");
		for(int i=0; i<4; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n작은 수 부터 입력 : ");
		int input = sc.nextInt()-1;
		
		if ( arr[input] == gameNum) {
			System.out.println("딩동댕!");
			gameNum++;
		}
		else {
			System.out.println("땡");
		}
		
		if(gameNum > 4 ) {
			break;
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
