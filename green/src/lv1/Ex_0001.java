package lv1;

import java.util.Random;
import java.util.Scanner;

public class Ex_0001 {

	public static void main(String[] args) {
		//����뿬���� .

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int x = sc.nextInt();
		int a = 4;
		int s = (x % a++); 
		
		
		System.out.println(s);
	}

}
