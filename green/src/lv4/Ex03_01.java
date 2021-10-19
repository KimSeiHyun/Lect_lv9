package lv4;

public class Ex03_01 {

	public static void main(String[] args) {
		// 문제 ) 사전 순으로 이름 정렬
		String[] names = { "하김김", "가유신", "마동석", "나바킹", "다동요" };


	
		for(int i =0; i<5; i++) { 
			String max = names[i];
			int idx = i;
			for(int j =i; j<5; j++) {
				if(max.compareTo(names[j]) > 0) {
					max = names[j];
					idx = j;
				}
			}
			String temp = names[i];
			names[i] = names[idx];
			names[idx] = temp;
		}

		for(int i =0; i<5; i++) {
			System.out.print(names[i] + " ");
		}
		

		
	}//clear


}
