package lv.test_8;

import java.util.Scanner;
import java.util.Vector;

public class lv8_09 {

	public static void main(String[] args) {
		// 틱택토 
		Scanner scan = new Scanner(System.in);
		Vector<int [] > vec = new Vector<int []>();
		
		for(int i = 0; i < 3; i++) {
			vec.add(new int[3]);
		}
		
	
		
		boolean turn = true;
		int win = 0;
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
				if(x >= 0 && x < 3 && y >= 0 && y < 3 ) {
					if(vec.get(y)[x] ==0) {
						vec.get(y)[x] = 1;
						turn = !turn;					
					}
				}
			}else {
				if(x >= 0 && x < 3 && y >= 0 && y < 3 ) {
					if(vec.get(y)[x] == 0) {
						vec.get(y)[x] = 2;
						turn = !turn;	
					}
				}
			}
			//가로
			for(int i=0; i<3; i++) {
				if(vec.get(i)[0] == 1 && vec.get(i)[1] == 1 && vec.get(i)[2] == 1) {
					win = 1;
				}
			}
			for(int i=0; i<3; i++) {
				if(vec.get(i)[0] == 2 && vec.get(i)[1] == 2 && vec.get(i)[2] == 2) {
					win = 2;
				}
			}
			//세로
			for(int i=0; i<3; i++) {
				if(vec.get(0)[i] == 1 && vec.get(1)[i] == 1 && vec.get(2)[i] == 1) {
					win = 1;
				}
			}
			for(int i=0; i<3; i++) {
				if(vec.get(0)[i] == 2 && vec.get(1)[i] == 2 && vec.get(2)[i] == 2) {
					win = 2;
				}
			}
			//대각\
			if(vec.get(0)[0] == 1 && vec.get(1)[1] == 1 && vec.get(2)[2] == 1) {
				win = 1;
			}
			if(vec.get(0)[0] == 2 && vec.get(1)[1] == 2 && vec.get(2)[2] == 2) {
				win = 2;
			}
			//대각/
			if(vec.get(0)[2] == 1 && vec.get(1)[1] == 1 && vec.get(2)[0] == 1) {
				win = 1;
			}
			if(vec.get(0)[2] == 2 && vec.get(1)[1] == 2 && vec.get(2)[0] == 2) {
				win = 2;
			}
			if(win != 0) {
				System.out.printf("p%d의 승리! ",win);
				break;
			}
		}//while
	}
}