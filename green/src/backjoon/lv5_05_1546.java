package backjoon;

import java.util.Scanner;

public class lv5_05_1546 {

	public static void main(String[] args) { // 1546
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		double arr[] = new double[n];
		for(int i=0; i<n; i++) {
			double x = sc.nextInt();
			arr[i] = x;
		}
		double max = -1;
		for(int i=0; i<n; i++) {
			if(max < arr[i] ) {
				max = arr[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			arr[i] = arr[i]/max*100*100;
			int x = (int)arr[i];
			double xx = x;
			xx = xx/100;
			
			arr[i] = xx;
			sum += arr[i];
		}
		
		System.out.println(sum/n);
		
		
		
	}

}