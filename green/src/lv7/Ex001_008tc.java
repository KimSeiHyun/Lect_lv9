package lv7;

import java.util.Random;
import java.util.Scanner;

class Word2 {
    String word;
    
    void printWord() {
    	
    }
    
}


class WordSample2 {
    String[] wordSampleList = { "java", "jsp", "python", "android", "spring" };
	
}

class WordGame2 {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	WordSample2 sample = new WordSample2();
	Word2 wordList[]; //
	int size;
	int score;
	int cnt;
	
	void setGame() {
		this.size = this.sample.wordSampleList.length;
		wordList = new Word2[this.size];
		
		int check[] = new int[this.size]; // 0 1
		
		for(int i=0; i<this.size; i++) {
			wordList[i] = new Word2();
			
			int r = rn.nextInt(this.size);
			if(check[r] == 0) {
				wordList[i].word = this.sample.wordSampleList[r];
				check[r] = 1;
			}
			else {
				i --;
			}
		}
		
	}
	
	void printWords() {
		for(int i=0; i<this.wordList.length; i++) {
			System.out.print(this.wordList[i].word + " ");
		}System.out.println();
	}
	
	
	String blindWord(String str) {
		String text = "";
		int r = rn.nextInt(str.length());
		
		for(int i=0; i<str.length(); i++) {
			if(i != r) {
				text += str.charAt(i);
			}
			else {
				text += "*";
			}
		}
		return text;
	}
	void quize() {
		for(int i=0; i<this.wordList.length; i++) {
//			this.wordList[i].printWord();
			String quize = blindWord(this.wordList[i].word);
			
			while(true) {
				System.out.println(quize);
				System.out.print("단어입력 : ");
				String answer = sc.next();
				
				if(answer.equals(this.wordList[i].word)) {
					this.score += 20;
					this.cnt ++;
					break;
				}
			else {
				 this.score -= 5;
			}
				
			}
		}
		printResult();
	}
	
	void printResult() {
		System.out.println(this.score + "점");
	}
	
	boolean end() {
		if(this.cnt == 5) return true;
		return false;
	}
    void run(){
    	setGame();
    	while(!end()) {
    		printWords();
    		quize();
    	}
    }
}

public class Ex001_008tc {

	public static void main(String[] args) {
	      WordGame2 game = new WordGame2();
				game.run();

		}
	}