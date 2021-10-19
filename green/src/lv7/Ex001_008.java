package lv7;

import java.util.Random;
import java.util.Scanner;

class Word {
    String word;
}

class WordSample {
    String[] wordSampleList = { "java", "jsp", "python", "android", "spring" };
	
}

class WordGame {
	Word w = new Word();
	WordSample ws = new WordSample();
	Random rn = new Random();
	Scanner sc = new Scanner(System.in);
	int rNum = rn.nextInt(ws.wordSampleList[this.cnt].length());
	int tempNum;
	int cnt = 0;
	void shuffle() {
		int x = 0;
		while (x < 100) {
			int rNum = rn.nextInt(ws.wordSampleList.length);
			String temp = ws.wordSampleList[0];
			ws.wordSampleList[0] = ws.wordSampleList[rNum];
			ws.wordSampleList[rNum] = temp;
			x++;
		}
	}
	
	void print() {
		for(int i=0; i<ws.wordSampleList[this.cnt].length(); i++) {
			if(i == rNum ) {
				System.out.print("*");
			}else System.out.print(ws.wordSampleList[this.cnt].charAt(i));
		}System.out.println();
	}
	
	void play() {
		while(true) {
			System.out.print("정답 입력 : ");
		w.word = sc.next();
		if(w.word.equals(ws.wordSampleList[this.cnt])) {
			System.out.println("정답 !! ");
			this.cnt++;
			break;
		}
		else {
		System.out.println("땡.");
		print();
		}
		}
		this.rNum = rn.nextInt(ws.wordSampleList[this.cnt].length());
	}
    void run(){
    	shuffle();
    	while(true) {
    		print();
    		play();
    		if(this.cnt == ws.wordSampleList.length) {
    			System.out.println("game clear !! ");
    			break;
    		}
    	}
    }
}

public class Ex001_008 {

	public static void main(String[] args) {
	      WordGame game = new WordGame();
				game.run();

		}
	}