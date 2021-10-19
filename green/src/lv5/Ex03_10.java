package lv5;

import java.util.Random;
import java.util.Scanner;

public class Ex03_10 {

	public static void main(String[] args) {
		// ¹®Á¦) ¿µ¾î´Ü¾î ¸ÂÃß±â
		// ¿µ¾î´Ü¾î°¡ ÀüºÎ * ·Î Ç¥½ÃµÈ´Ù.
		// ¿µ¾î´Ü¾î¸¦ ÀÔ·Â¹Ş°í Æ²¸±¶§¸¶´Ù ·£´ıÀ¸·Î ÇÑ±ÛÀÚ¾¿ ¹ş°ÜÁø´Ù. (Á¡¼ö´Â 5Á¡¾¿ °¨Á¡)
		// (Á¶°Ç) ¸¸¾à¿¡ °°Àº Ã¶ÀÚ°¡ ¿©·¯°³¸é ÇÑ¹ø¿¡ ¹ş°ÜÁø´Ù.
		// ÀüºÎ ¹ş°ÜÁö°Å³ª ¸ÂÃß¸é Á¾·á
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int score = 100;
		String word = "performance";
		String meaning = "°ø¿¬";
		int size = word.length();
		int check[] = new int[size]; // ÈùÆ® Ã¼Å©¸¦ ÅëÇØ¼­ È®ÀÎÇÒ¼öÀÖ´Ù.
		
		for(int i=0; i<check.length; i++) {
			check[i] = -1;
		}

		char a;
		while (true) {
			int count = 0;
			System.out.println("¶æ : " + meaning);
			System.out.println("score : " + score);
			System.out.print("¹®Á¦ : ");
			for (int i = 0; i < size; i++) { //ÈùÆ®¸¦ ¹Ş°Å³ª ¸ÂÃá°Å¸é ¾ËÆÄºªÇ¥½Ã, ¾Æ´Ï¸é *Ç¥½Ã 
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
			
			if(count == size) {// ´Ù ¸ÂÃß°Å³ª ´Ù °ø°³µÇ¸é Á¾·á . 
				System.out.println("game clear !! ");
				break;
			}
			
			System.out.println("¿µ¾î´Ü¾î¸¦ ÀÔ·ÂÇÏ¼¼¿ä >>> ");
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
					System.out.println("ÀÔ·ÂÇÏ½Å Ã¶ÀÚ¼ö°¡ ÃÊ°úµÆ½À´Ï´Ù.");
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
						System.out.println("ÇÏ³ªµµ ¸ø¸Â­ŸÀ¸¹Ç·Î 5Á¡ÀÌ ±ïÀÌ°í Ã¶ÀÚ°¡ ÇÏ³ª °ø°³µË´Ï´Ù.");
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
