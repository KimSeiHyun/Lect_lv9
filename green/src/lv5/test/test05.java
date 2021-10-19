package lv5.test;

import java.util.Random;
import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		//시작시간 02 : 03
		//종료시간 02 : 43
		//소요시간 00 : 40
		
		// 문제) 영어단어 맞추기
		// 영어단어가 전부 * 로 표시된다.
		// 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
		// (조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다.
		// 전부 벗겨지거나 맞추면 종료
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int check[] = new int[size]; // 힌트 체크를 통해서 확인할수있다.
		
		while(true) {
			System.out.print("문제  :");
			for(int i=0; i<size; i++) {
				if(check[i] == 0) {
					System.out.print("*");
				}
				else {
					char c = word.charAt(i);
					System.out.print(c);
				}
			}
			System.out.println();
			System.out.println("단어의 뜻 : " +meaning);
			System.out.println("scroe : " +score);
			
			
			System.out.println("정답 입력 : ");
			String answer = sc.next();
			int check2 = 0;
			for(int i=0; i<answer.length(); i++) {
				if(word.charAt(i) == answer.charAt(i) && check[i] == 0) {
					check[i] = 1;
					check2 = 1;
					for(int j=0; j<size; j++) {
						if(answer.charAt(i) == word.charAt(j)) {
							check[j] = 1;
						}
					}
				}
			}
			if(check2 == 0) {
				System.out.println("틀렷으므로 점수가 5점 깍입이고 철자 하나가 오픈됩니다.");
				score -= 5;
				while(true) {
					int r = rn.nextInt(size);
					if(check[r] == 0) {
						check[r] = 1;
						for(int i=0; i<size; i++) {
							if(word.charAt(i) == word.charAt(r)) {
								check[i] = 1;
							}
						}
						break;
					}
				}
			}
			int cnt = 0;
			for(int i=0; i<size; i++) {
				if(check[i] == 1) {
					cnt ++;
				}
			}
			if(cnt == size) {
				System.out.println("게임이 종료됩니다. ");
				System.out.println("점수 : " + score + "점");
				break;
			}
			if(answer.equals(word)) {
				System.out.println("정답!! 게임이 종료됩니다.");
				System.out.println("점수 : " + score + "점");
				break;
			}

		}//while

	}

}
