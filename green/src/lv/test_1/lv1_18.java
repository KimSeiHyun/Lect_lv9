package lv.test_1;

import java.util.Random;
import java.util.Scanner;

public class lv1_18 {

	public static void main(String[] args) {
		/*
		 * # Ȧ¦ ����
		 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
		 * 2. ����� ���� ���ڸ� �����ְ�,
		 * 3. �ش� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
		 */
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int ranNum = rn.nextInt(100)+1;
		System.out.println("����� ���� ���ڴ� : " + ranNum);
		System.out.println("1.Ȧ��");
		System.out.println("2.¦��");

		System.out.print("��ȣ�� �����ϼ��� : ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			if(ranNum %2 == 1) {
				System.out.println("���� ! ");
			}
			if(ranNum %2 != 1) {
				System.out.println("�� !  ! ");
			}
		}
		if(choice == 2) {
			if(ranNum %2 == 0) {
				System.out.println("���� ! ");
			}
			if(ranNum %2 != 0) {
				System.out.println("�� !! ");
			}
			
		}

		
	}

}
