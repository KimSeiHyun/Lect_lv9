package lv.test_2;

public class lv2_29s {

	public static void main(String[] args) {
		//		# 문제1) 7의 배수를 차례대로 출력했을대 8번째 배수를 출력
		//
		System.out.println("문제1");
		int cnt = 0;
		for(int i=1; i<100; i++) {
			if(i%7 == 0) {
				cnt ++;
			}
			if(cnt == 8) {
				System.out.println(i);
				break;
			}
		}
		//	# 문제2) 6과 8의 공약수를 모두 출력
		//	# 공약수란 각수의 공통인약수를 말한다.
		//	# 예)  6 ==>  1 , 2, 3, 6
		//	#       8 ==> 1, 2, 4, 8
		//	# 공약수는  1, 2
		//
		System.out.println("문제2");
		int x = 0;
		int y = 0;
		int max = 0;
		for(int i=1; i<10; i++) {
			if(6%i == 0) {
				x = i;
			}
			if(8%i == 0) {
				y = i;
			}
			if(x == y) {
				max = x;
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		
		//	# 문제3) 위 수의 최대 공약수 출력
		//	# 최대공약수란 공약수중에서 가장큰수 
		//
		System.out.println("문제3");
		System.out.println(max);
		//	# 문제4) 25 , 75 의 최대 공약수를 출력
		//
		System.out.println("문제4");
		max = 0;
		for(int i=1; i<100; i++) {
			if(75%i == 0) {
				x= i;
			}
			if(25%i == 0) {
				y =i;
			}
			if(x == y) {
				max = y;
			}
		}
		System.out.println(max);
		//	# 문제5) 연필 42자루와 지우개 28개를 최대한 많은 학생에가 남김없이 똑같이 나누어 주려고합니다
		//	# 몇명까지 나누어 줄수있는지 출력
		System.out.println("문제5");
		max = 0;
		for(int i=1; i<100; i++) {
			if(42%i == 0) {
				x = i;
			}
			if(28%i == 0) {
				y = i;
			}
			if(x == y) {
				max = y;
			}
		}
		System.out.println(max +"명");
		
	}

}
