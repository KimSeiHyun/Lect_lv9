package lv5.test;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		//���۽ð� 02 : 50
		//����ð� 03 : 27
		//�ҿ�ð� 00 : 37
		
		// �ı� ���Ǳ� ���α׷� 		
		// 1) ������   2) ����� 
		//������ ==> 1) �ı�����   2) �ܵ� ���� 	 3)�ڷΰ���
		//����� ==> 1) ���� ==> ==> �Ա� �ݾ� �Է� ==> ���� �ż� �Է�  ==> �ܵ���� 	
	    //	       2)�ڷΰ���
		// ���� ) ��) �ܵ��� 7600���̴�. 5000������ ������ 1000��¥�� 7����� 
		//ȭ�� 
		// �ı� ���� : 3200�� 
		// �ı� 	  : ??��  (������ ����) 
		// 50000�� : ?? ��  	// 10000�� : ?? ��	// 5000�� : ?? ��
		// 1000�� : ?? ��		//  500�� : ?? ��	  	//  100�� : ?? �� 
		Scanner sc = new Scanner(System.in);
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
		int tickets = 5;		// �ı� ����
		int price = 3200;		// �ı� ����
		
		while(true) {
		System.out.println("[1]������");
		System.out.println("[2]�����");
		System.out.println("[3]�ܾ� , �ı� ���");
		System.out.print("�޴� ���� : ");
		int sel = sc.nextInt();
		
		if(sel == 1) {
			System.out.println("1)�ı�����");
			System.out.println("2)�ܵ�����");
			System.out.println("3)�ڷΰ���");
			System.out.print("�޴� ���� : ");
			int sel2 = sc.nextInt();
			if(sel2 == 1) {
				System.out.println("�ı��� ���� �����Ͻðڽ��ϱ� ? ");
				int x = sc.nextInt();
				tickets += x;
			}
			else if(sel2 == 2) {
				System.out.println("�����ϰ���� ȭ���� ������ �����ּ��� ");
				int x = sc.nextInt();
				int check =0;
				for(int i=0; i<6; i++) {
					if(money[i] == x) {
						System.out.println("������ ������ �����ּ��� . ");
						int y = sc.nextInt();
						charges[i] += y;
						check = 1;
					}
				}
				if(check == 0) System.out.println("ȭ���� ������ �ٽ� Ȯ�����ּ��� .");
			}
			else if(sel2 == 3) {
				continue;
			}
		}
		
		else if(sel == 2) {
			System.out.println("1)����");
			System.out.println("2)�ڷΰ���");
			System.out.print("�޴� ���� : ");
			int sel2 = sc.nextInt();
			if(sel2 == 1) {
				System.out.println("�ı��� ���� �����Ͻðڽ��ϱ�?");
				int buy = sc.nextInt();
				if(buy <= tickets) {
					System.out.printf("�ı� %d���� ������ %d �Դϴ�.",buy,price*buy);
					System.out.println("�Ա��� �ݾ��� �Է����ּ��� ");
					int inMoney = sc.nextInt();
					if(inMoney < price*buy) {
						System.out.println("�Ա��� �ݾ��� �����մϴ�. ���θ޴��� �̵��մϴ�.");
						continue;
					}
					int x = inMoney-(buy*price);
					System.out.println("�ܵ� : " + x);
					int temp[] = new int[6];
					for(int i=0; i<6; i++) {
						temp[i] = charges[i];
					}
					for(int i=0; i<6; i++) {
						int a = 0;
						int cnt = 0;
						for(int j=0; j<charges[i]; j++) {
							if(x - money[i] >= 0) {
								x -= money[i];
								a = i;
								cnt ++;
							}
						}
						charges[a] -= cnt;
					}
					System.out.println("����� ���� �ܵ� : " + x);
					if(x != 0) {
						for(int i=0; i<6; i++) {
							charges[i] = temp[i];
						}
						System.out.println("�Ž������� ������ �ı� ���Ű� ��ҵ˴ϴ�.");
					}
				}else System.out.println("�ı��� ������ �����Ͻô� �������� �����մϴ�.");
				
				
			}
			else if(sel2 == 2) {
				continue;
			}
		}
		else if(sel == 3) {
			for(int i=0; i<6; i++) {
				System.out.print(money[i] + "��\t");
			}System.out.println();
			for(int i=0; i<6; i++) {
				System.out.print(charges[i] + "��\t");
			}System.out.println();
			System.out.println("�ı� : " + tickets);
		}
		
		}//while

		
	}

}
