package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex01_06 {

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
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		int x = 0;
		while(x<100) {//����
			int a = rn.nextInt(4);
			int b = rn.nextInt(4);
			String temp = words[a];
			words[a] = words[b];
			words[b] = temp;
			x++;
		}
		for(int i=0; i<4; i++) {//������ �� �̴��� ���
			System.out.print(words[i] + " ");
		}System.out.println();
		x = 0;
		
		while(x <4) {
			int a = rn.nextInt(words[x].length()); //������ ���� �ȿ��� ������ index ���� .

			int z = 0;
			while (z < 1) {// ������ Ʋ���� *���� �ٲ��� �ʰ� while �ȿ��� ���� a �� ���� . 
							//Ʋ���� �ٽ� ���� a�� �״����ä�� �ٽ� ��ȯ  ���߸� x + 1 �Ǽ� �������� 
			String temp = "";
			if(a == 0) {
				temp += "*";
				temp +=words[x].substring(a+1);
			}
			else if( a == words[x].length()) {
				temp += words[x].substring(a-1);
				temp += "*";
			}
			else {
				temp += words[x].substring(0,a);
				temp += "*";
				temp += words[x].substring(a+1);
			}
			System.out.println("���� : " +temp);
			System.out.print("�Է� : ");
			String s = sc.next();

			if(words[x].equals(s)) {
				x++;
				z = 1;
			}
			
			}//w(z)
		}//w(x)
		
		
	}

}
