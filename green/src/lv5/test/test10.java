package lv5.test;

import java.util.Random;
import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		//���۽ð� 12 : 39
		//����ð� 02 : 26
		//�ҿ�ð� 01 : 57
		
		/*
		 * # ������ũ ����
		 * 1. 10x10 �迭�� 0���� ä���.
		 * 2. ������ũ�� 1234�� ǥ���Ѵ�.
		 * 3. �����¿�� �̵��� �����ϸ�, ������ ����´�.
		 * 4. �ڱ���ϰ� �ε�����, ����Ѵ�.
		 * 5. �������� �������� ������
		 *    �������� ������ ���� 1���� �ڶ���.
		 * 6. ������ �ִ� 8������ ������ �� �ִ�.
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
		System.out.println("�����϶����� �ʵ忡 �������� ���� Ȯ���� �����ּ��� . \nex) 1 = 1/1\nex) 2 = 1/2\nex) 3 = 1/3\nex) 4 = 1/4");
		int ran = sc.nextInt();
		while(true) {
			int r = rn.nextInt(ran);
			//�ʵ忡 ������ ���� 
			while(r == 0) {
				int y1 = rn.nextInt(size);
				int x1 = rn.nextInt(size);
				
				if(map[y1][x1] == 0) {
					map[y1][x1] = I;
					break;
				}
			}
			//���
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					if(map[i][j] == I) {
						System.out.print("�� ");
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
				for(int i =0; i<size; i++) {//���̻� �������� �� �� ���� �� ����ó�� . 
					if(map[i][0] == snake) {
						check3 = 1;
					}
				}
				if(check3 == 1) continue;
			for(int k = snake; k>0; k--) {
				for(int i=0; i<size; i++) {
					for(int j=0; j<size; j++) {
						if(check == 0 && map[i][j] == snake && map[i][j-1] != 0 && map[i][j-1] != 9) { // ���ó�� 
							death = 1;
							break;
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i][j-1] == I) { //�����۽��� 1ĭ���� 
							if(snake <=7) { // ���̰� 7�����϶� ������ ���� 
								map[i][j-1] = snake+1;
								snake++;
								check2 = 1;
								break;
							}else { // ���̰� 8�̻��̸� �������� ���ְ� �ٷ� �ؿ� ���ǹ����� �̵� �� �� �ְ� ó�� . 
								map[i][j-1] = 0;
							}
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i][j-1] == 0) { // �Ӹ��� �̵�
							map[i][j-1] = snake;
							a = i;
							b = j;
							check = 1;
							break;
						}
						if(check == 1 &&map[i][j] == k && map[a][b] == k+1) { //k�� --�ɶ����� ��ĭ�� ���� ��ܿ��� . 
							map[a][b] = k;
							a = i;
							b = j;
							if(k == 1) { //������ k = 1�϶� 1�� �ΰ� ����ԵǴµ� ������ �κ��� 0���� ������� . 
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
				for(int i =0; i<size; i++) {//���̻� ���������� �� �� ���� �� ����ó�� .
					if(map[i][size-1] == snake) {
						check3 = 1;
					}
				}
				if(check3 == 1) continue;
			for(int k = snake; k>0; k--) {
				for(int i=0; i<size; i++) {
					for(int j=0; j<size; j++) {
						if(check == 0 && map[i][j] == snake && map[i][j+1] != 0 && map[i][j+1] != 9) {// ���ó�� 
							death = 1;
							break;
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i][j+1] == I) {//�����۽��� 1ĭ���� 
							if(snake <= 7 ) { // ���̰� 7�����϶� ������ ���� 
								map[i][j+1] = snake+1;
								snake++;
								check2 = 1;
								break;
							}else map[i][j+1] = 0; // ���̰� 8�̻��̸� �������� ���ְ� �ٷ� �ؿ� ���ǹ����� �̵� �� �� �ְ� ó�� . 
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i][j+1] == 0) { // �Ӹ��� �̵�
							map[i][j+1] = snake;
							a = i;
							b = j;
							check = 1;
							break;
						}
						if(check == 1 && map[i][j] == k && map[a][b] == k+1) { //k�� --�ɶ����� ��ĭ�� ���� ��ܿ��� . 
							map[a][b] = k;
							a = i;
							b = j;
							if(k == 1) { //������ k = 1�϶� 1�� �ΰ� ����ԵǴµ� ������ �κ��� 0���� ������� .
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
				for(int i =0; i<size; i++) { //���̻� �Ʒ������� �� �� ���� �� ����ó�� .
					if(map[0][i] == snake) {
						check3 = 1;
					}
				}
				if(check3 == 1) continue;
			for(int k = snake; k>0; k--) {
				for(int i=0; i<size; i++) {
					for(int j=0; j<size; j++) {
						if(check == 0 && map[i][j] == snake && map[i-1][j] != 0 && map[i-1][j] != 9) {// ���ó�� 
							death = 1;
							break;
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i-1][j] == I) {//�����۽��� 1ĭ���� 
							if(snake<=7) { // ���̰� 7�����϶� ������ ���� 
								map[i-1][j] = snake+1;
								snake++;
								check2 = 1;
								break;
							}else map[i-1][j] = 0; // ���̰� 8�̻��̸� �������� ���ְ� �ٷ� �ؿ� ���ǹ����� �̵� �� �� �ְ� ó�� . 
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i-1][j] == 0) { // �Ӹ��� �̵�
							map[i-1][j] = snake;
							a = i;
							b = j;
							check = 1;
							break;
						}
						if(check == 1 && map[i][j] == k && map[a][b] == k+1) {//k�� --�ɶ����� ��ĭ�� ���� ��ܿ��� . 
							map[a][b] = k;
							a = i;
							b = j;
							if(k == 1) {//������ k = 1�϶� 1�� �ΰ� ����ԵǴµ� ������ �κ��� 0���� ������� .
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
				for(int i =0; i<size; i++) { //���̻� �������� �� �� ���� �� ����ó�� .
					if(map[size-1][i] == snake) {
						check3 = 1;
					}
				}
				if(check3 == 1) continue;
			for(int k = snake; k>0; k--) {
				for(int i=0; i<size; i++) {
					for(int j=0; j<size; j++) {
						if(check == 0 && map[i][j] == snake && map[i+1][j] != 0 && map[i+1][j] != 9) {// ���ó�� 
							death = 1;
							break;
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i+1][j] == I) {//�����۽��� 1ĭ���� 
							if(snake<=7) { // ���̰� 7�����϶� ������ ���� 
								map[i+1][j] = snake+1;
								snake++;
								check2 = 1;
								break;								
							}else map[i+1][j] = 0; // ���̰� 8�̻��̸� �������� ���ְ� �ٷ� �ؿ� ���ǹ����� �̵� �� �� �ְ� ó�� . 
						}
						if(check == 0 && k == snake && map[i][j] == snake && map[i+1][j] == 0) { // �Ӹ��� �̵�
							map[i+1][j] = snake;
							a = i;
							b = j;
							check = 1;
							break;
						}
						if(check == 1 && map[i][j] == k && map[a][b] == k+1) { //k�� --�ɶ����� ��ĭ�� ���� ��ܿ��� .
							map[a][b] = k;
							a = i;
							b = j;
							if(k == 1) { //������ k = 1�϶� 1�� �ΰ� ����ԵǴµ� ������ �κ��� 0���� ������� .
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
			if(death == 1) { //����� �׳� 
				System.out.println("�� ���� �΋H�� ��� ");
				break;
			}

		}//while(true)

	}

}
