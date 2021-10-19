package lv4.test;

import java.util.Random;
import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		//# 빙고 Ver2(플레이어 2명)
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int maxNum = 5;
		int size = 50;
		int[][] me = new int[maxNum][maxNum];
		int[][] you = new int[maxNum][maxNum];
		
		int[][] meMark = new int[maxNum][maxNum];
		int[][] youMark = new int[maxNum][maxNum];
		
		int[] temp = new int[maxNum * maxNum];
		
		int win1 = 0;
		int win2 = 0;
		int temp1 = 0;
		int temp2 = 0;
		int sum = 0;
		int turn = 1;
		// 시작 11:08
		// 종료 11:42 
		// 소요 00:34
		
		int x = 0;
		while(x<25) {//me에 중복숫자 없게 랜덤숫자 부여 
			int num = rn.nextInt(50)+1;
			int check = 0;
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(me[i][j] == num) {
						check = 1;
					}
				}
			}
			if(check == 0) {
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(me[i][j] == 0) {
						me[i][j] = num;
						x++;
						check = 2;
						break;
					}
				}
				if(check == 2) {
					break;
				}
			}
			}
		}//w
		x = 0;
		while(x<25) {//you에 중복숫자 없게 랜덤숫자 부여 
			int num = rn.nextInt(50)+1;
			int check = 0;
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(you[i][j] == num) {
						check = 1;
					}
				}
			}
			if(check == 0) {
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(you[i][j] == 0) {
						you[i][j] = num;
						x++;
						check = 2;
						break;
					}
				}
				if(check == 2) {
					break;
				}
			}
			}
		}//w
	
		while(true) {
			
			System.out.println("me"); //출력
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(me[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println("you"); //출력 
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(you[i][j] + "\t");
				}
				System.out.println();
			}
			
			if(win1 != 0 && win2 != 0) { // 승리조건
				System.out.println("무승부 !! ");
				break;
			}
			if(win1 != 0) {
				System.out.println("me의 승리입니다 !! ");
				break;
			}
			if(win2 != 0) {
				System.out.println("you의 승리입니다 !! ");
				break;
			}
			
			if(turn == 1) {
				System.out.println("me의 차례입니다.");
			}
			else System.out.println("you의 차례입니다.");
			int num = sc.nextInt();
			if(turn == 1) { //1턴
			int check = -1;
			for(int i=0; i<5; i++) { //입력한 값이 있으면 0으로 변경 
				for(int j=0; j<5; j++) {
					if(me[i][j] == num) {
						me[i][j] = 0;
						check = 0;
					}
				}
			}
			if(check == -1) { // 예외
				System.out.println("없는 숫자입니다 숫자를 다시 확인해주세요 . ");
				continue;
			}
			for(int i=0; i<5; i++) { // 2턴도 그 값을 가지고 있으면 0으로 변경 
				for(int j=0; j<5; j++) {
					if(you[i][j] == num) {
						you[i][j] = 0;
					}
				}
			}
			}
			else { //2턴 
				int check = -1;
				for(int i=0; i<5; i++) {// 입력한 값이 있으면 0으로 변경 . 
					for(int j=0; j<5; j++) {
						if(you[i][j] == num) {
							you[i][j] = 0;
							check = 0;
						}
					}
				}
				if(check == -1) { // 예외 
					System.out.println("없는 숫자입니다 숫자를 다시 확인해주세요 . ");
					continue;
				}
				for(int i=0; i<5; i++) { // 입력한 값이 1턴도 가지고 있으면 0으로 변경 
					for(int j=0; j<5; j++) {
						if(me[i][j] == num) {
							me[i][j] = 0;
						}
					}
				}
			}
			

			//가로
			for (int i=0; i<5; i++) {
				int cnt1 = 0;
				int cnt2 = 0;
				for(int j=0; j<5; j++) {
					if(me[i][j] == 0) {
						cnt1 ++;
					}
					if(you[i][j] == 0) {
						cnt2 ++;
					}
				}
				if(cnt1 == 5) {
					win1 = 1;
				}
				if(cnt2 == 5) {
					win2 = 1;
				}
			}
			
			//세로
			for (int i=0; i<5; i++) {
				int cnt1 = 0;
				int cnt2 = 0;
				for(int j=0; j<5; j++) {
					if(me[j][i] == 0) {
						cnt1 ++;
					}
					if(you[j][i] == 0) {
						cnt2 ++;
					}
				}
				if(cnt1 == 5) {
					win1 = 1;
				}
				if(cnt2 == 5) {
					win2 = 1;
				}
			}
			//대각선/
			int cnt1 = 0;
			int cnt2 = 0;
			for (int i=0; i<5; i++) {
				if(me[i][i] == 0) {
					cnt1 ++;
				}
				if(you[i][i] == 0) {
					cnt2 ++;
				}
				if(cnt1 == 5) {
					win1 = 1;
				}
				if(cnt2 == 5) {
					win2 = 1;
				}
			}
			//대각선\
			 cnt1 = 0;
			 cnt2 = 0;
			 int a = 4;
			for(int i=0; i<5; i++) {
					if(me[i][a] == 0) {
						cnt1  ++;
					}
					if(you[i][a] == 0) {
						cnt2  ++;
					}
					if(cnt1 == 5) {
						win1 = 1;
					}
					if(cnt2 == 5) {
						win2 = 1;
					}
					a--;
			}

			turn = turn == 1? 2:1;
		
		}//w

	}

}
