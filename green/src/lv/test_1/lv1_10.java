package lv.test_1;

import java.util.Scanner;

public class lv1_10 {

	public static void main(String[] args) {
		/*
		 * # �α���[2�ܰ�]
		 * 1. Id�� Pw�� �Է¹޾� ȸ�������� �����Ѵ�.
		 * 2. ���� �α����� ���� �ٽ� Id�� Pw�� �Է¹޴´�.
		 * 3. ���� �� ����� �����Ϳ� �α��� �� �Է¹��� �����͸� ���Ѵ�.
		 * ��) �α��� ���� or �α��� ����
		 */
		int dbId = 0;
		int dbPw = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ȸ������ ���̵� �Է����ּ��� . ");
		int id = sc.nextInt();
		System.out.println("ȸ������ ��й�ȣ�� �Է����ּ��� . ");
		int pw = sc.nextInt();
		
		dbId = id;
		dbPw = pw;
		System.out.println("ȸ������ �Ϸ� ! ");
		System.out.println("id : " +dbId);
		System.out.println("pw : " +dbPw);
		
		System.out.println("�α����� ���̵� �Է����ּ��� ");
		int inId = sc.nextInt();
		System.out.println("�α����� ��й�ȣ�� �Է����ּ��� ");
		int inPw = sc.nextInt();
		
		if(inId == dbId && inPw == dbPw ) {
			System.out.println("�α��� ���� ! ");
		}
		if(inId != dbId || inPw != dbPw ) {
			System.out.println("�α��� ���� .  ");
		}
		
		
	}

}
