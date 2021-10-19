package lv1.test;

import java.util.Random;
import java.util.Scanner;

public class Ex13_05tc {

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
		Random ran = new Random();
		int desX = 0;
		int desY = 0;
		desX = ran.nextInt(21) -10;
		desY = ran.nextInt(21) -10;
		// 현재 위치
		int x = 0;
		int y = 0;
		// 방향(direction)
		int dir = 0;
		// 속도
		int speed = 0;
		// 요금
		int fee = 0;
		int move = 0;
		boolean run = true;
		while(run) {

			
		
		System.out.println("= 카카오 택시 =");
		System.out.println("이동 칸수 : " + move + "칸");
		System.out.println("현재 요금 : " + fee + "원");
		System.out.println("목적지 : " + desX + "," + desY);
		System.out.println("현위치 : " + x + "," + y);
		System.out.println("방   향 : " + dir);
		System.out.println("속   도 : " + speed);
		System.out.println("============");
		//도착 확인
		
		if (x == desX && y == desY) {
			System.out.println("도착했습니다 , 안녕히 가십시오 .");
			System.out.printf("요금은 %d원 입니다 .", fee);
			run = false;
		}
		if ( run == true) {
		{
		System.out.println("1.방향설정");
		System.out.println("2.속도설정");
		System.out.println("3.이동하기");
		System.out.print("메뉴 선택 : ");
		int sel = sc.nextInt();
// 		dir = scan.nextInt(); // 예외처리 x
		
		if(sel == 1) {
			System.out.println("방향 입력 (1동 2서 3남 4북) : ");
			int input = sc.nextInt();
			
			if ( input >= 1 && input <=4) {
				dir = input;
			}
			else {
				System.out.println("설정할 수 없는 값입니다.");
			}
			
		}
		else if(sel == 2) {
			// 1~3 speed 
			System.out.println("속도 입력 : 1~3");
			int input = sc.nextInt();
			
			if ( input >= 1 && input <= 3) {
				speed = input;
			}
			else {
				System.out.println("설정할 수 없는 값입니다.");
			}
		}
		else if(sel == 3) {
//		int desX = -4; //
//		int desY = 3; //
			
			// dir : 4
			// speed : 3
			// 이동 >>
			
			// 내 좌표 x 또는 y가 업데이드 되어야 함. 
			if( dir >= 1 && dir <=4 ) {
		    	if(dir == 1) { // x +
				x += speed;
			}
			else if ( dir ==2) { // x =
				x -= speed;
			}
			else if (dir == 3 ) { // y-
				y -= speed;
			}
			else if (dir == 4) { // y+
				y += speed;
				//  y 좌표가 + 
			}
			
			move += speed;
			fee += 50*speed;
			}
		}
		

		}
		
		
		}
		
		


		
		
		}
	}
}
