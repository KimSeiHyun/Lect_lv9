package lv2;

public class Ex01_07 {

	public static void main(String[] args) {
		//문제3) 8의 배수중  150보다 작고 150 에 가장 가까운수를 출력 ==> 답 : 144
		
		int max = 0;
		int a= 0;
		
		for (a=0; a < 150; a++) {
			if (a%8 == 0 && max < a) {
				max = a;
			}
		}
		System.out.println("max : " + max );
	}

}
