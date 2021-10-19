package lv3.test;

public class Test07 {

	public static void main(String[] args) {
		// for를 사용해서 풀어보세요

		// 문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980
		
		// 시작 11:13
		// 종료 11:20
		// 소요 7분
		
		int max = 0;
		
		for(int i=28; i<=999; i+=28) {
			if ( max < i) {
				max = i;
			}			
		}
		System.out.println(max);

		
	}
}
