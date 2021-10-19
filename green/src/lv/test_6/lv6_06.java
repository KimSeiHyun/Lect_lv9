package lv.test_6;
/*
 * # ��ȭ�� �¼����� : Ŭ���� + ����
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */

import java.util.Scanner;

class Ex07{
	int[] seat = new int[7];
	int money = 0;
}
public class lv6_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex07 e = new Ex07();
		
		while(true) {
			for(int i=0; i<e.seat.length; i++) {
				System.out.print(e.seat[i] + " ");
			}System.out.println();
			System.out.println("[MOVIE]");
			System.out.println("[1]�¼�����");
			System.out.println("[2]�����ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			if(sel == 1) {
				System.out.println("������ �¼��� �Է� : ");
				int idx = sc.nextInt();
				if(idx >= 0 && idx <e.seat.length) {
					if(e.seat[idx] == 0) {
						e.seat[idx] = 1;
						e.money +=12000;
					}else System.out.println("�̹� ���õ� �ڸ��Դϴ�.");
				}else System.out.println("������ Ȯ�����ּ���");
			}
			else if(sel == 2) {
				System.out.println("�� ����� : " +e.money);
				break;
			}
		}


	}
}
