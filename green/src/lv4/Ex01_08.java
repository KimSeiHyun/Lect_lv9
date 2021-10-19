package lv4;

public class Ex01_08 {

	public static void main(String[] args) {

		/*
		 * # 석차 출력
		 * . 성적 순으로 이름 출력
		 */
		
		String[] name = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] score   = {    87,    42,    100,     11,     98};

		int temp = 0;
		int b = 0;
		int idx = 0;
		for(int i=0; i<5; i++) {
			int max = 0;
			for(int j=i; j<5; j++) {
				if(max <score[j]) {
					max = score[j];
					b = j;
					idx = j;
				}
			}
			
			temp = score[i];
			score[i] = max;
			score[b] = temp;
			
			String a = name[i];
			name[i] = name[idx];
			name[b] = a;
		}
		
		
		
		for(int i=0; i<5; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(name[i] + " ");
		}
		
	}

}
