package lv.test_3;

import java.util.Scanner;

public class lv3_05 {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// ����) �й��� �Է¹޾� ���� ���
		// 		��, �����й� �Է� �� ����ó��
		// ��)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("�й��� �Է����ּ��� ");
		int x = sc.nextInt();
		int check = -1;
		for (int i = 0; i < 5; i++) {
			if(x == hakbuns[i]) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
		}else {
			System.out.println(scores[check]);
		}
		
		
	}

}