package lv2;

public class Level_Test_25 {

	public static void main(String[] args) {
//		# 문제4) 25 , 75 의 최대 공약수를 출력

		//	시작 : 11:41
		//	종료 : 11:45
		//	소요 : 4분
		
		int i = 1;
		int max = 0 ;
		
		while(i <= 75 ) {
			if (25%i == 0 && 75%i == 0 && max < i) {
				max = i;
			}
			i++;
		}
		System.out.println("25와 75의 최대공약수는 : " + max );
		
	}

}
