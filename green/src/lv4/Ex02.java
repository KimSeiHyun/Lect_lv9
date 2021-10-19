package lv4;

public class Ex02 {

	public static void main(String[] args) {
		
		// 배열 : (같은 자료형의) 여러개의 값을 저장 할 수 있는 것 .
		// 2차원의 배열 : 또 다른 배열을 값으로 갖는 것 .
		
		// 선언
		// 자료형 배열명[];
		// int  arr[];
		
		// 초기화
		// = {};
		// = new 자로형[개수];
		
		// 2차원 배열의 선언
		// 자료형 배열명[][]; // ==  자료형[][] 배열명;
		
		// 2차원 배열의 초기화
		// = {{},{},{}};
		// = new 자료형[개수][개수]
		
		int arr[][] = {{1,2},{3,4},{5,6}}; // stack
		//	 외부인덱스     0     1     2		 
		//	 내부인덱스    0 1   0 1   0 1
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// 2차원 배열의 사용방법
		// 배열명[외부인덱스][내부인덱스]
		
		System.out.println(arr[0][0]); // 1
		System.out.println();
		
		// 2차원 반복문을 사용해서 > arr 배열의 전체값 (1~6까지)을 출력.	
		for(int i=0; i<arr.length; i++) { // i : 외부 인덱스
			for(int j=0; j<2; j++) {	  // j : 내부 인덱스
				System.out.println(arr[i][j]);
			}
		}

		int datas[][] = new int[3][2]; // {{0,0},{0,0},{0,0}}
		
		// 2차원 반복문을 사용해서 > datas 배열의 전체 값을 1부터 6까지 초기화.
		
		int x = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				if(arr[i][j] == 0) {
					arr[i][j] += x;
					x++;
				}
				System.out.println(arr[i][j]);
			}
		}
		

		
		
	}

}
