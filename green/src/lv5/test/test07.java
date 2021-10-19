package lv5.test;

import java.util.Random;
import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
		//시작시간 09 : 07
		//종료시간 10 : 15
		//소요시간 01 : 08
		
		
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
		int y = 1 ;
		
		int start = 0;
		while(true) {
			//출력
			for(int i=0; i<5; i++) { 
				for(int j=0; j<20; j++) {
					System.out.print(horse[i][j] + " ");
				}
				System.out.println();
			}System.out.println();
			
			System.out.println("rank");
			for(int i=0; i<5; i++) {
				System.out.print(rank[i] + " ");
			}System.out.println();
			System.out.println("total");
			for(int i=0; i<5; i++) {
				System.out.print(total[i] + " ");
			}System.out.println();
			System.out.print("움직이려면 아무 숫자나 입력 :");
			int rrrr = sc.nextInt();
			int x = 0 ;
			int rankCheck = 0;
			while(x < 5) {
				int ran = rn.nextInt(5);
				System.out.println("ran : " + ran);
					for(int j=0; j<20; j++) {
						if(start == 0 ) { //처음시작할때
							horse[x][ran] = x+1;
							total[x] += ran+1;
							break;
						}
						else {
							if(rankCheck == 1 && horse[x][j] == x+1 && j+ran >= 19) {//동시도착 예외처리
								x--;
								break;
							}
							if(horse[x][j] == x+1 && j+ran >=20) {
								horse[x][j] = 0;
								horse[x][19] = x+1;
								total[x] = 20;
								rank[x] = y;
								y++;
								rankCheck = 1;
								break;
							}
							if(horse[x][j] == x+1 && j+ran <= 19) {
								horse[x][j] = 0;
								horse[x][j+ran] = x+1;
								total[x] += ran;
								if(j+ran == 19) {
									rank[x] = y;
									y++;
									rankCheck = 1;
								}
								break;
							}
							if(horse[x][19] == x+1) {
								break;
							}
						}
					}
					
					x++;
				
			}//while (x < 5 )
			start = 1;

		}//while

		
	}

}
