package lv3;

import java.util.Random;

public class Ex01_19tc {

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
		int arr[] = { 10, 20 , 30, 40, 50 };
		
		Random rn = new Random();
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + "  ");
		}
		
		for(int i=0; i<1000; i++) {
			int rIdx = rn.nextInt(5); // 0~4
			
			int temp = arr[0];
			arr[0] = arr[rIdx];
			arr[rIdx] = temp;
		}
		
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + "  ");
		}
		
		
		
	}

}
