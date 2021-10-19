package lv3.test;

public class Test09 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int temp1[] = new int[5];

		//문제1) arr 의 값을 temp1 에  복사후 출력 
		// temp1 ==> {10, 20, 30, 40, 50}

		// 시작 11:31
		// 종료 11:34
		// 소요 3분
		
		for(int i=0; i<5; i++) {
			if (temp1[i] == 0) {
				temp1[i] = arr[i];
			}
			System.out.print(temp1[i]+ " ");
		}
		
	
	}

}
