package lv4;

import java.util.Random;
import java.util.Scanner;

public class Ex01_05tc {

	public static void main(String[] args) {
		/* 
		 * # 1 to 50�� ==> 1 to 18
		 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
		 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
		 * 3. �� ������ ���ڹ����� ���� 1 to 18�� ���� �����Ѵ�.
		 * 4. ���� 1~9�� front �迭�� �����ϰ�,
		 *    ���� 10~18�� back �迭�� �����Ѵ�.
		 */
		
		
		final int SIZE = 9; // ���
		
		int[] front = new int[SIZE]; // 1~9 ����
		int[] back  = new int[SIZE]; // 10~18 ����
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<9; i++) {
			front[i] = i+1;
			back[i] = i+10;
		}
		
		// ����
		for(int i=0; i<1000; i++) {
			int rIdx = rn.nextInt(9);
			
			int temp = front[0];
			front[0] = front[rIdx];
			front[rIdx] = temp;
			
			rIdx = rn.nextInt(9);
			
			temp = back[0];
			back[0] = back[rIdx];
			back[rIdx] = temp;
		}
		
		int gameNum =1;
		// run
		while(true) {
			//���
			for(int i =0; i<9; i++) {
				System.out.print(front[i] + " ");
				if(i % 3 == 2 ) {
					System.out.println();
				}
			}
			System.out.println();
			for(int i =0; i<9; i++) {
				System.out.print(back[i] + " ");
				if(i % 3 == 2 ) {
					System.out.println();
				}
			}
			
			System.out.print("���� ���� ��ǥ [1~9] :");
			int idx = sc.nextInt()-1;
			
			if(idx >= 0 && idx < 9) {
				
			}
			if (front[idx] == gameNum) {
				front[idx] = back[idx];
				back[idx] = 0;
				gameNum ++;
			}
			else {
				System.out.println("��");
			}
			
			// ���� ����
			if(gameNum > SIZE*2) {
				System.out.println("game clear!");
				break;
			}
			
		}
		
		
		
	}

}
