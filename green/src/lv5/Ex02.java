package lv5;

public class Ex02 {

	public static void main(String[] args) {
		//예외처리1
		
		int num = 10;
		//System.out.println(num / 0);  // 어떤 숫자를 0으로 나누면 에러 발생 . 
		
		//try , catch
		//자바는 일반적으로 에러가 발생하면 프로그램이 즉시 종료됨.
		//try , catch 는 에러가 발생해도 프로그램이 종료되지 않고 
		//에러난 부분만 동작하지 않고 프로그램이 계속 진행 되도록 만들어준다.(매우유용 ! )
		
		// 1) try {} ==> 중괄호 안에 코드를 작성하면 에러발생해도 무시한다.
		// 2) catch(Exception e){} ==> 에러가 발생하면 한번 작동된다 . 
		
		try {	//try {} 괄호안에서 에러가 발생하면 에러가 발생하기 전까지 정상작동후 에러발생이후는 진행하지 않음 .
			System.out.println("abcd");
			System.out.println(num / 0);
			System.out.println("1234");
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다."); // 직접 출력해도 되고 아래처럼 해도된다.
			e.printStackTrace(); // 자바에서 제공하는 출력문 (어떤 에러인지 알려준다.)
		}
		System.out.println("프로그램 종료 ");

	}

}
