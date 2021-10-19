package lv6;

import java.util.Scanner;

class Ex003_07 {
	Scanner sc= new Scanner(System.in);
	int seat[] = new int[8];
	int cnt = 0;
	
	void print() {
		System.out.print("seat = ");
		for(int i=0; i<this.seat.length;i ++) {
			System.out.print(this.seat[i] + " ");
		}System.out.println();
		
	}
	int reservation() {
		System.out.println("�¼���ȣ(index) �Է� : ");
		System.out.println("(���Ḧ ���Ͻø� 10 �Է�) ");
		int sel =sc.nextInt();
		int x = 0;
		if(sel>=0 && sel <this.seat.length && this.seat[sel] == 0) {
			this.seat[sel] = 1;
			cnt ++;
		}else if(sel>=0 && sel <this.seat.length && this.seat[sel] == 1) {
			System.out.println("�̹� ����� �¼��Դϴ�.");
		}
		
		return sel;
		
	}
	
	void pay() {
			System.out.println("----------------");
			System.out.println("�� ����� : " + cnt*12000);
	}
	
	public void run() {
		while(true) {
		print();
		if(reservation() == 10) {
			pay();
			break;
		}
		
		}
	}
	
}
public class Ex003_007 {

	public static void main(String[] args) {
		/*
		 * # ��ȭ�� �¼����� : Ŭ���� + �޼���
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
		Ex003_07 ex = new Ex003_07();
		ex.run();
	}

}
