package lv.test_4;

public class lv4_07 {

	public static void main(String[] args) {
		/*
		 * # 정렬하기
		 * 1. 인덱스 0번이 나머지를 검사한다.
		 * 2. 제일 큰 값을 찾아 교환한다.
		 * 3. 인덱스 1증가한다.
		 * 4. [1~3]을 끝까지 반복한다.
		 * 예)
		 * 10, 50, 30, 40, 80, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 40, 30, 10, 7
		 */
		
		int[] score = {10, 30, 40, 7, 80, 50};
		int x = 0;

			for(int i=0; i<6 ; i++) {
				int max = 0 ;
				int temp = 0;
				int a = 0;
				int b = 0;
				max = score[i];
				for(int j= i; j<6; j++) {
				if(max < score[j] ) {
					max = score[j];
					a = i;
					b = j;
				}
				}
				
				temp = score[a];
				score[a] = score[b];
				score[b] = temp;
				
			}
			x++;

		for(int i=0; i<6; i++) {
			System.out.print(score[i] + " ");
		}
	}

}
