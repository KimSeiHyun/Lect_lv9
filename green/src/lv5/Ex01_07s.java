package lv5;

import java.util.Scanner;

public class Ex01_07s {

	public static void main(String[] args) {
		//���ڿ��񱳹���
		/*
		 * # ���ڿ� ��
		 * . equals() �޼��� ������ ������ ��ġ���� ��
		 * ��)
		 * �ڳ���
		 * �Է� = Ƽ�����罺
		 * ��� = false
		 */
		
		Scanner sc = new Scanner(System.in);
		String name = "�ڳ���";
		System.out.println("���þ� : " + name);
		System.out.print("���� �̸��� �Է��ϼ��� : ");			// ex) Ƽ�����罺
		String myName = sc.next();
		int cnt = 0;

		for(int i=0; i<name.length(); i++) { //���� ��ġ�� ���ڰ� ��ġ�ϸ� cnt ++
			int a = name.charAt(i);
			int num1 = a;
			int b = myName.charAt(i);
			int num2 = b;
			if(num1 == num2) {
				cnt ++;
			}
		}
		if(cnt == myName.length()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
