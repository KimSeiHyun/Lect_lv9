package lv3;

import java.util.Random;

public class Ex01_02tc {

	public static void main(String[] args) {
		// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		Random rn = new Random();
		
		int score[] = new int[5]; // {0,0,0,0,0}
		double total = 0;
		double avg = 0;
		int pass = 0;
		for(int i=0; i<5; i++) {
			score[i] = rn.nextInt(100) +1;
			System.out.println(score[i]);
			total += score[i];
			if (score[i] >= 60) {
				pass++;
			}
		}
		avg = total / 5.0;
		
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)	
		System.out.println("total =" + total);
		System.out.println("avg = " + avg);
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��
		System.out.println("pass : " + pass);
		
	}

}
