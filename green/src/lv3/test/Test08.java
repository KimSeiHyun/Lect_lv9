package lv3.test;

public class Test08 {

	public static void main(String[] args) {
		// for를 사용해서 풀어보세요
		// 문제6) 8의 배수를 작은수부터 5개 출력 ==> 답 : 0,8,16,24,32
		
		// 시작 11:21
		// 종료 11:27
		// 소요 6분
		
		for(int i=0; i<40; i+=8) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		int cnt = 0;
		for(int i=0; i<100; i++) {
			if (i % 8 == 0) {
				cnt++;
				System.out.print(i + " ");
			}
			if (cnt == 5) {
				break;
			}
		}

	}

}
