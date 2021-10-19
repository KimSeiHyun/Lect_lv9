package lv.test_4;

public class lv4_29s {

	public static void main(String[] args) {
		/*
		 * # 2차원 반복문
		 * 1   2  3  4  5
		 * 10  9  8  7  6
		 * 11 12 13 14 15
		 * 20 19 18 17 16
		 * 21 22 23 24 25
		 */
		int arr[][] = new int[5][5];

		// 문제1) 위와 같이 수를 채우고, 출력해보세요.
		int x = 1;
		for(int i=0; i<5; i++) {
			if(i%2 == 0 ) {
				for(int j=0; j<5; j++) {
					arr[i][j] = x;
					x++;
				}
				
			}
			else {
				for(int j=4; j>=0; j--) {
					arr[i][j] = x;
					x++;
				}
				
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
	}

}
