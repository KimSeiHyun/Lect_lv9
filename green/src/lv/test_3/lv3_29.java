package lv.test_3;

import java.util.Scanner;

public class lv3_29 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};	
		int b[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		// ���ڸ� 5�� �Է¹ް� arr �迭�ȿ� �Է��Ѱ��� ���������� 
		// b�迭�ȿ� �ش� ���� �ε����� ���ʴ�� �����ҷ��� �Ѵ�. 
		// ����) ���࿡ �Է��� ���ڰ� arr �� ������ �ε��� ��� -1 ���� 
	
		// ��) 10, 20, 10, 1, 50
		//  b ={0,1,0,-1,4}
		// ��)  30, 40, 1, 10, 
		// b = {2,3,-1,0,-1}
		int x = 0;
		
		while (x <5) {
			int check = 1;
			int num = sc.nextInt();
			for(int i=0; i<5; i++) {
				if(num == arr[i]) {
					b[x] = i;
					check = -1;
				}
			}
			if(check == 1) {
				b[x] = -1;
			}
			
			for(int i=0; i<5; i++) {
				System.out.print(b[i] + " ");
			}System.out.println();
			x++;
		}
		
		
		
	}

}
