package lv1;

public class Ex11 {

	public static void main(String[] args) {
		//증감연산자
		//ㄴ 증가 또는 감소 
		
		// 1) a = a + 1;
		// 2) a += 1; ( 사칙연산 다 사용가능 . -= , *= , /= ) 
		// 3) a ++; (후위연산) //연산자가 포함된 식이 종료된 후 연산이 적용 
		// 4) ++ a; (전위연산) //연산자가 포함된 식이 시작되기 전 연산이 적용 .
		
		int a = 10 ;
		int b = 20 ;
		int c ; 
		
		c = a ++ + b; // c = a + b; a += 1;
		System.out.println("c : " + c); // 30
		System.out.println("a : " + a); // 11
		
		c = ++ a + b; // a += 1; c = a + b ;
		System.out.println("c : " + c); // 32
		System.out.println("a : " + a); // 12
		


	}

}
