package lv.test_6;

class Test1 {
	void printEvenOrOdd(int x) {
		if(x %2 == 0) System.out.println("짝수");
		else System.out.println("홀수");
	}
	void sumBetweenValues(int x, int y) {
		int sum = 0;
		for(int i=x; i<=y; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	void printPrimeNums(int primeNumber) {
		for(int i=2; i<=primeNumber; i++) {
			int cnt = 0;
			for(int j=1; j<=primeNumber; j++) {
				if(i %j ==0) cnt ++;
			}
			if(cnt == 2) System.out.println(i);
		}
	}
}

public class lv6_30 {

	public static void main(String[] args) {
		Test1 test = new Test1();
		// 문제 1) a 가 홀수인지 짝수인지 출력 
		int a = 19;
		test.printEvenOrOdd(a);

		// 문제 2) x부터 y까지의 합을 출력하는 메서드
		int x = 1;
		int y = 10;
		test.sumBetweenValues(x, y);

		// 문제3) 숫자 1개를 인자로 사용해서 2부터 인자까지의  소수 전부 출력 
		int primeNumber = 20;
		test.printPrimeNums(primeNumber);
	
	}
}