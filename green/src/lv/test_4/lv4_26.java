package lv.test_4;

import java.util.Random;
import java.util.Scanner;

public class lv4_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		int maxNum = 5;
		int size = 50;
		int turn = 1;
		int[][] me = new int[maxNum][maxNum];
		int[][] you = new int[maxNum][maxNum];

		int[][] meMark = new int[maxNum][maxNum];
		int[][] youMark = new int[maxNum][maxNum];

		int[] temp = new int[maxNum * maxNum];

		int win = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				
			}
		}
		int cnt = 0;
		while(cnt < 25) {
			int rNum = rn.nextInt(size)+1;
			int check = 0;
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(me[i][j] == rNum) check = 1;
				}
			}
			if(check == 0) {
				for(int i=0; i<5; i++) {
					for(int j=0; j<5; j++) {
						if(me[i][j] == 0) {
							me[i][j] = rNum;
							check = 2;
							break;
						}
					}
					if(check==2) {
						cnt++;
						break;
					}
				}
			}
		}//while
		cnt = 0;
		while(cnt < 25) {
			int rNum = rn.nextInt(size)+1;
			int check = 0;
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(you[i][j] == rNum) check = 1;
				}
			}
			if(check == 0) {
				for(int i=0; i<5; i++) {
					for(int j=0; j<5; j++) {
						if(you[i][j] == 0) {
							you[i][j] = rNum;
							check = 2;
							break;
						}
					}
					if(check==2) {
						cnt++;
						break;
					}
				}
			}
		}//while
		
		while(true) {
			System.out.println("me");
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(me[i][j] + "\t");
				}System.out.println();
			}System.out.println();
			System.out.println("you");
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(you[i][j] + "\t");
				}System.out.println();
			}System.out.println();
			
			if(win == 1) {
				System.out.println("me의 승리!! ");
				break;
			}
			if(win == 2) {
				System.out.println("you의 승리!! ");
				break;
			}
			if(turn == 1) System.out.println("me의 차례입니다.");
			if(turn == 2) System.out.println("you의 차례입니다.");
			int selNum = sc.nextInt();
			if(turn == 1) {
				int check = 0;
				for(int i=0; i<5; i++) {
					for(int j=0; j<5; j++) {
						if(me[i][j] == selNum) {
							me[i][j] = 0;
							check = 1;
						}
					}
				}
				if(check == 0) {
					System.out.println("숫자를 확인해주세요 .");
					continue;
				}
				else {
					for(int i=0; i<5; i++) {
						for(int j=0; j<5; j++) {
							if(you[i][j] == selNum) {
								you[i][j] = 0;
							}
						}
					}
				}
				
			}
			if(turn == 2) {
				int check = 0;
				for(int i=0; i<5; i++) {
					for(int j=0; j<5; j++) {
						if(you[i][j] == selNum) {
							you[i][j] = 0;
							check = 1;
						}
					}
				}
				if(check == 0) {
					System.out.println("숫자를 확인해주세요 .");
					continue;
				}
				else {
					for(int i=0; i<5; i++) {
						for(int j=0; j<5; j++) {
							if(me[i][j] == selNum) {
								me[i][j] = 0;
							}
						}
					}
				}
				
			}
			
			//가로
			int cnt1 = 0;
			int cnt2 = 0;
			for(int i=0; i<5; i++) {
				cnt1 = 0;
				cnt2 = 0;
				for(int j=0; j<5; j++) {
					if(me[i][j] == 0) cnt1 ++;
					if(you[i][j] == 0) cnt2 ++;
				}
				if(cnt1 == 5) win = 1;
				if(cnt2 == 5) win = 2;
			}
			//세로
			for(int i=0; i<5; i++) {
				cnt1 = 0;
				cnt2 = 0;
				for(int j=0; j<5; j++) {
					if(me[j][i] == 0) cnt1 ++;
					if(you[j][i] == 0) cnt2 ++;
				}
				if(cnt1 == 5) win = 1;
				if(cnt2 == 5) win = 2;
			}
			//대각\
			cnt1 = 0;
			cnt2 = 0;
			for(int i=0; i<5; i++) {
				if(me[i][i] == 0) cnt1 ++;
				if(you[i][i] == 0) cnt2 ++;
			}
			if(cnt1 == 5) win = 1;
			if(cnt2 == 5) win = 2;
			//대각/
			cnt1 = 0;
			cnt2 = 0;
			for(int i=0; i<5; i++) {
				if(me[i][4-i] == 0) cnt1 ++;
				if(you[i][4-i] == 0) cnt2 ++;
			}
			if(cnt1 == 5) win = 1;
			if(cnt2 == 5) win = 2;
			turn = turn == 2 ? 1 : 2;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
