package lv.test_2;

public class lv2_19s {

	public static void main(String[] args) {
		// for를 사용해서 풀어보세요 
		//문제1) 9의 배수중 일의 자리가 6인 첫번째 배수 출력 ==> 답 : 36
		System.out.println("문제1");
		for(int i=0; i<100; i++) {
			if(i%9 ==0 && i%10 == 6) {
				System.out.println(i);
				i = 100;
			}
		}
		//문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 ==> 답 : 63
		System.out.println("문제2");
		for(int i=0; i<100; i++) {
			if(i%9 == 0 && i/10 ==6) {
				System.out.println(i);
				i = 100;
			}
		}
		//문제3) 8의 배수중  150보다 작고 150 에 가장 가까운수를 출력 ==> 답 : 144
		System.out.println("문제4");
		int max = 0;
		for(int i=0; i<150; i++) {
			if(i%8 == 0) {
				max = i;
			}
		}
		System.out.println(max);
	}

}
