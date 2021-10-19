package lv2;

public class Level_Test_7 {

	public static void main(String[] args) {
//		#   문제1)
//	    #   운주네 반 학생은 31명입니다.
//		#   이중에서 남학생은 12명 , 여학생은 14명이 봉사할동을 하였습니다.
//		#   은주네 반에서 봉사활동을 하지않은 학생은
//		#   몇명인지 출력 
		//	시작 : 01:02
		//	종료 : 01:28
		//	소요 : 26분
		
		int s = 31;
		int man = 12;
		int girl = 14; 
		int a = 1; 
		int b = 1;
		int ns = 0;
		while (a <= 31) {
			
			if (a == (man + girl)) {
				s -= a;
				System.out.println("봉사활동을 하지 않은 학생의 수는 : " + s + "입니다");

				
			}

			a++;

		}



	}

}
