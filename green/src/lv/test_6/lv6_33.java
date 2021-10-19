package lv.test_6;

import java.util.Random;

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
class ScoreMng{
	
	Random ran = new Random();
	
	int[] omr = {1, 4, 3, 2, 2};		// ������
	int[] me = new int[5];				// �л����
	
	int cnt = 0;						// ���� ���� ����
	int score = 0;						// ����
	
	public void inAnswer() {
		for(int i=0; i<me.length; i++) {
			this.me[i] = ran.nextInt(5)+1;
		}
	}
	
	public void print() {
		System.out.print("omr  : ");
		for(int i=0; i<this.omr.length; i++) {
			System.out.print(this.omr[i] + " ");
		}System.out.println();
		System.out.print("me   : ");
		for(int i=0; i<this.omr.length; i++) {
			System.out.print(this.me[i] + " ");
		}System.out.println();
	}
	public void OXprint() {
		String temp[] = new String[this.omr.length];
		System.out.print("OX   : ");
		for(int i=0; i<temp.length; i++) {
			if(this.omr[i] == this.me[i]) {
				temp[i] = "O";
				this.score += 20;
				System.out.print(temp[i] + " ");
			}
			else {
				temp[i] = "X";
				System.out.print(temp[i] + " ");
			}
		}System.out.println();
		System.out.println("score : " + score);
	}
	void run() {
		inAnswer();
		print();
		OXprint();
	}
	
}

public class lv6_33 {

	public static void main(String[] args) {
		ScoreMng sm = new ScoreMng();
		sm.run();


	}
}