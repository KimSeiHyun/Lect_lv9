package lv.test_3;

import java.util.Scanner;

public class lv3_40s {

	public static void main(String[] args) {
		int arr[] = {0,2,0,3,4,0,0,5,0};	
		// �Ʒ� ��ȣ�� �Է¹ް� ������ ���� 0 �̾ƴѼ��ڸ� �����ÿ�.
		// 1)left 2)right 
		
		// ��) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
		// ��) 1) right ==> arr = {0,0,0,0,0,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}System.out.println();
			System.out.println("1.left   2.right");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				int x = 0;
				while (x < 50) {
				for(int i=0; i<arr.length-1; i++) {
					if(arr[i] == 0) {
						int temp = 0;
						temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
					}
				}
				x++;
				}
			}
			if(sel == 2) {
				int x = 0;
				while (x < 50) {
				for(int i=8; i>0; i--) {
					if(arr[i] == 0) {
						int temp = 0;
						temp = arr[i];
						arr[i] = arr[i-1];
						arr[i-1] = temp;
					}
				}
				x++;
			}
		}
		
	}

	}}
