package lv.test_7;

import java.util.Random;
import java.util.Scanner;

class Words {
   private  String word;
   
   public String getWord() {
	   return this.word;
   }
   public void setWord(String word) {
	   this.word = word;
   }
}

class WordSamples {
    private String[] wordSampleList = { "java", "jsp", "python", "android", "spring" };
	
    public int getSize() {
    	return this.wordSampleList.length;
    }
    public  String getWordSample(int idx) {
    	return this.wordSampleList[idx];
    }
    
    public  void setWordSample(int idx , String temp) {
    	this.wordSampleList[idx] = temp;    	
    }
}

class WordGames {
	Words word = new Words();
	WordSamples sample = new WordSamples();
	public static Random rn = new Random();
	public static Scanner sc = new Scanner(System.in);
	private int cnt = 0;
	public void shuffle() {
		int x = 0;
		while(x < 150) {
			int r = rn.nextInt(this.sample.getSize());
			String temp = this.sample.getWordSample(0);
			
			this.sample.setWordSample(0, this.sample.getWordSample(r));
			this.sample.setWordSample(r, temp);
			x++;
		}
	}
	
	public void print() {
		for(int i=0; i<this.sample.getSize(); i++) {
			System.out.print(this.sample.getWordSample(i) + " ");
		}System.out.println();
	}
	
	public void play() {
		String temp = this.sample.getWordSample(this.cnt);
		int r = rn.nextInt(temp.length());
		while(true) {
			for(int i=0; i<temp.length(); i++) {
				if(r != i) System.out.print(temp.charAt(i));
				if(r == i) System.out.print("*");
			}System.out.println();
			System.out.print("정답 입력 : ");
			this.word.setWord(sc.next());
			if(this.word.getWord().equals(temp)) {
				this.cnt ++;
				System.out.println("정답!");
				break;
			}else System.out.println("땡!");
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

public class lv7_10s {

	public static void main(String[] args) {
	      WordGames game = new WordGames();
				game.run();

		}
	}