package lv5;

public class Ex02c {

	public static void main(String[] args) {
		// 에러의 종류 (참고사이트)
		// https://butter-shower.tistory.com/87
		
		// 에러의 종류가 너무 많기 때문에
		// 모든 에러를 다 잡아주는 Exception 을 보통 사용함 .
		
		int arr[] = new int[3];
		
		try {
			arr[100] = 100;
		}
		catch(Exception e) {
			System.out.println("예제1");
			e.printStackTrace();
		}
		
		int a = 10;
		try {
			int b = a/0;
		} catch (Exception e) {
			System.out.println("예제2");
			e.printStackTrace();
		}
		
		String str = "aaa";
		
		try {
			int num = Integer.parseInt(str);
		}catch (Exception e) {
			System.out.println("예제3");
			e.printStackTrace();
		}
		

		
	}

}
