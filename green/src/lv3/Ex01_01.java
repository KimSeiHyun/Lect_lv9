package lv3;

public class Ex01_01 {

	public static void main(String[] args) {
		int[] arr = new int[5] ;
		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		int sum = 0;
		System.out.println("문제 1");
		arr[0] = 10;
		while ( arr[0] <= 50 ) {
			System.out.println(arr[0]);
			sum += arr[0];
			arr[0]+=10;

		}
		
		// 문제2) 전체 합 출력
		// 정답2) 150
		System.out.println("문제 2");
		System.out.println(sum);
	}

}
