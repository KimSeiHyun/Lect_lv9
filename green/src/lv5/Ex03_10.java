package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex03_10 {

	public static void main(String[] args) {
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
		
		for(int i=0; i<check.length; i++) {
			check[i] = -1;
		}

		char a;
		while (true) {
			int count = 0;
			System.out.println("�� : " + meaning);
			System.out.println("score : " + score);
			System.out.print("���� : ");
			for (int i = 0; i < size; i++) { //��Ʈ�� �ްų� ����Ÿ� ���ĺ�ǥ��, �ƴϸ� *ǥ�� 
				if(check[i] == -1) {
					System.out.print("*");
				}
				else {
					a = word.charAt(i);
					System.out.print(a);
				}
			}
			System.out.println();
			
			
			for(int i=0; i<size;  i++) {
				if(check[i] == 0) {
					count ++;
				}
			}
			
			if(count == size) {// �� ���߰ų� �� �����Ǹ� ���� . 
				System.out.println("game clear !! ");
				break;
			}
			
			System.out.println("����ܾ �Է��ϼ��� >>> ");
			String me = sc.next();
			int size2 = me.length();
			int cnt = 0;
			for(int i=0; i<size2; i++) {
				if(size2 <= size) {
					if(word.charAt(i) == me.charAt(i) && check[i] == -1) {
					check[i] = 0;
					cnt ++;
					}
				}else {
					System.out.println("�Է��Ͻ� ö�ڼ��� �ʰ��ƽ��ϴ�.");
					break;
				}
			}
			if(cnt == 0) {
				int c = 0;
				int x = -1;
				while(c == 0) {
				int ranNum2 = rn.nextInt(size);
				for(int i=0; i<size; i++) {
					if(check[ranNum2] == -1 && i == ranNum2 ) {
						check[i] = 0;
						c = 1;
						x = i;
						score -= 5;
						System.out.println("�ϳ��� ���­����Ƿ� 5���� ���̰� ö�ڰ� �ϳ� �����˴ϴ�.");
					}
				}
				
				
				}
				for(int i=0; i<size; i++) {
					if(word.charAt(i) == word.charAt(x)) {
						check[i] = 0;
					}
				}
			}

			
		}//while 

		
	}

}
