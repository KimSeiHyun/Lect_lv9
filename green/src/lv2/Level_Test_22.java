package lv2;

public class Level_Test_22 {

	public static void main(String[] args) {
//		# 문제1) 7의 배수를 차례대로 출력했을대 8번째 배수를 출력

		//	시작 : 10:37
		//	종료 : 10:42
		//	소요 : 5분
		
		int i = 1;
		int cnt =0;
		int j = 0;
		while (i < 100) {
			
			if(i%7 == 0) {
				cnt++;
				if(cnt == 8) {
					j = i;
				}
			}
			
			i++;
		}
		System.out.println("7의 배수중 8번째 배수는 : " + j );

	}

}
