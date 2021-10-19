package backjoon11_15;

import java.util.Random;
import java.util.Scanner;

public class lv11_001_2798 {

	public static void main(String[] args) { //2798
		Scanner sc= new Scanner(System.in);
		Random rn = new Random();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		int x1 = 0;
		int x2 = 1;
		int x3 = 2;
		int sum = 0;
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			arr[i] = x;
		}
		
		while(true) {
			int temp = arr[x1]+arr[x2]+arr[x3];
			if(temp <= m && temp > sum) {
				sum = temp;
			}
			
		
			if(x1 == n-3 && x2 == n-2 && x3 == n-1) {
				break;
			}
			x3++;
			if(x3 == n) {
				x3 = x2+2;
				x2 ++;
				if(x3 == n && x2 == n-1) {
					x1 ++;
					x2 = x1+1;
					x3 = x1+2;
				}
			}
			
		}
		System.out.println(sum);
		
		
		
    }
	
}