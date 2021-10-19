package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex03_16 {

	public static void main(String[] args) {
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
		for(int i=0; i<snake; i++) {
			x[i] = i;
			y[i] = 0;
			map[y[i]][x[i]] = i + 1;
		}
		System.out.println("�����϶����� �������� ������ Ȯ���� �����ּ��� .");
		System.out.println("ex)1�Է½� 1/1Ȯ��\nex)2�Է½� 1/2Ȯ��\nex)3�Է½� 1/3Ȯ��\nex)4�Է½� 1/4Ȯ��");
		int p = sc.nextInt();
		while(true) {
			System.out.println("���� ����  : " + snake);
			int random = rn.nextInt(p);//�����϶����� 1/2
			if(random == 0) {
				while(true) {
					int itemX = rn.nextInt(size);
					int itemY = rn.nextInt(size);
					if(map[itemX][itemY] == 0) {
						map[itemX][itemY] = 9;
						break;
					}
				}
			}
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					if(map[i][j] == 9) {
						System.out.print("�� ");
					}
					else {
						System.out.print(map[i][j] + " ");
						
					}
				}
				System.out.println();
			}
			System.out.println();
			System.out.print("1)left 2)right 3)up 4)down : ");
			int sel = sc.nextInt();
			if(sel == 1) {
				int check = 0;
				int check3 = 0;
				int check4 = 0;
				int a = 0;
				int b = 0;
				int c = 0;
				int d = 0;
				for(int i=0; i<size; i++) {//�Ӹ��� �����ʿ� ������ ��Ƽ��
					if(map[i][0] == snake) {
						check = 1;
						System.out.println("continue");
					}
				}
				if(check == 1) continue;
				int dieCheck = 0;
				for(int i=0; i<size; i++) {//�Ӹ��� ���±濡 0�� �ƴϸ� ��ž 
					for(int j=0; j<size; j++) {
						if(map[i][j] == snake && map[i][j-1] == snake-1) {
							check3 = 1;
						}
						if(map[i][j] == snake && map[i][j-1] >= 1 && map[i][j-1] <=snake-2) {
							dieCheck = 1; //���� �΋H���� ���� .
						}
					}
				}
				if(dieCheck == 1) {
					System.out.println("�� ���� �΋H�� ���. ");
					break;
				}
				if(check3 == 1) continue;
				for(int k = snake; k>0; k--) {
					int check2 = 0;
					for(int i=0; i<size; i++) {
						for(int j=0; j<size; j++) {
							if(map[i][j] == snake && check == 0 && map[i][j-1] == 9 && snake <= 7 ) {
								map[i][j-1] = snake+1;
								snake++;
								check4 = 1;
								check = 1;
								break; //�����۸����� ��ĭ���� 
							}
							if(map[i][j] == snake && check == 0 && map[i][j-1] == 0 ) {
								map[i][j-1] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1;//�����ϰ��� �ƹ��͵� ������ ������
							}
							if(map[i][j] == snake && check == 0 && map[i][j-1] == 9 && snake>7 ) {
								map[i][j-1] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1; //���̰� 8�Ǹ� �������� �Ծ �þ�� ���� 
							}
							if(k < snake) {//������ ������� ����� �ڵ�
								if(map[i][j] == k) {
									a = i;
									b = j;
									map[i][j] = 0;
									map[c][d] = k;
									c = a;
									d = b;
								check2 = 1;
								break;
								}
								
							}
						}
						if(check2 == 1) break;
						if(check4 == 1) break;
					}
					if(check4 == 1) break;
				}
			}//sel == 1
			else if(sel == 2) {
				int check = 0;
				int check3 = 0;
				int check4 = 0;
				int a = 0;
				int b = 0;
				int c = 0;
				int d = 0;
				for(int i=0; i<size; i++) {//�Ӹ��� �����ʿ� ������ ��Ƽ��
					if(map[i][size-1] == snake) {
						check = 1;
					}
					
				}
				if(check == 1) continue;
				int dieCheck = 0;
				for(int i=0; i<size; i++) {//�Ӹ��� ���±濡 0�� �ƴϸ� ��ž 
					for(int j=0; j<size; j++) {
						if(map[i][j] == snake && map[i][j+1] == snake-1) {
							check3 = 1;
						}
						if(map[i][j] == snake && map[i][j+1] >= 1 && map[i][j+1] <=snake-2) {
							dieCheck = 1;//���� �΋H���� ���� .
						}
					}
				}
				if(dieCheck == 1) {
					System.out.println("�� ���� �΋H�� ���. ");
					break;
				}
				if(check3 == 1) continue;
				for(int k = snake; k>0; k--) {
					int check2 = 0;
					for(int i=0; i<size; i++) {
						for(int j=0; j<size; j++) {
							if(map[i][j] == snake && check == 0 && map[i][j+1] == 9 && snake <= 7 ) {
								map[i][j+1] = snake+1;
								snake++;
								check4 = 1;
								check = 1;
								break;//�����۸����� ��ĭ���� 
							}
							if(map[i][j] == snake&& check == 0 && map[i][j+1] == 0  ) {
								map[i][j+1] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1;	//�����ϰ��� �ƹ��͵� ������ ������
							}
							if(map[i][j] == snake&& check == 0 && map[i][j+1] == 9 && snake>7  ) {
								map[i][j+1] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1;	//���̰� 8�Ǹ� �������� �Ծ �þ�� ���� 
							}
							if(k < snake) {//������ ������� ����� �ڵ�
								if(map[i][j] == k) {
									a = i;
									b = j;
									map[i][j] = 0;
									map[c][d] = k;
									c = a;
									d = b;
								check2 = 1;
								break;
								}
								
							}
						}
						if(check2 == 1) break;
						if(check4 == 1) break;
					}
					if(check4 == 1) break;

				}
			}//sel == 2
			else if(sel == 3) {
				int check = 0;
				int check3 = 0;
				int check4 = 0;
				int a = 0;
				int b = 0;
				int c = 0;
				int d = 0;
				for(int i=0; i<size; i++) {//�Ӹ��� ������ ������ ��Ƽ��
					if(map[0][i] == snake) {
						check = 1;
					}
				}
				if(check == 1) continue;
				int dieCheck = 0;
				for(int i=0; i<size; i++) {//�Ӹ��� ���±濡 0�� �ƴϸ� ��ž 
					for(int j=0; j<size; j++) {
						if(map[i][j] == snake && map[i-1][j] == snake-1) {
							check3 = 1;
						}
						if(map[i][j] == snake && map[i-1][j] >= 1 && map[i-1][j] <=snake-2) {
							dieCheck = 1;//���� �΋H���� ���� .
						}
					}
				}
				if(dieCheck == 1) {
					System.out.println("�� ���� �΋H�� ���. ");
					break;
				}
				if(check3 == 1) continue;
				for(int k = snake; k>0; k--) {
					int check2 = 0;
					for(int i=0; i<size; i++) {
						for(int j=0; j<size; j++) {
							if(map[i][j] == snake && check == 0 && map[i-1][j] == 9 && snake <= 7 ) {
								map[i-1][j] = snake+1;
								snake++;
								check4 = 1;
								check = 1;
								break;//�����۸����� ��ĭ���� 
							}
							if(map[i][j] == snake&& check == 0 && map[i-1][j] == 0) {
								map[i-1][j] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1; //�����ϰ��� �ƹ��͵� ������ ������
							}
							if(map[i][j] == snake&& check == 0 && map[i-1][j] == 9 && snake>7) {
								map[i-1][j] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1; //���̰� 8�Ǹ� �������� �Ծ �þ�� ���� 
							}
							if(k < snake) {//������ ������� ����� �ڵ�
								if(map[i][j] == k) {
									a = i;
									b = j;
									map[i][j] = 0;
									map[c][d] = k;
									c = a;
									d = b;
								check2 = 1;
								break;
								}
								
							}
						}
						if(check2 == 1) break;
						if(check4 == 1) break;
					}
					if(check4 == 1) break;
				}
			}//sel == 3
			else if(sel == 4) {
				int check = 0;
				int check3 = 0;
				int check4 = 0;
				int a = 0;
				int b = 0;
				int c = 0;
				int d = 0;
				for(int i=0; i<size; i++) {//�Ӹ��� �Ʒ��� ������ ��Ƽ��
					if(map[size-1][i] == snake) {
						check = 1;
					}
				}
				if(check == 1) continue;
				int dieCheck = 0;
				for(int i=0; i<size; i++) {//�Ӹ��� ���±濡 0�� �ƴϸ� ��ž 
					for(int j=0; j<size; j++) {
						if(map[i][j] == snake && map[i+1][j] == snake-1) {
							check3 = 1;
						}
						if(map[i][j] == snake && map[i+1][j] >= 1 && map[i+1][j] <=snake-2) {
							dieCheck = 1;//���� �΋H���� ���� .
						}
					}
				}
				if(dieCheck == 1) {
					System.out.println("�� ���� �΋H�� ���. ");
					break;
				}
				if(check3 == 1) continue;
				for(int k = snake; k>0; k--) {
					int check2 = 0;
					for(int i=0; i<size; i++) {
						for(int j=0; j<size; j++) {
							if(map[i][j] == snake && check == 0 && map[i+1][j] == 9 && snake <= 7 ) {
								map[i+1][j] = snake+1;
								snake++;
								check4 = 1;
								check = 1;
								break;//�����۸����� ��ĭ���� 
							}
							if(map[i][j] == snake&& check == 0 && map[i+1][j] == 0) {
								map[i+1][j] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1;//�����ϰ��� �ƹ��͵� ������ ������
							}
							if(map[i][j] == snake&& check == 0 && map[i+1][j] == 9 && snake>7) {
								map[i+1][j] = snake;
								map[i][j] = 0;
								c = i;
								d = j;
								check = 1; //���̰� 8�Ǹ� �������� �Ծ �þ�� ���� 
							}
							if(k < snake) {//������ ������� ����� �ڵ�
								if(map[i][j] == k) {
									a = i;
									b = j;
									map[i][j] = 0;
									map[c][d] = k;
									c = a;
									d = b;
								check2 = 1;
								break;
								}
								
							}
						}
						if(check2 == 1) break;
						if(check4 == 1) break;
					}
					if(check4 == 1) break;
				}
			}//sel == 4 
			
		}//while

	}

}
