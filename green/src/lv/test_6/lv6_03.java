package lv.test_6;

import java.util.Random;
import java.util.Scanner;

class Ex04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class lv6_03 {

	public static void main(String[] args) {
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		Ex04 e = new Ex04();
		int sum = 0;
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		for(int i=0; i<e.scores.length; i++) {
			int rNum = rn.nextInt(100)+1;
			e.scores[i] = rNum;
			sum += rNum;
		}
		System.out.println("����1");
		for(int i=0; i<e.scores.length; i++) {
			System.out.print(e.scores[i] + " ");
		}System.out.println();
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		System.out.println("����2");
		System.out.println("���� : "+sum);
		System.out.println("��� : "+(double)sum/e.scores.length);
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		System.out.println("����3");
		int cnt = 0;
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[i] >= 60) {
				cnt ++;
			}
		}
		System.out.println(cnt);
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		System.out.println("����4 �ε����� �Է¹޾� ���� ���");
		int idx = sc.nextInt();
		System.out.println(e.scores[idx]);
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		
		System.out.println("����5 ������ �Է¹޾� �ε��� ���");
		int score = sc.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[i] == score) {
				System.out.println(i);
			}
		}
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 92��
		System.out.println("����6 �й��� �Է¹޾� ���� ���");
		int num = sc.nextInt();
		for(int i=0; i<e.scores.length; i++) {
			if(e.hakbuns[i] == num) System.out.println(e.scores[i]);
		}
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		System.out.println("����7 �й��� �Է¹޾� ���� ��� , �����й� �Է½� ����ó��");
		num = sc.nextInt();
		int check = 0;
		for(int i=0; i<e.scores.length; i++) {
			if(e.hakbuns[i] == num) {
				System.out.println(e.scores[i]);
				check = 1;
			}
		}
		if(check ==0) System.out.printf("%d �ش��й��� �������� �ʽ��ϴ�.\n",num);
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		int max = 0;
		idx = 0;
		for(int i=0; i<e.scores.length; i++) {
			if(e.scores[i] > max ) {
				max = e.scores[i];
				idx = i;
			}
		}
		System.out.println("����8  1���л��� �й��� ���� ���");
		System.out.printf("%d�� , %d��",max,e.hakbuns[idx]);
	}

}
