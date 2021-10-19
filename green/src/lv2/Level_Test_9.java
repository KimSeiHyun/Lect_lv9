package lv2;

public class Level_Test_9 {

	public static void main(String[] args) {
//		# 문제3)
//		# 어느 공장에서 한사람이 1시간에 컴퓨터를 4대를 조립할수 있다고한다.
//		# 3명이 컴퓨터 96대를 조립혀면 몇시간이 걸리는가
		//	시작 : 02:58
		//	종료 : 03:10
		//	소요 : 12분
		
		int one = 4;
		int three = one*3;
		int time = 1;
		int max = 0;
		while (three * time <= 96  ) {
			if (time > max ) {
				max++;
			}
			



			time++;

		}

		
		System.out.println("3명이 96대를 조립하면 걸리는 시간은 : " + max + " 시간 ");
		

		
		
		
	}

}
