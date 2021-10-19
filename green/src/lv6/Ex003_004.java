package lv6;

class Test2 {
	void printSum(int[] arr) {
		System.out.println("문제1. 전체 합 출력");
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum : " + sum);
	}
	void printSumMultiple4(int[] arr) {
		int sum = 0;
		int cnt =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %4 == 0) {
				sum += arr[i];
				cnt ++;
			}
		}
		System.out.println("문제2. 4의 배수의 합 출력");
		System.out.println("sum : " + sum);
		System.out.println("문제3. 4의 배수의 개수 출력 :");
		System.out.println("cnt : " +cnt);
	}
	void printCountMultiple4(int[] arr) {
		
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %2 == 0) {
				cnt ++;
			}
		}
		System.out.println("문제4. 짝수의 개수 출력");
		System.out.println("cnt : " + cnt);
	}
}

public class Ex003_004 {

	public static void main(String[] args) {
		int[] arr = { 87, 100, 11, 72, 92 };
		
		Test2 test = new Test2();
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		test.printSum(arr);
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		test.printSumMultiple4(arr);
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3

		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		test.printCountMultiple4(arr);
	}

}
