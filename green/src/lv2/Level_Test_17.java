package lv2;

public class Level_Test_17 {

	public static void main(String[] args) {
//		# 문제4) 어느도시에 전체 인구가 400000 명인데 나이가 19세 이하 인구는 35퍼센트
//		#  40세 이상인구는 25퍼센트일때
//		# 19세이하인구 - 40세이상인구 수를 구하시요
		//	시작 : 09:48
		//	종료 : 10:06
		//	소요 : 18분
		
		int total = 400000;
		int young = 35;
		int old = 25; 
		
		int totalP = 0;
		int youngP = 0;
		int oldP = 0;
		int i = 0;
		while (i < 100) {
			if (i == young) {
				youngP = totalP;
			}
			if (i == old) {
				oldP = totalP;
			}
			

			totalP += total/100;
			i++;
		}
		
		
		System.out.println("19세 이하의 인구 : " + youngP);
		System.out.println("40세 이상의 인구 : " + oldP);
		System.out.println("19세이하인구 - 40세이상인구 : " + (youngP - oldP));
		
	
	}

}
