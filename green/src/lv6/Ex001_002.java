package lv6;

import java.util.Random;
import java.util.Scanner;

class Ex04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class Ex001_002 {
	
	//Ŭ��������2
	public static void main(String[] args) {
		Ex04 ex = new Ex04();
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		System.out.println("����1");
		int sum = 0 ;
		double avr = 0 ;
		int cnt = 0;
		for(int i=0; i<5; i++) {
			int ranNum = rn.nextInt(100)+1;
			ex.scores[i] = ranNum;
			System.out.print(ex.scores[i] + " ");
			sum += ex.scores[i];
			if(ex.scores[i] >= 60) {
				cnt++;
			}
		}System.out.println();
		System.out.println();
		
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		System.out.println("����2");
		System.out.println("���� : " +sum);
		System.out.println("��� : " +sum/5);
		System.out.println();
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		System.out.println("����3");
		System.out.println("������ 60�̻��� �л� �� : " + cnt);
		System.out.println();
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		System.out.println("����4");
		System.out.println("�ε����� �Է¹޾� ���� ��� : (0~4�Է�) " );
		int idx = sc.nextInt();
		System.out.println(ex.scores[idx]);
		System.out.println();
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1
		System.out.println("����5");
		System.out.println("������ �Է¹޾� �ε��� ��� : (1~100�Է�) ");
		int score = sc.nextInt();
		for(int i=0; i<5; i++) {
			if(ex.scores[i] == score) {
				System.out.println(i);
			}
		}
		System.out.println();
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 45��
		System.out.println("����6\n�й��� �Է¹޾� ���� ��� (1001~1005): ");
		int a = sc.nextInt();
		for(int i=0; i<5; i++) {
			if(a == ex.hakbuns[i]) {
				System.out.println(ex.scores[i]);
			}
		}System.out.println();
		
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		System.out.println("����7\n�й��� �Է¹޾� ���� ��� ,�� ���� �й� �Է½� ���� ó�� ");
		a = sc.nextInt();
		int check = 0;
		for(int i=0; i<5; i++) {
			if(a == ex.hakbuns[i]) {
				System.out.println(ex.scores[i]);
			}else check = 1;
		}
		if(check == 1) System.out.printf("%d �ش� �й��� �������� �ʽ��ϴ�. \n" ,a);
		System.out.println();
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		int max = 0;
		idx = -1; 
		for(int i=0; i<5; i++) {
			if(max < ex.scores[i]) {
				max = ex.scores[i];
				idx = i;
			}
		}
		System.out.println("����8");
		System.out.println("1���л��� �й�  : " +ex.hakbuns[idx] );
		System.out.println("1���л��� ����  : " +max  );
		

	}

}
