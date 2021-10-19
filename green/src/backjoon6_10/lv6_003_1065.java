package backjoon6_10;

import java.util.Scanner;

public class lv6_003_1065 {

	public static void main(String[] args) { // 1065
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = x;
		int z = 0;
		int cnt = 0;
		while (z <= x) {
			if(z >= 1 && z <= 99) {
				cnt ++;
			}
			if(z >= 100 && z< 1000) {
				int temp1 = (z-(z/100*100))%10;
				int temp2 = (z-(z/100*100))/10;
				int temp3 = z/100;
				int a = temp1 - temp2;
				int b = temp2 - temp3;
				if(a == b) {
					cnt++;
				}
			}

			z++;
		}
		
		System.out.println(cnt);
		
		
	}

}