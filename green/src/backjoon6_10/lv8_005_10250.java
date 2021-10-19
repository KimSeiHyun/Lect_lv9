package backjoon6_10;

import java.util.Scanner;

public class lv8_005_10250 {

	public static void main(String[] args) { // 10250
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
		int h = sc.nextInt();	
		int w = sc.nextInt();	
		int n = sc.nextInt();	
		
		//층을 구하는 식 
		int x = 0;
		if(n%h == 0 && h != 2) {
			x = h;
		}
		if(n%h != 0 && h != 2 ) {
			x = n%h;
		}
		if(n%h == 0 && h == 2 ) {
			x = 2;
		}
		if(n%h != 0 && h == 2 ) {
			x = 1;
		}
	//	System.out.println("층 x : " + x);
		
		//방번호 구하는 식 
		int y = 0;
		if(n % h == 0 ) {
			y = n/h;
		}
		if(n % h != 0 ) {
			y = n/h+1;
		}
	//	System.out.println("방번호 y : " + y);
		
		if(h*w < n) {
			continue;
		}
		if( y < 10) {
			System.out.println(x+"0"+y);
		}
		else {
			System.out.println(x+""+y);
		}
		}
		
		
		
		
    }
}