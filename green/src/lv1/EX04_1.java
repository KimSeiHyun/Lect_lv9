package lv1;

public class EX04_1 {

	public static void main(String[] args) {
		// 변수명의 이름 규칙 .
		// 두개 이상의 키워드가 조합될 경우 . 
		// 1. 카멜표기법 myNameIs (새로 시작하는 키워드를 대문자로 시작. )
		// 2. 헝가리언  my_name_is (새로 시작하는 키워드에 _(언더바를) 사용 .)
		
		// 변수를 사용해서 문제 해결 . 
		
		// 현금이 1000원있다 . 200원짜리 과자 구입 후 , 잔돈 출력. 
		int money = 1000;
		int price = 200;
		int payback = money - price;
		System.out.println("잔돈은 " + payback + "원 입니다.");
		
		// 문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		int month = 100;
		double  year = month * 12 * 0.9 ;
		System.out.println("연봉 = " + year);
		// 문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		int a = 30;
		int b = 50;
		int c = 4;
		int avar = (a + b + c)/3 ;
		System.out.println("평균 = " + avar);
		// 문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int g = 3;
		int s = 6;
		int gs = (g*s) /2 ;
		System.out.println("넓이 = " + gs);
		// 문제4) 100초를 1분 40초로 출력
		int m = 100 ;
		int se = m/60 ; 
		int se2 = m%60 ; 
		System.out.println(se + "분" + se2 + "초");
		// 문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		int big = 500 ;
		int small = 100;
		System.out.println("500원 = " + (800/big) + "개" );
		System.out.println("100원 = " + (800%big/100) +"개");
		// 정답5) 500원(1개), 100원(3개)
		
		// 변수는 단 한개의 값을 저장할 수 있음. 
		int x = 10;
		int y = 20;
		
	//	 x = y;
	//	 y = 10;
		int z = x;
		x = y;
		y = 10;
		
		System.out.println(x); //20
		System.out.println(y); //10
	}

}
