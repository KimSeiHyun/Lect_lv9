package lv3;

import java.util.Scanner;

public class Ex01_04tc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		// ����) �й��� �Է¹޾� ���� ���
		// 		��, �����й� �Է� �� ����ó��
		// ��)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.
		
		
		// ������ �й��� ������ ����ϸ� -> break
		while(true) {
			System.out.println("�й��Է� : ");
			int num = sc.nextInt();
			
//			int check = 0; // 0 false , 1 true
			boolean check = false;
			int index = -1;
			// �˻� (hakbuns �迭�� �����ϴ°�)
			for (int i=0; i<5; i++) {
				if(hakbuns[i] == num) {
					check = true;
					index = i;
				}
			}
			// check ���� Ȱ�� -> ����� ���� . 
			if (check == true) {
				System.out.println(scores[index] + "��");
				break;
			}
			else {
				System.out.println("������ �й��� �Է����ּ��� . ");
			}
		}
		
		
		
		
		
		
		
		
	}

}