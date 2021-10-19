package lv2;

public class Level_Test_13 {

	public static void main(String[] args) {
//		#문제3) 가게에서 24600원 짜리 옷을샀습니다.
//		# 1000원짜리 지폐로만 옷값을 낸다면 몇장이 필요한가요?
		//	시작 : 12:54
		//	종료 : 01:03
		//	소요 : 9분
		
		int a = 24600;
		int won = 1000;
		int w = 0;
		int cnt = 0;
		
		boolean t = true;
		while (t ) {
			if( w > a) {
				break;
			}
			w += won;
			cnt ++;
		}
	System.out.println("24600원짜리 옷을 1000원짜리 지폐로만 지불하면 " + cnt +"장이 필요합니다.");
	
	
	}

}
