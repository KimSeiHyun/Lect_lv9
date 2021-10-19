package lv3;

public class Ex01_16tc {

	public static void main(String[] args) {
		/*
		 * # 4의 배수만 저장
		 * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
		 * - 단! temp 의 길이를 4의 배수만큼만 설정한다. 
		 */
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		// 1. temp 배열의 초기화 될 크기를 정해야함.
		int cnt = 0 ;
		for(int i=0; i<5; i++) {
			if(arr[i] %4 == 0) {
				cnt ++;
			}
		}
		// 2. temp 배열을 재 초기화 . 
		temp = new int[cnt]; // {0,0,0.....}
		
		// 3. 4의 배수를 선별 > 저장
		int tempIdx = 0;
		for(int i=0; i<5; i++) {
			if(arr[i] % 4 == 0) {
				temp[tempIdx] = arr[i];
				tempIdx ++;
			}
		}
		
		//출력 
		for ( int i=0; i<cnt; i++) {
			System.out.print(temp[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
