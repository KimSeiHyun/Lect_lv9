package lv2;

public class Ex02 {

	public static void main(String[] args) {
		//제어문
		// 1) 조건문 if 
		// 2) 반복문 while , for
		// 3) 보저제어문 break , continue
		
		// switch - case
		// switch(조건변수) { } 
		// {
		//  case 변수값 : 실행문;
		//  case 변수값 : 실행문;
		//  case 변수값 : 실행문;
		// } 
		
		int grade = 3; //  1 vip , 2 gold , 3 silver
		
		
		// if - else  : 선두의 조건식이 우선된다 . ( 우선순위 발생 )
		if (grade == 1 ) {
			System.out.println("vip 고객입니다.");
		}
		else if (grade == 2 ) {
			System.out.println("gold 고객입니다.");
		}
		else if (grade == 3 ) {
			System.out.println("silver 고객입니다.");
		}
		
		//switch - case : 연쇄처리. 
		switch(grade) {
		case 1 : 
			System.out.println("vip 혜택 부여. ");
	//		break; //
		case 2 : 
			System.out.println("gold 혜택 부여.");

		case 3 :
			System.out.println("silver 혜택 부여.");
		}
		
		// 삼항연산자 . (식이 3개이기 때문에 삼항연산자.)
		// 홀짝 , 코인 같은식을짤때 유용 .
		// 조건식 ? true일때 실행할(반환할) 문장 . : false일때 실행할(반환할) 문장 
		
		int coin = 2; // 1:앞 , 2:뒤
		
		if (coin == 1) {
			System.out.println("앞면입니다.");
		}
		else {
			System.out.println("뒷면입니다.");
		}
		
		String msg = coin == 1 ? "앞면입니다." : "뒷면입니다.";
		System.out.println(msg);
		int a = 10;
		int b = 20;
		int max = a > b ? 10 : 20 ; 
		
		System.out.println(max);
		
		
	}

}
