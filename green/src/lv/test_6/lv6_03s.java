package lv.test_6;

import java.util.Random;
import java.util.Scanner;

class Ex04s {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class lv6_03s {

	public static void main(String[] args) {
		Ex04s e = new Ex04s();
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		System.out.println("����1");
		int sum = 0;
		int cnt = 0;
		for(int i=0; i<e.scores.length; i++) {
			int rNum = rn.nextInt(100)+1;
			e.scores[i] = rNum;
			sum += rNum;
			if(rNum >= 60) cnt ++;
			System.out.print(e.scores[i] + " ");
		}System.out.println();
		
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		System.out.println("����2");
		System.out.println("���� : " + sum);
		System.out.println("��� : " +(double)sum/e.scores.length);
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		System.out.println("����3");
		System.out.println(cnt);
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		System.out.println("����3");
		System.out.println("�ε��� �Է� : ");
		int idx = sc.nextInt();
		System.out.println(e.scores[idx]);
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		System.out.println("����5");
		System.out.println("���� �Է� : ");
		int score = sc.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[i] == score) System.out.println(i);
		}
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 92��
		System.out.println("����6");
		System.out.println("�й� �Է� : ");
		int h = sc.nextInt();
		for(int i=0; i<e.hakbuns.length; i++) {
			if(e.hakbuns[i] == h) System.out.println(e.scores[i]);
		}
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		System.out.println("����7");
		System.out.println("�й� �Է� : ");
		h = sc.nextInt();
		int check = 0;
		int max = 0;
		idx = 0;
		for(int i=0; i<e.hakbuns.length; i++) {
			if(e.hakbuns[i] == h) {
				System.out.println(e.scores[i]);
				check = 1;
			}
			if(max < e.scores[i] ) {
				max = e.scores[i];
				idx = i;
			}
		}
		if(check == 0) System.out.println("�ش� �й��� �������� �ʽ��ϴ�. ");
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		System.out.println("����8");
		System.out.println("1���� �й� : " +e.hakbuns[idx]);
		System.out.println("1���� ���� : " +max);
	}

}