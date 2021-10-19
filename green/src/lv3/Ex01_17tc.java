package lv3;

public class Ex01_17tc {

	public static void main(String[] args) {
		int arr[] = {0,0,0,
				  	 0,3,3,
					 3,0,0};
		//			 0 1 2 3 4 5 6 7 8
		//               v     v     v
		//문제1) 배열을 위와 같이3줄씩 출력

		
		for ( int i =0; i<9; i++) {
			System.out.print(arr[i]);
//			if(arr[i] == 3) {
//				System.out.print("■");
//			}
//			else {
//				System.out.print("□");
//			}
			if(i %3 == 2 ) {
				System.out.println();
			}
		}
		
		// 가로 검사문
		// 0 1 2
		// 3 4 5
		// 6 7 8
		
		
		// ver.1
		for( int i= 0; i<9; i+=3) {
			int cnt = 0;
			if (arr[i] == 3 && arr[i+1] == 3 && arr[i+2] == 3) {
				cnt ++;
			}
			
			if(cnt == 1) {
				System.out.println("빙고!");
			}
		}
		
		// ver.2
		for( int i= 0; i<9; i+=3) { // i : 0 3 6 
			int cnt = 0;
			for(int j=0; j<3; j++) {
				if(arr[i+j] == 3) { // i+j :0 1 2 / 3 4 5 / 6 7 8  
					cnt ++;
				}
			}
			if ( cnt ==3) {
				System.out.println("빙고 ! ");
			}
		}
		
		
		
		
		
		
	}

}
