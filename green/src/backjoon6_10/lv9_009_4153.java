package backjoon6_10;

import java.util.Scanner;

public class lv9_009_4153 {

	public static void main(String[] args) { // 4153
		Scanner sc= new Scanner(System.in);
		// 피타고라스의 정리 : 
		//변 a,b  빗변 c      c*c = (a*a) + (b*b) 
		while(true) {
			int arr[] = new int[3];
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			arr[0] = a;
			arr[1] = b;
			arr[2] = c;
			
			int max = 0;
			int idx = -1;
			for(int i=0; i<3; i++) {
				if(max < arr[i] ) {
					idx = i;
					max = arr[i];
				}
			}
			
			int sum =0;
			for(int i=0; i<3; i++) {
				if(i != idx) {
					sum += arr[i] * arr[i];
				}
			}
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}

			
			if(max*max == sum) {
				System.out.println("right");
			}else System.out.println("wrong");
		}

		
		
    }
}