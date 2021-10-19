package lv1;

public class Ex13_2 {

	public static void main(String[] args) {
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		System.out.println("문제1");
		int a = 1;
		int sum = 0;
		int count = 0;
		while( a < 6) {
			sum += a;
			a++ ; 
		}
		System.out.println("sum = " + sum);
		
		System.out.println("문제2");
		int b = 1;
		while (b <= 10) {
			if (b < 3 || b >= 7) {
				System.out.println(b);
			sum += b;
			count ++;
			}
			b++;
		}
		System.out.println("문제3");
		System.out.println("sum =" + sum);
		
		System.out.println("문제4");
		System.out.println("count : " + count);
		}
	}


