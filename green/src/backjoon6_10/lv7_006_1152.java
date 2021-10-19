package backjoon6_10;

import java.util.Scanner;

public class lv7_006_1152 {

	public static void main(String[] args) {//1152
		Scanner sc = new Scanner(System.in);
		String c = " ";
		int cnt = 0;
		String str = sc.nextLine();
		String temp[] = str.split(" ");
		int x = temp.length;
		
		for(int i=0; i<temp.length; i++) {
			if(temp[i].length() == 0) {
				x--;
			}
		}
		
		System.out.println(x);
	}

}