package lv4;

import java.util.Scanner;

public class Ex02_05 {

	public static void main(String[] args) {
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
		
		Scanner sc = new Scanner(System.in);
		
		// ���� 1) ������ ������ �� ���
		// ���� 1) 4400, 7100, 5400
		int sum[] = new int[3];
		for(int i= 0; i<3; i++) {
			for(int j =0; j<3; j++) {
				sum[i] += pay[i][j];
			}
		}
		System.out.print("����1. ������ ������ �� ��� : ");
		for(int i=0; i<3; i++) {
			System.out.print(sum[i]+ " ");
		}
		System.out.println();
		
		System.out.println();
		// ���� 2) ȣ�� �Է��ϸ� ������ ���
		// ��    2) �Է� : 202	������ ��� : 2000
		System.out.print("����2. ȣ�� �Է����ּ��� . ������ ��� ");
		int num = sc.nextInt();
		for(int i= 0; i<3; i++) {
			for(int j =0; j<3; j++) {
				if(num == apt[i][j]) {
					System.out.print(pay[i][j]);
				}
			}
		}
		System.out.println();
		System.out.println();
		// ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
		// ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)
		
		int max = 0;
		int min = 10000;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(max < pay[i][j]) {
					max = pay[i][j];
					a = i;
					b = j;
					
				}
				if(min> pay[i][j]) {
					min = pay[i][j];
					c = i;
					d = j;
				}
			}
		}
		System.out.println("����3. ������ ���� ���̳�����,���� ���� �� ���.");
		System.out.println("������ ���� ���� ���� �� : " + apt[a][b]);
		System.out.println("������ ���� ���� ���� �� : " + apt[c][d]);
		
		System.out.println();
		// ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü
		System.out.println("����4. ȣ 2���� �Է��ϸ� ������ ��ü.");
		System.out.print("ù��° ȣ�� �Է��ϼ��� . ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ȣ�� �Է��ϼ��� . ");
		int num2 = sc.nextInt();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(apt[i][j] == num1) {
					a = i;
					b = j;
				}
				if(apt[i][j] == num2) {
					c = i;
					d = j;
					
				}
			}
		}
		
		int temp = pay[a][b];
		pay[a][b] = pay[c][d];
		pay[c][d] = temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}
		

	}//clear

}
