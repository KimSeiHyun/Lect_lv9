package lv2;

public class Ex01_06 {

	public static void main(String[] args) {
		//문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 ==> 답 : 63
		int a= 0; 
		
		for ( a=0; a<100; a++)
			if ( a %9 == 0 && a /10 == 6) {
				System.out.println(a);
				a=100;
			}
	}

}
