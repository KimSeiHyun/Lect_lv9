package backjoon6_10;

import java.io.IOException;
import java.util.Scanner;

public class lv8_007_2839 {

	public static void main(String[] args) { // 2839
			
			Scanner sc= new Scanner(System.in);
			// 3 5 8 
			int a = 3;
			int b = 5;
			int cnt = 0;
			int check = 0;
			int x = sc.nextInt();
			int temp = x;
			while(true) {
				
				if(x %10 == 9) {
					if(x < 10) {
						System.out.println(x/3);
					}
					if(x > 10) {
						System.out.println((x/10*2) +3);
					}
					break;
				}
				if(x %10 == 8) {
					if(x < 10) {
						System.out.println(2);
					}
					if(x > 10) {
						System.out.println((x/10*2)+2);
					}
					break;
				}
				if(x %10 == 7) {
					if(x < 10) {
						System.out.println(-1);
						break;
					}
					if(x > 10) {
						if((x/10)%2 == 0) { // 27 5- 47  67
							temp -= 5;
							cnt++;
							if(temp == 12) {
								System.out.println(cnt+4);
								break;
							}
						}
						if((x/10)%1 == 0) { // 17  37  57
							temp -= 5;
							cnt++;
							if(temp == 12) {
								System.out.println(cnt+4);
								break;
							}
						}
					}
				}
				if(x %10 == 6) {
					if(x < 10) {
						System.out.println(2);
					}
					if(x > 10) {
						System.out.println((x/10*2)+2);
					}
					break;
				}
				if(x %5 == 0) {
					System.out.println(x/5);
					break;
				}
				if(x %10 == 4) {
					if(x < 10) {
						System.out.println(-1);
						break;
					}
					if(x > 10) {
						temp -= 5;
						cnt++;
						if(temp == 9) {
							System.out.println(cnt+3);
							break;
						}

					}
				}
				if(x %10 == 3) {
					if(x < 10) {
						System.out.println(1);
						break;
					}
					if(x > 10) {
						temp -= 5;
						cnt ++;
						if(temp == 3) {
							System.out.println(cnt+1);
							break;
						}
					}
				}
				if(x %10 == 2) {
					if(x < 10) {
						System.out.println(-1);
						break;
					}
					if(x > 10) {
						if(temp == 12) {
							System.out.println(cnt+4);
							break;
						}
						temp -= 5;
						cnt ++;
					}
				}
				if(x %10 == 1) {
					if(x < 10) {
						System.out.println(-1);
						break;
					}
					if(x > 10) {
						temp-=5;
						cnt++;
						if(temp == 6) {
							System.out.println(cnt+2);
							break;
						}
						
					}
				}

				
				
				
				
				
			}
			
			
			
			
			
			

			
	    }
	}