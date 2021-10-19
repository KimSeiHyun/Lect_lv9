package lv4;

public class Ex01 {

	public static void main(String[] args) {
		
		//배열의 주소개념 . 
		
		int[] arr = {87, 100, 24, 11, 79};
//		int[] temp = arr; // arr 배열이 가진 값(주소)으로 초기화 됨 . (주소를 공유)
						  // 건물은 하나인데 뒷문이 생긴 개념 . 
		int[] temp = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		// 위 for 반복문에서 i<5 대신 i<변수의명.length; 를 쓸수있음
		// 변수의명.length 는 배열의 끝을 가져와줌 . 
		// 앞으로는 배열의 길이가 무수히 길수도 있기 때문 . 
		
		System.out.println(arr);
		System.out.println(temp);
		
		temp[1] = 0;
		
		//출력문 . 
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
