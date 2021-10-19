package lv2;

public class Level_Test_11 {

	public static void main(String[] args) {
//		#문제 1) 마트에서 오이를 3개씩 묶어서 1500원에 판다고 한다
//		# 오이가 14개 필요하다. 돈이 얼마필요한가(오이는 묶음으로만 판다)
	/*
	   힌트 : 3의배수가 아니면 될때까지 증가시킨다. 
	    while(오이 % 3  != 0){
	       오이 += 1;
	   }
	*/
		//	시작 : 12:21
		//	종료 : 12:40
		//	소요 : 19분
		boolean t = true;
		int cost = 1500;
		int oi = 0;
		int noi = 14;
		int pay = 0;
		
		while (t) {
			if ( oi > 14) {
				break;
			}
			pay += 1500;
			oi += 3;
		}
		System.out.println("오이가 14개 필요하면 " + pay + "원이 필요하다.");
		
		
		
	}

}
