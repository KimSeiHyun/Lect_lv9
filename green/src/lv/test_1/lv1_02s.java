package lv.test_1;

public class lv1_02s {

	public static void main(String[] args) {
		// 예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력
		int 현금 = 1000;
		int 과자 = 200;
		int 잔돈 = 현금 - 과자;
		System.out.println("잔돈 = " + 잔돈 + "원");

		// 문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		int 월급 = 100;
		int 연봉 = 월급*12;
		int 세금 = 연봉/10;
		int 세후연봉 = 연봉 - 세금;
		System.out.println("세후연봉 :" +세후연봉+"원");
		// 문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		int score1 = 30;
		int score2 = 50;
		int score3 = 4;
		int total = score1+score2+score3;
		int avr = total/3; 
		System.out.println("평균은 : " + avr+"점");
		// 문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int x = 3;
		int y = 6;
		int z = x*y/2;
		System.out.println("넓이는 : " + z);
		
		// 문제4) 100초를 1분 40초로 출력
		int time = 100;
		int m = time/60;
		int s = time%60;
		System.out.println("100초 : " + m +"분" + s +"초");
		// 문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		// 정답5) 500원(1개), 100원(3개)
		int money = 800;
		int fives = money/500;
		int ones = money%500/100;
		System.out.println("500원짜리 : " + fives +"개\n" + "100원짜리 : " + ones + "개");
		
		
	}

}
