package lv.test_2;

import java.util.Random;
import java.util.Scanner;

public class lv2_24s {

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
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int a = rn.nextInt(21)-10;
		int b = rn.nextInt(21)-10;
		
		// 목적지(destination)
		int desX = a;
		int desY = b;
		
		// 현재 위치
		int x = 0;
		int y = 0;
		
		// 방향(direction)
		int dir = 0;
		
		// 속도
		int speed = 0;
		
		// 요금
		int fee = 0;
		
		boolean run = true;
		while(run) {
			
			System.out.println("= 카카오 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("요   금 : " + fee);
			System.out.println("============");
			
			if(x == desX && y == desY) {
				System.out.println("목적지에 도착했습니다.");
				break;
			}
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("방향을 선택해주세요 . 동(1)  서(2)  남(3)  북(4)");
				dir = sc.nextInt();
			}
			else if(sel == 2) {
				System.out.println("스피드를 선택해주세요. 1~3");
				speed = sc.nextInt();
			}
			else if(sel == 3) {
				if(dir == 1) {
					x += speed;
				}
				if(dir == 2) {
					x -= speed;
				}
				if(dir == 3) {
					y -= speed;
				}
				if(dir == 4) {
					y += speed;
				}
				fee += speed*50;
			}
			
		}//w
	}

}
