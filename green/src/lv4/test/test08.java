package lv4.test;

import java.util.Random;
import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		//# ���� Ver2(�÷��̾� 2��)
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
		// ���� 11:08
		// ���� 11:42 
		// �ҿ� 00:34
		
		int x = 0;
		while(x<25) {//me�� �ߺ����� ���� �������� �ο� 
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
		while(x<25) {//you�� �ߺ����� ���� �������� �ο� 
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
			
			System.out.println("me"); //���
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(me[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println("you"); //��� 
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(you[i][j] + "\t");
				}
				System.out.println();
			}
			
			if(win1 != 0 && win2 != 0) { // �¸�����
				System.out.println("���º� !! ");
				break;
			}
			if(win1 != 0) {
				System.out.println("me�� �¸��Դϴ� !! ");
				break;
			}
			if(win2 != 0) {
				System.out.println("you�� �¸��Դϴ� !! ");
				break;
			}
			
			if(turn == 1) {
				System.out.println("me�� �����Դϴ�.");
			}
			else System.out.println("you�� �����Դϴ�.");
			int num = sc.nextInt();
			if(turn == 1) { //1��
			int check = -1;
			for(int i=0; i<5; i++) { //�Է��� ���� ������ 0���� ���� 
				for(int j=0; j<5; j++) {
					if(me[i][j] == num) {
						me[i][j] = 0;
						check = 0;
					}
				}
			}
			if(check == -1) { // ����
				System.out.println("���� �����Դϴ� ���ڸ� �ٽ� Ȯ�����ּ��� . ");
				continue;
			}
			for(int i=0; i<5; i++) { // 2�ϵ� �� ���� ������ ������ 0���� ���� 
				for(int j=0; j<5; j++) {
					if(you[i][j] == num) {
						you[i][j] = 0;
					}
				}
			}
			}
			else { //2�� 
				int check = -1;
				for(int i=0; i<5; i++) {// �Է��� ���� ������ 0���� ���� . 
					for(int j=0; j<5; j++) {
						if(you[i][j] == num) {
							you[i][j] = 0;
							check = 0;
						}
					}
				}
				if(check == -1) { // ���� 
					System.out.println("���� �����Դϴ� ���ڸ� �ٽ� Ȯ�����ּ��� . ");
					continue;
				}
				for(int i=0; i<5; i++) { // �Է��� ���� 1�ϵ� ������ ������ 0���� ���� 
					for(int j=0; j<5; j++) {
						if(me[i][j] == num) {
							me[i][j] = 0;
						}
					}
				}
			}
			

			//����
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
			
			//����
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
			//�밢��/
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
			//�밢��\
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
