package lv3;

import java.util.Scanner;

public class Ex01_08 {

	public static void main(String[] args) {
		// ���� 3) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����(��ġ�� �տ��� ����  ����)
	    // 2�������� ���� �ٸ�
		// ��) c = [49, 51, 17, 0, 0]
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = { 10, 49, 51, 36, 17 };
		int c[] = { 0,0,0,0,0 };
		System.out.println("����3 : ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����(��ġ�� �տ��� ����  ����)");
		

		int i2 = -1;
		for (int i= 0; i <5; i++) {
			
			if(a[i] %2 == 1  ) {	
				c[i] += a[i];		
			}

			System.out.println(c[i]);
			
		}

	}

}
