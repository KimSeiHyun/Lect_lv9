package backjoon6_10;

import java.util.Scanner;

public class lv7_003_10809 {

	public static void main(String[] args) { // 10809
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int arr[] = new int[26];
		int check[] = new int[26];
		int x = 0;
		for(int i=97; i<=122; i++) {
			arr[x] = i;
			x++;
		}
		for(int j=0; j<str.length(); j++) {
			for(int i=0; i<26; i++) {
				char s = str.charAt(j);
				int y = s;
				if(y == arr[i]) {
					arr[i] = j;
					check[i] = 1;
				}
			}		
		}
		
		for(int i=0; i<26; i++) {
			if(check[i] == 0) {
				arr[i] = -1;
			}
		}
		for(int i=0; i<26; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
	}

}