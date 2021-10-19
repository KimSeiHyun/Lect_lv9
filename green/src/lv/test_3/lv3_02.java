package lv.test_3;

public class lv3_02 {

	public static void main(String[] args) {
//		int[] arr = new int[5];
	
		int arr[] = {10,20,30,40,50};
		// 문제1) 4의 배수만 출력
		// 정답1) 20 40
		System.out.println("문제1");
		int sum =0;
		int cnt =0;
		for(int i=0; i<5; i++) {
			if(arr[i] % 4 == 0) {
				System.out.print(arr[i] + " ");
				sum += arr[i];
				cnt++;
			}
		}
		System.out.println();
		// 문제2) 4의 배수의 합 출력
		// 정답2) 60
		System.out.println("문제2");
		System.out.println(sum);
		// 문제3) 4의 배수의 개수 출력
		// 정답3) 2
		System.out.println("문제3 ");
		System.out.println(cnt);
	}

}
