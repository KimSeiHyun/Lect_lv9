package lv.test_4;

public class lv4_08 {

	public static void main(String[] args) {
		/*
		 * # 석차 출력
		 * . 성적 순으로 이름 출력
		 */
		
		String[] name = {"다", "라", "가", "마", "나"};
		int[] score   = {    87,    42,    100,     11,     98};
		
		for(int i=0; i<5; i++) {
			int max = 0;
			int temp =0;
			String temp2 = "";
			int a = 0;
			int b = 0;
			max = score[i];
			for(int j=i; j<5; j++) {
				if(max < score[j]) {
					max = score[j];
					a = i;
					b = j;
				}
			}
			temp = score[a];
			score[a] = score[b];
			score[b] = temp;
			
			temp2= name[a];
			name[a] = name[b];
			name[b] = temp2;
			
			
		}

		for(int i=0; i<5; i++) {
			System.out.print(name[i] +"  ");
		}System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(score[i] +" ");
		}System.out.println();
		
		
	}

}
