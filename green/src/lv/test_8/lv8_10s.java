package lv.test_8;

import java.util.Scanner;
import java.util.Vector;

public class lv8_10s {

	public static void main(String[] args) {
		// ∆Ω≈√≈‰ 
		Scanner scan = new Scanner(System.in);
		Vector<Vector<Integer> > vec = new Vector<Vector<Integer>>();
		
		
		for(int i = 0; i < 3; i++) {
			Vector<Integer> temp = new Vector<Integer>();
			for(int j = 0; j < 3; j++) {
				temp.add(0);
			}
			vec.add(temp);
		}
		
	
		
		boolean turn = true;
		
		while(true) {
			System.out.println("------------------------");
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					System.out.print(vec.get(i).get(j));
				}
				System.out.println();
			}
			System.out.println("------------------------");
			System.out.print("y : ");
			int y = scan.nextInt();
			System.out.print("x : ");
			int x = scan.nextInt();
			if(turn) {
				vec.get(y).set(x, 1);
				turn = !turn;
			}else {
				vec.get(y).set(x, 2);
				turn = !turn;
			}
		}
	}
}