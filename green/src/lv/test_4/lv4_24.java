package lv.test_4;

import java.util.Scanner;

public class lv4_24 {

	public static void main(String[] args) {
		//����1) 1~�鸸 ������ ���ڸ� �Է¹ް� ��� ���� ��� 
        //(�� ! ¦���ڸ��� ���� ¦���ڸ���� ���)
		// ��)  123 ==> 2
		// ��)  1234 ==> ¦���� �ڸ��̴�
		// ��)  1 ==> 1
		// ��)  1234567 ==> 4
		
		// ��Ʈ �ڸ����� ���ϰ� �迭�� ������� �ϳ��� ���� 
		// ��) ==> 123 ==> 3 ==> arr[] = new int[3];
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int check = 0;
		if(a.length()%2 == 0) {
			check = 1;
		}
		if(check == 1) {
			System.out.println("¦�����ڸ��̴�");
		}else {
			if(a.charAt(a.length()/2)%2 == 0) {
				System.out.println("�ۼ�");
			}else System.out.println("Ȧ��");
			
		}
		
	}

}
