package lv5;

import java.util.Scanner;

public class Ex01_04 {

	public static void main(String[] args) {
		/*
		 * # �����ձ� ����
		 * ���þ� : ������
		 * �Է� : �Ź�
		 * ���þ� : �Ź�
		 * �Է� : �̼�
		 * ...
		 */
		
		Scanner sc = new Scanner(System.in);
		String start = "������";
		
		while(true) {
		
		System.out.println("���þ� : " + start);
		System.out.print("�Է� : ");
		String str = sc.next();
		int max = 0;
		for(int i=0; i<start.length(); i++) {
			if(max <i) {
				max = i;
			}
		}
		if(start.charAt(max)==str.charAt(0)) {
			start = str;				
		}else {
			System.out.println("���þ��� ������ ���ڶ� �Է��� ������ ù��° ���ڰ� ���� �ʽ��ϴ�.");
		}
		}//w

	}

}
