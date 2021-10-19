package lv3.test;

import java.util.Random;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		/*
		 * #  1 to 4
		 * 1. arr¹è¿­¿¡ 1~4 »çÀÌÀÇ ¼ıÀÚ¸¦ Áßº¹¾øÀÌ ÀúÀåÇÑ´Ù.
		 * 2. »ç¿ëÀÚ´Â 1ºÎÅÍ ¼ø¼­´ë·Î ÇØ´ç À§Ä¡ °ªÀ» ÀÔ·ÂÇÑ´Ù.
		 * 3. Á¤´äÀ» ¸ÂÃß¸é ÇØ´ç °ªÀº 9·Î º¯°æµÇ¾î ¸ğµç °ªÀÌ 9°¡ µÇ¸é °ÔÀÓÀº Á¾·áµÈ´Ù.
		 * ¿¹)
		 * 4 2 3 1
		 * ÀÔ·Â : 3
		 * 4 2 3 9
		 * ÀÔ·Â : 1
		 * 4 9 3 9
		 * ...
		 */
		// ½ÃÀÛ 02:04
		// Á¾·á 06:09
		// ¼Ò¿ä 4½Ã°£4ºĞ 
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[4];
		int arr2[] = new int[4];
		int arr3[] = {1,2,3,4};
		
		int cnt = 1;
		int score = 0;
		
		boolean t = true;
		int a = 0;
		while(a<4) {
			int num = ran.nextInt(4)+1;
			if(arr2[num-1] == 0) {
				arr[a] = num;
				arr2[num-1] = 1;
				a++;
			}
		}

		while(t) {
			System.out.print("À§Ä¡°ª : ");
			for(int i=0; i<4; i++) {
				System.out.print(arr3[i] + " ");
			}
			System.out.println();
			System.out.print("ÀúÀå°ª : ");
			for(int i=0; i<4; i++) {
				System.out.print(arr[i] + " ");
			}
			 if( score >= 36) {
				 System.out.println();
				 System.out.println("Á¤´äÀ» ´Ù ¸Â­Ÿ½À´Ï´Ù. °ÔÀÓÀ» Á¾·áÇÕ´Ï´Ù.");
				 break;
			 }
			System.out.println();
			System.out.println("ÀÛÀº¼öºÎÅÍ ÀúÀå°ªÀÇ À§Ä¡°ªÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä . ");
			int in = sc.nextInt()-1;
			if (in <0 || in > 3 ) {
				System.out.println("ÁöÁ¤µÈ ¹üÀ§°¡ ¹ş¾î³µ½À´Ï´Ù.");
				continue;
			}

			 if(arr[in] == cnt ) {
				 cnt++;
				 arr[in] =9;
				 score += 9;
				 System.out.println("Á¤´ä ! ");
			 }
			 else { 
				 System.out.println("Æ²·È½À´Ï´Ù ! ");
			 }
			 		 
		}
		

		
	}

}
