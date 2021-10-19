package backjoon6_10;

import java.util.Scanner;

public class lv9_007_1085 {

	public static void main(String[] args) { // 1085
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int answerX = 0;
		int answerY = 0;
		//w = 8  // x = 6
		if(x < w) {
			if(w-x < x) {
				answerX = w-x;
			}
			else if(w-x > x){
				answerX = x;
			}
			else if( w-x == x) {
				answerX = w/2;
			}
		}
		else if(x > w) {
			answerX = x-w;
		}
		
		if(y < h) {
			if(h-y < y) {
				answerY = h-y;
			}
			else if(h-y > y){
				answerY = y;
			}
			else if( h-y == y) {
				answerY = h/2;
			}
		}
		else if(y > h) {
			answerY = y-h;
		}
		
		if(answerY > answerX ) {
			System.out.println(answerX);
		}
		if(answerY < answerX ) {
			System.out.println(answerY);
		}
		if(answerX == 0 || answerY == 0) {
			System.out.println(0);
		}
		if(answerX == answerY) {
			System.out.println(answerX);
		}
		

		
		
    }
}