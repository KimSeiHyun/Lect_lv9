package lv1;

import java.util.Scanner;

public class Ex06_1 {

	public static void main(String[] args) {
		// ����Ȱ�� + ����� �Լ� ��� . 
		
		// ���� 1) ���� 2���� �Է¹޾�, �� ���
		Scanner scan = new Scanner(System.in);
		int x;
		System.out.print("x : ");
		x = scan.nextInt();
		System.out.println(x);
		int y;
		System.out.print("y : ");
		y = scan.nextInt();
		System.out.println(y);
		int sum = x + y ; 
		System.out.println(sum);
		// ���� 2) ���� 1���� �Է¹޾�, Ȧ���̸� true ���
		int a ; 
		System.out.println("a : ");
		a = scan.nextInt();
		System.out.println(a);
		boolean result = a % 2 == 1 ;
		System.out.println(result);
		//System.out.println(a % 2 == 1);
		
		
		// ���� 3) ������ �Է¹޾�, 60�� �̻��̰� 100�� �����̸� true ���
		
		int q;
		System.out.println("���� : ");
		q = scan.nextInt();
		System.out.println(q);
		boolean pass = q >= 60 && q <=100 ; 
		System.out.println(pass);
		//System.out.println(q >= 60 && q <= 100);
		

	}

}
