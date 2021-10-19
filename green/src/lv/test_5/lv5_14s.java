package lv.test_5;

public class lv5_14s {

	public static void main(String[] args) {
		// 에러의 종류 (참고사이트) 
		// https://butter-shower.tistory.com/87
	
		// try catch finally
		
		
		// finally 는 에러 유무 상관없이 무조건 실행된다.
		// 코드가 잘 작동했는지 확인 할때 쓴다. (안내문구용)
			
		int num1 = 10;
		int num2 = 0;
		
		try {
			System.out.println(num1 / num2);
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("예외발생과 상관없이 무조건 실행할 문장을 적는다.");
			
		}
		
	
	}

}