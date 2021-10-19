package lv1.test;

import java.util.Random;
import java.util.Scanner;

public class Ex13_05 {

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
		//destination 목적지 . 
		//direction 방향, 목표 ,진로 
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int x = 0;
		int y = 0;
		
		int destX = 0;
		int destY = 0;
		
		int speed = 0;
		int dir = 0;
		int dir2 = 0;
		int charge = 0;
		
		
		
		destX = ran.nextInt(21) -10 ;
		destY = ran.nextInt(21) -10 ;
		boolean t = true;

		while (t) {

			System.out.println("----- 카카오 택시 ! -----");
			System.out.println("나의 위치 :" + x + "," + y);
			System.out.println("목적 위치 :" + destX + "," + destY);
			System.out.println("-----------------------");
			System.out.println("메뉴를 입력해주세요 .");
			System.out.println("1. 속도설정 : 1~3까지만 가능.");
			System.out.println("2. 방향설정 : 동(1)서(2)남(3)북(4)");
			System.out.println("3. 이동하기 : " + speed+ "," + dir+"," + dir2);
			int sel = sc.nextInt();
			boolean t2 = true;
			if(sel == 1) {
				System.out.println("속도설정입니다 . 1~3숫자를 입력해주세요 . ");
				while (t2) {
					speed = sc.nextInt();
				if ( speed == 1 ) {
					t2 = false;
				}
				else if (speed == 2 ) {
					t2 = false;
				}
				else if (speed == 3 ) {
					t2 = false;
				}
				else  {
					System.out.println("잘못된 범위입니다. 1~3 숫자를 입력해주세요 . ");	
				}
				}
			}
			else if (sel == 2 ) {
				while (t2) {
					System.out.println("X의 방향설정입니다 .동(1)서(2)남(3)북(4)을 입력해주세요 .  ");
					dir = sc.nextInt();
					System.out.println("Y의 방향설정입니다 .동(1)서(2)남(3)북(4)을 입력해주세요 .  ");
					dir2 = sc.nextInt();
				if ( dir<5 && dir >0 && dir2 < 5 && dir2>0 ) {
				 if ( destX < x) {
					x -= speed;
					t2 = false;
				}
				  if ( destX > x) {
					 x += speed;
						t2 = false;
				 }
					
				  if ( destY < y) {
					 y -=  speed;
						t2 = false;
				 }
				 if (destY > y) {
					y += speed;
					}
					t2 = false;
				}
				else {
					System.out.println("잘못된 범위입니다. 동(1)서(2)남(3)북(4)을 입력해주세요 . ");
				}
				}
			}
			else if (sel == 3 ) { // 요금 = 50 * speed
				if (dir<5 && dir >0 && dir2 < 5 && dir2>0 ) {
					
					charge = speed * 100;
					t = false;
				}
				
			}
			else {
				System.out.println("잘못된 메뉴입니다. 다시 입력해주세요 .");
			}
			System.out.println("요금은 : " + charge);

		}
	}
}