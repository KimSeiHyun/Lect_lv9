package backjoon;

import java.util.Scanner;

public class lv5_07_4344 {

	public static void main(String[] args) { // 4344
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=0; i<x; i++) {
			double sum = 0;
			double cnt = 0; 
			String temp = "%";
			int y = sc.nextInt();
			double arr[] = new double[y];
			for(int j=0; j<y; j++) {
				double score = sc.nextInt();
				arr[j] = score;
				sum += score;
			}
			for(int j=0; j<y; j++) {
				if(arr[j] > sum/y) {
					cnt++;
				}
			}
			double z = cnt/y;
			System.out.println(String.format("%.3f",z*100)+temp);
		}
		
		
		
		
		
	}

}