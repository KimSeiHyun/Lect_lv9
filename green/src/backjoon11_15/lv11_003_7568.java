package backjoon11_15;

import java.util.Random;
import java.util.Scanner;

public class lv11_003_7568 {

	public static void main(String[] args) { // 7568
		Scanner sc= new Scanner(System.in);
		Random rn = new Random();
		int n = sc.nextInt();
		int arr[][] = new int[n][2];
		int check[] = new int[n];
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[i][0] = x;
			arr[i][1] = y;
		}
		
		for(int i=0; i<n; i++) {
			int cnt = 1;
			int temp1 = arr[i][0];
			int temp2 = arr[i][1];
			for(int j=0; j<n; j++) {
				if(arr[j][0] > temp1 && arr[j][1] > temp2) {
					cnt++;
				}
			}
			check[i] = cnt;
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(check[i] + " ");
		}
    }
	
}
