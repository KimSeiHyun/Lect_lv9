package backjoon;

import java.util.Scanner;

public class lv2_002_9498 {

	public static void main(String[] args) { //문제번호 9498
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 
		
		if(x >=90 && x <= 100) {
			System.out.println("A");
		}
		else if(x>=80 && x<=89) {
			System.out.println("B");
		}
		else if(x>=70 && x<=79) {
			System.out.println("C");
		}
		else if(x>=60 && x<=69) {
			System.out.println("D");
		}else System.out.println("F");

	}

}
