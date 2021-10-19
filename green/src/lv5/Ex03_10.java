package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex03_10 {

	public static void main(String[] args) {
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
		
		for(int i=0; i<check.length; i++) {
			check[i] = -1;
		}

		char a;
		while (true) {
			int count = 0;
			System.out.println("뜻 : " + meaning);
			System.out.println("score : " + score);
			System.out.print("문제 : ");
			for (int i = 0; i < size; i++) { //힌트를 받거나 맞춘거면 알파벳표시, 아니면 *표시 
				if(check[i] == -1) {
					System.out.print("*");
				}
				else {
					a = word.charAt(i);
					System.out.print(a);
				}
			}
			System.out.println();
			
			
			for(int i=0; i<size;  i++) {
				if(check[i] == 0) {
					count ++;
				}
			}
			
			if(count == size) {// 다 맞추거나 다 공개되면 종료 . 
				System.out.println("game clear !! ");
				break;
			}
			
			System.out.println("영어단어를 입력하세요 >>> ");
			String me = sc.next();
			int size2 = me.length();
			int cnt = 0;
			for(int i=0; i<size2; i++) {
				if(size2 <= size) {
					if(word.charAt(i) == me.charAt(i) && check[i] == -1) {
					check[i] = 0;
					cnt ++;
					}
				}else {
					System.out.println("입력하신 철자수가 초과됐습니다.");
					break;
				}
			}
			if(cnt == 0) {
				int c = 0;
				int x = -1;
				while(c == 0) {
				int ranNum2 = rn.nextInt(size);
				for(int i=0; i<size; i++) {
					if(check[ranNum2] == -1 && i == ranNum2 ) {
						check[i] = 0;
						c = 1;
						x = i;
						score -= 5;
						System.out.println("하나도 못맞췃으므로 5점이 깍이고 철자가 하나 공개됩니다.");
					}
				}
				
				
				}
				for(int i=0; i<size; i++) {
					if(word.charAt(i) == word.charAt(x)) {
						check[i] = 0;
					}
				}
			}

			
		}//while 

		
	}

}
