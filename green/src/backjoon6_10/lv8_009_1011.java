package backjoon6_10;

import java.util.Scanner;

public class lv8_009_1011 {

	public static void main(String[] args) { // 1011
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int z = y-x;
		
		int max = (int)Math.sqrt(z); // �������� ���� ( �Ҽ��� ���� ) 
		
//		System.out.println("x : " + x);
//		System.out.println("y : " + y);
//		System.out.println("z(�Ÿ�) : " + z);
//		System.out.println("max(������) : " + max);
		
		if(max == Math.sqrt(z)) {
//			System.out.print("ī��Ʈa : ");
			System.out.println(max*2 -1);
		}
		else if(z <= max*max +max) {
//			System.out.print("ī��Ʈb : ");
			System.out.println(max * 2);
		}
		else {
//			System.out.print("ī��Ʈc : ");
			System.out.println(max *2 +1);
		}
		}
		
		
		

		
    }
}