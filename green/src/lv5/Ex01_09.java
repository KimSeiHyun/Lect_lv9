package lv5;

import java.util.Scanner;

public class Ex01_09 {

	public static void main(String[] args) {
		/*
		 * # �ܾ� �˻�
		 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
		 * 2. �ܾ �����ϸ� true
		 *    �ܾ ������ false�� ����Ѵ�.
		 */

		Scanner sc = new Scanner(System.in);
		String text = "Life is too short.";
		System.out.println(text);
		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String word = sc.next();
		//sc.next() �޼���� ������ �������� ���� ������ �ֱ� ������
		//Life is ��� �Է��ص� Life�� ���� �����.
		//Life is�� ������ �����ϰ� ������
		//nextLine() �Լ��� ����ؾ��� . 
		String temp[] = text.split(" ");
		int check = 1;
		System.out.println(temp.length-1);
		for(int i=0; i<temp.length; i++) {
			if(word.equals(temp[i])) {
				check = 0;
			}
			if(i == temp.length-1) {
				String x = word+".";
				if(x.equals(temp[temp.length-1])) {
					check = 0;
				}
			}
		}

		if(check == 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	
	}

}
