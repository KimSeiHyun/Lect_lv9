package lv.test_4;

import java.util.Random;
import java.util.Scanner;

public class lv4_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int maxNum = 5;
		
		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];
		
		int[] temp = new int[maxNum*maxNum];
		int size = 50; // 1~50������ ���� �ߺ����� �����ǿ� ��ġ 

		int win = 0;
		
		int x = 0;
		while(x < 25) {
			int rNum = rn.nextInt(50)+1;
			int check = 0;
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(bingo[i][j] == rNum) {
						check = 1;
						break;
					}
				}
				if(check == 1) {
					break;
				}
			}
			if(check == 1) {
				continue;
			}
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					if(bingo[i][j] == 0) {
						bingo[i][j] = rNum;
						check = 2;
						x++;
						break;
					}
					
				}
				if(check == 2) break;
			}
			
			
			
		}
		
		
		while(true) {
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.print(bingo[i][j] + "\t");
				}System.out.println();
			}
			System.out.println("������ ��ǥ(x,y)�� �Է����ּ��� . ");
			System.out.print("x : ");
			x = sc.nextInt();
			System.out.print("y : ");
			int y = sc.nextInt();
			
			if(x >= 0 && x < 5 && y >= 0 && y <5) {
				if(bingo[x][y] != 0) {
					bingo[x][y] = 0;
				}else {
					System.out.println("�̹� ���õ� �ڸ��Դϴ�.");
				}
				
			}else System.out.println("��ǥ�� �ٽ� Ȯ�����ּ��� . ");
			
			//����
			for(int i=0; i<5; i++) {
				int cnt = 0;
				for(int j=0; j<5; j++) {
					if(bingo[i][j] == 0)cnt ++;
				}
				if(cnt == 5) win ++;
			}
			//����
			for(int i=0; i<5; i++) {
				int cnt = 0;
				for(int j=0; j<5; j++) {
					if(bingo[j][i] == 0)cnt ++;
				}
				if(cnt == 5) win ++;
			}
			//�밢\
			int cnt = 0;
			for(int i=0; i<5; i++) {
				if(bingo[i][i] == 0) {
					cnt ++;
				}
			}
			if(cnt ==5 ) win++;
			//�밢/
			cnt = 0;
			for(int i=0; i<5; i++) {
				if(bingo[i][4-i] == 0) {
					cnt ++;
				}
			}
			if(cnt ==5 ) win++;
			
			if(win != 0) {
				System.out.println("����!");
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
