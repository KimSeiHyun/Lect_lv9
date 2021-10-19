package lv6;

class Ex03 {
	int[] arr = { 87, 100, 11, 72, 92 };
	String str;
}
//클래스 문제1
public class Ex001_001 {

	public static void main(String[] args) {
		
		Ex03 ex = new Ex03();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		System.out.println("문제1");
		int sum = 0;
		int sum2 = 0;
		int cnt = 0;
		int cnt2 = 0;
		for(int i=0; i<ex.arr.length; i++) {
			sum += ex.arr[i];
			if(ex.arr[i] %4 == 0) {
				sum2 += ex.arr[i];
				cnt ++;
			}
			if(ex.arr[i] %2 == 0) {
				cnt2 ++;
			}
		}
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
		System.out.println("문제2");
		System.out.println(cnt2);
		
		
	}

}
