package lv.test_4;

public class lv4_12 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		int sum = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
			}
		}System.out.println();

		// 문제 1) 전체 합 출력
		// 정답 1) 450
		System.out.println("문제1");
		System.out.println(sum);
		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80
		System.out.println("문제2");
		sum = 0;
		int cnt = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] %4 == 0) {
					System.out.print(arr[i][j] + " ");
					sum += arr[i][j];
					cnt ++;
				}
			}
		}System.out.println();
		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		System.out.println("문제3");
		System.out.println(sum);
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		System.out.println("문제4");
		System.out.println(cnt);
		
	}

}
