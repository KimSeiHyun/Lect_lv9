package backjoon6_10;

import java.util.Scanner;

public class lv9_003_11653 {

	public static void main(String[] args) { // 11653
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		if(t >= 1 && t <= 10000000) {
			for(int i=2; i<=t; i++) {
				int cnt = 0;
				if(t%i == 0) {
//					System.out.println(i);
					for(int j=1; j<=t; j++) {
						if(i%j == 0 ) {
							cnt++;
						}
					}
					if(cnt == 2) {
//						System.out.println("¼Ò¼ö´Â : " + i);
						while(true) {
							
							if(t%i == 0) {
								t = t/i;
								System.out.println(i);
							}else {
								break;
							}
							
						}
					}
				}
			}

		
		}

		
		
    }
}