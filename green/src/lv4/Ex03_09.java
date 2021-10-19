package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex03_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int maxNum = 5;
		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];
		int[] temp = new int[maxNum * maxNum];
		int size = 50;
		int win = 0;
		int cnt = 0;
		System.out.println("���� ���� ���� ! ");
		while(true) {
		//��¹�
		System.out.println("--BINGO--");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (bingo[i][j] == 0) {
					System.out.print("+ ");
				}
				if(bingo[i][j] == 1) {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println("---------");
		
		//����!
		if (win == 1) {
			System.out.println("���� ! ");
			break;
		}
		//��ǥ�Է� 
		System.out.print("x��ǥ�� �Է����ּ��� [ 1~5 ] ");
		int x = sc.nextInt()-1;
		System.out.print("y��ǥ�� �Է����ּ��� [ 1~5 ] ");
		int y = sc.nextInt()-1;
		
		if(x >4 || x < 0 || y > 4 || y < 0) {
			System.out.println("��ǥ���� ������ ������ϴ�.");
			continue;
		}
		int check = -1;
		
		//����ó��
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if( j == x && i == y) {
					if (bingo[i][j] == 1) {
						check = 1;
					}
				}
			}
		}
		//���ܰ� �ƴ� ��� �� ����
		if (check == -1) { 
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if( j == x && i == y) {
					bingo[i][j] = 1;
				}
			}
		}
		}
		else {
			System.out.println("�̹� ���õ� ��ǥ�Դϴ�.");
		}
		
		//����
		for(int i=0; i<5; i++) {
			cnt = 0;
			for(int j=0; j<5; j++) {
				if(bingo[i][j] == 1) {
					cnt++;
				}
			}
			if(cnt == 5 ) {
				win = 1;
			}
		}
		
		//����
		for(int i=0; i<5; i++) {
			cnt = 0;
			for(int j=0; j<5; j++) {
				if(bingo[j][i] == 1) {
					cnt++;
				}
			}
			if(cnt == 5 ) {
				win = 1;
			}
		}
		
		//�밢�� \
		cnt = 0;
		for(int i=0; i<5; i++) {
			if(bingo[i][i] == 1) {
				cnt ++;
			}
			if (cnt == 5) {
				win  = 1;
			}
		}
		
		//�밢�� /
		cnt = 0;
		int a = 0;
		for(int i=0; i<5; i++ ) {
			if(bingo[i][4-a] == 1) {
				cnt ++;
			}
			if( cnt == 5) {
				win = 1;
			}
			a++;
		}	
		}//c
	
	}

}
