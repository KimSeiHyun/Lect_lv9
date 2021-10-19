package lv6;

import java.util.Random;
import java.util.Scanner;

class Test3 {
Random rn = new Random();
Scanner sc = new Scanner(System.in);
	void ranNum(int[] scores) {
		int x = 0;
		while(true) {
		int rNum = rn.nextInt(100)+1;
		int check =0;
		for(int i=0; i<scores.length; i++) {
			if(scores[i] == rNum) {
				check = 1;
			}
		}
		if(check == 0 ) {
			scores[x] = rNum;
			x++;
		}
		if(x == 5) {
			System.out.println("����1. scores�迭�� ������ ����");
			for(int i=0; i<scores.length; i++) {
				System.out.print(scores[i] + " ");
			}System.out.println();
			break;
		}
		}
		
	}//ranNum
	
	void total_avr(int scores[]) {
		int total = 0;
		for(int i=0; i<scores.length; i++) {
			total += scores[i];
		}
		System.out.println("����2. �������� ������ ��� ���");
		System.out.println("total : " + total);
		System.out.println("avr : " + total/scores.length);
	}
	void pass(int scores[]) {
		System.out.println("����3 . ������ 60�̻��̸� �հ�, �հݻ��� ���");
		int cnt = 0;
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i] + "\t");
			if(scores[i] >= 60 ) {
				System.out.println("(�հ� !) ");
				cnt++;
			}
			else System.out.println("(���հ� !)");
		}
		System.out.println("cnt : " + cnt);
	}
	void printScore(int hakbuns[],int scores[]) {
		
		System.out.println("����4. �ε����� �Է¹޾� ���� ��� ");
		System.out.print("�ε��� �Է� : ");
		int idx = sc.nextInt();
		System.out.println("���� : " + scores[idx]);
		
		System.out.println("����5. ������ �Է¹޾� �ε��� ���. ");
		System.out.print("���� �Է� : ");
		int x = sc.nextInt();
		for(int i=0; i<scores.length; i++) {
			if(x == scores[i]) {
				System.out.println("�ε��� : " + i);
			}
		}
		
		System.out.println("����6. �й��� �Է¹޾� ���� ���");
		System.out.print("�й� �Է� : ");
		x = sc.nextInt();
		int check = 0;
		for(int i=0; i<hakbuns.length; i++) {
			if(hakbuns[i] == x) {
				System.out.println("score : " + scores[i]);
			}
		}
		System.out.println("����7. �й��� �Է¹޾� ���� ��� (����ó��)");
		x = sc.nextInt();
		for(int i=0; i<hakbuns.length; i++) {
			if(hakbuns[i] == x) {
				System.out.println("score : " + scores[i]);
				check = 1;
			}
		}
		if(check == 0) System.out.println("�й��� �ٽ� Ȯ�����ּ��� . ");
	}
	
	void max (int hakbuns[],int scores[]) {
		System.out.println("����8. 1���л��� �й��� ���� ���");
		int max = 0;
		int idx = -1;
		for(int i=0; i<5; i++) {
			if(max < scores[i]) {
				max = scores[i];
				idx = i;
			}
		}
		System.out.println("1�� �л��� �й� : " + hakbuns[idx]);
		System.out.println("1�� �л��� ���� : " + scores[idx]);
	}
	
	
}

public class Ex003_005 {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];
		
		Test3 test = new Test3();
		// ����1) scores�迭�� 1~100�� ������ ���� ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		test.ranNum(scores);
		
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		test.total_avr(scores);
		
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		test.pass(scores);
		
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		test.printScore(hakbuns,scores);
		
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1

		
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 45��

		
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		
		
		
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		test.max(hakbuns, scores);
	}

}
