package backjoon;

import java.util.Scanner;

public class lv2_005_2884 {

	public static void main(String[] args) {//문제번호 2884
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); 
		int m = sc.nextInt(); 
		int temp = 60;
		if( m > 45) {
			m -= 45;
			System.out.println(h + " "+ m);
		}
		else if(h > 0 &&m < 45) {
			h -= 1;
			m = m-45+temp;
			
			System.out.println(h + " "+ m);
		}else if(h == 0 && m < 45) {
			h = 23;
			m = m-45+temp;
			System.out.println(h + " "+ m);
		}else if(m == 45) {
			 m -= 45;
			 System.out.println(h + " "+ m);
		}

	}

}
