package lv3;

import java.util.Scanner;

public class Ex01_05tc {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		Scanner sc = new Scanner(System.in);
		// ����) 1���л��� �й��� ���� ���
		// ����) 1004��(98��)
		
		// �ִ밪 ���ϱ�  >  �迭 ���� . 
		
		int max = 0;
		int idx = -1;
		for(int i=0; i<5; i++) {
			if(scores[i] > max) {
				max = scores[i]; // max�� ���� . 
				idx = i;
			}
		}
		System.out.println("1�� �л��� : " + hakbuns[idx] + "�� ");
		System.out.println("max : " + max);

	}

}
