package backjoon;

import java.util.Scanner;

public class lv5_01_10818 {

	public static void main(String[] args) { // 10818
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int arr[] = new int[x];
		
		int max = -1000000;
		int min = 1000000;
		
		for(int i=0; i<x; i++) {
			int y = sc.nextInt();
			arr[i] = y;
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		 
		 System.out.println(min+ " " + max);
		 
	}

}