package lv5;

import java.util.Scanner;

public class Ex02d {

	public static void main(String[] args) {
		//예외처리4
		
		//	에러의 종류 (참고사이트)
		//	https://butter-shower.tistory.com/87
		
		// try , catch , finally
		
		// finally 는 에러 유무 상관없이 무조건 실행된다.
		// 코드가 잘 작동했는데 확인 할때 쓴다.(안내문구용)
		Scanner sc = new Scanner(System.in);
		System.out.println("예제1");
		int[] arr = { 0 , 1 , 2};
		int num = 10;
		try {
			System.out.println("마지막 인덱스 :" + arr[3]);
			System.out.println("처음 인덱스 : " + arr[0]);
			System.out.println(num / 0);
		}catch(Exception a ) {
			System.out.println("마지막 인덱스(3) 존재하지 않음"); // 오류가 나면 출력하는 출력문 
			a.printStackTrace(); // 오류가 나면 어디가 낫는지 출력 . 
		}
		System.out.println("오류가 발생해도 정상실행 . \n");
		
		System.out.println("예제2");
		int x = 10;
		String str = "abcd";
		try {
			int y = Integer.parseInt(args[0]);
	//		int temp = Integer.parseInt(str);
	//		System.out.println(x / 0);
			System.out.println(x / y);
		} catch (ArrayIndexOutOfBoundsException e){ // 배열의 범위를 벗어난 인덱스 사용시 발생 . 
													// main() 메소드의 인수가 없을 때 발생. 
			System.out.println("인덱스가 존재하지 않습니다.");
		} catch (NumberFormatException e) { 		// main() 메소드의 인수를 숫자로 바꿀 수 없을 때 발생. 
			System.out.println("숫자가 아닙니다.");
		} catch (ArithmeticException e) {			// main() 메소드의 인수가 0일때 나눌 수 없으므로 발생 . 
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("항상 실행됩니다.\n ");	//예외 발생과 상관없이 항상 실행 . 
		}
		// 다중 catch 블록일 때 catch 순서
		// 1.다중 catch 블록일 때 try 블록에서 예외가 발생하면 발생한 예외를 catch 블록 순서대로 비교.
		// 2.앞에 있는 catch 블록의 예외 객체가 나중 catch 블록 예외 객체의 부모라면 
		//   앞에 있는 catch 블록이 먼저 가로챔.
		// 3. 구체적인 예외를 먼저 처리햐아 함 . (중요)
		
		System.out.println("예제3");
		
		int arr2[] = { 0 , 1 , 2};
		
		try {
			int a = arr2[3];
		} catch (Exception e ) {
			System.out.println("오류발생  !!");
		}
//		catch (ArrayIndexOutOfBoundsException e) { 
//			// Exception 객체를 처리하는 catch 블록에서 모든 예외를 처리하므로 
//			// 이 catch 블록은 도달할 수 없음 . 컴파일 오류 발생. 
//			System.out.println("인덱스가 존재하지 않습니다.");
//		}
		System.out.println("종료");

		
	}

}
