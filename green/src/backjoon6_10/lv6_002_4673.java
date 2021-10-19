package backjoon6_10;

import java.util.Scanner;

public class lv6_002_4673 {

	public static void main(String[] args) { // 4673
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int cnt = 0;
		int arr[] = new int[10000];
		for(int i=0; i<10000; i++) {
			arr[i] = i;
		}
		while(x <= 10000) {
			int sum = 0;
			if(x < 10) {
				sum = x+x;
			}
			else if(x >=10 && x < 100) {
				sum += x+(x/10)+(x%10);
			}
			else if(x >=100 && x < 1000) {
				sum += x+(x/100)+((x-(x/100*100))/10)+((x-(x/100*100))%10);
			}
			else if(x >=1000 && x <10000) {
				sum += x+(x/1000)+((x-(x/1000*1000))/100)+((x-(x/100*100))/10)+((x-(x/100*100))%10);
				
			}
			cnt ++;
			x++;
			for(int i=0; i<10000;i ++) {
				if(arr[i] == sum) {
					arr[i] = -1;
				}
			}
		}
		
		for(int i=0; i<10000; i++) {
			if(arr[i] != -1) {
				System.out.println(arr[i]);
			}
		}
		
		
		
	}

}