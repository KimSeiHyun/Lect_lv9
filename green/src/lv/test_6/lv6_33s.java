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
class ScoreMngs{
	
	Random ran = new Random();
	
	int[] omr = {1, 4, 3, 2, 2};		// ������
	int[] me = new int[5];				// �л����
	
	int cnt = 0;						// ���� ���� ����
	int score = 0;						// ����
	
	// 1.me ��� �ϼ��ϱ�
	void makeAnswer() {
		for(int i=0; i<me.length; i++) {
			me[i] = ran.nextInt(4) + 1;		// [0 ~ 3] + 1		
		}
	}
	
	// 2.���� ����ϱ�
	void showAnswer() {
		// omrī�� ���
		System.out.print("omr = [");
		for(int i=0; i<omr.length; i++) {
			System.out.print(omr[i] + " ");
		}
		System.out.println("]");
		// meī�� ���
		System.out.print("me  = [");
		for(int i=0; i<me.length; i++) {
			System.out.print(me[i] + " ");
		}
		System.out.println("]");
	}
	
	// 3.���� ���ϱ�
	void checkAnswer() {
		cnt = 0;
		System.out.print("����ǥ= [");
		for(int i=0; i<omr.length; i++) {
			if(omr[i] == me[i]) {
				System.out.print("o ");
				cnt += 1;
			}else {
				System.out.print("x ");
			}
		}
		System.out.println("]");
		
		score = 20 * cnt;
		System.out.println("��  �� = " + score + "��");
	}
	
	// 4.�����ϱ�
	void run() {
		makeAnswer();
		showAnswer();
		checkAnswer();
	}
	
}

public class lv6_33s {

	public static void main(String[] args) {
		ScoreMngs sm = new ScoreMngs();
		sm.run();


	}
}