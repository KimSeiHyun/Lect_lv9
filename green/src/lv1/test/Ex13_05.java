package lv1.test;

import java.util.Random;
import java.util.Scanner;

public class Ex13_05 {

	public static void main(String[] args) {
		/*
		 * # īī�� �ý�
		 * 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�.
		 * 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�.
		 * 3. �޴��� �Ʒ��� ����.
		 * 		1) �ӵ����� : 1~3������ ����
		 * 		2) ���⼳�� : ��(1)��(2)��(3)��(4)
		 * 		3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�
		 * 4. �Ÿ� 1ĭ �� 50���� �߰��Ǿ� ������ ��ݵ� ����Ѵ�.
		 *
		 */
		//destination ������ . 
		//direction ����, ��ǥ ,���� 
		
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

			System.out.println("----- īī�� �ý� ! -----");
			System.out.println("���� ��ġ :" + x + "," + y);
			System.out.println("���� ��ġ :" + destX + "," + destY);
			System.out.println("-----------------------");
			System.out.println("�޴��� �Է����ּ��� .");
			System.out.println("1. �ӵ����� : 1~3������ ����.");
			System.out.println("2. ���⼳�� : ��(1)��(2)��(3)��(4)");
			System.out.println("3. �̵��ϱ� : " + speed+ "," + dir+"," + dir2);
			int sel = sc.nextInt();
			boolean t2 = true;
			if(sel == 1) {
				System.out.println("�ӵ������Դϴ� . 1~3���ڸ� �Է����ּ��� . ");
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
					System.out.println("�߸��� �����Դϴ�. 1~3 ���ڸ� �Է����ּ��� . ");	
				}
				}
			}
			else if (sel == 2 ) {
				while (t2) {
					System.out.println("X�� ���⼳���Դϴ� .��(1)��(2)��(3)��(4)�� �Է����ּ��� .  ");
					dir = sc.nextInt();
					System.out.println("Y�� ���⼳���Դϴ� .��(1)��(2)��(3)��(4)�� �Է����ּ��� .  ");
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
					System.out.println("�߸��� �����Դϴ�. ��(1)��(2)��(3)��(4)�� �Է����ּ��� . ");
				}
				}
			}
			else if (sel == 3 ) { // ��� = 50 * speed
				if (dir<5 && dir >0 && dir2 < 5 && dir2>0 ) {
					
					charge = speed * 100;
					t = false;
				}
				
			}
			else {
				System.out.println("�߸��� �޴��Դϴ�. �ٽ� �Է����ּ��� .");
			}
			System.out.println("����� : " + charge);

		}
	}
}