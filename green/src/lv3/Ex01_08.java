package lv3;

import java.util.Scanner;

public class Ex01_08 {

	public static void main(String[] args) {
		// 문제 3) 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장(위치는 앞에서 부터  저장)
	    // 2번문제와 조금 다름
		// 예) c = [49, 51, 17, 0, 0]
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = { 10, 49, 51, 36, 17 };
		int c[] = { 0,0,0,0,0 };
		System.out.println("문제3 : 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장(위치는 앞에서 부터  저장)");
		

		int i2 = -1;
		for (int i= 0; i <5; i++) {
			
			if(a[i] %2 == 1  ) {	
				c[i] += a[i];		
			}

			System.out.println(c[i]);
			
		}

	}

}
