package lv5.test;

import java.util.Random;
import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		/*
		 * # Ÿ�ڿ��� ����[2�ܰ�]
		 * 1. ������ ���´�.(shuffle)
		 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
		 * 3. �� ������ ������ ��, �ܾ��� ������ ��ġ �� ���� *�� ���
		 * ��)
		 * ���� : mys*l
		 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
		 * ���� : *sp
		 * �Է� : jsp
		 * ...
		 */
		//���� ���⶧���� ��ġ ����.
		//���۽ð� 11 : 23
		//����ð� 11 : 45
		//�ҿ�ð� 00 : 22
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};
		int x = 0;
		while(x < 100) {
			int ran1 = rn.nextInt(4);
			String temp = words[0];
			words[0] = words[ran1];
			words[ran1] = temp;
			
			x++;
		}
		
		for(int i=0; i<4; i++) {
			System.out.print(words[i] + " ");
		}System.out.println();
		
		int cnt = 0;
		
		while (cnt < 4) {
			int r = rn.nextInt(words[cnt].length());
			for(int i=0; i<words[cnt].length(); i++) {
				if ( i == r) {
					System.out.print("*");
				}else {
					System.out.print(words[cnt].charAt(i));
					
				}
			}System.out.println();
			System.out.println("�ܾ��Է� : ");
			String str = sc.next();
			if(str.equals(words[cnt])) {
				cnt++;
			}
			if(cnt ==4) System.out.println("game clear !");
		}
		

		
	}

}
