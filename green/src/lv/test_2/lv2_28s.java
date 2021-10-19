package lv.test_2;

public class lv2_28s {

		public static void main(String[] args) {
		//		# 문제1) 36의 약수 를 전부 출력
		//	# 약수는  36과 나눠서 나머지가 0인수를 말한다.
		//	# 1,2,4,6.....
		//
			System.out.println("문제1");
			for(int i=1; i<37; i++) {
				if(36%i == 0) {
					System.out.print(i+ " ");
				}
			}
			System.out.println();
		//	# 문제2) 24의 약수중에서 2의 배수만출력
		//
			System.out.println("문제2");
			for(int i=1; i<=24; i++) {
				if(24%i == 0 && i%2 == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		//	# 문제3) 18의 약수의 갯수 더하기  21의 약수의 갯수를 출력
		//
			System.out.println("문제3");
			int cnt = 0;
			
			for(int i=1; i<=18; i++) {
				if(18%i == 0) {
					cnt ++;
				}
			}
			for(int i=1; i<=21; i++) {
				if(21%i == 0) {
					cnt ++;
				}
			}
			System.out.println(cnt);
		//	# 문제4) 50 부터 100 까지의 자연수중에서 9의 배수는 모두 몇개?
			System.out.println("문제4");
			cnt = 0;
			for(int i=50; i<=100; i++) {
				if(i%9 == 0) {
					cnt ++;
				}
			}
			System.out.println(cnt);
	}

}
