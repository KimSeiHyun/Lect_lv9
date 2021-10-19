package backjoon6_10;

import java.io.IOException;
import java.util.Scanner;

public class lv8_006_2775 {

	public static void main(String[] args)throws IOException { // 2775
		
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		for(int i=0; i<t; i++) {
			int y = sc.nextInt();
			int x = sc.nextInt()-1;
			int arr2[][] = new int[17][15];
	//		if(y >= 0 && ) {
			//첫줄에 1~x까지 숫자 배치 . 
			for(int i2 = 0; i2<14; i2++) {
				arr2[0][i2] = i2+1;
			}
			
			for(int j=1; j<17; j++) {
				for(int k=0; k<15; k++) {
					int sum = 0;
					for(int a = 0; a<=k; a++) {
						sum += arr2[j-1][a];
					}
					arr2[j][k] = sum;
				}
			}
			
			
			
			
			//출력문
//			for(int i2=0; i2<17; i2++) {
//				for(int j=0; j<15; j++) {
//					System.out.print(arr2[i2][j] + " ");
//				}
//				System.out.println();
//			}
			System.out.println(arr2[y][x]);
	//		}
		}//for i
		
		
		
		
    }
}