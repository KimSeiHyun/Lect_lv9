package lv6;

import java.util.Random;
import java.util.Scanner;

class Ex001_07 {
	
	final int SIZE = 10;
	int front[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int back[] = new int[SIZE];
	
}

public class Ex001_007 {

	public static void main(String[] args) {
		/*
		 * # ±â¾ï·Â °ÔÀÓ : Å¬·¡½º + º¯¼ö
		 * 1. front ¹è¿­ Ä«µå 10ÀåÀ» ¼¯´Â´Ù.
		 * 2. front ¹è¿­¿¡¼­ °°Àº Ä«µå¸¦ °ñ¶ó Ä«µåÀÇ À§Ä¡¸¦ ÀÔ·ÂÇÑ´Ù.
		 * 3. ¼±ÅÃÇÑ 2ÀåÀÇ Ä«µå°¡ °°Àº Ä«µåÀÌ¸é, back ¹è¿­¿¡ Ç¥½ÃÇÑ´Ù.
		 * 4. ¸ðµç Ä«µå°¡ µÚÁýÈ÷¸é(back¹è¿­ÀÇ 0ÀÌ »ç¶óÁö¸é) °ÔÀÓÀº Á¾·áµÈ´Ù. 
		 */
		
		Ex001_07 ex = new Ex001_07();
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		//¼ÅÇÃ
		int s = 0;
		while(s < 150) {
			int rIdx = rn.nextInt(ex.SIZE);
			int temp = ex.front[0];
			ex.front[0] = ex.front[rIdx];
			ex.front[rIdx] = temp;
			s++;
		}
		int cnt = 0;
		
		
		while(true) {
			System.out.println("front");
			for(int i=0; i<ex.SIZE; i++) {
				System.out.print(ex.front[i] + " ");
			}System.out.println();
			System.out.println("back");
			for(int i=0; i<ex.SIZE; i++) {
				System.out.print(ex.back[i] + " ");
			}System.out.println();
			
			if(cnt == 5) {
				System.out.println("¸ðµç Ä«µå¸¦ ´Ù ¸Â­Ÿ´Ù !! ");
				break;
			}
			System.out.print("Ä«µåÀÇ À§Ä¡ ÀÔ·Â :");
			int sel1 = sc.nextInt();
			int sel2 = sc.nextInt();
			if(sel1 == sel2) {
				System.out.println("°°Àº Ä«µå¸¦ ¼±ÅÃÇÒ ¼ö ¾ø½À´Ï´Ù. ");
				continue;
			}
			if(sel1 <0 || sel1 >= ex.SIZE ||sel2 <0 || sel2 >= ex.SIZE ) {
				System.out.println("ÀÔ·ÂÇÑ Ä«µåÀÇ À§Ä¡°¡ ¹þ¾î³µ½À´Ï´Ù.");
				continue;
			}
			if(sel1 != sel2 && ex.front[sel1] == ex.front[sel2]) {
				ex.back[sel1] = ex.front[sel1];
				ex.back[sel2] = ex.front[sel2];
				System.out.println("Ä«µå¸¦ ¸Â­Ÿ´Ù !");
				cnt ++;
			}

		}//while(true)

	}

}
