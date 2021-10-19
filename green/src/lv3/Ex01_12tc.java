package lv3;

import java.util.Scanner;

public class Ex01_12tc {

	public static void main(String[] args) {
		/*
		 * # ��ȭ�� �¼�����
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
		Scanner scan = new Scanner(System.in);		
		int[] seat = new int[7]; // {0,0,0,0,0,0,0} // 1~7
		int total = 0;
		int ticket = 12000;
		
		boolean run = true;
		
		while(run) {
			//�¼���Ȳ ��� 
			for(int i =0; i<7; i++) {
//				System.out.print(seat[i]+ "  ");
				if( seat[i] == 1) {
					System.out.print("�� ");
				}
				else {
					System.out.print("�� ");
					
				}
			}
			System.out.println();
			for ( int i=0; i<7; i++) {
				System.out.print(i+1 + " ");
			}
			System.out.println("\n=��ȭ��=");
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println("�¼����� (1~7) : ");
				int input = scan.nextInt() -1; // �ε����� ��ȯ
				
				if(input >= 0 && input <7) { 
				//���� ���� Ȯ�� ����
				if(seat[input] == 1) {
					System.out.println("�̹� ���õ� �¼��Դϴ�.");
				}
				else {
					seat[input] = 1;
					System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�");
					total += ticket;
				}
				}
				else {
					System.out.println("�¼� ��ȣ�� �ٽ� Ȯ�����ּ��� . ");
				}
			}
			
			else if(sel == 2){
				System.out.println("����� : " + total + "��");
				run = false;
			}
		}

	}

}