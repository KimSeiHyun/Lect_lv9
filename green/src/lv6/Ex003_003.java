package lv6;

class Test1 {
	void printEvenOrOdd(int x) {
		if(x %2 == 0) {
			System.out.println("짝수이다");
		}else System.out.println("홀수이다.");
	}
	
	void sumBetweenValues(int x, int y) {
		int sum = 0;
		for(int i=x; i<=y; i++) {
			sum += i;
		}
		System.out.println("sum :" + sum);
	}

	void printPrimeNums(int primeNumber) {
		for(int i=2; i<=primeNumber; i++) {
			int cnt =0;
			for(int j=1; j<=primeNumber; j++) {
				if(i%j == 0) {
					cnt ++;
				}
			}
			if(cnt == 2) {
				System.out.println(i);
			}
		}
	}
}

public class Ex003_003 {

	public static void main(String[] args) {
		Test1 test = new Test1();
		// 문제 1) a 가 홀수인지 짝수인지 출력 
		int a = 19;
		System.out.println("문제1. 19 가 홀수인지 짝수인지 출력 ");
		test.printEvenOrOdd(a);

		// 문제 2) x부터 y까지의 합을 출력하는 메서드
		int x = 1;
		int y = 10;
		System.out.println("문제2. 1부터 10까지의 합을 출력하는 메서드 ");
		test.sumBetweenValues(x, y);

		// 문제3) 숫자 1개를 인자로 사용해서 2부터 인자까지의  소수 전부 출력 
		int primeNumber = 20;
		System.out.println("문제3. 2부터 20까지의 소수 전부 출력 ");
		test.printPrimeNums(primeNumber);
	}

}
