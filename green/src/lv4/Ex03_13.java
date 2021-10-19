package lv4;

import java.util.Scanner;

public class Ex03_13 {

	public static void main(String[] args) {
		/*
		 * # 나만의 마블
		 * 옷 □ □ □ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ □ □ □ □
		 */
		
		// 옷이 이동숫자를 입력받을때마다 이동 하는데 
		// 외각으로만 이동 아래그림참조 
		/*
		 * # 나만의 마블
		 * 옷 □ □ □ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ □ □ □ □
		 */
		 //입력 ==> 3 
		/*
		 * # 나만의 마블
		 * □ □ □ 옷 □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ □ □ □ □
		 */
		 //입력 ==> 3 
		/*
		 * # 나만의 마블
		 * □ □ □ □ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ 옷 
		 * □ ■ ■ ■ □ 
		 * □ □ □ □ □
		 */
		// 시작 12:17
		// 종료 02:50
		// 소요 02:33
		
		int arr[][] = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i >0 && i < 4) {
					arr[i][1] = 1;
					arr[i][2] = 1;
					arr[i][3] = 1;
				}
			}
		}
		arr[0][0] = 2;
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(arr[i][j] == 0) {
						System.out.print("□ ");
					}
					if(arr[i][j] == 1) {
						System.out.print("■ ");
					}
					if(arr[i][j] == 2) {
						System.out.print("옷 ");
					}
				}
				System.out.println();
			}
			
			System.out.println("움직일 칸을 입력해주세요 . ");
			int move = sc.nextInt();
			if(move >= 1 && move <= 4) {
			for(int i=0; i<5 ; i++) {
				for(int j=0; j<5; j++) {
					if(arr[0][j] == 2 && j+move <=4) {//윗줄에서 넘어가지 않을 경우
						arr[0][j] = 0;
						arr[0][j+move] = 2;
						break;
					}
					if(arr[0][j] == 2 && j+move>4) {//윗줄에서 넘어갈때
						if(move >= 6 ) {
		
						}
						arr[0][j] = 0;
						arr[move-(4-j)][4] = 2;
						break;
					}
					if(arr[j][4] == 2 && j+move<=4) {//오른쪽에서 넘어가지 않을경우
						arr[j+move][4] = 2;
						arr[j][4] = 0;
						break;
					}
					if(arr[j][4] == 2 && j+move>4) {//오른쪽에서 넘어갈때
						arr[4][(4-j)+(4-move)] = 2;
						arr[j][4] = 0;
						break;
					}
					if(arr[4][j] == 2 && j-move >=0) {//아래에서 넘어가지 않을 경우
						arr[4][j] = 0;
						arr[4][j-move] = 2;
						break;
					}
					if(arr[4][j] == 2 && j-move <0) {//아래에서 넘어갈때
						arr[4][j] = 0;
						arr[4-(move-j)][0] = 2;
						break;
					}
					if(arr[j][0] == 2 && j-move>=0) {//왼에서 넘어가지 않을경우
						arr[j-move][0] = 2;
						arr[j][0] = 0;
						break;
					}
					if(arr[j][0] == 2 && j-move <0) {//왼쪽에서 넘어갈때
						arr[j][0] = 0;
						arr[0][(move-j)] = 2;
						break;
					}

				}
				break;
			}
		}
			else {
				System.out.println("1~4숫자만 입력해주세요 . ");
			}
		}//w/c

	}

}
