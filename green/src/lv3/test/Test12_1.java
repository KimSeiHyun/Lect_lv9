package lv3.test;

import java.util.Scanner;

public class Test12_1 {

	public static void main(String[] args) {
		int arr[] = {0,0,2,0,3,0,4,0,5};	
		// �Ʒ� ��ȣ�� �Է¹ް� ������ ���� 0 �̾ƴѼ��ڸ� �����ÿ�.
		// 1)left 2)right 
		// ��) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
		// ��) 1) right ==> arr = {0,0,0,0,0,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		
		
		boolean t = true;
		
		while (t) {
			
			for(int i = 0; i<9; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			
			System.out.print("1.left 2.right 3.���� ");
			int sel = sc.nextInt();
			
			if (sel == 1) {
				int a = 1;
				while(a < 5) {
				for(int i =0; i<9; i++) {	
					if(arr[i] == 0 ) {     
					for(int j=i+1; j<8; j++) {
							arr[j-1] = arr[j];
							arr[j] = arr[j+1];	
						}
					
					}
					arr[8] = 0;
				}
				a++;
				}
			}
			
			
			else if (sel == 2) {
			int a = 1;
			while(a < 5) {
				for(int i =8; i>=0; i--) {	
					if(arr[i] == 0 ) {     
					for(int j=i-1; j>=1; j--) {
							arr[j+1] = arr[j];
							arr[j] = arr[j-1];	
						}
					
					}
					arr[0] = 0;
					
				}
				a++;
			}
			}
			else {
				System.out.println("�����մϴ�.");
				break;
			}
			
		}//while
		
	
	}

}
