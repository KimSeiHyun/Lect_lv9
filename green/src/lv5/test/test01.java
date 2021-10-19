package lv5.test;

import java.util.Random;
import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		/*
		 * # 타자연습 게임[2단계]
		 * 1. 문제를 섞는다.(shuffle)
		 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
		 * 예)
		 * 문제 : mys*l
		 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		 * 문제 : *sp
		 * 입력 : jsp
		 * ...
		 */
		//별은 맞출때까지 위치 고정.
		//시작시간 11 : 23
		//종료시간 11 : 45
		//소요시간 00 : 22
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};
		int x = 0;
		while(x < 100) {
			int ran1 = rn.nextInt(4);
			String temp = words[0];
			words[0] = words[ran1];
			words[ran1] = temp;
			
			x++;
		}
		
		for(int i=0; i<4; i++) {
			System.out.print(words[i] + " ");
		}System.out.println();
		
		int cnt = 0;
		
		while (cnt < 4) {
			int r = rn.nextInt(words[cnt].length());
			for(int i=0; i<words[cnt].length(); i++) {
				if ( i == r) {
					System.out.print("*");
				}else {
					System.out.print(words[cnt].charAt(i));
					
				}
			}System.out.println();
			System.out.println("단어입력 : ");
			String str = sc.next();
			if(str.equals(words[cnt])) {
				cnt++;
			}
			if(cnt ==4) System.out.println("game clear !");
		}
		

		
	}

}
