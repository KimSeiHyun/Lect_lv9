package lv2;

public class Level_Test_8 {

	public static void main(String[] args) {
//		# 문제2)
// 	    # 연필 7타를 여학생 2명과 남학생 4명에게 남김없이 똑같이 나누어 주었을때
//	    # 한사람은 연필을 몇 자루 가지게 되는 지 출력 (연필 1타는 12자루)
//		# 힌트 ) 7 * 12 / 6 
		//	시작 : 01:29
		//	종료 : 02:57
		//	소요 : 1시간 28분
		
		int man = 4;
		int girl = 2;

		boolean t = true;

		int turn = 0;
		
	while (t) {					//1
		if (84 / (man+girl) <= turn) {
		
			break;
		}


		turn++;
	}
	System.out.println("한사람이 가지게 되는 연필 갯수 : " + turn);
	

		
	}

}
