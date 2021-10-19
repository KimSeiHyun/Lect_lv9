package lv2;

public class Level_Test_12 {

	public static void main(String[] args) {
//		# 문제 2) 민수네 반 학생은 26명입니다
//		# 민수네반 학생들에게 도화지를 2 장씩 나누어 주려고합니다.
//		# 도화지는 10장씪 묶음으로만 판매하고 10장에 1200원입니다.
//		# 총얼마가 필요한가요?
		//	시작 : 12:44
		//	종료 : 12:53
		//	소요 : 9분
		
		int man = 26;
		
		int paper = 2;
		int paper2 = 10;
		int p = 0;
		
		int cost = 1200;		
		int pay = 0;
		boolean t = true;
		while (t) {
			if ( p >  man*paper) {
				break;
			}
			pay += cost;
			p += paper2;
		}
		
		System.out.println("도화지를 구매하는데 필요한 금액은 " + pay + "원 입니다.");
		

	}

}
