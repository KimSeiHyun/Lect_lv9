package lv3.test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		/* 
		 * # ƽ����
		 * === ƽ���� ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [ ][ ][ ]
		 * [p1]�ε��� �Է� : 6
		 * === ƽ���� ===
		 * [X][X][O]
		 * [ ][O][ ]
		 * [O][ ][ ]
		 * [p1]�¸�
		 * 
		 */
		// ���� 09:11
		// ���� 10:45
		// �ҿ� 1�ð�34��
		
		int arr[] = new int[9];
		int turn = 1;
		
		Scanner sc = new Scanner(System.in);
		
		boolean t = true;
		
		System.out.println("----ƽ����----");
		for(int i =0; i<9; i++) {
			if ( arr[i] == 0) {
				System.out.print("[ ]");
			}
			if (i%3 ==  2) {
				System.out.println();
			}		
		}
		while (t) {
			

			System.out.printf("player%d�� �����Դϴ�.1~9���� ���ڸ� �Է����ּ��� . " , turn);
			int player = sc.nextInt()-1;	
			if(player > 8 ) {
				System.out.println("������ ��� �����Դϴ�.");
				continue;
			}
			if(player < 0 ) {
				System.out.println("������ ��� �����Դϴ�.");
				continue;
			}
			if (arr[player] != 0 && turn == 1) {
				System.out.println("�̹� ���� �����Դϴ�");
				turn = 2;
			}
			else if (arr[player] != 0 && turn == 2) {
				System.out.println("�̹� ���� �����Դϴ�");
				turn = 1;
			}
			if(turn == 1) {
				arr[player] = 1;
				turn++;
			}
			else if ( turn == 2){
				arr[player] = 2;
				turn--;
			}
			

			for(int i =0; i<9; i++) {
				if ( arr[i] == 0) {
					System.out.print("[ ]");
				}
				else if (arr[i] == 1) {
					System.out.print("[O]");
				}
				else if (arr[i] == 2) {
					System.out.print("[X]");
				}
				if (i%3 ==  2) {
					System.out.println();
				}		
			}

			for(int i=0; i<9; i+=3) {
				if(arr[i] == 1 && arr[i+1] == 1 & arr[i+2] == 1) {
					System.out.println("player1�� �¸��Դϴ�.");
					t = false;
				}
			}
			for(int i=0; i<3; i++) {
				if(arr[i] == 1 && arr[i+3] == 1 & arr[i+6] == 1) {
					System.out.println("player1�� �¸��Դϴ�.");
					t = false;
				}
			}
			for(int i=0; i<1; i++) {
				if(arr[i] == 1 && arr[i+4] == 1 & arr[i+8] == 1) {
					System.out.println("player1�� �¸��Դϴ�.");
					t = false;
				}
			}
			for(int i=2; i<3; i++) {
				if(arr[i] == 1 && arr[i+2] == 1 & arr[i+4] == 1) {
					System.out.println("player1�� �¸��Դϴ�.");
					t = false;
				}
			}
			
			for(int i=0; i<9; i+=3) {
				if(arr[i] == 2 && arr[i+1] == 2 & arr[i+2] == 2) {
					System.out.println("player2�� �¸��Դϴ�.");
					t = false;
				}
			}
			for(int i=0; i<3; i++) {
				if(arr[i] == 2 && arr[i+3] == 2 & arr[i+6] == 2) {
					System.out.println("player2�� �¸��Դϴ�.");
					t = false;
				}
			}
			for(int i=0; i<1; i++) {
				if(arr[i] == 2 && arr[i+4] == 2 & arr[i+8] == 2) {
					System.out.println("player2�� �¸��Դϴ�.");
					t = false;
				}
			}
			for(int i=2; i<3; i++) {
				if(arr[i] == 2 && arr[i+2] == 2 & arr[i+4] == 2) {
					System.out.println("player2�� �¸��Դϴ�.");
					t = false;
				}
			}

		
		}
		

		
	}

}
