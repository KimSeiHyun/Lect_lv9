package lv.test_2;

public class lv2_07s {

	public static void main(String[] args) {
		//문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력  # 답 : 6 (54,63,72,81,90,99) 
		int x = 50;
		int cnt = 0;
		while ( x <= 100) {
			if(x%9 == 0) {
				cnt ++;
			}
			x++;
		}
		System.out.println("문제1");
		System.out.println(cnt);
		//문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980 
		x = 0;
		int temp = 0;
		while(x < 1000) {
			if(x %28 == 0 ) {
				temp = x ;
			}
			x++;
		}
		System.out.println("문제2");
		System.out.println(temp);
		
		//문제6) 8의 배수를 작은수부터 5개 출력 ==> 답 : 0,8,16,24,32
		x = 0;
		cnt = 0;
		System.out.println("문제3");
		while (x < 1000) {
			if(x %8 == 0) {
				System.out.println(x);
				cnt++;
			}
			if(cnt == 5) {
				x = 1000;
			}
			x++;
		}

	}

}
