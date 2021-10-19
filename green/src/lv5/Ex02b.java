package lv5;

public class Ex02b {

	public static void main(String[] args) {
		//예외처리2
		
		// 에러의 종류(참고사이트)
		// https://butter-shower.tistory.com/87
		
		// 주석처리 해보면서 하나씩 실행해보자 .
		
		int arr[] = new int[3];
		try {
			arr[100] = 100;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예제1");
			System.out.println("배열의 범위를 벗어났을 때");
			e.printStackTrace();
		}
		
		// ---------------------------------
		
		int a = 10;
		try {
			int b = a/0;
		}catch(ArithmeticException e) {
			System.out.println("예제2");
			System.out.println("숫자를 0으로 나눌 수 없기 때문에");
			e.printStackTrace();
		}
		
		//-------------------------
		
		String str = "aaa";
		try {
			int num = Integer.parseInt(str);
		}catch (NumberFormatException e) {
			System.out.println("예제3");
			System.out.println("aaa는 숫자로 반환할 수 없기 때문에");
			e.printStackTrace();
		}

	}

}
