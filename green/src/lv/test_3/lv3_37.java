package lv.test_3;

public class lv3_37 {

	public static void main(String[] args) {
		// for를 사용해서 풀어보세요
		// 문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력 # 답 : 6 (54,63,72,81,90,99)
		System.out.println("문제4");
		int cnt = 0;
		for(int i=50; i<=100; i++) {
			if(i %9 == 0) {
				cnt ++;
			}
		}
		System.out.println(cnt);
		// 문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980
		System.out.println("문제5");
		int max = 0;
		for(int i=0; i<1000; i++) {
			if(i%28 == 0) {
				max =i;
			}
		}
		System.out.println(max);
		// 문제6) 8의 배수를 작은수부터 5개 출력 ==> 답 : 0,8,16,24,32
		System.out.println("문제6");
		cnt = 0;
		for(int i=0; i<100; i++) {
			if(i%8 == 0) {
				System.out.println(i);
				cnt ++;
			}
			if(cnt == 5) {
				break;
			}
		}
		
	}

}
