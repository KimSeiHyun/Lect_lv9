package lv.test_3;

import java.util.Random;
import java.util.Scanner;

public class lv3_20 {

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
		int[] arr = new int[4];
		int[] check = new int[4];
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int x = 0;
		while (x <4) {//랜덤값부여 
			int ranNum = rn.nextInt(4)+1;
			int check1 = 0;
			for(int i=0; i<4; i++ ) {
				if(arr[i] == ranNum ) {
					check1 = 1;
				}
			}
			if(check1 == 0) {
				for(int i=0; i<4 ; i++) {
					if(arr[i] == 0 ) {
						arr[i] = ranNum;
						break;
					}
				}
			}
			else {
				x--;
			}
			x++;
		}//w
		int cnt = 0;
		while(true) {
			int min =100;
		for(int i=0; i<4 ; i++) {
			System.out.print(arr[i] + " ");
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println();
		
		System.out.println("작은수의 인덱스를  입력해주세요 . ");
		int num = sc.nextInt();
		if(arr[num] == min) {
			arr[num] = 9;
			cnt ++;
		}
		if(cnt == 4) {
			System.out.println("게임 클리어 .");
			break;
		}
		
		}//w2
		
		
		
	}

}
