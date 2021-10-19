package lv2;

public class Level_Test_10 {

	public static void main(String[] args) {
//		# 문제4)
//		# 귤 6개의 무개는 840g, 사과 3개의 무게는 750g 입니다.
//		# 귤5개와 사과 4개의 무게는 몇g인지 출력 (단 각각의 귤끼리 무게는 같고  각각의 사과끼리는 무게가같다)
		//	시작 : 11:40
		//	종료 : 12:20
		//	소요 : 40분
		
		
		
		int gyul6 = 840;
		int apple3 = 750;
		
		int gyul = gyul6/6;
		int apple = apple3/3;
		
		int a = 1;
		int b = 1;
		
		int g = 0;
		
		for(a = 1; a<=5; a++) {
			g+= gyul;
		}
		for(b = 1; b<=4; b++) {
			g+= apple;
		}
		
		System.out.println("귤5개와 사과4개의 무개는 : " + g );



	}

}
