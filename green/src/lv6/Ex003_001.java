package lv6;

import java.util.Scanner;

class Ex003_01 {
	int total = 0;
	String menu[] = {"�������" , "ġŲ����" , "�Ի����" };
	int price[] = {500,1000,1500};
	int arr[] = { 50000, 10000, 5000, 1000, 500, 100};
	int arr2[] = {    1,     5,   10,   10,  10,  10};
	int check[] = new int[3];
	void printMenu() { //�޴��� ��� 
		System.out.println("-----�޴���------");
		for(int i=0; i<menu.length; i++) {
			System.out.print(i+1 + "." + menu[i] +"  ");
			System.out.print(price[i] + "��\n");
		}
		System.out.println("---------------");
	}
	void selMenu(int a) { // total�� ���̽��� �޴����� �߰��ϰ� check�迭�� � ��Ҵ��� �߰���
		total += price[a-1];
		check[a-1] ++;
		System.out.println(menu[a-1]+"�� ��ҽ��ϴ�.");
	}
		
	void calculate1(int x) { //ī���� �ܵ� �� �ʿ䰡 ���� . 
		x = x - total;
		System.out.println("�ܵ��� " + x +"�� �Դϴ�.");
		total = 0;
		check = new int[3];
	}
	void calculate2(int x) { // ���ݰ��
		
		int temp = x-total;
		int tempArr[] = new int[arr2.length];
		for(int i=0; i<arr2.length; i++) { //����� ���Ǽ��� ���� ���������� �迭�� �ϳ� �Ȱ��� �� ����
			tempArr[i] = arr2[i];
		}
		for(int i=0; i<arr.length; i++) { // ��ȯ�ؾ��� �ܵ��� ������ �� . 
			for(int j=0; j<arr2.length; j++) {
				if(temp-arr[i] >=0) {
					temp -= arr[i];
					arr2[i] --;
				}
			}
		}
		if(temp == 0) { //������ �մ� �ܵ��� ����ϸ� ����� ��ġ�� ������ �ʱ�ȭ��(�ܵ���������)
			for(int i=0; i<arr2.length; i++) {
				if(tempArr[i]-arr2[i] != 0) {
					System.out.printf("%d��  %d��\n",arr[i],tempArr[i]-arr2[i]);					
				}
			}
			check = new int[3];
			total = 0;
		}else if(temp > 0) {//������ �ִ� �ܵ��� �����ϸ� ����Ѱ��� �ٽ� �ʱ�ȭ�� . 
			//�ʱ�ȭ �ϴ°� arr2���� - �߾��� ������ ������
			System.out.println("�ܵ��� �����Ͽ� �������� �ܵ��� ��ȯ �� �� �����ϴ�.");
			for(int i=0; i<arr2.length; i++) {
				arr2[i] = tempArr[i];
			}
		}
	}
	void printRecipe() { //���� �޴��� ���̰� ��� ������� ��� 
		for(int i=0; i<3; i++) {
			System.out.println(menu[i] + " " + price[i] +"��" + " " + check[i] +"��");
		}
		System.out.printf("�����Ͻ� �� �ݾ��� %d�� �Դϴ�.\n",total);
	}
	
	public void run() {
		Ex003_01 ex = new Ex003_01();

		
		while(true) {
			System.out.println("1.�޴�����");
			System.out.println("2.����");
			System.out.println("3.����");
			Scanner sc = new Scanner(System.in);
			int sel = sc.nextInt();
			if(sel == 1) {
				printMenu();
				System.out.println("���Ͻô� �޴��� ��ȣ�� �Է����ּ��� . ");
				int x = sc.nextInt();
				if(x >= 1 && x<= 3) {
					selMenu(x);
				}else System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				
			}
			else if(sel == 2) {
				if(total > 0) {
				printRecipe();
				System.out.println("1.ī����� \n2.���ݰ���");
				int x = sc.nextInt();
				System.out.println("�����Ͻ� �ݾ��� �Է����ּ��� ");
				int inMoney = sc.nextInt();
					if(x == 1 && total <= inMoney) {
						calculate1(inMoney);
					}
					else if (x == 2 && total <= inMoney) {
						calculate2(inMoney);
					}
					else {
						System.out.println("�����Ͻ� �ݾ��� �����մϴ�.");
					}
				}else System.out.println("�޴��� ���� ����ּ��� . ");
			}
			else if(sel == 3) {
				System.out.println("�����մϴ�.");
				break;
			}
		}//while(true)
	}//void run
	
	
}//class

public class Ex003_001 {

	public static void main(String[] args) {
		/*
		 * # ������ ����ϱ� : Ŭ����[����]
		 * 1. �ܹ��� �ֹ��� �޾� �������� ����Ѵ�.
		 * 2. ��³����� �� �޴��� �ֹ� ������ �� �ݾ� �� �ܵ��� ǥ���Ѵ�.
		 */
		//�ɼ� ���ݰ����� �ҽ� �ܵ� ���������� �ܵ� �����ְ�
		//    ī������ҽ� �׳� ��ü ���� , 
		Ex003_01 ex = new Ex003_01();
		
		ex.run();

		
	}

}
