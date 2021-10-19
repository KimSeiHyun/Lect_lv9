package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex03_16 {

	public static void main(String[] args) {
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
		for(int i=0; i<snake; i++) {
			x[i] = i;
			y[i] = 0;
			map[y[i]][x[i]] = i + 1;
		}
		System.out.println("움직일때마다 아이템이 생성될 확률을 적어주세요 .");
		System.out.println("ex)1입력시 1/1확률\nex)2입력시 1/2확률\nex)3입력시 1/3확률\nex)4입력시 1/4확률");
		int p = sc.nextInt();
		while(true) {
			System.out.println("뱀의 길이  : " + snake);
			int random = rn.nextInt(p);//움직일때마다 1/2
			if(random == 0) {
				while(true) {
					int itemX = rn.nextInt(size);
					int itemY = rn.nextInt(size);
					if(map[itemX][itemY] == 0) {
						map[itemX][itemY] = 9;
						break;
					}
				}
			}
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					if(map[i][j] == 9) {
						System.out.print("◈ ");
					}
					else {
						System.out.print(map[i][j] + " ");
						
					}
				}
				System.out.println();
			}
			System.out.println();
			System.out.print("1)left 2)right 3)up 4)down : ");
			int sel = sc.nextInt();
			if(sel == 1) {
				int check = 0;
				int check3 = 0;
				int check4 = 0;
				int a = 0;
				int b = 0;
				int c = 0;
				int d = 0;
				for(int i=0; i<size; i++) {//머리가 오른쪽에 있으면 콘티뉴
					if(map[i][0] == snake) {
						check = 1;
						System.out.println("continue");
					}
				}
				if(check == 1) continue;
				int dieCheck = 0;
				for(int i=0; i<size; i++) {//머리가 가는길에 0이 아니면 스탑 
					for(int j=0; j<size; j++) {
						if(map[i][j] == snake && map[i][j-1] == snake-1) {
							check3 = 1;
						}
						if(map[i][j] == snake && map[i][j-1] >= 1 && map[i][j-1] <=snake-2) {
							dieCheck = 1; //몸에 부딫히면 종료 .
						}
					}
				}
				if(dieCheck == 1) {
					System.out.println("내 몸에 부딫혀 사망. ");
					break;
				}
				if(check3 == 1) continue;
				for(int k = snake; k>0; k--) {
					int check2 = 0;
					for(int i=0; i<size; i++) {
						for(int j=0; j<size; j++) {
							if(map[i][j] == snake && check == 0 && map[i][j-1] == 9 && snake <= 7 ) {
								map[i][j-1] = snake+1;
								snake++;
								check4 = 1;
								check = 1;
								break; //아이템먹으면 한칸증가 
							}
							if(map[i][j] == snake && check == 0 && map[i][j-1] == 0 ) {
								map[i][j-1] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1;//움직일곳이 아무것도 없으면 움직임
							}
							if(map[i][j] == snake && check == 0 && map[i][j-1] == 9 && snake>7 ) {
								map[i][j-1] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1; //길이가 8되면 아이템을 먹어도 늘어나지 않음 
							}
							if(k < snake) {//꼬리가 따라오게 만드는 코드
								if(map[i][j] == k) {
									a = i;
									b = j;
									map[i][j] = 0;
									map[c][d] = k;
									c = a;
									d = b;
								check2 = 1;
								break;
								}
								
							}
						}
						if(check2 == 1) break;
						if(check4 == 1) break;
					}
					if(check4 == 1) break;
				}
			}//sel == 1
			else if(sel == 2) {
				int check = 0;
				int check3 = 0;
				int check4 = 0;
				int a = 0;
				int b = 0;
				int c = 0;
				int d = 0;
				for(int i=0; i<size; i++) {//머리가 오른쪽에 있으면 콘티뉴
					if(map[i][size-1] == snake) {
						check = 1;
					}
					
				}
				if(check == 1) continue;
				int dieCheck = 0;
				for(int i=0; i<size; i++) {//머리가 가는길에 0이 아니면 스탑 
					for(int j=0; j<size; j++) {
						if(map[i][j] == snake && map[i][j+1] == snake-1) {
							check3 = 1;
						}
						if(map[i][j] == snake && map[i][j+1] >= 1 && map[i][j+1] <=snake-2) {
							dieCheck = 1;//몸에 부딫히면 종료 .
						}
					}
				}
				if(dieCheck == 1) {
					System.out.println("내 몸에 부딫혀 사망. ");
					break;
				}
				if(check3 == 1) continue;
				for(int k = snake; k>0; k--) {
					int check2 = 0;
					for(int i=0; i<size; i++) {
						for(int j=0; j<size; j++) {
							if(map[i][j] == snake && check == 0 && map[i][j+1] == 9 && snake <= 7 ) {
								map[i][j+1] = snake+1;
								snake++;
								check4 = 1;
								check = 1;
								break;//아이템먹으면 한칸증가 
							}
							if(map[i][j] == snake&& check == 0 && map[i][j+1] == 0  ) {
								map[i][j+1] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1;	//움직일곳이 아무것도 없으면 움직임
							}
							if(map[i][j] == snake&& check == 0 && map[i][j+1] == 9 && snake>7  ) {
								map[i][j+1] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1;	//길이가 8되면 아이템을 먹어도 늘어나지 않음 
							}
							if(k < snake) {//꼬리가 따라오게 만드는 코드
								if(map[i][j] == k) {
									a = i;
									b = j;
									map[i][j] = 0;
									map[c][d] = k;
									c = a;
									d = b;
								check2 = 1;
								break;
								}
								
							}
						}
						if(check2 == 1) break;
						if(check4 == 1) break;
					}
					if(check4 == 1) break;

				}
			}//sel == 2
			else if(sel == 3) {
				int check = 0;
				int check3 = 0;
				int check4 = 0;
				int a = 0;
				int b = 0;
				int c = 0;
				int d = 0;
				for(int i=0; i<size; i++) {//머리가 맨위에 있으면 콘티뉴
					if(map[0][i] == snake) {
						check = 1;
					}
				}
				if(check == 1) continue;
				int dieCheck = 0;
				for(int i=0; i<size; i++) {//머리가 가는길에 0이 아니면 스탑 
					for(int j=0; j<size; j++) {
						if(map[i][j] == snake && map[i-1][j] == snake-1) {
							check3 = 1;
						}
						if(map[i][j] == snake && map[i-1][j] >= 1 && map[i-1][j] <=snake-2) {
							dieCheck = 1;//몸에 부딫히면 종료 .
						}
					}
				}
				if(dieCheck == 1) {
					System.out.println("내 몸에 부딫혀 사망. ");
					break;
				}
				if(check3 == 1) continue;
				for(int k = snake; k>0; k--) {
					int check2 = 0;
					for(int i=0; i<size; i++) {
						for(int j=0; j<size; j++) {
							if(map[i][j] == snake && check == 0 && map[i-1][j] == 9 && snake <= 7 ) {
								map[i-1][j] = snake+1;
								snake++;
								check4 = 1;
								check = 1;
								break;//아이템먹으면 한칸증가 
							}
							if(map[i][j] == snake&& check == 0 && map[i-1][j] == 0) {
								map[i-1][j] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1; //움직일곳이 아무것도 없으면 움직임
							}
							if(map[i][j] == snake&& check == 0 && map[i-1][j] == 9 && snake>7) {
								map[i-1][j] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1; //길이가 8되면 아이템을 먹어도 늘어나지 않음 
							}
							if(k < snake) {//꼬리가 따라오게 만드는 코드
								if(map[i][j] == k) {
									a = i;
									b = j;
									map[i][j] = 0;
									map[c][d] = k;
									c = a;
									d = b;
								check2 = 1;
								break;
								}
								
							}
						}
						if(check2 == 1) break;
						if(check4 == 1) break;
					}
					if(check4 == 1) break;
				}
			}//sel == 3
			else if(sel == 4) {
				int check = 0;
				int check3 = 0;
				int check4 = 0;
				int a = 0;
				int b = 0;
				int c = 0;
				int d = 0;
				for(int i=0; i<size; i++) {//머리가 아래에 있으면 콘티뉴
					if(map[size-1][i] == snake) {
						check = 1;
					}
				}
				if(check == 1) continue;
				int dieCheck = 0;
				for(int i=0; i<size; i++) {//머리가 가는길에 0이 아니면 스탑 
					for(int j=0; j<size; j++) {
						if(map[i][j] == snake && map[i+1][j] == snake-1) {
							check3 = 1;
						}
						if(map[i][j] == snake && map[i+1][j] >= 1 && map[i+1][j] <=snake-2) {
							dieCheck = 1;//몸에 부딫히면 종료 .
						}
					}
				}
				if(dieCheck == 1) {
					System.out.println("내 몸에 부딫혀 사망. ");
					break;
				}
				if(check3 == 1) continue;
				for(int k = snake; k>0; k--) {
					int check2 = 0;
					for(int i=0; i<size; i++) {
						for(int j=0; j<size; j++) {
							if(map[i][j] == snake && check == 0 && map[i+1][j] == 9 && snake <= 7 ) {
								map[i+1][j] = snake+1;
								snake++;
								check4 = 1;
								check = 1;
								break;//아이템먹으면 한칸증가 
							}
							if(map[i][j] == snake&& check == 0 && map[i+1][j] == 0) {
								map[i+1][j] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1;//움직일곳이 아무것도 없으면 움직임
							}
							if(map[i][j] == snake&& check == 0 && map[i+1][j] == 9 && snake>7) {
								map[i+1][j] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1; //길이가 8되면 아이템을 먹어도 늘어나지 않음 
							}
							if(k < snake) {//꼬리가 따라오게 만드는 코드
								if(map[i][j] == k) {
									a = i;
									b = j;
									map[i][j] = 0;
									map[c][d] = k;
									c = a;
									d = b;
								check2 = 1;
								break;
								}
								
							}
						}
						if(check2 == 1) break;
						if(check4 == 1) break;
					}
					if(check4 == 1) break;
				}
			}//sel == 4 
			
		}//while

	}

}
