package lv.test_1;

import java.util.Scanner;

public class lv1_09 {

	public static void main(String[] args) {
		/*
		 * # �α���[1�ܰ�]
		 * 1. Id�� Pw�� �Է¹޴´�.
		 * 2. �Է¹��� �����Ϳ� db�����͸� ���� �α��� ó���� �����Ѵ�.
		 * ��) �α��� ���� or �α��� ����
		 */
		
		int dbId = 1234;
		int dbPw = 1111;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵� �Է����ּ��� .");
		int inputId = sc.nextInt();
		System.out.println("��й�ȣ�� �Է����ּ��� .");
		int inputPw = sc.nextInt();
		
		if(inputId == dbId && inputPw == dbPw) {
			System.out.println("�α��� ���� ! ");
		}
		if(inputId != dbId || inputPw != dbPw) {
			System.out.println("�α��� ����.. ");
		}
		
		
		
		
	}

}
