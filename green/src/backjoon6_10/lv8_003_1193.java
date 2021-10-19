package backjoon6_10;

import java.util.Scanner;

public class lv8_003_1193 {

	public static void main(String[] args) { // 1193
		Scanner sc = new Scanner(System.in);

			
		
		int sel = sc.nextInt();
		int a = 1;
		int b = 1;
		int check = 0;
		int x = 1;
		
		while(true) {

			if(x == sel) {
				break;
			}
			
			if(a == 1 &&  b %2 == 1 && check == 0) { //맨위에서 오른쪽으로
				b++;
				x++;
				check = 1;
				continue;
			}
			if(check == 1 && b >= 2) { //왼쪽아래 대각선으로 
				a++;
				b--;
				x++;
				continue;
			}
			
			if(b == 1 && a%2 == 0) check = 2;
			if(b == 1 && a%2 == 0 &&check == 2) { //맨왼쪾에서 아래로
				a ++;
				x ++;
				check = 3;
				continue;
			}
			if(check == 3 && a >= 2) { // 오른쪽 위 대각선으로 
				a--;
				b++;
				x++;
				continue;
			}
			if(a == 1) check = 0;
			

		}//while true
				

		System.out.printf("%d/%d",a,b);

	}

}