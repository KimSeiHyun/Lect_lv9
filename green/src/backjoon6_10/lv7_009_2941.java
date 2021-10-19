package backjoon6_10;

import java.util.Scanner;

public class lv7_009_2941 {

	public static void main(String[] args) {//2941
		Scanner sc = new Scanner(System.in);
		

		String s = sc.next();
		String temp = "=";
		int x = s.length();
		int l = x;
	for(int i=0; i<x; i++) {
		if( i < x-2 && s.substring(i, i+3).equals("dz=") ) {
			l --;
		}
		 if( i < x-1 && s.substring(i, i+2).equals("lj") ) {
			l --;
		}
		 if( i < x-1 && s.substring(i, i+2).equals("nj") ) {
			l --;
		}
		 if( i < x-1 && s.substring(i, i+2).equals("c=") ) {
			 l --;
		 }
		 if( i < x-1 && s.substring(i, i+2).equals("s=") ) {
			 l --;
		 }
		 if( i < x-1 && s.substring(i, i+2).equals("z=") ) {
			 l --;
		 }
		 if( i < x-1 && s.substring(i, i+2).equals("c-") ) {
			 l --;
		 }
		 if( i < x-1 && s.substring(i, i+2).equals("d-") ) {
			 l --;
		 }
	}
	System.out.println(l);


	
}

}