package lv.test_4;

import java.util.Scanner;

public class lv4_24 {

	public static void main(String[] args) {
		//문제1) 1~백만 사이의 숫자를 입력받고 가운데 숫자 출력 
        //(단 ! 짝수자리의 수는 짝수자리라고 출력)
		// 예)  123 ==> 2
		// 예)  1234 ==> 짝수의 자리이다
		// 예)  1 ==> 1
		// 예)  1234567 ==> 4
		
		// 힌트 자리수를 구하고 배열을 만든다음 하나씩 저장 
		// 예) ==> 123 ==> 3 ==> arr[] = new int[3];
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int check = 0;
		if(a.length()%2 == 0) {
			check = 1;
		}
		if(check == 1) {
			System.out.println("짝수의자리이다");
		}else {
			if(a.charAt(a.length()/2)%2 == 0) {
				System.out.println("작수");
			}else System.out.println("홀수");
			
		}
		
	}

}
