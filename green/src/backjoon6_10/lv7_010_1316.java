package backjoon6_10;

import java.util.Scanner;

public class lv7_010_1316 {

	public static void main(String[] args) { // 1316
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int cnt = 0;
		for(int i=0; i<x; i++) {//i
			int count = 0;
			String str = sc.next();
			
			for(int j=0; j<str.length(); j++) {//j
				int check = 0;
				int check2 = 0;
				String temp = str.charAt(j)+"";
				
				for(int k= 0; k<str.length(); k++) {//k
					if(temp.equals(str.charAt(k)+"")) {
						check = 1;
					}
					if(check == 1 ) {
						if(temp.equals(str.charAt(k)+"")) {
							
						}else {
							check2 = 1;
						}
						
					}
					if(check2 == 1) {
						for(int a = 0; a<j; a++) {
							String temp2 = str.charAt(a)+"";
							if(k <str.length()-1 && temp2.equals(str.charAt(k+1)+"")) {
								count = 1;

							}
						}
						check2 = 3;
					}
				}//k
			}//j
			if(count == 0) {
				cnt ++;
			}
		}//i
		
		
		System.out.println(cnt);
		
		
		
	}

}