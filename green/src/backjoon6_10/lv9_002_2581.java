package backjoon6_10;

import java.util.Scanner;

public class lv9_002_2581 {

	public static void main(String[] args) { // 2581
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int sum = 0;
		int check = 0;
		int min = 0;
		for(int i=x; i<=y; i++) {
			int cnt = 0;
			for(int j=1; j<=y; j++) {
				if(i %j == 0) {
					cnt ++;

				}
			}
			if(cnt == 2) {
				sum += i;
				if(check ==0) {
					min = i;
					check = 1;
				}
				
			}
		}
		if(sum != 0) {
			System.out.println(sum);
			System.out.println(min);			
		}else System.out.println("-1");
		

		
    }
}