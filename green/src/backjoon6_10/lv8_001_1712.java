package backjoon6_10;

import java.util.Scanner;

public class lv8_001_1712 {

	public static void main(String[] args) { // 1712
		Scanner sc = new Scanner(System.in);
		long arr[] = new long[3];
		for(int i=0; i<3; i++) {
			long x = sc.nextInt();
			if(x <= 2100000000 && x >= 0) {
				arr[i] = x;				
			}
		}
		long y = 1;
		long temp = 0;
		long temp2 = 0;
		int check = 0;
		if(arr[1] != arr[2]) { // arr[1] 이랑 arr[2]랑 같은수면  line20에서 by zero 런타임 에러가 뜨는걸 방지 .
			temp = arr[2] - arr[1] ;
			temp2 = arr[0] / temp;
			y = temp2+1;
		}else check = 1;
		
		if(arr[1] > arr[2] || check == 1) { // 손익분기점이 없으면 -1 출력 . 
			y = -1;
		}
		System.out.println(y);
		
		
		
		
		
	}

}