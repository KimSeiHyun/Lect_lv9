package lv.test_3;

import java.util.Random;
import java.util.Scanner;

public class lv3_19 {

	public static void main(String[] args) {
		/*
		 * # ±â¾ï·Â °ÔÀÓ
		 * 1. °°Àº ¼ıÀÚÀÇ À§Ä¡¸¦ 2°³ ÀÔ·ÂÇØ Á¤´äÀ» ¸ÂÃß´Â °ÔÀÓÀÌ´Ù.
		 * 2. Á¤´äÀ» ¸ÂÃß¸é back¿¡ ÇØ´ç ¼ıÀÚ¸¦ ÀúÀåÇØ,
		 *    back¿¡ ¸ğµç ¼ö°¡ Ã¤¿öÁö¸é °ÔÀÓÀº Á¾·áµÈ´Ù.
		 * ¿¹)
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		 * ÀÔ·Â1 : 0
		 * ÀÔ·Â2 : 1
		 * 
		 * front = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
		 * back  = [1, 1, 0, 0, 0, 0, 0, 0, 0, 0]
		 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		// ¼ÅÇÃ(shuffle)
		int i = 0;
		while(i < 1000) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			i += 1;
		}
		int x = 0;
		while(true) {
			int check = 0;
			int win = 0;
		for(int j=0; j<10; j++) {
			System.out.print(front[j] + " ");
		}
		System.out.println();
		for(int j=0; j<10; j++) {
			System.out.print(back[j] + " ");
		}
		System.out.println();
		System.out.println("°°Àº ¼ıÀÚ°¡ ÀÖ´Â ÀÎµ¦½º¸¦ ÀÔ·Â(Ã¹¹øÂ°) . ");
		int sel1 = sc.nextInt();
		System.out.println("°°Àº ¼ıÀÚ°¡ ÀÖ´Â ÀÎµ¦½º¸¦ ÀÔ·Â(µÎ¹øÂ°) . ");
		int sel2 = sc.nextInt();
		
		for(int j=0; j<10; j++ ) {
			if(front[sel1] == back[j]) {
				check = -1;
			}
		}
		if(check == -1) {
			System.out.println("ÀÌ¹Ì ¼±ÅÃÇÑ °ªÀÔ´Ï´Ù.");
			continue;
		}
			if(front[sel1] == front[sel2]) {
				back[x] = front[sel1];
				back[x+1] = front[sel2];
				x+=2;
			}
		for(int j=0; j<10; j++) {
			if(back[j] != 0) {
				win++;
			}
		}
		if(win == 10) {
			System.out.println("¸ğµÎ ´Ù ¸Â­Ÿ½À´Ï´Ù ! ");
			break;
		}

		}//w
	}

}
