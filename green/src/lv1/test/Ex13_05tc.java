package lv1.test;

import java.util.Random;
import java.util.Scanner;

public class Ex13_05tc {

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
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int desX = 0;
		int desY = 0;
		desX = ran.nextInt(21) -10;
		desY = ran.nextInt(21) -10;
		// ���� ��ġ
		int x = 0;
		int y = 0;
		// ����(direction)
		int dir = 0;
		// �ӵ�
		int speed = 0;
		// ���
		int fee = 0;
		int move = 0;
		boolean run = true;
		while(run) {

			
		
		System.out.println("= īī�� �ý� =");
		System.out.println("�̵� ĭ�� : " + move + "ĭ");
		System.out.println("���� ��� : " + fee + "��");
		System.out.println("������ : " + desX + "," + desY);
		System.out.println("����ġ : " + x + "," + y);
		System.out.println("��   �� : " + dir);
		System.out.println("��   �� : " + speed);
		System.out.println("============");
		//���� Ȯ��
		
		if (x == desX && y == desY) {
			System.out.println("�����߽��ϴ� , �ȳ��� ���ʽÿ� .");
			System.out.printf("����� %d�� �Դϴ� .", fee);
			run = false;
		}
		if ( run == true) {
		{
		System.out.println("1.���⼳��");
		System.out.println("2.�ӵ�����");
		System.out.println("3.�̵��ϱ�");
		System.out.print("�޴� ���� : ");
		int sel = sc.nextInt();
// 		dir = scan.nextInt(); // ����ó�� x
		
		if(sel == 1) {
			System.out.println("���� �Է� (1�� 2�� 3�� 4��) : ");
			int input = sc.nextInt();
			
			if ( input >= 1 && input <=4) {
				dir = input;
			}
			else {
				System.out.println("������ �� ���� ���Դϴ�.");
			}
			
		}
		else if(sel == 2) {
			// 1~3 speed 
			System.out.println("�ӵ� �Է� : 1~3");
			int input = sc.nextInt();
			
			if ( input >= 1 && input <= 3) {
				speed = input;
			}
			else {
				System.out.println("������ �� ���� ���Դϴ�.");
			}
		}
		else if(sel == 3) {
//		int desX = -4; //
//		int desY = 3; //
			
			// dir : 4
			// speed : 3
			// �̵� >>
			
			// �� ��ǥ x �Ǵ� y�� �����̵� �Ǿ�� ��. 
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
				//  y ��ǥ�� + 
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