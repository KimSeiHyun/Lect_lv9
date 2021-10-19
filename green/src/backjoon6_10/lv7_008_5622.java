package backjoon6_10;

import java.util.Scanner;

public class lv7_008_5622 {

	public static void main(String[] args) { // 5622
		Scanner sc = new Scanner(System.in);
		int x = 0;
		//97 122  아스키코드에서 a~z 번호   
		//65  90  아스키코드에서 A~Z 번호
		
		int arr[] = new int[26];
		
		for(int i=65; i<=90; i++) {
			arr[x] = i;
			x++;
		}
		int total = 0;
		String str = sc.next();
		for(int i=0; i<str.length(); i++) {
			int time = 2;
			int cnt = 1;
			char c = str.charAt(i);
			int y = c;
			for(int j=0; j<26; j++) {
				if((j+1)%3 == 1 && j != 0 && j<18) {
					cnt++;
				}
				if(j == 19) cnt ++;
				if(j == 22) cnt ++;
				if(arr[j] == y) {
					total += time+cnt;
				}
			}
			if(c == '1') {
				total += 2;
			}
			else if(c == '0') {
				total += 11;
			}
		}
		
		System.out.println(total);
	}

}