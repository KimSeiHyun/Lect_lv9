package lv.test_3;

import java.util.Scanner;

public class lv3_29s {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};	
		int b[] = new int[5];
		
		// ���ڸ� 5�� �Է¹ް� arr �迭�ȿ� �Է��Ѱ��� ���������� 
		// b�迭�ȿ� �ش� ���� �ε����� ���ʴ�� �����ҷ��� �Ѵ�. 
		// ����) ���࿡ �Է��� ���ڰ� arr �� ������ �ε��� ��� -1 ���� 
	
		// ��) 10, 20, 10, 1, 50
		//  b ={0,1,0,-1,4}
		// ��)  30, 40, 1, 10, 2
		// b = {2,3,-1,0,-1}
		Scanner sc = new Scanner(System.in);
		
		
		int x = 0;
		while (x <5) {
			int num = sc.nextInt();
			int check = 0;
			
			for(int i=0; i<5; i++) {
				if(arr[i] == num) {
					b[x] = i;
					check = 1;
				}
					
			}
			if(check == 0 ) {
				b[x] = -1;
			}
			for(int i=0; i<5; i++) {
				System.out.print(b[i] + " ");
			}
			x++;
		}//w
		
	}

}
