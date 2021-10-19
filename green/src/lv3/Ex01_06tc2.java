package lv3;

import java.util.Scanner;

public class Ex01_06tc2 {

	public static void main(String[] args) {
		int a[] = { 10, 49, 51, 36, 17 };
		// 문제 1) 다음 리스트를 값을 입력하면   번호 출력 
		// 예) 51 ==> 2
		// 예) 10 ==> 0
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<5; i++) {
			System.out.println((a[i] + "  "));
		}
		System.out.println("\n값 입력 : ");
		int data = sc.nextInt();
		
		for(int i = 0; i<5; i++) { // i : 0~4 (index)
			if (data == a[i]) {
				System.out.println("인덱스 : " + i);
			}
		}

		
		// 문제 2) 다음 리스트를 이용해서 a 의 값중 홀수만 b 에 저장(위치는 동일한위치에 저장)
		// 예) b = [0, 49, 51, 0, 17]
		int b[] = { 0,0,0,0,0 };
		
		for (int i = 0; i<5; i++) { // a 배열의 전체값을 스캔 . 
			if(a[i] %2 == 1) { //인덱스 i를 그대로 사용 > b배열에 값 저장. 
				b[i] =a[i] ; 
			}
		}
		// b배열의 출력 . 
		for (int i = 0 ; i <5; i++) {
			System.out.println(b[i] + " ");
		}
		
		// 문제 3) 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장(위치는 앞에서 부터  저장)
	    // 2번문제와 조금 다름
		// 예) c = [49, 51, 17, 0, 0]
		int c[] = { 0,0,0,0,0 };
		
		int cIdx = 0; // c 배열의 첫번째 인덱스를 초기값으로 가진것일 뿐 . 
					  
		
		for (int i = 0; i<5; i++) { // a 배열의 전체값을 스캔 . 
			if(a[i] %2 == 1) { // 인덱스 i값을 그대로 사용할 수 없다 . 
				c[cIdx] = a[i] ; 
				cIdx++;
			}
		}
		// c배열의 출력 . 
		System.out.println("문제3");
		for (int i = 0 ; i <5; i++) {
			System.out.println(c[i] + " ");
		}
		
		//-------------------------------------------------
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// 학번과 점수가 한쌍이다. ==>  1001:20 , 1002:45 , 1003:54
		// 문제4) 학번을 입력하면 점수 출력 
		// 예) 1001==>20 , 1003 ==> 54
		System.out.println("학번입력 : ");
		
		int num = sc.nextInt();
		
		for(int i = 0; i<6; i+=2) {
			if ( num == arr[i]) {
				System.out.printf("%d번 학생의 성적은 %d점 입니다.", arr[i], arr[i+1]);
			}
		}
		
		
		
		// 문제5) 점수를 입력하면 학번 출력 
		// 예) 20 ==> 1001 , 45 ==> 1002

	}

}
