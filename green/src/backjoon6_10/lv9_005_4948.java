package backjoon6_10;

import java.util.Scanner;

public class lv9_005_4948 {

	public static void main(String[] args) { // 4948
		Scanner sc= new Scanner(System.in);
		while(true) {
		int x = sc.nextInt();
		if(x == 0) break;
		int y = x*2;
		int arr[] = new int[250000];

		for(int i=0; i<=y; i++) {
			arr[i] = i;
		}
		
		for(int i=2; i<=y; i++) {
			if(arr[i] == 0) continue;
			
			for(int j=i*2; j<=y; j+=i) {
				arr[j] = 0;
			}
		}
		int cnt = 0 ;
		for(int i=x+1; i<=x*2; i++ ) {
		//	System.out.printf(" i : %d    ¼Ò¼ö : %d \n",i ,arr[i]);
			if(arr[i] != 0 ) {
				cnt ++;
			}
		}
		if(x != 0) {
			System.out.println(cnt);	
		}
		}
		
    }
}