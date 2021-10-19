package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Ex03_14 {

	public static void main(String[] args) {
		// ���ڹ� ����Ŀ �ϱ�
		// �÷��̾ ���ƴٴϸ鼭 ��ź ���������� �������� ��ġ �� ���Ϸ� ���� ��,
		// �ܼ����� �� ����� �ÿ��� �� ������ �̾ �� �ְ� ��������
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		final int SIZE = 9;
		final int PLAYER = 2;
		final int WALL = 3;
		final int BALL = 4;
		final int GOAL = 5;
		int pY = 0;
		int pX = 0;
		int y = -1;
		int x = -1; 
		int cnt = 0;
		int[][] map = new int[SIZE][SIZE];
		int[][] maker = new int[SIZE][SIZE];
		String fileName = "maker.txt";
		maker[5][5] = PLAYER;
		File file = new File(fileName);
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		while (true) {
			System.out.println("[1]���ڹ� ����Ŀ");
			System.out.println("[2]���� �����ϱ�"); // ����� ���� ������ -> �ҷ��ͼ� ���ӽ���
			System.out.println("[0]�����ϱ�");
			int choice = scan.nextInt();
			if (choice == 1) {
				while (true) {
					for (int i = 0; i < SIZE; i++) {
						for (int j = 0; j < SIZE; j++) {
							if (map[i][j] != 0 && maker[i][j] == PLAYER) {
								System.out.print("*\t");
							} else if (maker[i][j] == PLAYER) {
								System.out.print("��\t");
							} else if (map[i][j] == WALL) {
								System.out.print("��\t");
							} else if (map[i][j] == BALL) {
								System.out.print("��\t");
							} else if (map[i][j] == GOAL) {
								System.out.print("��\t");
							} else if (map[i][j] == 22) {
								System.out.print(map[i][j] + "\t");
							} else {
								System.out.print(maker[i][j] + "\t");
							}
						}
						System.out.println("\n");
					}
					System.out.println();
					System.out.println("[�̵�] �� ��(1)��(2)��(3)��(4)");
					System.out.println("[��ġ] �� ��(5)��(6)��(7)��(8) ");
					System.out.println("[����] �� 0");
					int move = scan.nextInt();
					if(move == 1) {
						for(int i=1; i<SIZE; i++) {
							for(int j=0; j<SIZE; j++) {
								if(maker[i][j] == PLAYER) {
									maker[i-1][j] = PLAYER;
									maker[i][j] = 0;
								}
							}
						}
						
					}
					else if (move == 2) {
						int m = 0;
						for(int i=0; i<SIZE-1; i++) {
							for(int j=0; j<SIZE; j++) {
								if(maker[i][j] == PLAYER) {
									maker[i+1][j] = PLAYER;
									maker[i][j] = 0;
									m = 1;
									break;
								}
							}
							if( m == 1) break;
						}
					}
					else if (move == 3) {
						
						for(int i=0; i<SIZE; i++) {
							for(int j=1; j<SIZE; j++) {
								if(maker[i][j] == PLAYER) {
									maker[i][j-1] = PLAYER;
									maker[i][j] = 0;
								}
							}
						}
						
					}
					else if (move == 4) {
						int m = 0;
						for(int i=0; i<SIZE; i++) {
							for(int j=0; j<SIZE-1; j++) {
								if(maker[i][j] == PLAYER) {
									maker[i][j+1] = PLAYER;
									maker[i][j] = 0;
									m = 1; 
									break;
								}
							}
							if( m == 1) break;
						}
					}
					else if (move == 5) {
						for(int i=0; i<SIZE; i++) {
							for(int j=0; j<SIZE; j++) {
								if(maker[i][j] == PLAYER) {
									map[i][j] = WALL;
								}
							}
						}
					}
					else if (move == 6) {
						for(int i=0; i<SIZE; i++) {
							for(int j=0; j<SIZE; j++) {
								if(maker[i][j] == PLAYER) {
									map[i][j] = BALL;
								}
							}
						}
						cnt ++;
					}
					else if (move == 7) {
						for(int i=0; i<SIZE; i++) {
							for(int j=0; j<SIZE; j++) {
								if(maker[i][j] == PLAYER) {
									map[i][j] = GOAL;
								}
							}
						}
					}
					else if (move == 8) {
						for(int i=0; i<SIZE; i++) {
							for(int j=0; j<SIZE; j++) {
								if(map[i][j] == 22) {
									map[i][j] = 0;
								}
							}
						}
							for(int i=0; i<SIZE; i++) {
								for(int j=0; j<SIZE; j++) {
									if(maker[i][j] == PLAYER) {
										map[i][j] = 22;
										y = i;
										x = j;
									}
								}
							}
					}
					else if (move == 0) {
						System.out.println("���� ���ڹ� ����Ŀ�� save file�� �����Ͻðڽ��ϱ� ?  1.yes   2.no");
						int sel = scan.nextInt();
						if(sel == 1) {
							try {
								fw = new FileWriter(file);
								for(int i=0; i<SIZE; i++) {
									for(int j=0; j<SIZE; j++) {
										fw.write(map[i][j]+"\n");
									}
								}
								fw.close();
								System.out.println("���ڹݸ���Ŀ�� save file�� �����߽��ϴ�.");
							} catch (Exception e) {
								e.printStackTrace();
							}
							
						} else if(sel == 2) {
							System.out.println("���ڹݸ���Ŀ�� �������� �ʰ� ���� ���θ޴��� ���ư��ϴ� . ");
							
						}
						break;
					}
					
				}//while
			}//choice == 1
			else if (choice == 2) {
				if(file.exists()) {
					System.out.println("save file�� �ֽ��ϴ� . load �Ͻðڽ��ϱ�?  1.yes  2.no");
					int sel = scan.nextInt();
					if(sel == 1) {
						try {
							fr = new FileReader(file);
							br = new BufferedReader(fr);
							for(int i=0; i<SIZE; i++) {
								for(int j=0; j<SIZE; j++) {
									String data  = br.readLine();
									
									map[i][j] = Integer.parseInt(data);
									if(map[i][j] == BALL) cnt ++;
								}
							}
							fr.close();
							br.close();
							System.out.println("load�� �����߽��ϴ�.");
						} catch (Exception e) {
							e.printStackTrace();
						}
						for(int i=0; i<SIZE; i++) {
							for(int j=0; j<SIZE; j++) {
								if(map[i][j] == 22) {
									map[i][j] = PLAYER;
								}
							}
						}
					}else if (sel == 2) {
						
					}
				}else System.out.println("�ҷ��� save�����̾����ϴ�");
				if(y != -1 && x != -1) {
					map[y][x] = PLAYER;
				}
				while(true) {
				for(int i=0; i<SIZE; i++) {//���
					for(int j=0; j<SIZE; j++) {
						if(map[i][j] == PLAYER) {
							System.out.print("��\t");
						}else if (map[i][j] == WALL) {
							System.out.print("��\t");
						}else if (map[i][j] == BALL) {
							System.out.print("��\t");
						}else if (map[i][j] == GOAL) {
							System.out.print("��\t");
						}else System.out.print(map[i][j] + "\t");
						
					}
					System.out.println("\n");
				}System.out.println();
				
				if(cnt == 0) { //�ʿ� ���� �������� ���� ���� , 
					for(int i=0; i<SIZE; i++) {
						for(int j=0; j<SIZE; j++) {
							if(map[i][j] == PLAYER) {
								map[i][j] = 0;
							}
						}
					}
					System.out.println("���� ���� ���̻� �����Ƿ� ���� ���� ! ");
					break;
				}
				System.out.println("[�̵�] �� ��(1)��(2)��(3)��(4) save(0)");
				int move = scan.nextInt();
				if(move == 1) {
					for(int i=1; i<SIZE; i++) {
						for(int j=0; j<SIZE; j++) {
							if(map[1][j] == PLAYER && map[0][j] == BALL) {
								break;//���� ���̶� ���
							}
							if(map[i][j] == PLAYER && map[i-1][j] == WALL) {
								break;//��� �տ� ��
							}
							if(map[i][j] == PLAYER && map[i-1][j] == BALL && map[i-2][j] == WALL) {
								break;//�� �� ��� 
							}
							if(map[i][j] == PLAYER && map[i-1][j] == 0) {
								map[i][j] = 0;//�տ� 0�϶� ���� 
								map[i-1][j] = PLAYER;
							}
							if(map[i][j] == PLAYER && map[i-1][j] == BALL && map[i-2][j] == 0) {
								map[i][j] = 0;//�տ� ���� ������ ���� 
								map[i-1][j] = PLAYER;
								map[i-2][j] = BALL;
							}
							if(map[i][j] == PLAYER && map[i-1][j] == BALL && map[i-2][j] == GOAL) {
								map[i][j] = 0;
								map[i-1][j] = PLAYER;//��뿡 ���� ������ ���� 
								map[i-2][j] = 0; cnt--;
							}
						}
					}
				}else if (move == 2) {
					int check = 0;
					for(int i=0; i<SIZE-1; i++) {
						for(int j=0; j<SIZE; j++) {
							if(map[SIZE-2][j] == PLAYER && map[SIZE-1][j] == BALL) {
								break;//���� ���̶� ���
							}
							if(map[i][j] == PLAYER && map[i+1][j] == WALL) {
								break;//��� �տ� ��
							}
							if(map[i][j] == PLAYER && map[i+1][j] == BALL && map[i+2][j] == WALL) {
								break;//�� �� ��� 
							}
							if(map[i][j] == PLAYER && map[i+1][j] == 0) {
								map[i][j] = 0;//�տ� 0�϶� ���� 
								map[i+1][j] = PLAYER;
								check = 1; break;
							}
							if(map[i][j] == PLAYER && map[i+1][j] == BALL && map[i+2][j] == 0) {
								map[i][j] = 0;//�տ� ���� ������ ���� 
								map[i+1][j] = PLAYER;
								map[i+2][j] = BALL;
								check = 1; break;
							}
							if(map[i][j] == PLAYER && map[i+1][j] == BALL && map[i+2][j] == GOAL) {
								map[i][j] = 0;
								map[i+1][j] = PLAYER;//��뿡 ���� ������ ���� 
								map[i+2][j] = 0;
								check = 1;  cnt--;
								break; 
							}
						}
						if(check == 1) break;
					}
					
				}else if (move == 3) {
					for(int i=0; i<SIZE; i++) {
						for(int j=1; j<SIZE; j++) {
							if(map[i][1] == PLAYER && map[i][0] == BALL) {
								break;//���� ���̶� ���
							}
							if(map[i][j] == PLAYER && map[i][j-1] == WALL) {
								break;//��� �տ� ��
							}
							if(map[i][j] == PLAYER && map[i][j-1] == BALL && map[i][j-2] == WALL) {
								break;//�� �� ��� 
							}
							if(map[i][j] == PLAYER && map[i][j-1] == 0) {
								map[i][j] = 0;//�տ� 0�϶� ���� 
								map[i][j-1] = PLAYER;
							}
							if(map[i][j] == PLAYER && map[i][j-1] == BALL && map[i][j-2] == 0) {
								map[i][j] = 0;//�տ� ���� ������ ���� 
								map[i][j-1] = PLAYER;
								map[i][j-2] = BALL;
							}
							if(map[i][j] == PLAYER && map[i][j-1] == BALL && map[i][j-2] == GOAL) {
								map[i][j] = 0;
								map[i][j-1] = PLAYER;//��뿡 ���� ������ ���� 
								map[i][j-2] = 0; cnt--;
							}
						}
					}
				}else if (move == 4) {
					int check = 0;
					for(int i=0; i<SIZE; i++) {
						for(int j=0; j<SIZE-1; j++) {
							if(map[i][SIZE-2] == PLAYER && map[i][SIZE-1] == BALL) {
								break;//���� ���̶� ���
							}
							if(map[i][j] == PLAYER && map[i][j+1] == WALL) {
								break;//��� �տ� ��
							}
							if(map[i][j] == PLAYER && map[i][j+1] == BALL && map[i][j+2] == WALL) {
								break;//�� �� ��� 
							}
							if(map[i][j] == PLAYER && map[i][j+1] == 0) {
								map[i][j] = 0;//�տ� 0�϶� ���� 
								map[i][j+1] = PLAYER;
								check = 1; break;
							}
							if(map[i][j] == PLAYER && map[i][j+1] == BALL && map[i][j+2] == 0) {
								map[i][j] = 0;//�տ� ���� ������ ���� 
								map[i][j+1] = PLAYER;
								map[i][j+2] = BALL;
								check = 1; break;
							}
							if(map[i][j] == PLAYER && map[i][j+1] == BALL && map[i][j+2] == GOAL) {
								map[i][j] = 0;
								map[i][j+1] = PLAYER;//��뿡 ���� ������ ���� 
								map[i][j+2] = 0;
								check = 1; cnt--;
								break; 
							}
						}
						
						if(check == 1) break;
					}
				}
				else if(move == 0) {//������ save ���Ͽ� ����. 
				try {
					fw = new FileWriter(file);
					for(int i=0; i<SIZE; i++) {
						for(int j=0; j<SIZE; j++) {
							fw.write(map[i][j]+"\n");
						}
					}
					fw.close();
					System.out.println("���� ���ڹ��� save file�� �����߽��ϴ�.");
				} catch (Exception e) {
					e.printStackTrace();
				}
				}
				}//while
			}//else if (chioce == 2)
			else if (choice == 0) {
				System.out.println("�����մϴ�.");
				break;
			}
		}//while
		
	}

}
