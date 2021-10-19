	package lv8;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex002_001tc {

	public static void main(String[] args) {
		ArrayList<int[]> tic = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			tic.add(new int[3]);
		}
		
		int turn = 1;
		int win = 0;
		while(true) {
			//print
			for(int i=0; i<tic.size();i ++) {
				for(int j=0; j<tic.get(i).length; j++) {
					System.out.print(tic.get(i)[j] + " ");
				}
				System.out.println();
			}
			
			// end 
			if(win != 0) {
				System.out.printf("p%d win !! ",win);
				break;
			}
			//input
			System.out.printf("p%d�� Y : ",turn);
			int y = sc.nextInt();
			System.out.printf("p%d�� X : ",turn);
			int x = sc.nextInt();
			
			//check 
			if(y <0 || y >= tic.size() || x<0 || x>=tic.get(0).length
					|| tic.get(y)[x] != 0) continue;
			
			// mark
//			tic.get(y)[x] = turn;
			int temp[] = tic.get(y);
			temp[x] = turn;
			tic.set(y, temp);
			
			// win check
			//����
			for(int i=0; i<tic.size(); i++) {
				int cnt = 0;
				for(int j=0; j<tic.get(i).length; j++) {
					if(tic.get(i)[j] == turn) cnt++;
				}
				if(cnt == 3) win = turn;
			}
			//����
			for(int i=0; i<tic.size(); i++) {
				int cnt = 0;
				for(int j=0; j<tic.get(i).length; j++) {
					if(tic.get(j)[i] == turn) cnt ++;
				}
				if(cnt == 3) win =turn;
			}
			//�밢\
			int cnt = 0;
			for(int i=0; i<tic.size(); i++) {
				if(tic.get(i)[i] == turn) cnt ++;
			}
			if(cnt == 3) win = turn;
			//�밢/
			
			cnt = 0;
			for(int i=0; i<tic.size(); i++) {
				if(tic.get(i)[tic.get(i).length-i -1] == turn) cnt ++;
			}
			if(cnt == 3) win = turn;

			//turn 
			turn = turn == 1 ? 2 : 1;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
