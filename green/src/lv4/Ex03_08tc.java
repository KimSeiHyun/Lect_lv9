package lv4;

import java.util.Scanner;

public class Ex03_08tc {

	public static void main(String[] args) {
		//����1) 1~�鸸 ������ ���ڸ� �Է¹ް� ��� ���� ��� 
        //(�� ! ¦���ڸ��� ���� ¦���ڸ���� ���)
		// ��)  123 ==> 2
		// ��)  1234 ==> ¦���� �ڸ��̴�
		// ��)  1 ==> 1
		// ��)  1234567 ==> 4
		// ��Ʈ �ڸ����� ���ϰ� �迭�� ������� �ϳ��� ���� 
		// ��) ==> 123 ==> 3 ==> arr[] = new int[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("1~1.000.000 �����Է� : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 1000000) {
			int temp = num;
			
			int digit = 0;
			while (temp > 0) {
				temp /= 10;
				digit ++;
			}
			System.out.println(digit);
			
			if(digit % 2 == 0) {
				System.out.println("¦���ڸ� �� �Դϴ� . ");
			}
			else {
				int arr[] = new int[digit]; 
				
				int idx = arr.length -1;
				while(digit > 0) {
					arr[idx] = num % 10 ;
					num /= 10;
					idx --;
					digit --;
				}
//				for(int i=0; i<arr.length; i++) {
//					System.out.print(arr[i] + " ");
//				}
				System.out.println(arr[arr.length/2]);
			}
			
			
		}//if
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
