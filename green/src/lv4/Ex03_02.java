package lv4;

import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		
		// String 부연 설명 . 
		
		Scanner sc = new Scanner(System.in);
		
		
		String a = "abc";
		String b = "abc";
		String c = sc.next(); // abc
		
		
		// String 객체의 주소를 비교함. 
		System.out.println(a == b); // true
		System.out.println(b == c); // false
		
		// String 객체의 값을 비교함. 
		System.out.println(a.equals(b)); // true
		System.out.println(b.equals(c)); // true
		
		
		
		
	}

}
