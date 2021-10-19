package lv.test_8;

import java.util.Scanner;
import java.util.Vector;

public class lv8_10 {

	public static void main(String[] args) {
		// 틱택토 
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
		int win = 0;
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
				if(x >= 0 && x < 3 && y >= 0 && y < 3 ) {
					if(vec.get(y).get(x) == 0) {
						vec.get(y).set(x, 1);
						turn = !turn;
					}
				}
			}else {
				if(x >= 0 && x < 3 && y >= 0 && y < 3 ) {
					if(vec.get(y).get(x) == 0) {
						vec.get(y).set(x, 2);
						turn = !turn;
					}
					
				}
			}
			//가로
			for(int i=0; i<3 ; i++ ) {
				if(vec.get(i).get(0) == 1 && vec.get(i).get(1) == 1 && vec.get(i).get(2) == 1  ) {
					win = 1;
				}
			}
			for(int i=0; i<3 ; i++ ) {
				if(vec.get(i).get(0) == 2 && vec.get(i).get(1) == 2 && vec.get(i).get(2) == 2  ) {
					win = 2;
				}
			}
			//세로
			for(int i=0; i<3 ; i++ ) {
				if(vec.get(0).get(i) == 1 && vec.get(1).get(i) == 1 && vec.get(2).get(i) == 1  ) {
					win = 1;
				}
			}
			for(int i=0; i<3 ; i++ ) {
				if(vec.get(0).get(i) == 2 && vec.get(1).get(i) == 2 && vec.get(2).get(i) == 2  ) {
					win = 2;
				}
			}
			//대각\
			if(vec.get(0).get(0) == 1 && vec.get(1).get(1) == 1 && vec.get(2).get(2) == 1  ) {
				win = 1;
			}
			if(vec.get(0).get(0) == 2 && vec.get(1).get(1) == 2 && vec.get(2).get(2) == 2  ) {
				win = 2;
			}
			//대각/
			if(vec.get(0).get(2) == 1 && vec.get(1).get(1) == 1 && vec.get(2).get(0) == 1  ) {
				win = 1;
			}
			if(vec.get(0).get(2) == 2 && vec.get(1).get(1) == 2 && vec.get(2).get(0) == 2  ) {
				win = 2;
			}
			
			if(win != 0) {
				System.out.printf("p%d의 승리!! ",win);
				break;
			}
		}//while
	}
}