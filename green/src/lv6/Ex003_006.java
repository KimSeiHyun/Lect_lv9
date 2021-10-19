package lv6;

import java.util.Random;

class Ex003_06 {
	Random rn = new Random();
	int answer[] = {1, 3, 4, 2, 5};
	int hgd[] = new int[5];
	String s[] = new String[5];
	
	void suffle(int hgd[]) {
		int x = 0;
	//	while(true) {
			for(int i=0; i<5; i++) {
				int rNum = rn.nextInt(5)+1;
				hgd[i] = rNum;
			}
	//	}
	}
	
	void answer(int a[], int b[]) {

		for(int i=0; i<5; i++) {
			if(answer[i] == hgd[i]) {
				s[i] = "O";
			}else {
				s[i] = "X";
			}
		}
	}

	void print(int a[], int b[]) {
		
		System.out.print("answer \t");
		for(int i=0; i<5; i++) {
			System.out.print(answer[i] + " ");
		}System.out.println();
		
		System.out.print("hgd \t");
		for(int i=0; i<5; i++) {
			System.out.print(hgd[i] + " ");
		}System.out.println();
		
		System.out.print("����ǥ \t");
		for(int i=0; i<5; i++) {
			System.out.print(s[i] + " ");
		}System.out.println();
	}
	
	void score() {
		int sum = 0;
		for(int i=0; i<5; i++) {
			if(s[i].equals("O")) {
				sum += 20;
			}
		}
		System.out.println("���� : " + sum);
	}
	
	
	void run() {
		suffle(hgd);
		answer(answer,hgd);
		print(answer,hgd);
		score();
	}
	
	
	

}
public class Ex003_006 {

	public static void main(String[] args) {
		Ex003_06 ex = new Ex003_06();

		/*
		 * # OMRī�� : Ŭ���� + �޼���
		 * 1. �迭 answer�� ���蹮���� �������̴�.
		 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
		 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
		 * 4. �� ������ 20���̴�.
		 * ��)
		 * answer = {1, 3, 4, 2, 5}
		 * hgd    = {1, 1, 4, 4, 3}
		 * ����ǥ     = {O, X, O, X, X}
		 * ����        = 40��
		 */
		ex.run();
		
	}

}
