package lv5;

import java.util.Scanner;

public class Ex01_07 {

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
		
		//Ex01_07s ���� Ǭ �ش��� ����ȭ ���� . 
		
		Scanner sc = new Scanner(System.in);
		String name = "�ڳ���";
		System.out.print("���� �̸��� �Է��ϼ��� : ");			// ex) Ƽ�����罺
		String myName = sc.next();
		int sum = 0;
		int sum2 = 0;
		int cnt = 0;
		for(int i=0; i<name.length(); i++) {//�� ���ڸ� ���ڷ� ��ȯ�� �ջ� 
			char a = name.charAt(i);
			int num = a;
			sum += num;
		}
		for(int i=0; i<myName.length(); i++) { //�� ���ڸ� ���ڷ� ��ȯ�� �ջ� 
			char a = myName.charAt(i);
			int num = a;
			sum2 += num;
		}
		System.out.println("sum : " + sum);
		System.out.println("sum2 : " + sum2);
		for(int i=0; i<name.length(); i++) { //���ڸ� �� ������ ��� true �� �Ǵ°� ���ܽ�Ŵ . 
			char a = name.charAt(i);
			int num1 = a;
			char b = myName.charAt(i);
			int num2 = b;
			if(num1 == num2) {
				cnt++;
			}
		}
		if(sum== sum2 && cnt == name.length()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
