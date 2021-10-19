package lv3.test;

public class Test10 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		int temp2[] = new int[5];
		
		//문제2) arr 의 값의 2배를 temp2에 복사후 출력 
		// temp2 ==> {20, 40, 60, 80 , 100}		
		
		// 시작 11:37
		// 종료 11:38
		// 소요 1분
		
		for(int i = 0; i<5; i++) {
			if(temp2[i] == 0) {
				temp2[i] = arr[i]*2;
			}
			System.out.print(temp2[i] + " ");
		}
		
	
		
	}

}
