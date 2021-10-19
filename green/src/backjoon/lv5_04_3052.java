package backjoon;

import java.util.Scanner;

public class lv5_04_3052 {

	public static void main(String[] args) { // 3052
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int cnt = 0;
		for(int i=0; i<10; i++) {
			int a =sc.nextInt();
			int c = a%42;
			arr[i] = c;
		}
		
		for(int i=0; i<10; i++) {
			int check = 0;
			for(int j=0; j<10; j++) {
				if(i != j && arr[i] == arr[j] ) {
					check = 1;
					arr[j] = -1;
				}
			}
		}
		
		for(int i=0; i<10; i++) {
			if(arr[i] != -1) {
				cnt ++;
			}
		}
		
		System.out.println(cnt);
		
		
		
		
	}

}