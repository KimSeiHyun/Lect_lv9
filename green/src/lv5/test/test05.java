package lv5.test;

import java.util.Random;
import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		//���۽ð� 02 : 03
		//����ð� 02 : 43
		//�ҿ�ð� 00 : 40
		
		// ����) ����ܾ� ���߱�
		// ����ܾ ���� * �� ǥ�õȴ�.
		// ����ܾ �Է¹ް� Ʋ�������� �������� �ѱ��ھ� ��������. (������ 5���� ����)
		// (����) ���࿡ ���� ö�ڰ� �������� �ѹ��� ��������.
		// ���� �������ų� ���߸� ����
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int score = 100;
		String word = "performance";
		String meaning = "����";
		int size = word.length();
		int check[] = new int[size]; // ��Ʈ üũ�� ���ؼ� Ȯ���Ҽ��ִ�.
		
		while(true) {
			System.out.print("����  :");
			for(int i=0; i<size; i++) {
				if(check[i] == 0) {
					System.out.print("*");
				}
				else {
					char c = word.charAt(i);
					System.out.print(c);
				}
			}
			System.out.println();
			System.out.println("�ܾ��� �� : " +meaning);
			System.out.println("scroe : " +score);
			
			
			System.out.println("���� �Է� : ");
			String answer = sc.next();
			int check2 = 0;
			for(int i=0; i<answer.length(); i++) {
				if(word.charAt(i) == answer.charAt(i) && check[i] == 0) {
					check[i] = 1;
					check2 = 1;
					for(int j=0; j<size; j++) {
						if(answer.charAt(i) == word.charAt(j)) {
							check[j] = 1;
						}
					}
				}
			}
			if(check2 == 0) {
				System.out.println("Ʋ�����Ƿ� ������ 5�� �����̰� ö�� �ϳ��� ���µ˴ϴ�.");
				score -= 5;
				while(true) {
					int r = rn.nextInt(size);
					if(check[r] == 0) {
						check[r] = 1;
						for(int i=0; i<size; i++) {
							if(word.charAt(i) == word.charAt(r)) {
								check[i] = 1;
							}
						}
						break;
					}
				}
			}
			int cnt = 0;
			for(int i=0; i<size; i++) {
				if(check[i] == 1) {
					cnt ++;
				}
			}
			if(cnt == size) {
				System.out.println("������ ����˴ϴ�. ");
				System.out.println("���� : " + score + "��");
				break;
			}
			if(answer.equals(word)) {
				System.out.println("����!! ������ ����˴ϴ�.");
				System.out.println("���� : " + score + "��");
				break;
			}

		}//while

	}

}
