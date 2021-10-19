package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex03_13 {

	public static void main(String[] args) {
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
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		int map[][] = new int[7][7];
		int arr[][] = new int [30][2];
		final int W = 3;
		final int P = 2;
		final int B = 9;
		final int I = 4;
		
		System.out.print("������ ���� ���� �Է� : ");
		int wall = sc.nextInt();
		int install = 5;
		int c1 = 0;
		int c2 = 0;
		int p1 =0;
		int p2 =0;
		int bombCount = 0;
		int check= 0;
		int check2 = 0;
		for(int i=0; i<7; i++) {//wall , player ����. 
			for(int j=0; j<7; j++) {
				if(c1< wall) {
					map[i][j] = W;
					c1++;
				}
				if(map[i][j] == 0) {
					map[i][j] = P;
					c2 = 1;
					break;
				}
			}
			if(c2 == 1) {
				break;
			}
		}
		int x = 0;
		
		while ( x == 0) {//��ŸƮ�������� player �ֺ��� �� ���� ���� 
			int y = 0;
			while(y < 300) {
			int x1 = rn.nextInt(7);
			int x2 = rn.nextInt(7);
			int x3 = rn.nextInt(7);
			int x4 = rn.nextInt(7);
			
			int temp = map[x1][x2];
			map[x1][x2] = map[x3][x4];
			map[x3][x4] = temp;
			y++;
			}
			int a = rn.nextInt(5)+1;
			int b = rn.nextInt(5)+1;
			if(map[a][b] == P && map[a][b-1] == 0 && map[a][b+1] == 0 && map[a+1][b] == 0 && map[a-1][b] == 0) {
				map[a][b] = P;
				x = 1;
			}
		}//w
		
		while(true) {
			
		for(int i=0; i<7; i++) {//���
			for(int j=0; j<7; j++) {
				if(map[i][j] == 0) {
					System.out.print("+ ");
				}
				if(map[i][j] == W) {
					System.out.print("�� ");
				}
				if(map[i][j] == P) {
					System.out.print("�� ");
				}
				if(map[i][j] == B) {
					System.out.print("@ ");
				}
				if(map[i][j] == I) {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
		System.out.println("�ִ���ź ��ġ ���� : " + install + "��" );
		System.out.println("��ġ�� ��ź ���� : "+bombCount+"��");
		System.out.println("1.��  2.��  3.��  4.��     5.��ź��ġ   6.���� ! ");
		int sel = sc.nextInt();
		
		if(sel == 1) {
			for(int i=1; i<7; i++) {
				for(int j=0; j<7; j++) {
					if(check2 == 1 && p1 == 0) {
						break;
					}
					if(check2 == 1 && map[p1][p2] == B && map[p1-1][p2] == B) {//��ź����ġ�ߴµ� ���� ��ź�� �������
						break;
					}
					if(check2 == 1 && map[i][j] == B && map[i-1][j] == 0) {//��ź�� ��ġ�ϰ� �̵��Ҷ� 
						map[p1-1][p2] = P;
						check2 = 0;
						break;
					}
					if(map[i][j] == P && map[i-1][j] == I) {
						install ++;
					}
					if(map[i][j] == P && map[i-1][j] == W ) {
						break;
					}
					if(map[i][j] == P && map[i-1][j] == B) {
						break;
					}
					if(map[i][j] == P) {
						map[i][j] = 0;
						map[i-1][j] = P;
					}
					
				}
			}
		}
		if(sel == 2) {
			check = 0;
			for(int i=0; i<6; i++) {
				for(int j=0; j<7; j++) {
					if(check2 == 1 && p1 == 6) {
						break;
					}
					if(check2 == 1 && map[p1][p2] == B && map[p1+1][p2] == B) {//��ź����ġ�ߴµ� ���� ��ź�� �������
						break;
					}
					if(check2 == 1 && map[i][j] == B && map[i+1][j] == 0) {//��ź�� ��ġ�ϰ� �̵��Ҷ� 
						map[p1+1][p2] = P;
						check2 = 0;
						check = 1;
						break;
					}
					if(map[i][j] == P && map[i+1][j] == I) {
						install ++;
					}
					if(map[i][j] == P && map[i+1][j] == W ) {
						break;
					}
					if(map[i][j] == P && map[i+1][j] == B) {
						break;
					}
					if(map[i][j] == P) {
						map[i][j] = 0;
						map[i+1][j] = P;
						check = 1;
						break;
					}	
				}
				if(check == 1) {
					break;						
				}
			}
		}
		if(sel == 3) {
			check = 0;
			for(int i=0; i<7; i++) {
				for(int j=1; j<7; j++) {
					if(check2 == 1 && p2 == 0) {
						break;
					}
					if(check2 == 1 && map[p1][p2] == B && map[p1][p2-1] == B) {//��ź����ġ�ߴµ� ���ʿ� ��ź�� �������
						break;
					}
					if(check2 == 1 && map[i][j] == B && map[i][j-1] == 0) {//��ź�� ��ġ�ϰ� �̵��Ҷ� 
						map[p1][p2-1] = P;
						check2 = 0;
						check = 1;
						break;
					}
					if(check ==1 ) {
						break;
					}
					if(map[i][j] == P && map[i][j-1] == I) {
						install ++;
					}
					if(map[i][j] == P && map[i][j-1] == W ) {
						break;
					}
					if(map[i][j] == P && map[i][j-1] == B) {
						break;
					}
					if(map[i][j] == P) {
						map[i][j] = 0;
						map[i][j-1] = P;


					}	
				}

			}
		}
		if(sel == 4) {
			check = 0;
			for(int i=0; i<7; i++) {
				for(int j=0; j<6; j++) {
					if(check2 == 1 && p2 == 6) {
						break;
					}
					if(check2 == 1 && map[p1][p2] == B && map[p1][p2+1] == B) {//��ź����ġ�ߴµ� ���� ��ź�� �������
						break;
					}
					if(check2 == 1 && map[i][j] == B && map[i][j+1] == 0) {//��ź�� ��ġ�ϰ� �̵��Ҷ� 
						map[p1][p2+1] = P;
						check2 = 0;
						check = 1;
						break;
					}
					if(map[i][j] == P && map[i][j+1] == I) {
						install ++;
					}
					if(map[i][j] == P && map[i][j+1] == W ) {
						break;
					}
					if(map[i][j] == P && map[i][j+1] == B) {
						break;
					}
					if(map[i][j] == P) {
						map[i][j] = 0;
						map[i][j+1] = P;
						check = 1;
						break;
					}	
				}
				if(check == 1) {
					break;						
				}
			}
		}
		if(sel == 5) {
			if(bombCount < install) {
			for(int i=0; i<7; i++) {
				for(int j=0; j<7; j++) {
					if(map[i][j] == P) {
						map[i][j] = B;
						check2 = 1;
						arr[bombCount][0] = i;
						arr[bombCount][1] = j;
						bombCount ++;
						p1 = i;
						p2 = j;
						
						
					}
				}
			}
		}
		else System.out.println("��ź�� �ִ�� ��ġ�Ǿ��ִ�.");
			
			
		}
		if(sel == 6) {
			if(bombCount > 0) {
				boolean check3 = false;
				int checkY = -1;
				int checkX = -1;
				while(!check3) {
					checkY = -1;
					checkX = -1;
					int Y = arr[0][0];//3
					int X = arr[0][1];//2

					// ���˻� & ���� 
					for(int i=-1; i<=1; i++) {
						if(Y+i>=0 && Y+i<5) {
							if(map[Y+i][X]==9 && Y+i != Y) { // ���ΰ˻�
								checkY = Y+i;
								checkX = X;
								System.out.println("���ΰ˻�");
							}
							map[Y+i][X] = 0;
						}
						if(X+i>=0 && X+i<5) {
							if(map[Y][X+i]==9 && X+i != X) { // ���ΰ˻�
								checkY = Y;
								checkX = X+i;
								System.out.println("���ΰ˻�");
							}
							map[Y][X+i] = 0;
						}
					}

					// �迭 ����
					for(int i=0; i<bombCount-1; i++) {
						arr[i][0] = arr[i+1][0];
						arr[i][1] = arr[i+1][1];
					}
					arr[bombCount-1][0] = 0;
					arr[bombCount-1][1] = 0;
					bombCount --;

					// ��ź �� ��ź
					int idx = -1;
					if(checkY != -1) {
						for(int i=0; i<bombCount; i++) {
							if(arr[i][0] == checkY && arr[i][1] == checkX) {
								idx = i;
							}
						}
						int tempY = arr[0][0];
						int tempX = arr[0][1];
						arr[0][0] = arr[idx][0];
						arr[0][1] = arr[idx][1];
						arr[idx][0] = tempY;
						arr[idx][1] = tempX;
						System.out.println("��ź��");
					}
					else {
						check3 = true;
					}
				}//while
			}
		}
		
		for(int i=0; i<bombCount; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}System.out.println();
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			}
	}