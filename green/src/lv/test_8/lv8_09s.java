package lv.test_8;

import java.util.Scanner;
import java.util.Vector;

public class lv8_09s {

	public static void main(String[] args) {
		// ∆Ω≈√≈‰ 
		Scanner scan = new Scanner(System.in);
		Vector<int [] > vec = new Vector<int []>();
		
		for(int i = 0; i < 3; i++) {
			vec.add(new int[3]);
		}
		
	
		
		boolean turn = true;
		
		while(true) {
			System.out.println("------------------------");
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					System.out.print(vec.get(i)[j]);
				}
				System.out.println();
			}
			System.out.println("------------------------");
			System.out.print("y : ");
			int y = scan.nextInt();
			System.out.print("x : ");
			int x = scan.nextInt();
			if(turn) {
				vec.get(y)[x] = 1;
				turn = !turn;
			}else {
				vec.get(y)[x] = 2;
				turn = !turn;
			}
		}
	}
}