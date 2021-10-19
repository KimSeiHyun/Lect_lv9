package lv4;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		

		
		// 자료형
		// 1. int 
		// 2. double
		// 3. char
		// 4. boolean
		// 5. String  (기본자료형이 아님)
		Scanner sc = new Scanner(System.in);
		
		int size = 5;
		int range = (int)Math.round(size*size*1.5);
		System.out.println(range);
		
		
		// 문자열 : 문자(char)의 나열 ( 배열 ) 
		
		String name = "홍길통";
		//			  {'홍','길','동'}
		//              0    1    2
		System.out.println(name);
		System.out.println(name.length());
		
		// 입력받기
//		System.out.print("이름입력 : ");
//		
//		String data = sc.next(); // 문자열을 입력 처리 
//		System.out.println(data);
		
		// 문자열 메소드
		
		// ㄴ 비교 equals ( 비교를 해서 boolean 값을 리턴함 . )
		String temp = "홍";
		if(name.equals(temp)) {    //(name == temp ) {
			System.out.println("같다");
		}
		else { 
			System.out.println("다르다");
		}
		
		// ㄴ 문자열의 대소비교 ( 정렬 )
		//	 문자열.compareTo(비교문자열)
		//	 문자열을 기준으로 비교문자열과 비교했을 때, 문자열의 위치 . 
		temp = "홍길동";
		System.out.println(name.compareTo(temp));
		
		
		
	}

}
