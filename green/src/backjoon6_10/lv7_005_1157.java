package backjoon6_10;

import java.util.Scanner;

public class lv7_005_1157 {

	public static void main(String[] args) { // 1157
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int cnt = 0;
		int max = 0;
		int idx = -1;
		
		//97 122  아스키코드에서 a~z 번호   
		//65  90  아스키코드에서 A~Z 번호
		int arr[] = new int[26];
		int check[] = new int[26];
		int x = 0;
		for(int i=65; i<=90; i++) {
			arr[x] =  i;
			x++;
		}
		
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<26; j++) {
				char c = str.charAt(i);
			int y = c;
			if(y >= 97) y -= 32;
			if(arr[j] == y) {
				check[j] ++;
				if(check[j] > max) max = check[j];
			}
			}
		}
		for(int i=0; i<26; i++) {
			if(check[i] == max) {
				cnt ++;
				idx = i;
			}
		}
		if(cnt == 1) {
			char t = (char)arr[idx];
			System.out.println(t);
		}else {
			System.out.println("?");
		}

		
		
		
	}

}