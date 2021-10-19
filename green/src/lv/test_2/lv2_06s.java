package lv.test_2;

public class lv2_06s {

	public static void main(String[] args) {
		//문제1) 9의 배수중 일의 자리가 6인 첫번째 배수 출력 ==> 답 : 36
		int x = 0;
		System.out.println("문제1");
		while (x <100) {
			if(x %10 == 6) {
				System.out.println(x);
				x = 100;
			}
			
			x+=9;
		}	
		//문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 ==> 답 : 63
		x = 0;
		System.out.println("문제2");
		while (x < 100) {
			if(x /10 == 6 ) {
				System.out.println(x);
				x = 100;
			}
			
			x+=9;
		}
		//문제3) 8의 배수중  150보다 작고 150 에 가장 가까운수를 출력 ==> 답 : 144
		x = 0;
		int temp = 0;
		while (x < 1000) {
			if(x <150) {
				temp = x;
			}
			x+=8;
		}
		System.out.println("문제3");
		System.out.println(temp);
		
		
		
		
		
	}

}
