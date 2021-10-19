package lv.test_6;

class Ex03s {
	int[] arr = { 87, 100, 11, 72, 92 };
}

public class lv6_02s {

	public static void main(String[] args) {
		Ex03s e = new Ex03s();
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int sum = 0;
		int sum2 = 0;
		int cnt = 0;
		int cnt2 = 0;
		for(int i=0; i<e.arr.length; i++) {
			sum += e.arr[i];
			if(e.arr[i] %4 ==0) {
				sum2 +=e.arr[i];
				cnt ++;
			}
			if(e.arr[i] %2 == 0) cnt2++;
		}
		System.out.println("문제1");
		System.out.println(sum);
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		System.out.println("문제2");
		System.out.println(sum2);
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		System.out.println("문제3");
		System.out.println(cnt);
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		System.out.println("문제4");
		System.out.println(cnt2);
	}
}