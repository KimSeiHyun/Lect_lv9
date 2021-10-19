package lv3;

public class Ex01_17 {

	public static void main(String[] args) {
		int arr[] = {
				0,0,0,
				3,3,3,
				0,0,0
		};
		//문제1) 배열을 위와 같이3줄씩 출력

		
		
		
		for ( int i =0; i<9; i++) {
			System.out.print(arr[i]);
			if ( i%3 == 2 ) {
				System.out.println();
			}

			}
		

		//문제2) 만약에 가로에 3이 연속으로 3개있으면 "빙고" 출력
		// 0,1,2 = 다 3이거나  
		// 3,4,5 = 다 3이거나
		// 6.7.8 = 다 3이면  빙고를 출력 . 
		int cnt = 0;
		for( int i=0; i<9; i++) {
			if(i < 3) {
				if ( arr[i] == 3) {
					cnt++;
				}
			}
			if(i < 6 && i >=3) {
				if ( arr[i] == 3) {
					cnt++;
				}
			}
			if(i < 9 && i >=6) {
				if ( arr[i] == 3) {
					cnt++;
				}
			}
		}
		
		if (cnt == 3 ) {
			System.out.println("빙고!");
		}
		
		
		
		
		
		
		
		
		
	}

}
