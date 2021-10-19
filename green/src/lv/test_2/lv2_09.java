package lv.test_2;

public class lv2_09 {

	public static void main(String[] args) {
		/*
		 * # 369게임[2단계]
		 * 1. 1~50까지 반복을 한다.
		 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
		 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
		 */
		
		int x = 1;
		
		while (x <= 50) {
		int cnt = 0;	
			if(x/10 ==3){
				cnt ++;
			}
			if(x%10 == 3 || x%10 == 6 || x %10 == 9) {
				cnt ++;
			}
			
			if(cnt == 2) {
				System.out.println("짝짝");
			}
			else if(cnt == 1) {
				System.out.println("짝");
			}
			else {
				System.out.println(x);
			}
			
			x++;
		}//w
	}

}
