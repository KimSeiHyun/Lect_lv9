package lv.test_4;

public class lv4_07s {

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
		
		int[] score = {10, 50, 30, 40, 80, 7};
		int max = 0;
		
		int temp = 0;
		
		for(int i=0; i<6; i++) {
			max = score[i];
			temp = 0;
			int idx = 0;
			int check = 0;
			for(int j=i; j<6; j++) {
				if(max < score[j]) {
					max = score[j];
					idx = j;
					check = 1;
				}
			}
			if(check == 1) {
			temp = score[i];
			score[i] = score[idx];
			score[idx] = temp;
			}
			
		}
		
			for(int i=0; i<6; i++) {
				System.out.print(score[i] + " ");
			}
		

		
	}

}
