package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex03_12 {

	public static void main(String[] args) {
		// # 경마 게임
		// 5마리의 말이 랜덤으로 한번에 일정거리 이동가능하다 
		// 이동한거리의 합이 20이상이면 도착 
		// 등수 출력 
		// 조건) 단! 동시도착 예외처리
		
		int horse[][] = new int[5][20];
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int max = 20;
		int rank[] = new int[5];
		int total[] = new int[5];
		int y = 0;
		int z = 1;
		while(true) {
			System.out.print("움직이려면 아무숫자나 입력");
			int qqq = sc.nextInt();
			
			int x = 0;
			int cnt = 1;
			while(x <5) {
				if(total[x] == 20) {
					x++;
					continue;
				}
				int num = rn.nextInt(5)+1;
				if(cnt > 1) {
					int check = 0;
					for(int i=0; i<20; i++) {
						if(horse[x][i] == 1 && i+num >= 19) {
							check = 1;
						}
					}
					if(check == 1) {
						x++;
						continue;
					}
				}
				
				if(count == 0) {
				horse[x][num-1] = 1;
				}
				else {
					for(int i=0; i<20; i++) {
						if(horse[x][i] == 1) {
							if(i+num >=20) {
								horse[x][i] = 0;
								horse[x][19] = 1;
								break;
							}
							horse[x][i] = 0;
							horse[x][i+num] = 1;
							break;
						}
					}
				}
				
				if(total[x]+num < 20) {
					total[x] += num;
				}
				else {
					total[x] = 20;
					cnt++;
					y = x;
					rank[y] =z;
					z++; //등수
				}
				
				x++;
			}//w
			count ++;
			
			for(int i=0; i<5; i++) {
				for(int j=0; j<20; j++) {
					if(horse[i][j] == 0) {
					System.out.print("[  ]");
					} else System.out.print("[옷]");
				}
				System.out.println();
			}

			System.out.println("rank ");
			for(int i=0; i<5; i++) {
				System.out.print(rank[i] + " ");
			}System.out.println();
		}//while

	}

}
