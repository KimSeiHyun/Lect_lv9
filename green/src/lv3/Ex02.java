package lv3;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		char code[] = {'a','b','c','d','e'};
		
		Scanner sc = new Scanner(System.in);
				
		// arr 배열에서 입력받은 값을 찾으면 -> 해당 코드를 출력. 
		
		System.out.print("정수 입력 :");
		int data = sc.nextInt();
		
//		int idx = 0; // 인덱스 정보를 저장하는 변수는 0이아닌 음수로 초기화를 하자 . 
		int idx = -1; // 인덱스 값은 0부터 존재하기 때문에 > 유요한 값을 잘못 참조할 수 있음 . 
		for(int i=0; i<5; i++) {
			if(data == arr[i]) {
				idx = i;
			}
		}
		
		// idx 활용 > code 출력 . 
		System.out.println(code[idx]);
		
		if ( idx == -1 ) {
			System.out.println("존재하지 않는 값 입니다.");
		}
		else {
			System.out.println(code[idx]);
			
		// 배열
		// ㄴ 자료형이 같은 여러개의 값(데이터)를 저장할 수 있다 . 
		// ㄴ 0부터 1씩 증가하는 인덱스가 존재한다. !!
		
			// 선언
			// 자료형키워드 배열이름[];
			
			// 초기화 
			// 1) = {}; // stack이라는 공간에 저장됨
			// 2) = new 자료형키워드[개수]; // heap이라는 공간에 저장됨.
			
			// 사용방법
			// 배열명[index]
			
			
			
		}
		
	}

}
