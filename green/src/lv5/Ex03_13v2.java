package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex03_13v2 {

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
		int arr[][] = new int[30][2];
		int bc = 0;
		final int W = 3;
		final int P = 2;
		final int B = 9;
		final int I = 4;
		int check4 = 0;
		int install = 5;
		int explode = 0;
		int bombCount = 0;
		
		System.out.print("������ ���� ���� �Է� : ");
		int wall = sc.nextInt();
		int cnt =0;
		int check= 0;
		int check2 = 0;
		int p1 =0;
		int p2 =0;
		for(int i=0; i<7; i++) {//wall , player ����. 
			for(int j=0; j<7; j++) {
				if(cnt< wall) {
					map[i][j] = W;
					cnt++;
				}
				if(map[i][j] == 0) {
					map[i][j] = P;
					check = 1;
					break;
				}
			}
			if(check == 1) {
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
						System.out.print("�� ");
					}
					
				}
				System.out.println();
			}
			for(int i=0; i<bc; i++) {//��ź�� ��ġ�� ��ǥ�� ���� ���
				for(int j=0; j<2; j++) {
					System.out.print(arr[i][j] + " ");
				}System.out.println();
			}System.out.println();
			System.out.println("�ִ���ź ��ġ ���� : " + install + "��" );
			System.out.println("��ġ�� ��ź ���� : "+bombCount+"��");
			System.out.println("bc : " + bc);
			System.out.println("1.��  2.��  3.��  4.��    5.��ź��ġ    6.���� ");
			int sel = sc.nextInt();
			if(sel == 1) {//�����̵�
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
			else if(sel == 2) {//�Ʒ����̵�
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
			else if(sel == 3) {//�·��̵�
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
			else if(sel == 4) {//����̵�
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
			else if(sel == 5) {//��ź��ġ
				
				if(bombCount < install) {
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++) {
						if(map[i][j] == P) {
							map[i][j] = B;
							check2 = 1;
							bombCount ++;
							p1 = i;
							p2 = j;
							
							arr[bc][0] = i;
							arr[bc][1] = j;
							bc++;
							
						}
					}
				}
			}
			else System.out.println("��ź�� �ִ�� ��ġ�Ǿ��ִ�.");
				
			}
			else if(sel == 6) {//���� !! 
				int playerCheck = 0;
				for(int i=0; i<7; i++) {
					for(int j=0; j<7; j++) {
						if(map[i][j] == P) {
							playerCheck = 1; //�÷��̾ ��ź�� ��ġ�Ѽ��� ��ź�̶� �÷��̾�� ��ġ�°� üũ .
						}
					}
				}
				if(playerCheck == 1) {
					int c = 0;
					int Y = arr[0][0];
					int X = arr[0][1];
					while(c < 2) {

					if(map[0][0] == B && map[0][1] != P && map[1][0] != P &&arr[0][0] == 0 && arr[0][1] == 0) {//������ �𼭸��� ��ź�϶�
						if(map[0][1] != 0) { 
							int r = rn.nextInt(2);
							if(r == 0) map[0][1] = I;	
							else map[0][1] = 0;
						}
						if(map[1][0] != 0) { 
							int r = rn.nextInt(2);
							if(r == 0) map[1][0] = I;	
							else map[1][0] = 0;
						}
						map[0][0] = 0;
						bombCount --;
						check4 = 1;
						System.out.println("map[0][0] :" +map[0][0]);
						System.out.println("�������𼭸��߾�");//Ȯ�ο� ���
						continue;
					}
					if(map[0][6] == B && map[0][5] != P && map[1][6] != P &&arr[0][0] == 0 && arr[0][1] == 6) {//�������� �𼭸��� ��ź�϶�
						if(map[0][5] != 0) { 
							int r = rn.nextInt(2);
							if(r == 0) map[0][5] = I;	
							else map[0][5] = 0;
						}
						if(map[1][6] != 0) { 
							int r = rn.nextInt(2);
							if(r == 0) map[1][6] = I;	
							else map[1][6] = 0;
						}
						map[0][6] = 0;
						bombCount --;
						check4 = 1;
						System.out.println("���������𼭸�");//Ȯ�ο� ���
						continue;
					}
					if(map[6][0] == B && map[5][0] != P && map[6][1] != P &&arr[0][0] == 6 && arr[0][1] == 0) {//���ʾƷ� �𼭸��� ��ź�϶�
						if(map[5][0] != 0) { 
							int r = rn.nextInt(2);
							if(r == 0) map[5][0] = I;	
							else map[5][0] = 0;
						}
						if(map[6][1] != 0) { 
							int r = rn.nextInt(2);
							if(r == 0) map[6][1] = I;	
							else map[6][1] = 0;
						}
						map[6][0] = 0;
						bombCount --;
						check4 = 1;
						System.out.println("���ʾƷ��𼭸�");//Ȯ�ο� ��� 
						continue;
					}
					if(map[6][6] == B && map[5][6] != P && map[6][5] != P &&arr[0][0] == 6 && arr[0][1] == 6) {//�����ʾƷ� �𼭸��� ��ź�϶�
						if(map[5][6] != 0) { 
							int r = rn.nextInt(2);
							if(r == 0) map[5][6] = I;	
							else map[5][6] = 0;
						}
						if(map[6][5] != 0) { 
							int r = rn.nextInt(2);
							if(r == 0) map[6][5] = I;	
							else map[6][5] = 0;
						}
						map[6][6] = 0;
						bombCount --;
						check4 = 1;
						System.out.println("�����ʾƷ��𼭸�");//Ȯ�ο� ���
						continue;
					}
					int check3 = 0;
					for(int j=1; j<6; j++) {
						if(map[0][j] == B && map[0][j-1] != P && map[0][j+1] != P && map[1][j] != P
								&& arr[0][0] == 0 && arr[0][1] == j) {
							//�����ٿ� ��ź�� ������
							if(map[0][j-1] != 0) {
								int r = rn.nextInt(2);
								if(r == 0) map[0][j-1] = I;	
								else map[0][j-1] = 0;
							}
							if(map[0][j+1] != 0) {
								int r = rn.nextInt(2);
								if(r == 0) map[0][j+1] = I;	
								else map[0][j+1] = 0;
							}
							if(map[1][j] != 0) {
								int r = rn.nextInt(2);
								if(r == 0) map[1][j] = I;	
								else map[1][j] = 0;
							}
							map[0][j] = 0;
							bombCount --;
							check3 = 1;
							check4 = 1;
							System.out.println("������"); //Ȯ�ο� ��� 
							break;
						}
						if(map[6][j] == B && map[6][j-1] != P && map[6][j+1] != P && map[6][j] != P
								&&arr[0][0] == 6 && arr[0][1] == j) {
							//�ǾƷ��� ��ź�� ������
							if(map[6][j-1] != 0) {
								int r = rn.nextInt(2);
								if(r == 0) map[6][j-1] = I;	
								else map[6][j-1] = 0;
							}
							if(map[6][j+1] != 0) {
								int r = rn.nextInt(2);
								if(r == 0) map[6][j+1] = I;	
								else map[6][j+1] = 0;
							}
							if(map[5][j] != 0) {
								int r = rn.nextInt(2);
								if(r == 0) map[5][j] = I;	
								else map[5][j] = 0;
							}
							map[6][j] = 0;
							bombCount --;
							check3 = 1;
							check4 = 1;
							System.out.println("�ǾƷ���"); //Ȯ�ο� ���
							break;
						}
					}
					if(check3 == 1) continue;
					check3 = 0;
					for(int i=1; i<6; i++) {
						if(map[i][0] == B && map[i-1][0] != P && map[i+1][0] != P && map[i][1] != P
								&&arr[0][0] == i && arr[0][1] == 0) {
							//�ǿ����ٿ� ��ź�� ������
							if(map[i-1][0] != 0) {
								int r = rn.nextInt(2);
								if(r == 0) map[i-1][0] = I;	
								else map[i-1][0] = 0;
							}
							if(map[i+1][0] != 0) {
								int r = rn.nextInt(2);
								if(r == 0) map[i+1][0] = I;	
								else map[i+1][0] = 0;
							}
							if(map[i][1] != 0) {
								int r = rn.nextInt(2);
								if(r == 0) map[i][1] = I;	
								else map[i][1] = 0;
							}
							map[i][0] = 0;
							bombCount --;
							check3 = 1;
							check4 = 1;
							System.out.println("�ǿ���"); //Ȯ�ο� ���
							break;
						}
						if(map[i][6] == B && map[i-1][6] != P && map[i+1][6] != P && map[i][5] != P
								&&arr[0][0] == i && arr[0][1] == 6) {
							//�ǿ������ٿ� ��ź�� ������
							if(map[i-1][6] != 0) {
								int r = rn.nextInt(2);
								if(r == 0) map[i-1][6] = I;	
								else map[i-1][6] = 0;
							}
							if(map[i+1][6] != 0) {
								int r = rn.nextInt(2);
								if(r == 0) map[i+1][6] = I;	
								else map[i+1][6] = 0;
							}
							if(map[i][5] != 0) {
								int r = rn.nextInt(2);
								if(r == 0) map[i][5] = I;	
								else map[i][5] = 0;
							}
							map[i][6] = 0;
							bombCount --;
							check3 = 1;
							check4 = 1;
							System.out.println("�ǿ�����"); //Ȯ�ο� ���
							break;
						}
					}
					if(check3 == 1) continue;
					int chekc3 =0;
					for(int i=1; i<6; i++) {
						for(int j=1; j<6; j++){
							//�𼭸��� �ƴϰ� �ǳ��ٵ� �ƴ� �߾ӿ� ��ź�� ������ 
							if(map[i][j] == B && map[i][j+1] != P && map[i][j-1] != P
									&&map[i+1][j] != P && map[i-1][j] != P
									&& arr[0][0] == i && arr[0][1] == j) {
								if(map[i][j+1] != 0) {
									int r = rn.nextInt(2);
									if(r == 0) map[i][j+1] = I;
									else map[i][j+1] = 0;
								}
								if(map[i][j-1] != 0) {
									int r = rn.nextInt(2);
									if(r == 0) map[i][j-1] = I;
									else map[i][j-1] = 0;
								}
								if(map[i+1][j] != 0) {
									int r = rn.nextInt(2);
									if(r == 0) map[i+1][j] = I;
									else map[i+1][j] = 0;
								}
								if(map[i-1][j] != 0) {
									int r = rn.nextInt(2);
									if(r == 0) map[i-1][j] = I;
									else map[i-1][j] = 0;
								}
								map[i][j] = 0;
								bombCount --;
								check3 = 1;
								check4 = 1;
								System.out.println("�߾�!"); //Ȯ�ο� ���
								break;
							}
						}
						if(check3 == 1) break;
					}
					if(c == 1) {
						check4 = 1;
					}
					c = 2;
					if(check4 == 1) {//���� �ֽŰͺ��� �����Ѱ� �迭 ����
						int checkX = 0;
						int checkY = 0;

						System.out.println("Y :" +Y);
						System.out.println("X :" +X);

						bc --;
						for(int i=0; i<29; i++) {
							arr[i][0] = arr[i+1][0];
							arr[i][1] = arr[i+1][1];
						}
						arr[29][0] = 0;
						arr[29][1] = 0;
						check4 = 0;
						int idx = -1;
						for(int j=-1; j<=1; j++) {
							if(arr[0][0]+j >= 0 && arr[0][0]+j <7) {
							for(int a = 0; a<30; a++) {
									if(arr[a][0] == Y+j && arr[a][1] == X && j != 0) {
										c = 1;
										idx = a;
										break;
								}
							}if(c ==1) break;						
							}
							if(arr[0][1]+j >= 0 && arr[0][1]+j <7) {
							for(int a = 0; a<30; a++) {
								if(arr[a][0] == Y && arr[a][1] == X+j && j != 0) {
										c = 1;
										idx = a;
										break;
								}
							}if(c ==1) break;	
							}
						}
						

						if(c == 1) {
							int temp1 = arr[0][0];
							int temp2 = arr[0][1];
							System.out.println("arr[0][0] = "+arr[0][0]);
							System.out.println("arr[0][1] = "+arr[0][1]);
							arr[0][0] = arr[idx][0];
							arr[0][1] = arr[idx][1];
							System.out.println("arr[0][0] = "+arr[0][0]);
							System.out.println("arr[0][1] = "+arr[0][1]);
							System.out.println("idx : " + idx);
							arr[idx][0] = temp1;
							arr[idx][1] = temp2;

				//			map[arr[0][0]][arr[0][1]] = B;
							
							continue;
						}

						System.out.println("c : " + c);
						c = 2;
						}
					}
					}//while (c < 2)
				int tt = 0;

				
			}//playercheck
			}//sel == 6

		}//while

	}


