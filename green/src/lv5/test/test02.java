package lv5.test;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		//���۽ð� 11 : 50
		//����ð� 12 : 04
		//�ҿ�ð� 00 : 14
		/*
		 * # �ܾ� ��ü�ϱ�(replace)
		 * 1. text���� ���� �ӿ��� �����ϰ� ���� �ܾ �Է¹޾�,
		 * 2. ��ü���ִ� ����� �����Ѵ�.
		 * ��)
		 * 		Life is too short.
		 * 		�����ϰ� ���� �ܾ��Է� : Life
		 * 		�ٲ� �ܾ��Է� : Time
		 * 
		 * 		Time is too short.
		 */
		Scanner sc = new Scanner(System.in);
		String text = "Life is too short.";
		System.out.println(text);
		
		while(true) {
		String temp[] = text.split(" ");
		temp[temp.length-1] = temp[temp.length-1].substring(0,temp[temp.length-1].length()-1);
		System.out.println("�����ϰ� ���� �ܾ� �Է� : ");
		String str = sc.next();
		for(int i=0; i<temp.length; i++) {
			if(str.equals(temp[i])) {
				System.out.println("�ٲ� �ܾ� �Է� : ");
				String str2 = sc.next();
				temp[i] = str2;
			}
		}
		text = "";
		for(int i=0; i<temp.length; i++) {
			if(i == temp.length-1) {
				text += temp[i]+".";
				break;
			}
			text += temp[i]+" ";
		}System.out.println();

		System.out.println(text);
		}

		
	}

}
