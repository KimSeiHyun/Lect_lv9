package lv.test_3;

import java.util.Random;
import java.util.Scanner;

public class lv3_19 {

	public static void main(String[] args) {
		/*
		 * # 기억력 게임
		 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
		 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
		 *    back에 모든 수가 채워지면 게임은 종료된다.
		 * 예)
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		 * 입력1 : 0
		 * 입력2 : 1
		 * 
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		// 셔플(shuffle)
		int i = 0;
		while(i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			i += 1;
		}
		int x = 0;
		while(true) {
			int check = 0;
			int win = 0;
		for(int j=0; j<10; j++) {
			System.out.print(front[j] + " ");
		}
		System.out.println();
		for(int j=0; j<10; j++) {
			System.out.print(back[j] + " ");
		}
		System.out.println();
		System.out.println("같은 숫자가 있는 인덱스를 입력(첫번째) . ");
		int sel1 = sc.nextInt();
		System.out.println("같은 숫자가 있는 인덱스를 입력(두번째) . ");
		int sel2 = sc.nextInt();
		
		for(int j=0; j<10; j++ ) {
			if(front[sel1] == back[j]) {
				check = -1;
			}
		}
		if(check == -1) {
			System.out.println("이미 선택한 값입니다.");
			continue;
		}
			if(front[sel1] == front[sel2]) {
				back[x] = front[sel1];
				back[x+1] = front[sel2];
				x+=2;
			}
		for(int j=0; j<10; j++) {
			if(back[j] != 0) {
				win++;
			}
		}
		if(win == 10) {
			System.out.println("모두 다 맞췃습니다 ! ");
			break;
		}

		}//w
	}

}
