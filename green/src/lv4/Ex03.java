package lv4;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		

		
		// �ڷ���
		// 1. int 
		// 2. double
		// 3. char
		// 4. boolean
		// 5. String  (�⺻�ڷ����� �ƴ�)
		Scanner sc = new Scanner(System.in);
		
		int size = 5;
		int range = (int)Math.round(size*size*1.5);
		System.out.println(range);
		
		
		// ���ڿ� : ����(char)�� ���� ( �迭 ) 
		
		String name = "ȫ����";
		//			  {'ȫ','��','��'}
		//              0    1    2
		System.out.println(name);
		System.out.println(name.length());
		
		// �Է¹ޱ�
//		System.out.print("�̸��Է� : ");
//		
//		String data = sc.next(); // ���ڿ��� �Է� ó�� 
//		System.out.println(data);
		
		// ���ڿ� �޼ҵ�
		
		// �� �� equals ( �񱳸� �ؼ� boolean ���� ������ . )
		String temp = "ȫ";
		if(name.equals(temp)) {    //(name == temp ) {
			System.out.println("����");
		}
		else { 
			System.out.println("�ٸ���");
		}
		
		// �� ���ڿ��� ��Һ� ( ���� )
		//	 ���ڿ�.compareTo(�񱳹��ڿ�)
		//	 ���ڿ��� �������� �񱳹��ڿ��� ������ ��, ���ڿ��� ��ġ . 
		temp = "ȫ�浿";
		System.out.println(name.compareTo(temp));
		
		
		
	}

}
