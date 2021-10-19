package backjoon6_10;

import java.util.Scanner;

public class lv8_002_2292 {

	public static void main(String[] args) { // 2292
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		int y = 1;
		int z = 0;
		int cnt =6;
		int count = 2;
		int c = 1;
		while (y <1000000000) {
			if(x == 0) {
				count = 0;
				break;
			}
			if(y > 2) {
				z++;								
			}
			if(z  == cnt  && z != 0 ) {
				z = 0;
				c++;
				cnt += 6;
				count ++;
			}
			if(y == x ) {
				if(x == 1) {
					count = 1;
				}
				break;
			}

			
			y++;			
		}//while(y)
		System.out.println( count );
		
		
		
		
	}

}