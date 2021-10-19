package lv5.test;

import java.util.Random;
import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		
		//���۽ð� 10 : 15
		//����ð� 18 : 14
		//�ҿ�ð� 07 : 59
		
		//�����ð� 00 : 01
		//����ð� 00 : 41
		//�ҿ�ð� 00 : 40
		
		//�� �ҿ�ð� 08:39
		
		
		/*
		 * # ũ������ �����̵�
		 * 1. ���� ũ��� 7 x 7 �̴�. 
		 * 2. ��(1)��(2)��(3)��(4)�� �̵��� �����ϸ�,
		 *    ��ź��ġ(5), ����(6)�� �����Ѵ�. 
		 * 3. ��(3), �÷��̾�(2), ��ź(9), ������(4)�� �����Ѵ�.
		 * 4. ��, ��ź�� ��ġ�� ������� ������ �ϸ�,
		 *    ���� �� ���ڰ� ���·� ������.
		 * 5. �� �ı��� �������� �����ϰ� �����Ǿ�,
		 *    �������� ������ ��ġ�� �� �ִ� ��ź�� ������ �����ȴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int map[][] = new int[7][7];
		int arr[][] = new int[30][2];
		int arr2[][] = new int[30][2];
		final int W = 3;
		final int P = 2;
		final int B = 9;
		final int I = 4;
		int maxBomb = 0;
		int bomb = 0;
		int a = -1;
		int b = -1;
		
		System.out.println("�ִ� ��ź ������ �������ּ��� . ");
		int bb = sc.nextInt();
		
		maxBomb = bb;
		map[0][0] = P;
		System.out.println("���� ������ �Է� : ");
		int wall = sc.nextInt();
		int wallCount = 0;
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				if(map[i][j] == 0) {
					if(wall == wallCount ) break;
					map[i][j] = W;
					wallCount ++;
				}
			}
			if(wall == wallCount ) break;
		}
		int s = 0;
		int sCheck = 0;
		while(sCheck == 0) {
			while(s < 300) {
				int r1 = rn.nextInt(7);
				int r2 = rn.nextInt(7);
				int temp = map[0][0];
				map[0][0] = map[r1][r2];
				map[r1][r2] = temp;
				s++;
			}
			for(int i=1; i<6; i++) {
				for(int j=1; j<6; j++) {
					if(map[i][j] == 2 &&map[i][j-1] == 0 && map[i][j+1] == 0 && map[i-1][j] == 0 && map[i+1][j] == 0) {
						sCheck = 1;
					}
				}
			}
			if(sCheck == 0) s = 0;
			else break;
		}
		
		
		
		while(true) {
			//��ź�� ��ǥ �׸��� ��ġ�� ���� ǥ�� 
			for(int i=0; i<bomb; i++) {
				for(int j=0; j<2; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}System.out.println();
			//�����
			for(int i=0; i<7; i++) {
				for(int j=0; j<7; j++) {
					if(map[i][j] == W) {
						System.out.print("�� ");
					}
					if(map[i][j] == P) {
						System.out.print("�� ");
					}
					if(map[i][j] == B) {
						System.out.print("�� ");
					}
					if(map[i][j] == I) {
						System.out.print("�� ");
					}
					if(map[i][j] == 0) {
						System.out.print(map[i][j] + " ");
					}

				}System.out.println();
			}System.out.println();
			System.out.println("�ִ� ��ź��ġ ���� : " + maxBomb);
			System.out.println("���� ��ź��ġ ���� : " + bomb);
			System.out.println("1.��  2.��  3.��  4.��   5.��ź��ġ   6.��ź����!");
			int sel = sc.nextInt();
			if(sel == 1) {// ���� �̵� 
				if(a != -1 && b != -1 &&  a != 0 &&  map[a][b] == B && map[a-1][b] == 0) { //��ź��ġ �� �̵� 
					map[a-1][b] = P;
					a = -1;
					b = -1;
					continue;
				}
				if(a != -1 && b != -1 && a != 0 && map[a][b] == B && map[a-1][b] == I) {	//��ź��ġ �� �̵�
					map[a-1][b] = P;
					maxBomb ++;
					a = -1; 
					b = -1;
					continue;
				}
				for(int i=1; i<7; i++) {
					for(int j=0; j<7; j++) {
						if(map[i][j] == P && map[i-1][j] == 0) { // ���� 0�϶� �̵�
							map[i][j] = 0;
							map[i-1][j] = P;
						}
						if(map[i][j] == P && map[i-1][j] == I) { // ���� �������϶� �̵��� ��ź���� 
							map[i][j] = 0;
							map[i-1][j] = P;
							maxBomb ++;
						}
					}
				}
			}//sel == 1
			if(sel == 2) {
				if(a != -1 && b != -1 &&  a != 6 &&  map[a][b] == B && map[a+1][b] == 0) { //��ź ��ġ �� �̵�
					map[a+1][b] = P;
					a = -1;
					b = -1;
					continue;
				}
				if(a != -1 && b != -1 && a != 6 && map[a][b] == B && map[a+1][b] == I) { //��ź ��ġ �� �̵�
					map[a+1][b] = P;
					maxBomb ++;
					a = -1; 
					b = -1;
					continue;
				}
				int moveCheck = 0;
				for(int i=0; i<6; i++) {
					for(int j=0; j<7; j++) {
						if(map[i][j] == P && map[i+1][j] == 0) { // �Ʒ��� 0�϶� �̵�
							map[i][j] = 0;
							map[i+1][j] = P;
							moveCheck = 1;
							break;
						}
						if(map[i][j] == P && map[i+1][j] == I) { // �Ʒ��� �������϶� �̵��� ��ź����
							map[i][j] = 0;
							map[i+1][j] = P;
							maxBomb ++;
							moveCheck = 1;
							break;
						}
					}
					if(moveCheck == 1) break;
				}
			}//sel == 2
			if(sel == 3) {
				if(a != -1 && b != -1 &&  b != 0 &&  map[a][b] == B && map[a][b-1] == 0) {//��ź ��ġ �� �̵�
					map[a][b-1] = P;
					a = -1;
					b = -1;
					continue;
				}
				if(a != -1 && b != -1 && b != 0 && map[a][b] == B && map[a][b-1] == I) {//��ź ��ġ �� �̵�
					map[a][b-1] = P;
					maxBomb ++;
					a = -1; 
					b = -1;
					continue;
				}
				for(int i=0; i<7; i++) {
					for(int j=1; j<7; j++) {
						if(map[i][j] == P && map[i][j-1] == 0) {//������ 0�϶� �̵�
							map[i][j] = 0;
							map[i][j-1] = P;
						}
						if(map[i][j] == P && map[i][j-1] == I) {//������ �������϶� �̵��� �ִ� ��ź ����
							map[i][j] = 0;
							map[i][j-1] = P;
							maxBomb ++;
						}
					}
				}
			}//sel == 3
			if(sel == 4) {
				if(a != -1 && b != -1 &&  b != 6 &&  map[a][b] == B && map[a][b+1] == 0) { //��ź ��ġ �� �̵�
					map[a][b+1] = P;
					a = -1;
					b = -1;
					continue;
				}
				if(a != -1 && b != -1 && b != 6 && map[a][b] == B && map[a][b+1] == I) { //��ź ��ġ �� �̵�
					map[a][b+1] = P;
					maxBomb ++;
					a = -1; 
					b = -1;
					continue;
				}
				int moveCheck = 0;
				for(int i=0; i<7; i++) {
					for(int j=0; j<6; j++) {
						if(map[i][j] == P && map[i][j+1] == 0) { //�������� 0�϶� �̵�
							map[i][j] = 0;
							map[i][j+1] = P;
							moveCheck = 1;
							break;
						}
						if(map[i][j] == P && map[i][j+1] == I) { //�������� ��ź�϶� �̵� �� �ִ� ��ź ���� 
							map[i][j] = 0;
							map[i][j+1] = P;
							maxBomb ++;
							moveCheck = 1;
							break;
						}
					}
					if(moveCheck == 1) break;
				}
				
			}
			if(sel == 5) { //��ź ��ġ
				if(bomb < maxBomb) {
					for(int i=0; i<7; i++) {
						for(int j=0; j<7; j++) {
							if(map[i][j] == P) {
								map[i][j] = B;
								a = i;
								b = j;
								arr[bomb][0] = a;
								arr[bomb][1] = b;
								bomb ++;
							}
						}
					}
				}else System.out.println("��ź�� ���̻� ��ġ �� �� �����ϴ�.");
			}//sel == 5
			if(sel == 6 && bomb > 0) { // ��ź ���� 
				int playerCheck = 0; // ��ź�� ��ġ�ϰ� �����¿� �ƹ����̳� �������� �ʰ� ��ź���ĸ� �ϸ� ����� �������� ������ üũ�� ��. 
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++) {
						if(map[i][j] ==P) {
							playerCheck = 1;
						}
					}
				}
				if(playerCheck == 1) {
				int y = arr[0][0];
				int x = arr[0][1];
				int Y = -1;
				int X = -1;
				int temp1 = -1;
				int temp2 = -1;
				int temp3 = y;
				int temp4 = x;
				
				
				int cnt = 0;
				while(true) {
					 y = arr[0][0];
					 x = arr[0][1];
					 map[y][x] = B;
					int check = 0;
					int check3 = 0;
				if(check == 0  && map[y][x] == B) {
						for(int i=-1; i<=1; i++) {
							if(y+i >= 0 && y+i <7 && map[y+i][x] == I && i != 0 ) { //�������� ��ź ������ ������ 0���� ����
								map[y+i][x] = 0;
							}
							if(x+i >= 0 && x+i <7 && map[y][x+i] == I && i != 0 ) {//�������� ��ź ������ ������ 0���� ����
								map[y][x+i] = 0;
							}
							if(y+i >= 0 && y+i <7 && map[y+i][x] == W && i != 0 ){ //���� ��ź���� �μ��� 50���� Ȯ���� ������ ����
								int r = rn.nextInt(2);
								if(r == 0) map[y+i][x] = I;
								else map[y+i][x] = 0;
							}
							if(x+i >= 0 && x+i <7 && map[y][x+i] == W && i != 0 ) { //���� ��ź���� �μ��� 50���� Ȯ���� ������ ����
								int r = rn.nextInt(2);
								if(r == 0) map[y][x+i] = I;
								else map[y][x+i] = 0;
							}
						}
						check = 1;
						map[y][x] = 0;
						for(int i=0; i<bomb; i++) { //��ź�� �μ��� �迭 ��ܿ��� 
							if(i == bomb-1) break;
							arr[i][0] = arr[i+1][0];
							arr[i][1] = arr[i+1][1];
							
						}
						bomb--;
						check3 = 1;
				}
				
				int check2 = 0;
				for(int i=-1; i<=1; i++) {//��ź�� �� �� �� �� �˻��ؼ� ���������Ұ��� �ִ��� üũ . 
					if(y+i >= 0 && y+i < 7 ) {
						if(map[y+i][x] == B && i != 0) {
							Y = y+i;
							X = x;
							check2 = 1;
							break;
						}
					}
					if(x+i >= 0 && x+i < 7 ) {
						if(map[y][x+i] == B && i != 0) {
							Y = y;
							X = x+i;
							check2 = 1;
							break;
						}
					}
				}
				if(check2 == 1) { // ���������� ��ź�� ������ �� �迭�� ù��°�� ���ܿ� . 
					for(int i=0; i<bomb; i++) {
						for(int j=0; j<2; j++) {
							if(arr[i][0] == Y && arr[i][1] == X) {
								temp1 = arr[0][0];
								temp2 = arr[0][1];
								arr[0][0] = arr[i][0];
								arr[0][1] = arr[i][1];
								arr[i][0] = temp1;
								arr[i][1] = temp2;
							}
						}
					}
					y = Y;
					x = X;
				}
				if(check2 == 0) { // map[y][x]�ڸ��� ��ź�� ������ map[y][x]�� �� �������� �˻��ϰ� ���� ���̻� ��ź�� ������ �ٽ� map[y][x] �� �Ʒ� ���� �״��� ���� ���������� �˻� �� �� �ְ� map[y][x]�� ��� ������� .  
					y = temp3;
					x = temp4;
					int cnt2 = 0;
					int cnt3 = 0;
					for(int i=-1; i<2; i++) { //�׸��� map[y][x] �ֺ��� ���̻� ��ź�� ������ 6.��ź������ �ݺ����� ������ ���� ������ ������� . 
						if(y+i >= 0 && y+i <7) {
							if(map[y+i][x] != B && i != 0) { // map[y][x] �� �Ʒ��� ��ź�� ������ ī��Ʈ �� ����
								cnt2 ++;
							}
						}
						if(x+i >= 0 && x+i <7) {
							if(map[y][x+i] != B && i != 0) { // map[y][x] ���� �����ʿ� ��ź�� ������ ī��Ʈ �� ����
								cnt2 ++;
							}
						}
					}
					if(y == 0 || y == 6 || x == 0 || x == 6) { //�𼭸��� �ƴ� ���� ��ź�� �پ����� 3������ ��ź�� �ƴϸ� 6.��ź���� �� �ݺ��� ���� . 
						if(cnt2 == 3) break;
					}
					if(y == 0 && x == 0 && cnt2 == 2) { //�𼭸��� ��ź�� �͠����� 2������  ��ź�� �ƴϸ� �ݺ��� ���� . 
						break;
					}
					if(y == 0 && x == 6 && cnt2 == 2) {
						break;
					}
					if(y == 6 && x == 0 && cnt2 == 2) {
						break;
					}
					if(y == 6 && x == 6 && cnt2 == 2) {
						break;
					}
					if(cnt2 ==4 ) break; //map[y][x] �� 4������ ��ź�� �ƴϸ� �ݺ��� ���� . 
				}
				}//while(true)
				}
			}//sel == 6

		}//while(true)

	}//clear

}
