package lv4;

import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		
		// String �ο� ���� . 
		
		Scanner sc = new Scanner(System.in);
		
		
		String a = "abc";
		String b = "abc";
		String c = sc.next(); // abc
		
		
		// String ��ü�� �ּҸ� ����. 
		System.out.println(a == b); // true
		System.out.println(b == c); // false
		
		// String ��ü�� ���� ����. 
		System.out.println(a.equals(b)); // true
		System.out.println(b.equals(c)); // true
		
		
		
		
	}

}
