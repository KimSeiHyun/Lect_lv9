package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex01_05 {

	public static void main(String[] args) {
		/*
		 * # Ÿ�ڿ��� ����[1�ܰ�]
		 * 1. ������ ���´�.(shuffle)
		 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
		 * ��)
		 * ���� : mysql
		 * �Է� : mydb
		 * ���� : mysql
		 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
		 * ���� : jsp
		 */
		String[] words = {"java", "mysql", "jsp", "spring"};
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int x = 0;
		while (x < 500) {//����
			int a = rn.nextInt(4);
			int b = rn.nextInt(4);
			String temp = words[a];
			words[a] = words[b];
			words[b] = temp;
			x++;
		}
		x = 0;
		for(int i=0; i<words.length; i++) {//������ �ߵǾ����� ������ ���Ȯ��. 
			System.out.print(words[i] + " ");
		}System.out.println();
		
		while(x<4) {//���ӽ���
			System.out.println("���� : " +words[x]);
			System.out.print("�Է� : ");
			String s = sc.next();
			if(words[x].equals(s)) {//�Է��Ѱ��� ���⶧�� x���� 
				x++;
			}
		}
		System.out.println("game clear ! ");

	}

}
