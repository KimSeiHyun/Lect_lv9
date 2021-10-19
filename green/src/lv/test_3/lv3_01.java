package lv.test_3;

public class lv3_01 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		System.out.println("문제1");
		int a = 1;
		int sum = 0;
		for(int i=0; i<5; i++) {
			arr[i] = 10*a;
			a++;
			sum += arr[i];
		}
		for(int i =0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 문제2) 전체 합 출력
		// 정답2) 150
		System.out.println("문제2");
		System.out.println(sum);
	}

}
