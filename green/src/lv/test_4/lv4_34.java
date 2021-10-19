package lv.test_4;

import java.util.Scanner;

public class lv4_34 {

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
		for(int i=0; i<3; i++) {
			int sum = 0;
			for(int j=0; j<3; j++) {
				sum += pay[i][j];
			}
			System.out.println(sum);
		}
		// ���� 2) ȣ�� �Է��ϸ� ������ ���
		// ��    2) �Է� : 202	������ ��� : 2000
		System.out.print("ȣ �Է� : ");
		int ho = sc.nextInt();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(apt[i][j] == ho) {
					System.out.println(pay[i][j]);
				}
			}
		}
		// ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
		// ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)
		int max = 0 ;
		int min = 9999;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(pay[i][j] > max ) {
					max = pay[i][j];
				}
				if(pay[i][j] < min) {
					min = pay[i][j];
				}
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(max == pay[i][j]) {
					System.out.println("���� ���� ���� �� : " + apt[i][j]);
				}
				if(min == pay[i][j] ) {
					System.out.println("���� ���� ���� �� : " + apt[i][j]);
				}
			}
		}
		
		// ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü
		System.out.println("����4 : ȣ 2���� �Է��ϸ� ������ ��ü . ");
		System.out.print("ù���� ȣ : ");
		int ho1 = sc.nextInt();
		int ho1Idx1 = -1;
		int ho1Idx2 = -1;
		System.out.print("�ι��� ȣ : ");
		int ho2 = sc.nextInt();
		int ho2Idx1 = -1;
		int ho2Idx2 = -1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(apt[i][j] == ho1) {
					ho1Idx1 = i;
					ho1Idx2 = j;
				}
				if(apt[i][j] == ho2) {
					ho2Idx1 = i;
					ho2Idx2 = j;
				}
			}
		}
		int temp = pay[ho1Idx1][ho1Idx2];
		pay[ho1Idx1][ho1Idx2] = pay[ho2Idx1][ho2Idx2];
		pay[ho2Idx1][ho2Idx2] = temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(pay[i][j] + " ");
			}System.out.println();
		}
	}

}
