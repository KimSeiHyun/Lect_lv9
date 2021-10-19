package lv.test_7;

import java.util.Random;
import java.util.Scanner;

class Word {
    private String word;
    
    public String getWord() {
    	return this.word;
    }
    
    public void setWord(String word) {
    	this.word = word;
    }
}

class WordSample {
   private String[] wordSampleList = { "java", "jsp", "python", "android", "spring" };
   
   public int getSize() {
	   return this.wordSampleList.length;
   }
   public String getSample(int idx) {
	   return wordSampleList[idx];
   }
   
   public void setSample(int idx , String temp) {
	   this.wordSampleList[idx] = temp;
   }
}

class WordGame {
	public static Random rn = new Random();
	public static Scanner sc = new Scanner(System.in);
	Word word = new Word();
	WordSample sample = new WordSample();
	int cnt = 0;
	public void shuffle() {
		int x = 0;
		while(x < 100) {
			int r = rn.nextInt(this.sample.getSize());
			String temp = this.sample.getSample(0);
			this.sample.setSample(0, this.sample.getSample(r));
			this.sample.setSample(r, temp);

			
			x++;
		}
	}
	
	public void print() {
		for(int i=0; i<this.sample.getSize(); i++) {
			System.out.print(this.sample.getSample(i) + " ");
		}System.out.println();
	}
	
	public void play() {
		String temp = this.sample.getSample(this.cnt);
		int r = rn.nextInt(temp.length());
		while(true) {
			for(int i=0; i<temp.length(); i++) {
				if(r != i) System.out.print(temp.charAt(i));
				else System.out.print("*");
			}System.out.println();
			System.out.println("단어를 완전히 입력해주세요 .");
			this.word.setWord(sc.next());
			if(this.word.getWord().equals(temp)) {
				this.cnt++;
				System.out.println("정답!");
				break;
			}else System.out.println("땡.");
			
		}
	}
    void run(){
    	shuffle();
    	print();
    	
    	while(true) {
    		play();
    		if(this.cnt == this.sample.getSize()) {
    			System.out.println("game clear !! ");
    			break;
    		}
    	}
    }
}

public class lv7_10 {

	public static void main(String[] args) {
	      WordGame game = new WordGame();
				game.run();

		}
	}