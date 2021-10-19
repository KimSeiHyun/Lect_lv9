package lv2;

import java.util.Random;
import java.util.Scanner;

public class Level_Test_5 {

	public static void main(String[] args) {
		/*
		 * # 카카오 택시
		 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
		 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
		 * 3. 메뉴는 아래와 같다.
		 * 		1) 속도설정 : 1~3까지만 가능
		 * 		2) 방향설정 : 동(1)서(2)남(3)북(4)
		 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
		 * 4. 거리 1칸 당 50원씩 추가되어 도착시 요금도 출력한다.
		 *
		 */
		//	시작 : 11:11
		//	종료 : 12:30
		//	소요 : 1시간 19분
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		
		int x = 0;
		int y = 0;
		
		int speed = 0;
		
		int dir = 0;
		
		int move = 0;
		
		int charge = 0;
		
		int destX = ran.nextInt(21) -10;
		int destY = ran.nextInt(21) -10;
		boolean t = true;
		
		while (t) {

			System.out.println("------카카오택시--------");
			System.out.println("이동한 칸 : " + move);
			System.out.println("총 요금 : " + charge);
			System.out.println("목적지 : "+ destX +"," + destY);
			System.out.println("현위치 : "+ x +"," + y);
			System.out.println("---------------------");
			System.out.println("현재속도 : " + speed);
			System.out.println("이동할방향 : "+ dir);
			
			System.out.println();
			
			System.out.println("메뉴를 입력해주세요 .");
			System.out.println("    1) 속도설정 : 1~3까지만 가능.");
			System.out.println("    2) 방향설정 : 동(1)서(2)남(3)북(4)");
			System.out.println("    3) 이동하기 : ");
			if (destX == x && destY == y) {
				System.out.println("목적지에 도착했습니다.");
				break;
			}

			int sel = sc.nextInt();
			
			if (sel == 1 ) {
				System.out.println("1) 속도설정 : 1~3사이의 숫자를 입력해주세요 . ");
				int sel2 = sc.nextInt();
				if (sel2 >= 1 && sel2 <=3) {
					speed = sel2;
				}
				
				else {
					System.out.println("잘못된 숫자입니다. ");
				}
			}
			else if (sel == 2) {
				System.out.println("2) 방향설정 : 동(1)서(2)남(3)북(4)을 입력해주세요.");
				int sel3 = sc.nextInt();
				if (sel3 >= 1 && sel3 <= 4) {
					dir = sel3;
				}
				else {
					System.out.println("잘못된 숫자입니다.");
				}
				
			}
			else if (sel == 3) {
				if ( dir >= 1 && dir <= 4 ) {
					if ( dir == 1) {
						x += speed;
					}
					
					else if ( dir == 2) {
						x -= speed;
					}
					else if ( dir == 3) {
						y -= speed;
					}
					else if ( dir == 4) {
						y += speed;
					}
					move += speed;
					charge += speed*50;
				}



				
			}
			else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요 . ");
			}
			




		}

	}

}
