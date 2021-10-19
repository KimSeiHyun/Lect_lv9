package lv3;

public class Ex01_01tc {

	public static void main(String[] args) {
		int[] arr = new int[5] ; // {0,0,0,0,0}
		//					index    0,1,2,3,4
		
		// 문제1) 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		
		for (int i=0; i<5; i++) {

			arr[i] = (i+1)*10;
			System.out.println(arr[i]);
		}

		
		// 문제2) 전체 합 출력
		// 정답2) 150
		
		int sum = 0;
		for (int i=0; i <5; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		// 문제1) 4의 배수만 출력
		// 정답1) 20 40
		sum = 0;
		for (int i = 0; i < 5; i++) {
			if(arr[i] % 4 == 0 ) {
				System.out.println(arr[i]);
				sum += arr[i];
			}
		}
		
		// 문제2) 4의 배수의 합 출력
		// 정답2) 60
		
		System.out.println(sum);
		
		
		// 문제3) 4의 배수의 개수 출력
		// 정답3) 2
		
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if(arr[i] %4 == 0) {
				cnt ++;
			}
		}
		System.out.println("cnt : " + cnt  );
		
	}

}
