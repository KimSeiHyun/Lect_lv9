package lv2;

public class Level_Test_21 {

	public static void main(String[] args) {
//		# 문제4) 50 부터 100 까지의 자연수중에서 9의 배수는 모두 몇개?

		//	시작 : 10:35
		//	종료 : 10:36
		//	소요 : 1분
		
		int a = 50;
		int cnt = 0;
		
		while ( a <= 100) {
			
			if(a%9 == 0 ) {
				cnt++;
			}
			a++;
		}
		
		System.out.println("50부터 100사이의 9의 배수의 갯수는 : " + cnt + "개");

	}

}
