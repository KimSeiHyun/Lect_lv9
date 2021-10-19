package backjoon11_15;

import java.util.Scanner;

public class lv12_001_2750 {

	public static void main(String[] args) { // 2750
		Scanner sc= new Scanner(System.in);
		 
		int t = sc.nextInt();
		int arr[] = new int[t];
		for(int i=0; i<t; i++) {
			int inNum = sc.nextInt();
			arr[i] = inNum;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			int temp = arr[i];
			int min = 1000;
			int idx = -1;
			int check = 0;
			for(int j=i; j<arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j]; 
					idx = j;
					check = 1;
				}
			}
			if(check == 1) {
				temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
    }
	
}