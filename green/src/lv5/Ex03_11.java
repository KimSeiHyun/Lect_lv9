package lv5;

import java.util.Scanner;

public class Ex03_11 {

	public static void main(String[] args) {
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
				while(true) {
					System.out.println("1)�ı�����");
					System.out.println("2)�ܵ�����");
					System.out.println("3)�ڷΰ���");
					System.out.print("�޴� ���� : ");
					int choice = sc.nextInt();
					if(choice == 1) {
						System.out.println("�ı��� �󸶳� �߰��Ͻðڽ��ϱ�?");
						int x = sc.nextInt();
						tickets += x;
						System.out.println("�ı��� " + x +"�� �߰��߽��ϴ�.");
					}
					else if(choice == 2) {
						System.out.println("������ �ܵ��� ������ �Է����ּ��� .");
						int x = sc.nextInt();
						int check = 0;
						for(int i=0; i<6; i++) {
							if(money[i] == x) {
								System.out.println(x+"���� �󸶳� �����Ͻðڽ��ϱ� ?");
								int y = sc.nextInt();
								charges[i] += y;
								check = 1;
								System.out.printf("%d�� ¥���� %d�� �߰��߽��ϴ�.\n",x,y);
							}
						}
						if(check == 0) System.out.println("������ �ٽ� Ȯ�����ּ��� .");

					}
					else if(choice == 3) {
						break;
					}
				}//sel1 while
			}//sel1
			
			else if(sel == 2) {
				while(true) {
					System.out.println("1)����");
					System.out.println("2)�ڷΰ���");
					System.out.print("�޴� ���� : ");
					int choice = sc.nextInt();
					if(choice == 1) {
						System.out.println("�ı��� ���� �����Ͻðڽ��ϱ� ? ");
						int x = sc.nextInt();
						if(x <= tickets) {
						int total = x*price;
						System.out.printf("�ı� %d���� �ݾ��� %d�� �Դϴ�.\n �Ա��� �ݾ� �Է� : ",x,total);
						int inMoney = sc.nextInt();
						int y = inMoney-total;

						if(inMoney >= total) {
							int temp[] = new int[6];
							//int temp[] = charges;  #new �� �Ⱦ��� heap �� ���� �����Ͱ� ���ŵ��� ���� .. 
													//�׷��� charges���� ���ϸ� �ּҰ��� �̾���� temp�� ���� ���� 
							for(int i=0; i<6; i++) {
								temp[i] = charges[i];
							}

							for(int i=0; i<6; i++) {
								//�������ִ� �ܵ��� ����� �ܵ����� ���ų� ������ �� A
								if(y/money[i] > 0 && charges[i]> 0 && charges[i]  <= y/money[i]) {
									System.out.println("�ܵ��� A : " + y + "��.");
									System.out.println(money[i]+"��"+charges[i]+"��");
									y -= money[i]*charges[i];
									charges[i] = 0;

								}
								//�������մ� �ܵ��� ����� �ܵ����� ���� �� B
								else if(y/money[i] > 0 &&  charges[i]  > y/money[i]) {
									System.out.println("�ܵ��� B : " + y + "��.");
									System.out.println(money[i]+"��"+y/money[i]+"��");
									charges[i] -= y/money[i];
									y -= money[i]*(y/money[i]);

								}

							}
							if(y == 0 ) {
								System.out.println("�ı��� ���������� �����߽��ϴ� .");
								tickets -= x;
								break;
							}
							else {
								for(int i=0; i<6; i++) {
									charges[i] = temp[i];
								}
								System.out.println("�ܵ��� �����մϴ� . ");
								break;
							}

						}else System.out.println("�Ա��Ͻ� �ݾ��� �����մϴ�.");
						
						}else System.out.println("Ƽ���� �����մϴ�.");
					}
					else if(choice == 2) {
						break;
					}
				}//sel2 while
			}//sel2
			else if(sel == 3) {
				for(int i=0; i<6; i++) {
					System.out.print(money[i] + "�� ");
					System.out.print(charges[i] + "��    ");
				}
				System.out.println();
				System.out.println("�ܿ��ı�  : "+ tickets);
			}//sel3
		}//while
		

	}

}
