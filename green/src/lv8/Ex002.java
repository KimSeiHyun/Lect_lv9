package lv8;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		//컬렉션 사용시 , 제네릭 타입으로 일반 자료형의 배열을 객체처럼 지정할 수 있다.
		ArrayList<int[]> arr = new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			arr.add(new int[i+1]);
			System.out.println(arr.get(i));
	
		}
		System.out.println("check");
		// 틱택토 만들기 
		ArrayList<int[]> tic = new ArrayList<>();
		Scanner  sc = new Scanner(System.in);
		
		tic.add(new int[9]);
		
		for(int i=0; i<tic.size(); i++) {
			System.out.println(tic.get(i));
			for(int j=0; j<tic.get(i).length; j++) {
				System.out.print(tic.get(i)[j] + " ");
				if( j %3 == 2) {
					System.out.println();
				}
			}
		}
		
		int turn = 1;
		int win = 0;
		
		while(true) {
			System.out.println("-----틱택톡-----");
			for(int i=0; i<tic.get(0).length; i++) {
				if(tic.get(0)[i] == 1) {
					System.out.print("[O] ");
				}
				else if(tic.get(0)[i] == 2) {
					System.out.print("[X] ");
				}
				else 
					System.out.print("[ ] ");
				if( i %3 == 2) {
					System.out.println();
				}
			}System.out.println("--------------");
			if(win != 0 ) {
				System.out.printf("p%d 의 승리 !! ",win);
				break;
			}
			System.out.printf("p%d의 차례입니다 . ",turn);
			int selIdx = sc.nextInt();
			
			if(selIdx >= 0 && selIdx < tic.get(0).length) {
				if(tic.get(0)[selIdx] == 0) {
					tic.get(0)[selIdx] = turn;
				}else {
					System.out.println("이미 선택된 칸입니다.");
					continue;
				}
				
			}
			else {
				System.out.println("인덱스의 범위를 확인해주세요 . ");
				continue;
			}
			
			//가로
			for(int i=0; i<tic.get(0).length; i+=3) {
				if(tic.get(0)[i] == turn && tic.get(0)[i+1] == turn
						&& tic.get(0)[i+2] == turn) {
					win = turn;
				}
			}
			//세로
			for(int i=0; i<3; i++) {
				if(tic.get(0)[i] == turn && tic.get(0)[i+3] == turn
						&& tic.get(0)[i+6] == turn) {
					win = turn;
				}
			}
			//대각/
			if(tic.get(0)[2] == turn && tic.get(0)[4] == turn
					&& tic.get(0)[6] == turn) {
				win = turn;
			}
			//대각\
			if(tic.get(0)[0] == turn && tic.get(0)[4] == turn
					&& tic.get(0)[8] == turn) {
				win = turn;
			}
			
			
			
			
			turn = turn == 2 ? 1 : 2;
		}//while(true)
		
		

	}

}
