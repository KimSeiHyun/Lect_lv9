package lv5;

import java.util.Scanner;

public class Ex01_10 {

	public static void main(String[] args) {
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
		System.out.print("�����ϰ� ���� �ܾ �Է��ϼ��� : ");
		String word = sc.nextLine();
		String temp[] = text.split(" ");
		int check = 0;
		String x = "";
		int y = 0;
		for(int i=0; i<temp.length;i ++) {
			if(word.equals(temp[i])) {
				check = 1;
				y = i;
			}
			if(i == temp.length-1) {
				x = word+".";
				if(x.equals(temp[temp.length-1])) {
					check = 2;
					y = i;
				}
			}
		}
		if(check == 1) {
			System.out.println("�ٲ� �ܾ��Է� : ");
			String str = sc.next();
			temp[y] = str;
		}
		else if(check == 2) {
			System.out.println("�ٲ� �ܾ��Է� : ");
			String str = sc.next();
			temp[y] = str+".";
			
		}
		else {
			System.out.println("��ġ�ϴ� �ܾ �����ϴ� . ");
		}
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+ " ");
		}

	}

}
