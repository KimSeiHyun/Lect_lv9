package lv1;

public class Ex13_6tc {

	public static void main(String[] args) {
        //문제1) 9의 배수중 일의 자리가 6인 첫번째 배수 출력 ==> 답 : 36
		boolean run = true;
		int n = 1 ;
		while (run) {
			if(n % 9 == 0 && n % 10 == 6) {
				 System.out.println(n);
				 run = false;
			}
			n++; // n += 9;
		}
		//문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 ==> 답 : 63
		run = true;
		n = 1 ;
		while (run) {
			if(n % 9 == 0 && n / 10 == 6) {
				 System.out.println(n);
				 run = false;
			}
			n++; // n += 9;
		}
		//문제3) 8의 배수중  150보다 작고 150 에 가장 가까운수를 출력 ==> 답 : 144
		n = 150 ;
		run = true;
		while (run) {
			if (n % 8 == 0 ) {
				System.out.println(n);
				run = false ; 
			}		
			n --;
		}
		
	//	int c = 0;
	//    int MAX = 0;
	//	while ( c < 150) {
	//		if (c % 8 == 0) {
	//			MAX = c;
	//		}
	//		c++;
	//	}
	//  System.out.println("답 : " + MAX);
	
        //문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력  # 답 : 6 (54,63,72,81,90,99) 
		int cnt = 0;
		n = 50;
		while (n <=100 ) {
			if ( n% 9 == 0) {
				cnt ++;
			}
			n ++;
		}
		System.out.println("cnt : "+cnt );
		//문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980 
		n = 1 ;
		int max = n;
		while ( n < 1000) {
			if ( n % 28 == 0 && max < n) {
				max = n;
			}
				n ++;
		}
		System.out.println("max : " + max);
		//문제6) 8의 배수를 작은수부터 5개 출력 ==> 답 : 0,8,16,24,32
		n = 0 ;
		cnt = 0;
		run = true ; 
		while(run) {
			if(n % 8 == 0) {
				System.out.println(n);
				cnt ++;
			}
			//  종료조건 
			if (cnt == 5) {
				run = false;
			}
			n++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
