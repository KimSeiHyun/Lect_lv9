package backjoon;

import java.util.Scanner;

public class lv5_02_2562 {

	public static void main(String[] args) { //2562
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];
		
		for(int i=0; i<9; i++) {
			int x = sc.nextInt();
			arr[i] = x;
		}
		int max = -1;
		int idx = -1;
		for(int i=0; i<9; i++) {
			if(arr[i] > max) {
				max = arr[i];
				idx = i;
			}
		}
		
		System.out.println(max);
		System.out.println(idx+1);

	}

}