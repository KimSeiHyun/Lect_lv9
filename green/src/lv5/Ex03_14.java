package lv5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Ex03_14 {

	public static void main(String[] args) {
		// 소코반 메이커 암기
		// 플레이어가 돌아다니면서 폭탄 내려놓듯이 구조물을 설치 → 파일로 저장 후,
		// 콘솔종료 후 재실행 시에도 → 게임을 이어갈 수 있게 만들어보세요
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
			System.out.println("[1]소코반 메이커");
			System.out.println("[2]게임 시작하기"); // 저장된 맵이 있으면 -> 불러와서 게임시작
			System.out.println("[0]종료하기");
			int choice = scan.nextInt();
			if (choice == 1) {
				while (true) {
					for (int i = 0; i < SIZE; i++) {
						for (int j = 0; j < SIZE; j++) {
							if (map[i][j] != 0 && maker[i][j] == PLAYER) {
								System.out.print("*\t");
							} else if (maker[i][j] == PLAYER) {
								System.out.print("옷\t");
							} else if (map[i][j] == WALL) {
								System.out.print("벽\t");
							} else if (map[i][j] == BALL) {
								System.out.print("공\t");
							} else if (map[i][j] == GOAL) {
								System.out.print("골\t");
							} else if (map[i][j] == 22) {
								System.out.print(map[i][j] + "\t");
							} else {
								System.out.print(maker[i][j] + "\t");
							}
						}
						System.out.println("\n");
					}
					System.out.println();
					System.out.println("[이동] ▶ 상(1)하(2)좌(3)우(4)");
					System.out.println("[설치] ▶ 벽(5)공(6)골(7)옷(8) ");
					System.out.println("[종료] ▶ 0");
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
						System.out.println("현재 소코반 메이커를 save file에 저장하시겠습니까 ?  1.yes   2.no");
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
								System.out.println("소코반메이커를 save file에 저장했습니다.");
							} catch (Exception e) {
								e.printStackTrace();
							}
							
						} else if(sel == 2) {
							System.out.println("소코반메이커를 저장하지 않고 종료 메인메뉴로 돌아갑니다 . ");
							
						}
						break;
					}
					
				}//while
			}//choice == 1
			else if (choice == 2) {
				if(file.exists()) {
					System.out.println("save file이 있습니다 . load 하시겠습니까?  1.yes  2.no");
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
							System.out.println("load에 성공했습니다.");
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
				}else System.out.println("불러올 save파일이없습니다");
				if(y != -1 && x != -1) {
					map[y][x] = PLAYER;
				}
				while(true) {
				for(int i=0; i<SIZE; i++) {//출력
					for(int j=0; j<SIZE; j++) {
						if(map[i][j] == PLAYER) {
							System.out.print("옷\t");
						}else if (map[i][j] == WALL) {
							System.out.print("■\t");
						}else if (map[i][j] == BALL) {
							System.out.print("♥\t");
						}else if (map[i][j] == GOAL) {
							System.out.print("♡\t");
						}else System.out.print(map[i][j] + "\t");
						
					}
					System.out.println("\n");
				}System.out.println();
				
				if(cnt == 0) { //맵에 공이 없어지면 게임 종료 , 
					for(int i=0; i<SIZE; i++) {
						for(int j=0; j<SIZE; j++) {
							if(map[i][j] == PLAYER) {
								map[i][j] = 0;
							}
						}
					}
					System.out.println("넣을 공이 더이상 없으므로 게임 종료 ! ");
					break;
				}
				System.out.println("[이동] ▶ 상(1)하(2)좌(3)우(4) save(0)");
				int move = scan.nextInt();
				if(move == 1) {
					for(int i=1; i<SIZE; i++) {
						for(int j=0; j<SIZE; j++) {
							if(map[1][j] == PLAYER && map[0][j] == BALL) {
								break;//끝에 공이랑 사람
							}
							if(map[i][j] == PLAYER && map[i-1][j] == WALL) {
								break;//사람 앞에 벽
							}
							if(map[i][j] == PLAYER && map[i-1][j] == BALL && map[i-2][j] == WALL) {
								break;//벽 공 사람 
							}
							if(map[i][j] == PLAYER && map[i-1][j] == 0) {
								map[i][j] = 0;//앞에 0일때 무브 
								map[i-1][j] = PLAYER;
							}
							if(map[i][j] == PLAYER && map[i-1][j] == BALL && map[i-2][j] == 0) {
								map[i][j] = 0;//앞에 공이 있을때 무브 
								map[i-1][j] = PLAYER;
								map[i-2][j] = BALL;
							}
							if(map[i][j] == PLAYER && map[i-1][j] == BALL && map[i-2][j] == GOAL) {
								map[i][j] = 0;
								map[i-1][j] = PLAYER;//골대에 공을 넣을때 무브 
								map[i-2][j] = 0; cnt--;
							}
						}
					}
				}else if (move == 2) {
					int check = 0;
					for(int i=0; i<SIZE-1; i++) {
						for(int j=0; j<SIZE; j++) {
							if(map[SIZE-2][j] == PLAYER && map[SIZE-1][j] == BALL) {
								break;//끝에 공이랑 사람
							}
							if(map[i][j] == PLAYER && map[i+1][j] == WALL) {
								break;//사람 앞에 벽
							}
							if(map[i][j] == PLAYER && map[i+1][j] == BALL && map[i+2][j] == WALL) {
								break;//벽 공 사람 
							}
							if(map[i][j] == PLAYER && map[i+1][j] == 0) {
								map[i][j] = 0;//앞에 0일때 무브 
								map[i+1][j] = PLAYER;
								check = 1; break;
							}
							if(map[i][j] == PLAYER && map[i+1][j] == BALL && map[i+2][j] == 0) {
								map[i][j] = 0;//앞에 공이 있을때 무브 
								map[i+1][j] = PLAYER;
								map[i+2][j] = BALL;
								check = 1; break;
							}
							if(map[i][j] == PLAYER && map[i+1][j] == BALL && map[i+2][j] == GOAL) {
								map[i][j] = 0;
								map[i+1][j] = PLAYER;//골대에 공을 넣을때 무브 
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
								break;//끝에 공이랑 사람
							}
							if(map[i][j] == PLAYER && map[i][j-1] == WALL) {
								break;//사람 앞에 벽
							}
							if(map[i][j] == PLAYER && map[i][j-1] == BALL && map[i][j-2] == WALL) {
								break;//벽 공 사람 
							}
							if(map[i][j] == PLAYER && map[i][j-1] == 0) {
								map[i][j] = 0;//앞에 0일때 무브 
								map[i][j-1] = PLAYER;
							}
							if(map[i][j] == PLAYER && map[i][j-1] == BALL && map[i][j-2] == 0) {
								map[i][j] = 0;//앞에 공이 있을때 무브 
								map[i][j-1] = PLAYER;
								map[i][j-2] = BALL;
							}
							if(map[i][j] == PLAYER && map[i][j-1] == BALL && map[i][j-2] == GOAL) {
								map[i][j] = 0;
								map[i][j-1] = PLAYER;//골대에 공을 넣을때 무브 
								map[i][j-2] = 0; cnt--;
							}
						}
					}
				}else if (move == 4) {
					int check = 0;
					for(int i=0; i<SIZE; i++) {
						for(int j=0; j<SIZE-1; j++) {
							if(map[i][SIZE-2] == PLAYER && map[i][SIZE-1] == BALL) {
								break;//끝에 공이랑 사람
							}
							if(map[i][j] == PLAYER && map[i][j+1] == WALL) {
								break;//사람 앞에 벽
							}
							if(map[i][j] == PLAYER && map[i][j+1] == BALL && map[i][j+2] == WALL) {
								break;//벽 공 사람 
							}
							if(map[i][j] == PLAYER && map[i][j+1] == 0) {
								map[i][j] = 0;//앞에 0일때 무브 
								map[i][j+1] = PLAYER;
								check = 1; break;
							}
							if(map[i][j] == PLAYER && map[i][j+1] == BALL && map[i][j+2] == 0) {
								map[i][j] = 0;//앞에 공이 있을때 무브 
								map[i][j+1] = PLAYER;
								map[i][j+2] = BALL;
								check = 1; break;
							}
							if(map[i][j] == PLAYER && map[i][j+1] == BALL && map[i][j+2] == GOAL) {
								map[i][j] = 0;
								map[i][j+1] = PLAYER;//골대에 공을 넣을때 무브 
								map[i][j+2] = 0;
								check = 1; cnt--;
								break; 
							}
						}
						
						if(check == 1) break;
					}
				}
				else if(move == 0) {//게임중 save 파일에 저장. 
				try {
					fw = new FileWriter(file);
					for(int i=0; i<SIZE; i++) {
						for(int j=0; j<SIZE; j++) {
							fw.write(map[i][j]+"\n");
						}
					}
					fw.close();
					System.out.println("현재 스코반을 save file에 저장했습니다.");
				} catch (Exception e) {
					e.printStackTrace();
				}
				}
				}//while
			}//else if (chioce == 2)
			else if (choice == 0) {
				System.out.println("종료합니다.");
				break;
			}
		}//while
		
	}

}
