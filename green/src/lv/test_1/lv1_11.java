package lv.test_1;

import java.util.Scanner;

public class lv1_11 {

	public static void main(String[] args) {
		/*
		 * # �α���[3�ܰ�]
		 * 1. Id�� �Է¹޾� dbId�� ��ġ�� ��쿡�� Pw�� �Է��� �� �ִ�.
		 * 2. Id�� Ʋ�� ���, "Id�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
		 * 3. Pw�� Ʋ�� ���, "Pw�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
		 * 4. Id�� Pw�� ��� ��ġ�ϴ� ���, "�α��� ����"��� �޼����� ����Ѵ�.
		 */
		int dbId = 1234;
		int dbPw = 1111;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵� �Է����ּ��� . ");
		int inId = sc.nextInt();
		
		if(inId == dbId ) {
			System.out.println("��й�ȣ�� �Է����ּ��� . ");
			int inPw = sc.nextInt();
			if(inPw != dbPw) { 
				System.out.println("��й�ȣ�� Ȯ�����ּ��� . ");
			}
			if(inId == dbId && inPw == dbPw ) {
				System.out.println("�α��� ���� !! ");
			}
		}
		if(inId != dbId ) {
			System.out.println("���̵� Ȯ�����ּ��� .");
		}

		
	}

}
