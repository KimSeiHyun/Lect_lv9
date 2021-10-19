package lv1;

public class Ex13_1 {

	public static void main(String[] args) {
		// 문제1) 1~10까지 반복해 5~9 출력
		int a =  1;
		System.out.println("문제1");
		while ( a < 11 ) {
			
			a++;
			if (a > 4 && a < 10)

			System.out.println(a);
			}	
		// 정답1) 5, 6, 7, 8, 9
		
		// 문제2) 10~1까지 반복해 6~3 거꾸로 출력
		int b = 10 ;
		System.out.println("문제2");
		while ( b > 0 ) {
			b --;
			if ( b < 7 && b > 2)
				System.out.println(b);
		}
		// 정답2) 6, 5, 4, 3
		// 문제3) 1~10까지 반복해 짝수만 출력
		System.out.println("문제3");
		int c = 1;
		while ( c < 11 ) {
			c ++;
			if (c %2 == 0 ) {
				System.out.println(c);
			}
		}
		// 정답3) 2, 4, 6, 8, 10

	}

}
