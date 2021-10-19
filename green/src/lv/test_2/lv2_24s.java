package lv.test_2;

import java.util.Random;
import java.util.Scanner;

public class lv2_24s {

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
		Random rn = new Random();
		int a = rn.nextInt(21)-10;
		int b = rn.nextInt(21)-10;
		
		// ������(destination)
		int desX = a;
		int desY = b;
		
		// ���� ��ġ
		int x = 0;
		int y = 0;
		
		// ����(direction)
		int dir = 0;
		
		// �ӵ�
		int speed = 0;
		
		// ���
		int fee = 0;
		
		boolean run = true;
		while(run) {
			
			System.out.println("= īī�� �ý� =");
			System.out.println("������ : " + desX + "," + desY);
			System.out.println("����ġ : " + x + "," + y);
			System.out.println("��   �� : " + dir);
			System.out.println("��   �� : " + speed);
			System.out.println("��   �� : " + fee);
			System.out.println("============");
			
			if(x == desX && y == desY) {
				System.out.println("�������� �����߽��ϴ�.");
				break;
			}
			System.out.println("1.���⼳��");
			System.out.println("2.�ӵ�����");
			System.out.println("3.�̵��ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("������ �������ּ��� . ��(1)  ��(2)  ��(3)  ��(4)");
				dir = sc.nextInt();
			}
			else if(sel == 2) {
				System.out.println("���ǵ带 �������ּ���. 1~3");
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
