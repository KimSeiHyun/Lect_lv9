package lv3;

import java.util.Random;
import java.util.Scanner;

public class Ex01_14 {

	public static void main(String[] args) {
		/*
		 * # �ߺ����� ����[1�ܰ�]
		 * 1. 0~4 ������ ���ڸ� arr�迭�� �����Ѵ�.
		 * 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
		 * ��Ʈ) ���� ���ڸ� check�迭�� �ε����� Ȱ���Ѵ�.
		 * 
		 * ��)
		 * �������� : 1
		 * check = {0, 1, 0, 0, 0}
		 * arr   = {1, 0, 0, 0, 0}
		 * �������� : 3
		 * check = {0, 1, 0, 1, 0}
		 * arr   = {1, 3, 0, 0, 0}
		 * �������� : 2
		 * check = {0, 1, 1, 1, 0}
		 * arr   = {1, 3, 2, 0, 0}
		 */
		int[] check = new int[5];
		int[] arr = new int[5];
		
		int t = 0;
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		while (t<5) {
			int random = ran.nextInt(5);
				
			for(int i=0; i<5; i++) {
				
			}
		System.out.println(random);
			t++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
