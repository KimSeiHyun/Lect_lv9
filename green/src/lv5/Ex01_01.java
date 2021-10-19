package lv5;

public class Ex01_01 {

	public static void main(String[] args) {
		//주민등록검사문제 
		
		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 30세
		int year = 2021;
		int a = Integer.parseInt(jumin.substring(0,2));
		System.out.println("문제1");
		System.out.println(year-(1900+a)+"세") ;
		// 문제 2) 성별 출력
		// 정답 2) 여성
		System.out.println("문제2");
		String x = jumin.substring(7,8);
		int y = Integer.parseInt(x);
		if(y == 2 || y == 4 || y == 6) {
			System.out.println("여성입니다.");
		}
		else {
			System.out.println("남성입니다.");
			
		}
	}

}
