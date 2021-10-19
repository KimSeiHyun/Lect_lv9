package lv.test_6;

import java.util.Scanner;

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

class Ex07s{
	private int[] seat = new int[7];
	private int money = 0;
	
	public void print() {
		for(int i=0; i<this.seat.length; i++) {
			System.out.print(this.seat[i] + " ");
		}System.out.println();
	}
	
	public int getSize() {
		return this.seat.length;
	}
	public int getSeat(int idx) {
		return this.seat[idx];
	}
	public void setSeat(int idx) {
		this.seat[idx] = 1;
	}
	public int getMoney() {
		return this.money;
	}
	
	public void setMoney() {
		this.money += 12000;
	}
}
public class lv6_06s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex07s e = new Ex07s();
		
		while(true) {
			e.print();
			System.out.println("[MOVIE]");
			System.out.println("[1]�¼�����");
			System.out.println("[2]�����ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.print("���ϴ� �ڸ� �ε��� �Է� :");
				int idx = sc.nextInt();
				if(idx >= 0 && idx < e.getSize() ) {
					if(e.getSeat(idx) == 0) {
						e.setSeat(idx);
						e.setMoney();
					}else System.out.println("�̹� ���õ� �ڸ��Դϴ�.");
				}else System.out.println("�ε��� �ٽ� Ȯ�� . ");
			}
			else if(sel == 2) {
				System.out.println("�� ������� : " + e.getMoney());
				break;
			}
		}


	}
}
