package lv.test_6;

class Test2s2 {
	void printSum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
	void printSumMultiple4(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %4 == 0) sum+= arr[i];
		}
		System.out.println(sum);
	}
	void printCountMultiple4(int[] arr) {
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %4 == 0) cnt ++;
		}
		System.out.println(cnt);
	}
	void printCountEven(int arr[]) {
		int cnt =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %2 == 0) cnt++;
		}
		System.out.println(cnt);
	}
	
}

public class lv6_31s {

	public static void main(String[] args) {
		int[] arr = { 87, 100, 11, 72, 92 };
		Test2s2 e = new Test2s2();
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		e.printSum(arr);
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		e.printSumMultiple4(arr);
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		e.printCountMultiple4(arr);
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		e.printCountEven(arr);
	}
}