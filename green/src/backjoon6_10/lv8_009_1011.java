package backjoon6_10;

import java.util.Scanner;

public class lv8_009_1011 {

	public static void main(String[] args) { // 1011
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int z = y-x;
		
		int max = (int)Math.sqrt(z); // 제곱근을 구함 ( 소수점 버림 ) 
		
//		System.out.println("x : " + x);
//		System.out.println("y : " + y);
//		System.out.println("z(거리) : " + z);
//		System.out.println("max(제곱근) : " + max);
		
		if(max == Math.sqrt(z)) {
//			System.out.print("카운트a : ");
			System.out.println(max*2 -1);
		}
		else if(z <= max*max +max) {
//			System.out.print("카운트b : ");
			System.out.println(max * 2);
		}
		else {
//			System.out.print("카운트c : ");
			System.out.println(max *2 +1);
		}
		}
		
		
		

		
    }
}