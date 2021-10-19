package lv5.test;

import java.util.Random;
import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		//시작시간 12 : 39
		//종료시간 02 : 26
		//소요시간 01 : 57
		
		/*
		 * # 스네이크 게임
		 * 1. 10x10 배열을 0으로 채운다.
		 * 2. 스네이크는 1234로 표시한다.
		 * 3. 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
		 * 4. 자기몸하고 부딪히면, 사망한다.
		 * 5. 랜덤으로 아이템을 생성해
		 *    아이템을 먹으면 꼬리 1개가 자란다.
		 * 6. 꼬리는 최대 8개까지 증가할 수 있다.
		 */
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int size = 10;
		int[][] map = new int[size][size];
		int snake = 4;
		int[] x = new int[snake];
		int[] y = new int[snake];
		final int I = 9;
		for(int i=0; i<snake; i++) {
			x[i] = i;
			y[i] = 0;
			map[y[i]][x[i]] = i + 1;
		}
		
		int death = 0;
		System.out.println("움직일때마다 필드에 아이템이 나올 확률을 적어주세요 . \nex) 1 = 1/1\nex) 2 = 1/2\nex) 3 = 1/3\nex) 4 = 1/4");
		int ran = sc.nextInt();
		while(true) {
			int r = rn.nextInt(ran);
			//필드에 아이템 생성 
			while(r == 0) {
				int y1 = rn.nextInt(size);
				int x1 = rn.nextInt(size);
				
				if(map[y1][x1] == 0) {
					map[y1][x1] = I;
					break;
				}
			}
			//출력
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					if(map[i][j] == I) {
						System.out.print("◈ ");
					}
					else System.out.print(map[i][j]  + " ");
				}System.out.println();
			}
			
			System.out.println("4.left  6.right  8.up   2.down");
			int sel = sc.nextInt();
			if(sel == 4) {
				int a = -1;
				int b = -1;
				int check = 0;
				int check2 = 0;
				int check3 = 0;
				for(int i =0; i<size; i++) {//더이상 왼쪽으로 갈 수 없을 때 예외처리 . 
					if(map[i][0] == snake) {
						check3 = 1;
					}
				}
				if(check3 == 1) continue;
			for(int k = snake; k>0; k--) {
				for(int i=0; i<size; i++) {
					for(int j=0; j<size; j++) {
						if(check == 0 && map[i][j] == snake && map[i][j-1] != 0 && map[i][j-1] != 9) { // 사망처리 
							death = 1;
							break;
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i][j-1] == I) { //아이템습득 1칸증가 
							if(snake <=7) { // 길이가 7이하일때 몸길이 증가 
								map[i][j-1] = snake+1;
								snake++;
								check2 = 1;
								break;
							}else { // 길이가 8이상이면 아이템을 없애고 바로 밑에 조건문으로 이동 할 수 있게 처리 . 
								map[i][j-1] = 0;
							}
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i][j-1] == 0) { // 머리를 이동
							map[i][j-1] = snake;
							a = i;
							b = j;
							check = 1;
							break;
						}
						if(check == 1 &&map[i][j] == k && map[a][b] == k+1) { //k가 --될때마다 한칸씩 숫자 댕겨오기 . 
							map[a][b] = k;
							a = i;
							b = j;
							if(k == 1) { //마지막 k = 1일때 1이 두개 생기게되는데 마지막 부분을 0으로 만들어줌 . 
								map[i][j] = 0;
							}
							break;
						}
					}
					if(check2 == 1) break;
				}
				if(check2 == 1) break;
			}

			}//sel == 4
			else if(sel == 6) {
				int a = -1;
				int b = -1;
				int check = 0;
				int check2 = 0;
				int check3 = 0;
				for(int i =0; i<size; i++) {//더이상 오른쪽으로 갈 수 없을 때 예외처리 .
					if(map[i][size-1] == snake) {
						check3 = 1;
					}
				}
				if(check3 == 1) continue;
			for(int k = snake; k>0; k--) {
				for(int i=0; i<size; i++) {
					for(int j=0; j<size; j++) {
						if(check == 0 && map[i][j] == snake && map[i][j+1] != 0 && map[i][j+1] != 9) {// 사망처리 
							death = 1;
							break;
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i][j+1] == I) {//아이템습득 1칸증가 
							if(snake <= 7 ) { // 길이가 7이하일때 몸길이 증가 
								map[i][j+1] = snake+1;
								snake++;
								check2 = 1;
								break;
							}else map[i][j+1] = 0; // 길이가 8이상이면 아이템을 없애고 바로 밑에 조건문으로 이동 할 수 있게 처리 . 
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i][j+1] == 0) { // 머리를 이동
							map[i][j+1] = snake;
							a = i;
							b = j;
							check = 1;
							break;
						}
						if(check == 1 && map[i][j] == k && map[a][b] == k+1) { //k가 --될때마다 한칸씩 숫자 댕겨오기 . 
							map[a][b] = k;
							a = i;
							b = j;
							if(k == 1) { //마지막 k = 1일때 1이 두개 생기게되는데 마지막 부분을 0으로 만들어줌 .
								map[i][j] = 0;
							}
							break;
						}
					}
					if(check2 == 1) break;
				}
				if(check2 == 1) break;
			}
				
			}//sel == 6 
			else if(sel == 8) {
				
				int a = -1;
				int b = -1;
				int check = 0;
				int check2 = 0;
				int check3 = 0;
				for(int i =0; i<size; i++) { //더이상 아래쪽으로 갈 수 없을 때 예외처리 .
					if(map[0][i] == snake) {
						check3 = 1;
					}
				}
				if(check3 == 1) continue;
			for(int k = snake; k>0; k--) {
				for(int i=0; i<size; i++) {
					for(int j=0; j<size; j++) {
						if(check == 0 && map[i][j] == snake && map[i-1][j] != 0 && map[i-1][j] != 9) {// 사망처리 
							death = 1;
							break;
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i-1][j] == I) {//아이템습득 1칸증가 
							if(snake<=7) { // 길이가 7이하일때 몸길이 증가 
								map[i-1][j] = snake+1;
								snake++;
								check2 = 1;
								break;
							}else map[i-1][j] = 0; // 길이가 8이상이면 아이템을 없애고 바로 밑에 조건문으로 이동 할 수 있게 처리 . 
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i-1][j] == 0) { // 머리를 이동
							map[i-1][j] = snake;
							a = i;
							b = j;
							check = 1;
							break;
						}
						if(check == 1 && map[i][j] == k && map[a][b] == k+1) {//k가 --될때마다 한칸씩 숫자 댕겨오기 . 
							map[a][b] = k;
							a = i;
							b = j;
							if(k == 1) {//마지막 k = 1일때 1이 두개 생기게되는데 마지막 부분을 0으로 만들어줌 .
								map[i][j] = 0;
							}
							break;
						}
					}
					if(check2 == 1) break;
				}
				if(check2 == 1) break;
			}
			}//sel == 8
			else if(sel == 2) {
				int a = -1;
				int b = -1;
				int check = 0;
				int check2 = 0;
				int check3 = 0;
				for(int i =0; i<size; i++) { //더이상 위쪽으로 갈 수 없을 때 예외처리 .
					if(map[size-1][i] == snake) {
						check3 = 1;
					}
				}
				if(check3 == 1) continue;
			for(int k = snake; k>0; k--) {
				for(int i=0; i<size; i++) {
					for(int j=0; j<size; j++) {
						if(check == 0 && map[i][j] == snake && map[i+1][j] != 0 && map[i+1][j] != 9) {// 사망처리 
							death = 1;
							break;
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i+1][j] == I) {//아이템습득 1칸증가 
							if(snake<=7) { // 길이가 7이하일때 몸길이 증가 
								map[i+1][j] = snake+1;
								snake++;
								check2 = 1;
								break;								
							}else map[i+1][j] = 0; // 길이가 8이상이면 아이템을 없애고 바로 밑에 조건문으로 이동 할 수 있게 처리 . 
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i+1][j] == 0) { // 머리를 이동
							map[i+1][j] = snake;
							a = i;
							b = j;
							check = 1;
							break;
						}
						if(check == 1 && map[i][j] == k && map[a][b] == k+1) { //k가 --될때마다 한칸씩 숫자 댕겨오기 .
							map[a][b] = k;
							a = i;
							b = j;
							if(k == 1) { //마지막 k = 1일때 1이 두개 생기게되는데 마지막 부분을 0으로 만들어줌 .
								map[i][j] = 0;
							}
							break;
						}
					}//j
					if(check2 == 1) break;
				}//i
				if(check2 == 1) break;
			}//k
			}//sel == 2
			if(death == 1) { //사망시 겜끝 
				System.out.println("내 몸에 부딫혀 사망 ");
				break;
			}

		}//while(true)

	}

}
