package lv1;

import java.util.Scanner;

public class Ex06_1 {

	public static void main(String[] args) {
		// 변수활용 + 입출력 함수 사용 . 
		
		// 문제 1) 숫자 2개를 입력받아, 합 출력
		Scanner scan = new Scanner(System.in);
		int x;
		System.out.print("x : ");
		x = scan.nextInt();
		System.out.println(x);
		int y;
		System.out.print("y : ");
		y = scan.nextInt();
		System.out.println(y);
		int sum = x + y ; 
		System.out.println(sum);
		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		int a ; 
		System.out.println("a : ");
		a = scan.nextInt();
		System.out.println(a);
		boolean result = a % 2 == 1 ;
		System.out.println(result);
		//System.out.println(a % 2 == 1);
		
		
		// 문제 3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		
		int q;
		System.out.println("성적 : ");
		q = scan.nextInt();
		System.out.println(q);
		boolean pass = q >= 60 && q <=100 ; 
		System.out.println(pass);
		//System.out.println(q >= 60 && q <= 100);
		

	}

}
