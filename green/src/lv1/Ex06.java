package lv1;

// 입력받기 . 
import java.util.Scanner; 
// 1. util 패키지의 Scanner를 import
// Scanner + 컨트롤 스페이스바 java.util 불러오기 . 
public class Ex06 {

	public static void main(String[] args) {
		
		// 문장암기.
		// 2. Scanner 변수 선언과 초기화 .  
		Scanner scan = new Scanner(System.in);
		//scan이라는애가 Scanner라는 클래스를 통쨰로 가지고잇음. 
		
		// 3. 입력받는 값을 저장할 변수 선언. 
		String name; 
		
		// 4. Scanner를 활용한 입력받기 .
		name = scan.next(); //String 자료형을 입력받을 함수 . 
		System.out.println(name);
		
		System.out.println("숫자 입력 : ");
		int data = scan.nextInt();
		System.out.println("data : " + data);
		
		System.out.println(data  + 123);
				

	}

}
