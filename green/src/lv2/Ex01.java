package lv2;

public class Ex01 {

	public static void main(String[] args) {
		// 반복문 : while , for
		
		// 반복문 종료조건 .
		// 1. 초기식
		// 2. 조건식
		// 3. 증감식
		System.out.println("-------");
		int n = 0 ;
		while (n < 5) {
			System.out.println(n);
			n++;
		}
		System.out.println("-------");
		// for(초기식; 조건식; 증감식) { 실행문;}
		for (int i = 0; i<5; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------");
		// 보조제어문 : break, continue 
		// ㄴ break : 자신이 속한 반복문을 즉시 종료시킴.
		// ㄴ continue : 자신이 속한 반복문의 처음(키워드)으로 돌아감 
		
		while (true) {
			System.out.println(1);
			break; //
		}
		int a = 1; 
		while (true) {
			System.out.println(1);
			while(true) {
				System.out.println(2);
				if ( a == 10) {
					continue; // 이하의 모든 구문을 무시 .
				}
				break;
			}
			System.out.println(3);
			a++;
		}
//		System.out.println("end");
	}
}
