package lv2;

import java.util.Random;
import java.util.Scanner;

public class Level_Test_5 {

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
		//	���� : 11:11
		//	���� : 12:30
		//	�ҿ� : 1�ð� 19��
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

			System.out.println("------īī���ý�--------");
			System.out.println("�̵��� ĭ : " + move);
			System.out.println("�� ��� : " + charge);
			System.out.println("������ : "+ destX +"," + destY);
			System.out.println("����ġ : "+ x +"," + y);
			System.out.println("---------------------");
			System.out.println("����ӵ� : " + speed);
			System.out.println("�̵��ҹ��� : "+ dir);
			
			System.out.println();
			
			System.out.println("�޴��� �Է����ּ��� .");
			System.out.println("    1) �ӵ����� : 1~3������ ����.");
			System.out.println("    2) ���⼳�� : ��(1)��(2)��(3)��(4)");
			System.out.println("    3) �̵��ϱ� : ");
			if (destX == x && destY == y) {
				System.out.println("�������� �����߽��ϴ�.");
				break;
			}

			int sel = sc.nextInt();
			
			if (sel == 1 ) {
				System.out.println("1) �ӵ����� : 1~3������ ���ڸ� �Է����ּ��� . ");
				int sel2 = sc.nextInt();
				if (sel2 >= 1 && sel2 <=3) {
					speed = sel2;
				}
				
				else {
					System.out.println("�߸��� �����Դϴ�. ");
				}
			}
			else if (sel == 2) {
				System.out.println("2) ���⼳�� : ��(1)��(2)��(3)��(4)�� �Է����ּ���.");
				int sel3 = sc.nextInt();
				if (sel3 >= 1 && sel3 <= 4) {
					dir = sel3;
				}
				else {
					System.out.println("�߸��� �����Դϴ�.");
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
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ��� . ");
			}
			




		}

	}

}
