package lv.test_3;

import java.util.Random;

public class lv3_03s {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Random rn = new Random();
		// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		System.out.println("����1");
		int sum = 0;
		int avr = 0 ;
		int cnt = 0;
		for(int i=0; i<5; i++) {
			int num = rn.nextInt(100)+1;
			arr[i] = num;
		}		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
			if(arr[i] >= 60) {
				cnt ++;
			}
		}
		System.out.println();
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		System.out.println("����2");
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum/5);
		
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��
		System.out.println("����3");
		System.out.println("60�� �̻��� �л� �� : " + cnt );
		
	}

}
