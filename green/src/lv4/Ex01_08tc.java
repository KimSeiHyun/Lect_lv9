package lv4;

public class Ex01_08tc {

	public static void main(String[] args) {
		/*
		 * # 석차 출력
		 * . 성적 순으로 이름 출력
		 */
		
		String[] name = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] score   = {    87,    42,    100,     11,     98};
		
		
		for(int i=0; i<5; i++) {
			int max = score[i];
			int idx = i;
			for(int j=i; j<5; j++) {
				if(max < score[j]) {
					max = score[j];
					idx = j;
				}
			}
			
			int temp1 = score[i];
			score[i] = score[idx];
			score[idx] = temp1;
			
			String temp = name[i];
			name[i] = name[idx];
			name[idx] = temp;
			
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
