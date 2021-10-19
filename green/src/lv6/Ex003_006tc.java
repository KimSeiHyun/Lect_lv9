package lv6;

import java.util.Random;
import java.util.Scanner;

class OMR {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	int answer[] = {3,3,2,1,4};
	int hgd[];
	
	void randomMark() {
		this.hgd = new int[this.answer.length];
		for(int i=0; i<this.answer.length; i++) {
			int rNum = rn.nextInt(5)+1;
			this.hgd[i] = rNum;
		}
	}
	
	char[] checkMark(int arr[]) {
		char[] resultCard = new char[arr.length];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == this.answer[i]) {
				resultCard[i] = 'O';
			}
			else {
				resultCard[i] = 'X';
			}
		}
		return resultCard;
	}
	
	void printCard(char arr[]) {
		for(int i=0; i<this.hgd.length; i++) {
			System.out.print(hgd[i] + " ");
		}System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
	
		
		}
	
	int resultScore() {
		int score = 0;
		for(int i=0; i<this.hgd.length; i++) {
			if(this.hgd[i] == this.answer[i]) {
				score += 20;
			}
		}
		return score;
		
	}
	public void run() {
		

		//����ۼ�(����)
		randomMark();
		//����üũ(��������)
		printCard(checkMark(this.hgd));
		//����ǥ���
		System.out.println(resultScore());
		
	}
	
}
public class Ex003_006tc {

	public static void main(String[] args) {
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
		OMR omr = new OMR();
		omr.run();
	}

}
