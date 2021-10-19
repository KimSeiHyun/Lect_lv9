package lv.test_2;

public class lv2_02 {

	public static void main(String[] args) {
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		System.out.println("문제1");
		int a = 1;
		int sum = 0;
		while (a <=5) {
			sum += a;
			a++;
		}
		System.out.println("1~5까지의 합은 : " + sum);
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		System.out.println("문제2 ");
		a = 1;
		sum = 0;
		int cnt = 0;
		while (a <=10) {
			if(a < 3 || a >=7) {
				System.out.print(a + " ");
				sum += a;
				cnt ++;
			}
			a++;
		}
		System.out.println();
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		System.out.println("문제3 ");
		System.out.println("문제2의 조건에 맞는 수들의 합은 : " + sum);
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		System.out.println("문제4");
		System.out.println("문제2의 조건에 맞는 수들의 개수는 : " + cnt );

	}

}
