package lv2;

public class Level_Test_16 {

	public static void main(String[] args) {
//		# 문제3) 가게에 우유가 250개가 있다 그중에 오전에 84퍼센트가 팔렸고 나머지는 오후에 다팔렸다
//		# 오전에 팔린갯수 - 오후에 팔린갯수는 얼마인가
		//	시작 : 09:03
		//	종료 : 09:46
		//	소요 : 43분
		
		double milk = 250;
		
		double m = 250 *0.84;
		double i = 0;
		
		while (i < m  ) {
			i ++;
		}
		System.out.println("오전에 팔린 갯수 :" + i);
		System.out.println("오후에 팔린 갯수 :" + (milk-i));
		System.out.println("오전에 팔린갯수 - 오후에 팔린 갯수 : " + (i -(milk-i)));
		


		
	}

}
