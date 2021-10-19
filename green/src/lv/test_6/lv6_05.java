package lv.test_6;

import java.util.Random;

class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// ������
	int[] hgd = new int[5];				// �л����
	
	int cnt = 0;						// ���� ���� ����
	int score = 0;						// ����
}
/*
 * # OMRī�� : Ŭ���� + ����
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

public class lv6_05 {

	public static void main(String[] args) {
		Ex06 e = new Ex06();
		Random rn = new Random();
		int score = 0;
		for(int i=0; i<e.hgd.length; i++) {
			int rNum = rn.nextInt(5)+1;
			e.hgd[i] = rNum;
		}
		
		System.out.print("answer = ");
		for(int i=0; i<5; i++) {
			System.out.print(e.answer[i] + " ");
		}System.out.println();
		System.out.print("hgd    = ");
		for(int i=0; i<5; i++) {
			System.out.print(e.hgd[i] + " ");
		}System.out.println();
		System.out.print("OX     = ");
		for(int i=0; i<5; i++) {
			if(e.answer[i] == e.hgd[i]) {
				System.out.print("O ");
				score += 20;
			}
			if(e.answer[i] != e.hgd[i]) System.out.print("X ");
		}System.out.println();
		System.out.println("���� : " + score);
	}

}
