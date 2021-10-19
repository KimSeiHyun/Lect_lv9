package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex01_06 {

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
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		int x = 0;
		while(x<100) {//셔플
			int a = rn.nextInt(4);
			int b = rn.nextInt(4);
			String temp = words[a];
			words[a] = words[b];
			words[b] = temp;
			x++;
		}
		for(int i=0; i<4; i++) {//셔플이 잘 됫는지 출력
			System.out.print(words[i] + " ");
		}System.out.println();
		x = 0;
		
		while(x <4) {
			int a = rn.nextInt(words[x].length()); //문제의 길이 안에서 무작위 index 설정 .

			int z = 0;
			while (z < 1) {// 문제가 틀려도 *값이 바뀌지 않게 while 안에서 랜덤 a 를 꺼냄 . 
							//틀리면 다시 랜덤 a는 그대로인채로 다시 순환  맞추면 x + 1 되서 정상진행 
			String temp = "";
			if(a == 0) {
				temp += "*";
				temp +=words[x].substring(a+1);
			}
			else if( a == words[x].length()) {
				temp += words[x].substring(a-1);
				temp += "*";
			}
			else {
				temp += words[x].substring(0,a);
				temp += "*";
				temp += words[x].substring(a+1);
			}
			System.out.println("문제 : " +temp);
			System.out.print("입력 : ");
			String s = sc.next();

			if(words[x].equals(s)) {
				x++;
				z = 1;
			}
			
			}//w(z)
		}//w(x)
		
		
	}

}
