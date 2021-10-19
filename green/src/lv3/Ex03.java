package lv3;

public class Ex03 {

	public static void main(String[] args) {
		
		//중첩 반복문 (다차원 반복문)
		//ㄴ 반복문 안에 또다른 반복문을 작성해서 > 문제 해결
		
		for (int i=0; i<3 ; i++) {
			System.out.println("i : " +i); // 0 1 2 
			for(int j=0; j<4; j++) {
				System.out.println("j : " +j); // 0 1 2 3 
			}
		}
		
	}

}
