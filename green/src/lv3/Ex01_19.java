package lv3;

import java.util.Random;

public class Ex01_19 {

	public static void main(String[] args) {
		//¼ÅÇÃ
		//¼ÅÇÃ ==> ¹è¿­¾ÈÀÇ °ªµéÀ» ·£´ıÀ¸·Î ¼¯´Â°Í
		// ¹æ¹ı ==> 1) ·£´ıÀÎµ¦½º 1~ 4¸¦  »Ì´Â´Ù.
		// 2) ·£´ıÀÎµ¦½ºÀÇ °ª°ú 0¹øÀÎµ¦½º °ª°ú ±³È¯ 
		// 3) À§ ½ÄÀ» 100¹ø¹İº¹ 
		// int arr[5] = {10, 20, 30, 40, 50};
		// ¿¹ ) ·£´ıÀÎµ¦½º --> 3 ==>  {40, 20, 30, 10, 50};
		// ¿¹ ) ·£´ıÀÎµ¦½º --> 1 ==>  {20, 40, 30, 10, 50};
		// ¿¹ ) ·£´ıÀÎµ¦½º --> 4 ==>  {50, 40, 30, 10, 20};
		int arr[] = { 10, 20, 30, 40, 50 };
		
		Random rn = new Random();
		int t= 0;
		int x = arr[0];
		int y = 0;
		while (t < 100) {
			int a = rn.nextInt(5);
			for(int i=0; i<5; i++) {
				if (a == 0 ) {
					
				}
				else if ( a== 1) {
					arr[a] =  x;
					arr[0] = arr[a];
				}
				else if ( a== 2) {
					
				}
				else if ( a== 3) {
					
				}
				else if ( a== 4) {
					
				}
				System.out.print(arr[i]+ " ");
			}
			System.out.println();

			

			t++;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
