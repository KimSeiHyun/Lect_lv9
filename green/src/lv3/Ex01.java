package lv3;

public class Ex01 {

	public static void main(String[] args) {
		// 변수 
		// ㄴ 단 한개의 값을 저장할 수 있음 .
		// ㄴ 변할 수 있는 값
		
		// 배열 array
		// ㄴ 같은 자료형의 데이터(값)을 여러개 저장 할 수 있음 .
		// ㄴ 0부터 시작하는 index(방번호)를 가지고 있음 . (1씩 증가)
		
		// 선언과 초기화 
		// 자료형키워드 배열명[];
		// 자료형키워드[] 배열명;
	
		// = {1,2,3,4}				// stack
		int arr[] = {1,2,3,4,5};
		//			 0 1 2 3 4 : index
	
		// = new 자료형키워드[개수];		// heap
		int arr2[] = new int[5]; 	// {0,0,0,0,0}
		// 0~4
		
		// 사용
		// 배열명[index]
		
		System.out.println(arr); // [I@7637f22 라는 값이 나오는데 이건 배열이 저장된 주소 . 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
//		System.out.println(arr[5]); //  Index 5 out of bounds for length 5
		
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		
		arr2[0] = 10;
		System.out.println(arr2[0]);
		
		// 배열의 전체값을 반복문을 통해 출력 . (while , for)
		
//		while (arr[0] <= 5) {
//			System.out.println(arr[0]);
//			arr[0]++;
//		}
//		while (arr2[0] <=5 ) {
//			System.out.println(arr2[0]);
//			arr2[0]++;
//		}
		
		int n = 0; // index로 활용.
		System.out.println("while");
		while ( n < 5 ) {
			System.out.println(arr[n]);
			n++;
		}
		
		System.out.println("for");
		for(int i=0; i<5; i++) {
			System.out.println(arr2[i] );
		}
		
		

	}

}
